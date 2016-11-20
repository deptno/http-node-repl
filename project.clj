(defproject http-node-repl "0.1.0-SNAPSHOT"
  :description "http-node-repl"
  :url "http://github.com/deptno/http-node-repl"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]
                 [me.raynes/conch "0.8.0"]
                 ]
  :plugins [[lein-ring "0.10.0"]]
  :ring {:handler http-node-repl.core/app})
