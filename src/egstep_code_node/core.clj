(ns egstep-code-node.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [me.raynes.conch :refer [programs with-programs let-programs]]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defn create-node-instant
  "spwan node proress"
  [version]
  (programs node)
  (str (node "-v") "/ " (node "-e" "console.log('print this in node')")))

(defn run-code
  "run node code {version: node version, code: stringified json}"
  [version code]
  (str "hi " version code))

(defroutes app-routes
           (GET "/run" [] (create-node-instant "1"))
           (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
