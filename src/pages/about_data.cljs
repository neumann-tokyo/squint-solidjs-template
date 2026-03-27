(ns pages.about-data
  (:require ["@solidjs/router" :refer [createAsync query]]))

(defn- wait [ms data]
  (new js/Promise (fn [resolve] (js/setTimeout resolve ms data))))

(defn- random [min max]
  (+ (js/Math.floor (* (js/Math.random) (+ 1 (- max min)))) min))

(def ^:private getName
  (query (fn [] (wait (random 500 1000) "Solid")) "aboutName"))

(defn AboutData []
  (createAsync (fn [] (getName))))
