(ns ${package}.views.home
  (:use ${package}.views.common
        noir.core))

(defpage "/" []
  (layout "${package}"
    [:p "So far, so good."]))
