;; solution to problem 1
(defn multiple? [n] 
	(or (= 0 (mod n 3)) 
	    (= 0 (mod n 5))))

(println (str "The number is: " (reduce + (filter multiple? (range 1 1000)))))
