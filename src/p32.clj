(ns p32)
(require '[p31])

; P32 (**) Determine the greatest common divisor of two positive integer numbers.
(comment "Use Euclid's algorithm.")
; my first attempt...
(defn gcd_a [n k] 
  (loop [a (if (< n k) n k)
         b (if (< n k) k n)
         c 2
         o 1] 
    (cond 
      (< a c) o
      (and (p31/evenly-divisible a c) (p31/evenly-divisible b c)) (recur (/ a c) (/ b c) c (* o c))
      :else (recur a b (inc c) o))))
; using euclid's algorithm...
(defn gcd [m n] 
  (if (zero? n) 
    m 
    (recur n (mod m n))))

;(println (gcd 63 36))
;(println (gcd 36 63))