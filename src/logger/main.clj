(ns logger.main (:require [clojure.java.io :as io]))

(defn print-logger [writer] 
  #(binding [*out* writer] 
     (println (flatten %&))))

(defn file-logger [file]
  #(with-open [f (io/writer file :append true)]
     ((print-logger f) %&)))

(def log->file (file-logger "log.txt"))

(defn multi-logger [& logger-fns]
  #(doseq [f logger-fns]
     (f %&)))

(def log (multi-logger (print-logger *out*) log->file))


