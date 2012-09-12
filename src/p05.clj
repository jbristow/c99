(ns p05) 
; P05 (*) Reverse a list.
; clojure already has a (reverse l)
(defn s99_reverse [l]
  (loop [[head & tail] l
         curr '()]
      (if (nil? head) curr (recur tail (cons head curr)))))

;(println (s99_reverse '(1 2 3 4 5)))
