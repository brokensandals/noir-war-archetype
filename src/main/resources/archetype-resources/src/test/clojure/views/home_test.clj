(ns ${package}.views.home-test
  (:use ${package}.views.home
        clojure.test
        noir.util.test))

(deftest get-home
  (is (= 200 (:status (send-request "/")))))
