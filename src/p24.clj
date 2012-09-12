(ns p24)

(use '[p23] '[p22])
; P24 (*) Lotto: Draw N different random numbers from the set 1..M.
; The selected numbers shall be put into a result list.
(defn lotto [n m] (rnd_select n (s99_range 1 m)))

(println (lotto 6 49))