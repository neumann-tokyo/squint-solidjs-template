(ns app
  (:require ["@solidjs/router" :as router]
            ["solid-js" :refer [Suspense]]
            [components.flex :refer [Flex]]))

(def ALink (.-A router))

(defn App [props]
  #jsx [:div {:class "container"}
        [Flex {:justify-content "space-between"}
         [Flex {:align-items "center"}
          [:h1 {:style {:margin 0 :padding 0}}
           [ALink {:href "/" :style {:text-decoration "none" :color "black"}}
            "Squint SolidJS Template"]]]
         [Flex {:align-items "center" :gap "0.5rem"}
          [ALink {:href "/about"} "About"]
          [ALink {:href "/error"} "error-page"]]]
        [:main
         [Suspense (.-children props)]]])
