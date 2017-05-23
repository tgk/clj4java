(defproject clj4java "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.5.0"]]
  :main uberjar
  :plugins [[lein-bin "0.3.4"]
            [lein-ring "0.9.7"]]
  :bin {:name "cljbin"
        :bin-path "~/bin"
        :bootclasspath true}
  :profiles {:uberjar {:aot :all}}
  :ring {:handler ring/handler})
