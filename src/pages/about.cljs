(ns pages.about
  (:require [pages.about-data :refer [AboutData]]
            ["solid-js" :refer [createEffect Suspense]]))

(defn About []
  (let [name (AboutData)]
    (createEffect
     (fn []
       (prn (name))))
    #jsx [:section
          [:h1 "About"]
          [:p "A page all about this website."]
          [:p
           [:span "We love"]
           [Suspense {:fallback [:span "..."]}
            [:span (name)]]]]))
