(ns coding-kata.core
  (:gen-class)
  (:require [clojure.string :as str]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  )



(defn remove-empty-places [input]
  (str/replace input "." ""))

(defn place-black [input]
  (let [input (remove-empty-places input )]
    (cond
      (= input "BW") "...BW0.."
      (= input "WB") "..0WB..."
      :else "...B....\n...W....\n...0....")) )