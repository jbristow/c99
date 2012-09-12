(ns p03) 
; P03 (*) Find the Kth element of a list.
; By convention, the first element in the list is element 0.
; in clojure, nth already exists (nth n l)
(defn s99_nth [n input]
  (loop [c 0
         i input]
    (if (= c n) (first i) (recur (inc c) (rest i)))))

;(println (s99_nth 2 '(1 2 3 4 5 6)))