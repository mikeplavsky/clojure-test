#!/usr/bin/clojure
(ns test)

(defn l [x]
  (println x))

(l *ns*)

(defn average [numbers]
  (/ (apply + numbers) (count numbers))) 

(l average)
(l (class average))

(l (average (read-string "[10 2 3 4 7]")))

(def person {:name "Ken Simpson" :city "SPB"})
(l (:city person))

(l (re-seq #"^(.*)\s+(.*)$" (:name person)))

(l (= [1 2 3] [1, 2, 3]))

(l 
  (do 
    (l "Wow")
    (apply * '(1 2 3 4))))

(l 
  (let [a (rand-int 6) b (rand-int 6)]
    (l (format "you've got a=%s b=%s" a b))
    (+ a b)))


