(defproject storm-benchmark "0.0.1-SNAPSHOT"
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :target-path "target"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [storm/storm "0.9.0-rc3"]]
:aot :all)
