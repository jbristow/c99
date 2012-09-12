(ns p01) 
; P01 (*) Find the last element of a list.
; Basically, this replicates the (last n) functionality already in clojure
(defn s99_last [[head & tail]]
  (if (empty? tail) head (recur tail)))

;(println (s99_last '(1 2 3 4 5 6)))