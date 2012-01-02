(ns euler.five)

;; accumulator to track state
(def acc (atom 1))

;; increments accumulator by 1
(defn accu [] (swap! acc + 1))

;; the core computation
(defn div [n d]
  (if (= 1 d)
    0
    (if (= 0 (mod n d))
      (recur n (dec d)) 1)))

;; call until we find the number that matches
(defn divides? [n]
  (if (= 0 (div n 20))
    n
    (recur (accu))))

(def answer (divides? 1))