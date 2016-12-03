(ns coding-kata.core-test
  (:require [clojure.test :refer :all]
            [coding-kata.core :refer :all]))

(deftest place-black-test
  (let [input "...BW...\n...WB..."
        output "...BW0..\n...WB..."]
    (is (= output   (place-black input)))))