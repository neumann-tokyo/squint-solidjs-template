(ns routes
  (:require [pages.home :refer [Home]]
            [pages.about :refer [About]]
            [errors.not-found :refer [NotFound]]
            [pages.about-data :refer [AboutData]]))

(def routes
  [{:path "/"
    :component Home}
   {:path "/about"
    :component About
    :data AboutData}
   {:path "**"
    :component NotFound}])
