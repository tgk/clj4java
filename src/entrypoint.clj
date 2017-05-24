(ns entrypoint)

(gen-class
 :name entrypoint.A
 :prefix classA-)

(gen-class
 :name entrypoint.B
 :prefix classB-)

(defn classA-toString
  [this]
  "I'm an A")

(defn classB-toString
  [this]
  "I'm a B")

(comment

  (.toString (entrypoint.A.))

  )
