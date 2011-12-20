;; Solution to problem 5

;; infinite sequence
(def inf (iterate #(inc %) 1))

;; the range we're dividing by
(def divisors (range 1 21))

;; does the sum of the given collection equal zero?
(defn zerosum? [coll] (= 0 (reduce + coll)))

;; given an integer n, return a map of n divided by the divisors range
(defn divisor-map [n] (map #(mod n %) divisors))

;; should hopefully eventually someday somewhere over the rainbow yield the solution
(println (some #(when (zerosum? (divisor-map %)) %) inf))
