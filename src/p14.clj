(ns p14)

; P14 (*) Duplicate the elements of a list.
(defn duplicate [l]  (mapcat (fn [a] (list a a)) l))

;(println (duplicate (list "a" "b" "c" "c" "d")))