; If we list all the natural numbers below
; 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
; The sum of these multiples is 23.

; Find the sum of all the multiples of 3 or 5 below 1000.

(ns clojure.examples.hello
    (:gen-class))

(defn calc [num sum]
  (if (= 0 num)
    num
    (if (or (= 0 (mod num 3)) (= 0 (mod num 5)))
      (+ num (calc (- num 1) (+ num sum)))
      (calc (- num 1) sum)
    )
  )
)

(println (calc 999 0))
