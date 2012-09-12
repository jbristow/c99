(ns p13) 
; P13 (**) Run-length encoding of a list (direct solution).
; Implement the so-called run-length encoding data compression method directly.
; I.e. don't use other methods you've written (like P09's pack); 
; do all the work directly.
(defn encodeDirect [l] 
  (loop [output '()
         [head & tail] l
         last-seen nil 
         n 0]
     (if (nil? head) 
      (reverse output)
      (if (= last-seen head) 
        (recur output tail last-seen (inc n)) 
        (recur (if (nil? last-seen) output (cons (list n last-seen) output)) tail head 1)))))

;(println (encodeDirect '("a" "a" "a" "a" "b" "c" "c" "a" "a" "d" "e" "e" "e" "e")))
