
(def acc (atom 1))

(defn accu [] (swap! acc + 1))

(defn div [n d]
  (if (= 1 d)
    0
    (if (= 0 (mod n d))
      (div n (dec d))
      1)))

;; if div equals 0, return n, else call again with accu

(defn divides? [n]
  (if (= 0 (div n 20))
    n
    (divides? (accu))))

(divides? (accu))









