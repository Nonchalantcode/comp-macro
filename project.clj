(defproject composition-macro "0.1.0"
  :description "Just a silly macro for function composition"
  :url "https://github.com/Nonchalantcode/comp-macro"
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot composition-macro.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
