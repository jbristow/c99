(ns p35)
(use '[p31])

; P35 (**) Determine the prime factors of a given positive integer.
(comment "Construct a flat list containing the prime factors in ascending order.")
(defn prime-factors [n]
  (loop [number n
         curr 2
         output '()]
    (cond 
      (= 1 number) (reverse output)
      (evenly-divisible number curr) (recur (/ number curr) curr (conj output curr))
      :else (recur number (inc curr) output))))

;(println (prime-factors 315))