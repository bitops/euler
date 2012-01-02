(ns euler.solutions)

;; solution to problem 1
(defn multiple? [n] 
	(or (= 0 (mod n 3)) 
	    (= 0 (mod n 5))))

(println (str "The number is: " (reduce + (filter multiple? (range 1 1000)))))
;; solution to problem 2

;; fibonacci sequence generator, thank you to http://bit.ly/19ToKF for insights and teaching.
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

;; how far you can go in the fibonacci sequence before going over or equal to 4M
(def upper-limit (take-while #(<= (fib %) 4000000) inf))

(println (str "The answer to Problem 1 is: "
	      (apply +
		     (filter #(= 0 (mod % 2))
			     (map #(fib %) upper-limit)))))

;; solution to problem 5
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

;; actually run the darn thing to get the answer :)
(println (str "The number is: " (divides? 1)))

;; answer to problem 6

;; wrap the Java power function
(defn pow [n e] (Math/pow n e))

(def numbers (range 1 101))

(def sum-of-squares (apply + (map #(pow % 2) numbers)))

(def square-of-sums (pow (apply + numbers) 2))

(def answer (int (- square-of-sums sum-of-squares)))

(println (str "The answer is: " answer))