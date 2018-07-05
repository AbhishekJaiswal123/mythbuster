(ns mythbuster.core
  (:require [ring.adapter.jetty :as jetty]
            [clojure.tools.nrepl.server :as nrepl]
            [cider.nrepl :as cider-nrepl]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello Clojure, abhishek kumar Jaiswal kumar Hello Ring"})

(defn- start-nrepl [port]
  (prn "starting repl")
  (nrepl/start-server
    :bind "localhost"
    :port port
    :handler cider-nrepl/cider-nrepl-handler))

(defn -main
  "I don't do a whole lot ... yet."
  [])
