(ns ${package}.views.common
  (:use hiccup.page
        noir.core))

(defpartial layout [title & content]
  (html5
    [:head
      [:title title]
      (include-css "/css/reset.css")]
    [:body
      [:div#content
        content]]))
