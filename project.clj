(defproject grab-bag-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [cheshire "5.10.0"]
                 [com.cognitect.aws/api "0.8.505"]
                 [com.cognitect.aws/endpoints "1.1.11.976"]
                 [com.cognitect.aws/s3 "811.2.865.0"]
                 [com.cognitect.aws/states "810.2.801.0"]
                 [com.cognitect.aws/lambda "810.2.817.0"]
                 [com.cognitect.aws/secretsmanager "811.2.858.0"]]
  :repl-options {:init-ns grab-bag-clj.core})
