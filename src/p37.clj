(ns p37)
(use '[p36])
; stolen from http://rosettacode.org/wiki/Exponentiation_operator#Clojure
(defn ** [x n] (if (zero? n) 1 (reduce * (repeat n x))))

; P37 (**) Calculate Euler's totient function phi(m) (improved).
(comment "See problem P34 for the definition of Euler's totient function. If the list of the prime factors of a number m is known in the form of problem P36 then the function phi(m>) can be efficiently calculated as follows: Let [[p1, m1], [p2, m2], [p3, m3], ...] be the list of prime factors (and their multiplicities) of a given number m. Then phi(m) can be calculated with the following formula:") 
(defn totient2 [n] 
  (let [pfs (prime-factors-mult n)]
    (reduce * (map (fn [[m p]] (* (dec p) (** p (dec m)))) pfs))))
 
;(println (totient2 10))

