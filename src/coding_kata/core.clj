(ns coding-kata.core
  (:gen-class)
  (:require [clojure.string :as str]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  )



(defn remove-empty-places [input]
  (str/replace input #"." ""))

(defn place-black [input]
  (let [input (remove-empty-places input )]
    (if (= input "BW")
      "...BW0.."
      "..0WB...")) )