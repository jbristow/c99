(ns p09) 
; P09 (**) Pack consecutive duplicates of list elements into sublists.
; If a list contains repeated elements they should be placed in separate sublists.
(defn pack [l] 
  (loop [output '()
         [head & tail] l
         last-seen-list nil]
    (let [last-seen (first last-seen-list)]
    (if 
      (nil? head) 
      (reverse (cons last-seen-list output))
      (if (= last-seen head) 
        (recur output tail (cons head last-seen-list)) 
        (recur (if (nil? last-seen-list) output (cons last-seen-list output)) tail (list head)))))))

;(println (pack (list "a" "a" "a" "a" "b" "c" "c" "a" "a" "d" "e" "e" "e" "e")))

