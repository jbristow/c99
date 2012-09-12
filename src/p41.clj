(ns p41)
(use '[p40] '[p39])

(defn limited-goldbach [n limit]
  (let [primes (primes-upto n)]
    (loop [[head & tail] primes] 
    (let [match (first (filter #(= % (- n head)) primes))]
      (cond 
        (nil? head) nil
        (> head (/ n 2)) nil
        (nil? match) (recur tail)
        (< head limit) (recur tail)
        :else (list head match)
      )))))

(comment "In most cases, if an even number is written as the sum of two prime numbers, one of them is very small. Very rarely, the primes are both bigger than say 50. Try to find out how many such cases there are in the range 2..3000.")
(defn print-goldbach-list-limited [a end limit] 
  (loop [start a] 
    (cond 
      (> start end) nil
      (< start limit) (recur (inc start))
      (zero? (rem start 2)) (do
                              (let [gbp (limited-goldbach start limit)]
                                (if (nil? gbp) nil 
                                    (let [[a b] gbp] (println start "=" a "+" b )))) 
                              (recur (inc start)))
      :else (recur (inc start)))))

; P41 (**) A list of Goldbach compositions.
(comment "Given a range of integers by its lower and upper limit, print a list of all even numbers and their Goldbach composition.") 
(defn print-goldbach-list [a end] 
  (print-goldbach-list-limited a end 0))

;(print-goldbach-list 5 20)
;(print-goldbach-list-limited 1 2000 50)



