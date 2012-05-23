#!/usr/bin/clojure

(defn average [numbers]
  (/ (apply + numbers) (count numbers))) 

(pr (average (read-string "[10 2 3 4 7]")))
