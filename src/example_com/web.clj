(ns example-com.web
  (:require [hiccup.core :refer [html]]))

(defn dev-handler [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (html [:h1 "Hello, world!"])})