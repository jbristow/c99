(ns p21)
(use '[p18])
; P21 (*) Insert an element at a given position into a list.
(defn insert_at [k value input]   
  (concat 
    (slice 0  k input) 
    (list value)
    (slice k (count input) input)))

(println (insert_at 2 "alfa" '(a,b,c,d)))