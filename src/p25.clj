(ns p25)

(use '[p20])

; P25 (*) Generate a random permutation of the elements of a list.
(defn randomPermute [input] 
  (loop [c (count input)
         output '()
         [r x] (remove_at (rand-int (count input)) input)]
      (if (> c 1) 
        (recur (dec c) (cons x output) (remove_at (rand-int (count r)) r)) 
        (cons x output))))
(println (randomPermute '(a b c d e f)))