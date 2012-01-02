(ns euler.six)

(defn pow [n e] (Math/pow n e))

(def numbers (range 1 101))

(def sum-of-squares (apply + (map #(pow % 2) numbers)))

(def square-of-sums (pow (apply + numbers) 2))

(def answer (int (- square-of-sums sum-of-squares)))