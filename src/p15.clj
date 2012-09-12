(ns p15)
; P15 (**) Duplicate the elements of a list a given number of times.
(defn duplicateN [n l] 
  (mapcat (fn [a] 
            (loop [output '()] 
              (if 
                (= (count output) n) 
                output 
                (recur (cons a output))))) l))
;(println (duplicateN 3 (list "a" "b" "c" "c" "d")))
