(defn multiple [n] 
	(or (= 0 (mod n 3)) 
			(= 0 (mod n 5))))

(reduce + (filter multiple (range 1 1000)))
;; 233168
