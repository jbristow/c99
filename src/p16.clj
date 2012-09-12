(ns p16)

; P16 (**) Drop every Nth element from a list.
; clojure's (drop n list) throws away the first n items in a list and returns the list 
(defn s99_drop [n l] 
  (loop [[head & tail] l
         c 1 
         output '()] 
    (if (nil? head) 
      (reverse output) 
      (if 
        (= c n) 
        (recur tail 1 output) 
        (recur tail (inc c) (cons head output))))))
;(println (s99_drop 4 '(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)))
