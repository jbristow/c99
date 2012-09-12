(ns p50)
(use '[p07])

(defn fr [sym freq] '((list sym) freq))

(defn huffman-tree [fs] 
  (let [fs-sorted (sort-by #(nth % 1) fs)]
    (loop [[a b & tail] fs-sorted] 
        (if (not (empty? tail)) 
          (recur (sort-by #(nth % 1) (conj tail (list (concat (list (nth a 0)) (list (nth b 0))) (+ (nth a 1) (nth b 1))))))
          (concat (list (nth a 0)) (list (nth b 0)))))))
(defn digit-map [a b c]
  (if (seq? a)
    (map digit-map a (list "0" "1") (list (str c b) (str c b)))
    (list a (str c b))))

(defn dft [ls]
  (mapcat (fn [e]
            (if (list? e)
              e
              (dft e)
              )) ls))
(defn process [ls] 
  (loop [[a b & tail] ls
         out '()] 
    (if (empty? tail) 
      (sort-by (fn [[a b]] a) (conj out (list a b))) 
      (recur tail (conj out (list a b))))))

(defn huffman [fs] 
  (let [tree (huffman-tree fs)]
    (process (dft (map 
      digit-map 
      tree 
      (list "0" "1")
      (list "" ""))))))

(huffman (list (list 'a 45) (list 'b 13) (list 'c 12) (list 'd 16) (list 'e 9) (list 'f 5)))