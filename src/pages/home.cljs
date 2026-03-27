(ns pages.home
  (:require ["solid-js" :refer [createSignal]]))

(defn Home []
  (let [[count setCount] (createSignal 0)]
    #jsx [:section
          [:h1 "Home"]
          [:p "This is the home page."]

          [:div {:class "grid"}
           [:button {:type "button" :onClick (fn [] (setCount (dec (count))))} "-"]
           [:button {:type "button" :onClick (fn [] (setCount (inc (count))))} "+"]]

          [:p (str "Count:" (count))]]))
