(ns logger.main (:require [clojure.java.io :as io]))

(defn print-logger [writer] 
  #(binding [*out* writer] 
     (println %)))

(defn file-logger [file]
  #(with-open [f (io/writer file :append true)]
     ((print-logger f) %)))

(def log->file (file-logger "log.txt"))



