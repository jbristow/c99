(ns p08) 
; P08 (**) Eliminate consecutive duplicates of list elements.
(comment "If a list contains repeated elements they should be 
replaced with a single copy of the element. 
The order of the elements should not be changed.")
(defn compress [l]
  (loop [current '()
         [head & tail] l]
    (if (nil? head)
      (reverse current)
      (recur 
        (if (= (first current) head) current (cons head current)) 
        tail))))

;(println (compress '("a" "a" "a" "a" "b" "c" "c" "a" "a" "d" "e" "e" "e" "e")))

