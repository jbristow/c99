(ns p38) 
(use '[p37] '[p34])

; P38 (*) Compare the two methods of calculating Euler's totient function.
(comment "Use the solutions of problems P34 and P37 to compare the algorithms. Try to calculate phi(10090) as an example.")
(defn timer [which function n]
  (let [start (System/currentTimeMillis)
        answer (function n)
        end (- (System/currentTimeMillis) start)]
  (println which "{" answer "} takes" end "ms")))

(defn benchmark [n] 
  (doseq [i (range 1 11)]
	  (println "Run" i)
	  (timer "p34" totient n)
	  (timer "p37" totient2 n)
	  (println "------\n")))

;(benchmark 100990)