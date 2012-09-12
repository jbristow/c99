(ns p10)
(use '[p09])
; P10 (*) Run-length encoding of a list.
; Use the result of problem P09 to implement the so-called run-length encoding 
; data compression method. Consecutive duplicates of elements are encoded as 
; tuples (N, E) where N is the number of duplicates of the element E.
(defn encode [l] 
  (map 
    (fn [a] (list (count a) (first a))) 
    (pack l)))

;(println (encode '("a" "a" "a" "a" "b" "c" "c" "a" "a" "d" "e" "e" "e" "e")))
