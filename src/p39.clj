(ns p39)
(defn prime? [n prime-cache] 
  (= 0 (count (filter zero? (map (fn [e] (mod n e)) prime-cache)))))

(defn primes-upto [n]
  (loop [possible 3
         primes '()]
	  (cond
	    (< n 2) primes
	    (= n 2) '(2)
	    (>= possible n) (reverse primes)
	    (prime? possible primes) (recur (+ 2 possible) (conj primes possible))
	    :else (recur (+ 2 possible) primes))))

; P39 (*) A list of prime numbers.
(comment "Given a range of integers by its lower and upper limit, construct a list of all prime numbers in that range.")
(defn prime-list [start end]
  (drop-while (fn [e] (< e start)) (primes-upto end)))

;(println (prime-list 1 20))
