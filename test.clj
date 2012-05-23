#!/usr/bin/clojure

(defn average [numbers]
  (/ (apply + numbers) (count numbers))) 

(println (average (read-string "[10 2 3 4 7]")))

(def person {:name "Ken Simpson" :city "SPB"})
(println (:city person))

(println (re-seq #"^(.*)\s+(.*)$" (:name person)))

(println (= [1 2 3] [1, 2, 3]))
