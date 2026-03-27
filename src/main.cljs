(ns main
  (:require ["solid-js/web" :refer [render]]
            ["@picocss/pico/css/pico.lime.css"]
            ["@solidjs/router" :refer [Router]]
            [routes :refer [routes]]
            [app :refer [App]]))

(def root (js/document.getElementById "root"))


(render (fn [] #jsx [Router {:root (fn [props] #jsx [App (.-children props)])}
                     routes])
        root)
