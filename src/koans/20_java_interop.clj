(ns koans.20-java-interop
  (:require [koan-engine.core :refer :all]))

(meditations
  "You may have done more with Java than you know"
  ; hint: try typing (javadoc "warfare") in the REPL
  (= String (class "warfare"))

  "The dot signifies easy and direct Java interoperation"
  (= "SELECT * FROM" (.toUpperCase "select * from"))

  "But instance method calls are very different from normal functions"
  (= ["SELECT" "FROM" "WHERE"]
     (map #(.toUpperCase %) ["select" "from" "where"]))

  "Constructing might be harder than breaking"
  (= 10 (let [latch (java.util.concurrent.CountDownLatch. 10)]
          (.getCount latch)))

  "Static methods are slashing prices!"
  (== 1024 (Math/pow 2 10)))
