(ns session)

;; Purpose of aarhus.clj and these meetups
;;; To get better
;;; To meet other Clojure peeps in Aarhus/East Jutland

;; Intro round
;;; Name, interests, experience with Clojure?


;; Agenda
;;  Me talking (< 30m)
;;    Purpose of aarhus.clj
;;    Intro round
;;    Introduction to the language
;;    Installing Clojure using Leiningen
;;    Solving the first couple of 4Clojure problems
;;  You hacking! (90m)
;;    Install lein on your machine
;;    Solve some 4Clojure problems
;;  All the time: Hang out and socialise (if you're into that)


;; --- Introduction to the language ---

;;; Parentheses!

(+ 1 2)
(+ 1 2 3)

(- 4 3 2)


;;; Datatypes

nil
42
:foo
"bar"

(class nil)
(class 42)
(class :foo)
(class "bar")

(= 42 1)
(= "foo" "bar")
(= "foo" "foo")

;;;; Lists

(list 1 2 3)
(list "foo" "bar" "baz")

(conj '(:bar :baz) :foo)

(to-array (list 1 2 3))
(into-array (list 1 2 3))

;;;; Vectors

["hello" "world" "!"]
(vec (list 1 2 3))
(vector 4 5 6)

(= (list 1 2 3) [1 2 3])

(conj [:bar :baz] :foo)

([1 2 3] 1)

;;;; Sets

#{1 2 3}
(set '(1 2 3))
(set '(1 1 2 2 3 3))

(conj #{:bar :baz} :foo)

(#{1 2 3} 4)

;;;; Maps

{:a 20, "b" 30}
(hash-map :foo 42, :bar 2)

(conj {:bar 1, :baz 2} [:foo 0])

({:foo 42 :bar 10} :foo)


;;; Built in functions

(first [3 2 1])
(first #{3 2 1})
(first {:foo 0, :bar 2})

(rest [3 2 1])


;;; API

;;;; https://clojure.github.io/clojure/clojure.core-api.html


;;; Functions

(fn [x] (+ x 2))

((fn [x] (+ x 2)) 40)

(map (fn [x] (+ x 2)) '(1 2 3))

(filter (fn [x] (= (mod x 2) 0)) '(1 2 3 4 5 6))


;;; Java interoperability

(.toUpperCase "hello")

(System/currentTimeMillis)

(import 'javax.swing.JFrame)

(comment
  (def frame (JFrame. "Hello Frame"))
  (.setSize frame 200 200)
  (.setVisible frame true)

  (doto (JFrame. "Hello again")
    (.setSize 200 200)
    (.setVisible true))
  )


;;; Clojure wrappers for Java libraries

;;;; As an example we use Amazonica at GoMore
;;;; https://github.com/mcohen01/amazonica#ec2


;;; Hosting Clojure vs. Java apps

;;;; uberjar.clj
;;;; lein uberjar
;;;; lein bin

;;;; ring.clj
;;;; lein ring server // jetty
;;;; lein ring uberwar // for any container


;;; Writing a Java library in Clojure

;;;; entrypoint.clj
