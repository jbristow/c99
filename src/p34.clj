(ns p34)
(use '[p33])

; P34 (**) Calculate Euler's totient function phi(m).
(comment "Euler's so-called totient function phi(m) is defined as the number of positive integers r (1 <= r <= m) that are coprime to m.") 
(defn totient [n] 
  (count 
    (filter 
      (fn [e] (p33/coprime? e n)) 
      (range 1 n))))

;(println (totient 10))