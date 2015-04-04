(ns hello-world.core
  (:require [clojure.browser.repl :as repl]))

(defonce conn
  (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(defonce init-state {:text "Hello, this is: " :numbers ["one" "two" "four"]})

(defonce app-state (atom init-state))

(println "Hello Cruel world!")          

(defn foo [a b]
  (* a b))

(defn bar [d e]
  (+ d e))

(defn bing [n d]
  (/ n d))
