(ns libs.type-checker
  (:require ["valibot" :as v]))

(defn check-props [props schema]
  (if (-> import .-meta .-env .-DEV)
    (let [result (.safeParse v schema props)]
      (.-success result))
    true))
