(ns app
  (:require ["@solidjs/router" :as router]
            ["solid-js" :refer [Suspense]]))

(def ALink (.-A router))

(defn App [props]
  #jsx [:div {:class "container"}
        [:nav
         [:ul
          [:li
           [:strong "YenMa"]]]
         [:ul
          [:li
           [ALink {:href "/"} "Home"]
           [ALink {:href "/about"} "About"]
           [ALink {:href "/error"} "Services"]]]]
        [:main
         [Suspense (.-children props)]]])
