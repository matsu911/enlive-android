(defproject enlive-android "0.1.1-SNAPSHOT"
  :description "a HTML selector-based (à la CSS) templating and transformation system for Clojure Android"
  :url "http://github.com/matsu911/enlive-android"
  :dependencies [[org.clojure-android/clojure "1.5.1-jb"]
                 [org.ccil.cowan.tagsoup/tagsoup "1.2.1"]]
  :license "Unknown"
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :target-path "target"
  :android {:library true
            :target-sdk :ics})
