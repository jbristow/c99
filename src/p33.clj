(ns p33)
(require '[p32])

; P33 (*) Determine whether two positive integer numbers are coprime.
(comment "Two numbers are coprime if their greatest common divisor equals 1.")
(defn coprime? [n k] (= 1 (p32/gcd n k)))