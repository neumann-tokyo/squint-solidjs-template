(ns app
  (:require ["solid-js" :refer [Suspense]]
            ["@solidjs/router" :as router]))

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
