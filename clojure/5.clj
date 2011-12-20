;; infinite sequence
(def inf (iterate #(inc %) 1))

;; are elements all identical?
(defn same? [coll] (apply = coll))

;; map of a modded by 1 through 10
(defn divvy [a] (map #(mod a %) (range 1 11)))

(println (some #(when (same? (divvy %)) %) inf))
