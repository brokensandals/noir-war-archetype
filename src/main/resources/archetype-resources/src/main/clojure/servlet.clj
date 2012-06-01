(ns ${package}.servlet
  (:use noir.server
        ring.util.servlet)
  (:gen-class :extends javax.servlet.http.HttpServlet))

(let [service-impl (atom nil)]
  (defn -service
    [servlet request response]
    (when-not @service-impl ; it'd be cleaner to do this in init, but I had trouble making that work
      (reset! service-impl
        (make-service-method
          (gen-handler :base-url (-> (.getServletContext servlet) .getContextPath)
                       :mode (-> "noir.mode" System/getProperty (or :prod) keyword)))))
    (@service-impl servlet request response)))
