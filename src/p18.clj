(ns p18)

; P18 (**) Extract a slice from a list.
; Given two indices, I and K, the slice is the list containing the elements 
; from and including the Ith element up to but not including the Kth element of
; the original list. Start counting the elements with 0.
(defn slice [i k l] (concat (take k (drop i l))))

(println (slice 3 7 '(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)))
