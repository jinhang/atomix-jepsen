(defproject io.atomix/atomix-jepsen "0.1.0-SNAPSHOT"
  :description "Atomix Jepsen tests"
  :url "http://github.com/atomix/atomix-jepsen"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [jepsen "0.0.7"]
                 [io.atomix/trinity "0.1.0-SNAPSHOT"]
                 [ch.qos.logback/logback-classic "1.1.3"]]
  :main atomix-jepsen.replica
  :aot [atomix-jepsen.replica]
  :uberjar-name "atomix-replica.jar"
  :plugins [[lein-localrepo "0.5.3"]]
  :repositories [["sonatype-nexus-snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots"}]]
  :jvm-opts ["-Xmx32g" "-XX:+UseConcMarkSweepGC" "-XX:+UseParNewGC"
             "-XX:+CMSParallelRemarkEnabled" "-XX:+AggressiveOpts"
             "-XX:+UseFastAccessorMethods" "-server"])
