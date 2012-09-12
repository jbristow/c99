(ns p11)
(use '[p10]) 
; P11 (*) Modified run-length encoding.
; Modify the result of problem P10 in such a way that if an element has no 
; duplicates it is simply copied into the result list. Only elements with 
; duplicates are transferred as (N, E) terms.

(defn encodeModified [l] 
  (map 
    (fn [a] (if (= (first a) 1) (last a) a)) 
    (encode l)))
;(println (encodeModified '("a" "a" "a" "a" "b" "c" "c" "a" "a" "d" "e" "e" "e" "e")))
