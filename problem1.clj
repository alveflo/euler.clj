(ns clojure.examples.hello
    (:gen-class))

(defn hello-world []
    (dotimes [i 10]
      (if (or (= 0 (mod i 3)) (= 0 (mod i 5)))
        (println i)
      )
  )
)
(hello-world)
