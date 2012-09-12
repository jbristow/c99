(ns p48)
(defn true-false-combos [n] 
  (loop [nleft n
         combos (list (list ))]
    (if (zero? nleft) 
      combos
      (recur (dec nleft) (concat (map #(conj %1 true) combos) (map #(conj %1 false) combos)) ))))

(defn table [nvars func] (let [tt (true-false-combos nvars)] (doseq [x tt] (println x (func `(~@x))))))