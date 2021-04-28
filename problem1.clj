; If we list all the natural numbers below
; 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
; The sum of these multiples is 23.

; Find the sum of all the multiples of 3 or 5 below 1000.

(ns clojure.examples.hello
    (:gen-class))

(defn hello-world []
;    (def lst (map inc (take 10 (range))))

    (println (->> (range)
         (take 10)
         (map inc)))

    (dotimes [i 9]
      (def y (inc i))
      (if (or (= 0 (mod y 3)) (= 0 (mod y 5)))
        (println y)
        ()
      )
  )
)

(hello-world)
