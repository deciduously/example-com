(set-env!
 :source-paths #{"src/"}
 :dependencies '[[org.clojure/clojure "1.9.0"]
                 [hiccup "1.0.5" :scope "test"]
                 [pandeiro/boot-http "0.8.3" :scope "test"]])

(task-options!
  pom {:project 'example-com
       :description "Static website generator and server"
       :url "http://www.example.com"
       :license {"MIT" "https://mit-license.org"}
       :developers {"you" "dev@example.com"}})

(require '[pandeiro.boot-http :refer [serve]])

(deftask dev
  "Run live development server"
  []
  (comp
    (serve :handler 'example-com.web/dev-handler :reload true :port 3000)
    (wait)))
