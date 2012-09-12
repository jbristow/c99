(ns p46)

; P46 (**) Truth tables for logical expressions.
(comment "Define predicates and/2, or/2, nand/2, nor/2, xor/2, impl/2 and equ/2 (for logical equivalence) which succeed or fail according to the result of their respective operations; e.g. and(A,B) will succeed, if and only if both A and B succeed. Note that A and B can be Prolog goals (not only the constants true and fail).")
(comment "A logical expression in two variables can then be written in prefix notation, as in the following example: and(or(A,B),nand(A,B)).")

(defn not_ [a] (if a false true))
(defn and_ [a b] (if a (if b true false) false))
(defn or_ [a b] (if a true (if b true false)))
(defn nand_ [a b] (not_ (and_ a b)))
(defn nor_ [a b] (not_ (or_ a b)))
(defn xor_ [a b] (or_ (and_ a (not_ b)) (and_ (not_ a) b)))
(defn impl_ [a b] (or_ (not_ a) (and_ a b)))
(defn equ_ [a b] (not_ (xor_ a b)))

(comment "Now, write a predicate table/3 which prints the truth table of a given logical expression in two variables.")
(defn table [f] 
  (doseq [a '(true false)
        b '(true false)] 
     (println a "\t" b "\t" (f a b))
    ))

(table #(and_ %1 (or_ %1 %2)))

(defn truth-table [n] 
  (loop [nleft n
         combos (list (list ))]
    (if (zero? nleft) 
      combos
      (recur (dec nleft) (concat (map #(conj % true) combos) (map #(conj % false) combos)) ))))
; P48 (**) Truth tables for logical expressions (3).
(comment "Generalize problem P47 in such a way that the logical expression may contain any number of logical variables. Define table/2 in a way that table(List,Expr) prints the truth table for the expression Expr, which contains the logical variables enumerated in List.") 
(defn table2 [nparams func] 
  (let [tfls (truth-table nparams)] 
    (doseq [ls tfls] 
      (do 
        (doseq [t ls] (print t "\t"))
        (println (apply func ls))))))
(table2 2 #(and_ %1 (or_ %1 %2)))