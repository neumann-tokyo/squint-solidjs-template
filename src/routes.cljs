(ns routes
  (:require [errors.not-found :refer [NotFound]]
            [pages.about :refer [About]]
            [pages.about-data :refer [AboutData]]
            [pages.home :refer [Home]]))

(def routes
  [{:path "/"
    :component Home}
   {:path "/about"
    :component About
    :data AboutData}
   {:path "**"
    :component NotFound}])
