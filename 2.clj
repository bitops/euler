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

(println (str "The answer is: "
	      (apply +
		     (filter #(= 0 (mod % 2))
			     (map #(fib %) upper-limit)))))

