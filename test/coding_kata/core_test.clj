(ns coding-kata.core-test
  (:require [clojure.test :refer :all]
            [coding-kata.core :refer :all]))

(deftest place-black-test
  (testing "placing black on top-right"
    (let [input "...BW...\n...WB..."
          output "...BW0..\n...WB..."]
      (is (= output (place-black input))))))