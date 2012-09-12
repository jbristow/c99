(ns p49)

; P49 (**) Gray code.
(comment "An n-bit Gray code is a sequence of n-bit strings constructed according to certain rules. For example,") 
(comment "n = 1: C(1) = ['0','1']. ")
(comment "n = 2: C(2) = ['00','01','11','10'].")
(comment "n = 3: C(3) = ['000','001','011','010','110','111','101','100'].")

(defn gray [n] 
  (loop [nleft n
         combos (list (list ))]
    (if (zero? nleft) 
      (map #(apply str %) combos)
      (recur (dec nleft) (concat (map #(conj %1 1) combos) (map #(conj %1 0) combos)) ))))
