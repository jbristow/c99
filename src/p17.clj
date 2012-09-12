(ns p17)
; P17 (*) Split a list into two parts; the length of the first part is given.
(defn split [n l] 
  (loop [c 0
         [head & tail] l
         output '()]
      (if (< c (dec n))
        (recur (inc c) tail (cons head output))
        (list (reverse (cons head output)) tail))))

;(println (split 4 '(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)))
