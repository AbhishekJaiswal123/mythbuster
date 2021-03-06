(defproject mythbuster "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.7.0-RC1"]
                 [ring/ring-jetty-adapter "1.7.0-RC1"]
                 [org.clojure/tools.nrepl "0.2.12"]
                 [cider/cider-nrepl "0.16.0"]
                 [org.clojure/tools.nrepl "0.2.13"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler mythbuster.core/handler
         :nrepl {:start? true :port 3101}}
  :main ^:skip-aot mythbuster.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
