; The prime factors of 13195 are 5, 7, 13 and 29.
; What is the largest prime factor of the number 600851475143 ?

(defn is-prime [n]
  (def sqrt (Math/sqrt n))
  (def lst (range 2 (+ sqrt 1)))
  (every? (fn [x] (not= 0 (mod n x))) lst)
)

(defn next-prime [n]
  (def next (+ n 1))
  (if (is-prime next)
    next
    (next-prime next)
  )
)

(defn prime-factor [num divider]
  (cond
    (= 0 (mod num divider))
      (prime-factor (/ num divider) divider)
    (is-prime num)
      num
    :default (prime-factor num (next-prime divider))
  )
)

(println (prime-factor 600851475143 2))