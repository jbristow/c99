(ns p23)
(use '[p20])

; P23 (**) Extract a given number of randomly selected elements from a list.
(defn rnd_select [n input] 
  (if (> n 0) 
    (loop [c n
           output '()
           [r x] (remove_at (rand-int (count input)) input)] 
      (if (> c 0) 
        (recur (dec c) (cons x output) (remove_at (rand-int (count r)) r)) 
        output)) nil))

(println (rnd_select 3 '(a,b,c,d,e,f,g,h)))