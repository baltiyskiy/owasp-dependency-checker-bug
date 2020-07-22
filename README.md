# owasp-dependency-checker-bug
Attempt to reproduce a bug in org.owasp:dependency-check-maven in a separate repo.

dependency-check-maven reports vulnerabilities in transitive dependencies of a test-jar artifact dependency, even though:
1. The dependency is included with scope `test`, and we don't override the default settings of `skipTestScope` (true).
2. The transitive dependency is _excluded_ in the POM. 

However, I couldn't reproduce it in a separate repo quickly. Here's the result so far.
