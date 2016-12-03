(ns coding-kata.core-test
  (:require [clojure.test :refer :all]
            [coding-kata.core :refer :all]))

(deftest place-black-test
  (testing "placing black on right"
    (let [input "...BW..."
          output "...BW0.."]
      (is (= output (place-black input)))))
  (testing "placing black on left"
    (let [input "...WB..."
          output "..0WB..."]
      (is (= output (place-black input)))))
  (testing "placing black on bottom"
    (let [input "...B....\n...W...."
          output "...B....\n...W....\n...0...."]
      (is (= output (place-black input))))))