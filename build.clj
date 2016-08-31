(require 'cljs.build.api)

(cljs.build.api/build "cljs/hb"
                      {:optimizations :advanced
                       :output-dir "lib/assets/cljs"
                       :modules {:front {:output-to "lib/assets/cljs/cljs-front.js"
                                         :entries #{"hb.front.core"}}
                                 :extranet {:output-to "lib/assets/cljs/cljs-extranet.js"
                                            :entries #{"hb.core"}}}})

(System/exit 0)
