(ns p36)
(use '[p35] '[p10])
; P36 (**) Determine the prime factors of a given positive integer (2).
(comment "Construct a list containing the prime factors and their multiplicity.") 
(defn prime-factors-mult [n] (encode (prime-factors n)))

;(println (prime-factors-mult 315))