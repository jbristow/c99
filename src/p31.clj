(ns p31)

(defn evenly-divisible [n d] (zero? (mod n d)))

; P31 (**) Determine whether a given integer number is prime.
(defn prime? [n] 
  (loop [c 2] 
    (if (> (* c c) n) 
      true 
      (if (zero? (mod n c))
        false
        (recur (inc c))))))

;(println (map prime? '(2 3 4 5 6 7 8 9 10)))