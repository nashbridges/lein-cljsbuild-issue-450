## Reproducing [lein-cljsbuild-450](https://github.com/emezeske/lein-cljsbuild/issues/450)

### Reproducing steps

1. Run `lein run -m clojure.main build.clj`. Expected output (at least): lib/assets/cljs/cljs-extranet.js,
  lib/assets/cljs/cljs-front.js, lib/assets/cljs/cljs_base.js

2. Run `lein cljsbuild once prod`. Expected output should be the same, but it's not (compiles empty
  target/cljsbuild-main.js)
