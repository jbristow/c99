(ns p20)

(use '[p18])

; P20 (*) Remove the K'th element from a list.
(defn remove_at [k input] 
  (list 
    (concat 
      (slice 0 k input) 
      (slice (inc k) (count input) input))
    (nth input k)))

(println (remove_at 2 '(a,b,c,d)))