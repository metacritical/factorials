(defproject factorials "0.1.0"
  :description "Exploring Clojure with Factorial Computation"
  :repl-options { :init (use 'factorials.core) }
  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"]
  :test-paths ["src/test/clojure"]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [incanter/incanter-core "1.3.0-SNAPSHOT"]])
