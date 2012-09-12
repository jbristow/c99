(ns p19)

(use '[p18])

; P19 (**) Rotate a list N places to the left.
(defn rotate [n input] 
  (let [amount (if (< n 0) (+ n (count input)) n)] 
    (concat (drop amount input) (slice 0 amount input))))

(println (rotate 3 '(a,b,c,d,e,f,g,h)))
(println (rotate -2 '(a,b,c,d,e,f,g,h)))