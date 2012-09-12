(ns p27)  
(use '[p26])

(defn exists? [[head & tail] item]
  (cond
    (nil? head) false
    (= head item) true
    :else (exists? tail item)))

(defn diff [lsa lsb] 
  (cond 
    (empty lsb) lsa 
    :else (filter #(not (nil? %)) 
            (for [item lsa] (when (not (exists? lsb item)) item)))))

(defn group3 [ls] 
  (for [a (combinations 2 ls)]
      (for [b (combinations 3 (diff ls a))] (list a b, (diff (diff ls a) b)))))

(defn group [[n & nls] ls]
  (if (nil? n) nil (for [combo (combinations n ls)] (list combo (group nls (diff ls combo)))))
  )


;(println (group3 (list "a" "b" "c" "d" "e" "f" "g" "h" "i")))
;(println (group '(2 2 5) (list "a" "b" "c" "d" "e" "f" "g" "h" "i")))
