(defproject hb "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.216"]
                 [com.cognitect/transit-cljs "0.8.239"]
                 [com.andrewmcveigh/cljs-time "0.4.0"]
                 [cljs-ajax "0.5.7"]
                 [reagent "0.6.0-rc"]]

  :plugins [[lein-figwheel "0.5.6"]
            [lein-cljsbuild "1.1.1"]]

  :clean-targets ^{:protect false} ["lib/assets/cljs/"]

  :cljsbuild {:builds [{:id "front"
                        :source-paths ["cljs/hb"]
                        :figwheel true
                        :compiler {:main "hb.front.core"
                                   :output-to "lib/assets/cljs/cljs-front.js"
                                   :output-dir "lib/assets/cljs/cljs-front.out"
                                   :asset-path "/assets/cljs-front.out"}}

                       {:id "extranet"
                        :source-paths ["cljs/hb"]
                        :figwheel true
                        :compiler {:main "hb.core"
                                   :output-to "lib/assets/cljs/cljs-extranet.js"
                                   :output-dir "lib/assets/cljs/cljs-extranet.out"
                                   :asset-path "/assets/cljs-extranet.out"}}

                       {:id "prod"
                        :source-paths ["cljs/hb"]
                        :compiler {:output-dir "lib/assets/cljs"
                                   :optimizations :advanced
                                   :modules {:front {:output-to "lib/assets/cljs/cljs-front.js"
                                                     :entries #{"hb.front.core"}}
                                             :extranet {:output-to "lib/assets/cljs/cljs-extranet.js"
                                                        :entries #{"hb.core"}}}}}]})
