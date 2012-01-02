(ns euler.common)

;; functions which pop up again and again

;; power function
(defn pow [n e] (Math/pow n e))

;; fibonacci sequence generator
(defn fib [i]
  (loop [a 0
         b 1
         n 1]
    (if (>= n i)
        b
        (recur b
               (+ a b)
               (inc n)))))

;; infinite sequence for easy iteration
(def inf (iterate #(inc %) 1))

(defn digit-sum [val] (apply + (map #(Integer. (str %)) (str val))))
