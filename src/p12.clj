(ns p12) 
; P12 (**) Decode a run-length encoded list.
; Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
(defn decode [l]
  (mapcat (fn [a] 
            (let [n (first a)
                  value (last a)]
              (loop [curr 0
                     output '()]
                (if
                  (= curr n)
                  output 
                  (recur (inc curr) (cons value output)))))) l))
;(println (decode (list '(4 "a") '(1 "b") '(2 "c") '(2 "a") '(1 "d") '(4 "e"))))
