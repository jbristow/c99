(ns p04)

; P04 (*) Find the number of elements of a list.
; This is the same functionality as clojure's (count l) function
(defn length [input]
  (loop [c 0 
         [head & tail] input]
    (if (nil? head) c (recur (inc c) tail))))

;(println (length '(1 2 3 4 5 6)))