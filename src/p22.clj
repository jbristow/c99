(ns p22)

; P22 (*) Create a list containing all integers within a given range.
; clojure already has a (range a b), but it is [a,b), not [a,b]
(defn s99_range [s e] 
  (loop [output [s] 
         curr (inc s)] 
    (if (> curr e) 
      output 
      (recur (conj output curr) (inc curr)))))

(println (s99_range 4 9))
