(ns p02)
; P02 (*) Find the last but one element of a list.
(defn penultimate [[a b & tail]] 
  (if (empty? tail) a (recur (cons b tail))))

;(println (penultimate '(1 2 3 4 5 6)))