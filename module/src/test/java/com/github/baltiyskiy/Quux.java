package com.github.baltiyskiy;

import com.google.crypto.tink.Config;

public class Quux {
  void quux(Foo foo, Config config, Baz baz) {
    baz.baz(config);
    foo.foo(baz);
  }
}