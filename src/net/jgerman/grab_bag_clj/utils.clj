(ns net.jgerman.grab-bag-clj.utils)

(defn selective-match?
  "Selectively compare map 1 and map 2. Only comparing the keys that exist in m1."
  [m1 m2]
  (= m1
     (select-keys m2 (keys m1))))
