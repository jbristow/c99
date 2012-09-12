(ns p26)

; P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
(comment "In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient). For pure mathematicians, this result may be great. But we want to really generate all the possibilities.")
(defn- index-combinations
  [n cnt]
  (seq
   (let [c (vec (cons nil (for [j (range 1 (inc n))] (+ j cnt (- (inc n)))))),
   iter-comb
   (fn iter-comb [c j]
     (if (> j n) nil
         (let [c (assoc c j (dec (c j)))]
     (if (< (c j) j) [c (inc j)]
         (loop [c c, j j]
           (if (= j 1) [c j]
         (recur (assoc c (dec j) (dec (c j))) (dec j)))))))),
   step
   (fn step [c j]
     (cons (rseq (subvec c 1 (inc n)))
     (seq (let [next-step (iter-comb c j)]
           (when next-step (step (next-step 0) (next-step 1)))))))]
     (step c 1))))

(defn combinations
  "All the unique ways of taking n different elements from items"
  [n items]      
  (let [v-items (vec (reverse items))]
    (if (zero? n) (list ())
      (let [cnt (count items)]
       (cond 
         (> n cnt) nil
         (= n cnt) (list (seq items))
         :else (map #(map v-items %) (index-combinations n cnt)))))))

(println (combinations 2 '(a b c d e)))


