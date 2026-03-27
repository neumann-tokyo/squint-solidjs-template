(ns main
  (:require ["@picocss/pico/css/pico.lime.css"]
            ["@solidjs/router" :refer [Router]]
            [app :refer [App]]
            [routes :refer [routes]]
            ["solid-js/web" :refer [render]]))

(def root (js/document.getElementById "root"))


(render (fn [] #jsx [Router {:root (fn [props] #jsx [App (.-children props)])}
                     routes])
        root)
