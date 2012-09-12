(ns p07) 
; P07 (**) Flatten a nested list structure.
(defn flatten [l]
  (if (list? l)
    (mapcat flatten l)
    (list l)))

;(println (flatten (list (list (list 1, 1), 2, (list 3, (list 5, 8))))))
