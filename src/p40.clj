(ns p40)

(use '[p39])
; P40 (**) Goldbach's conjecture.
(comment "Goldbach's conjecture says that every positive even number greater than 2 is the sum of two prime numbers. Example: 28 = 5 + 23. It is one of the most famous facts in number theory that has not been proved to be correct in the general case. It has been numerically confirmed up to very large numbers (much larger than we can go with our Prolog system). Write a predicate to find the two prime numbers that sum up to a given even integer.") 
(defn goldbach [n]
  (let [primes (primes-upto n)]
    (loop [[head & tail] primes] 
    (let [match (first (filter #(= % (- n head)) primes))]
      (cond 
        (nil? head) nil
        (nil? match) (recur tail)
        :else (list head match)
      )))))

;(println (goldbach 28))
;(println (goldbach 6))