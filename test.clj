#!/usr/bin/clojure

(defn l [x]
  (println x))

(defn average [numbers]
  (/ (apply + numbers) (count numbers))) 

(l (average (read-string "[10 2 3 4 7]")))

(def person {:name "Ken Simpson" :city "SPB"})
(l (:city person))

(l (re-seq #"^(.*)\s+(.*)$" (:name person)))

(l (= [1 2 3] [1, 2, 3]))
