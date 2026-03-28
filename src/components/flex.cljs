(ns components.flex
  (:require ["valibot" :as v]
            [libs.type-checker :refer [check-props]]))

(def flex-props-schema
  (let [align-content-enum (.picklist v ["flex-start" "flex-end" "center" "space-between" "space-around" "space-evenly" "stretch"])
        align-items-enum (.picklist v ["stretch" "flex-start" "flex-end" "center" "baseline"])
        flex-direction-enum (.picklist v ["row" "row-reverse" "column" "column-reverse"])
        flex-wrap-enum (.picklist v ["nowrap" "wrap" "wrap-reverse"])
        justify-content (.picklist v ["flex-start" "flex-end" "center" "space-between" "space-around" "space-evenly"])]
    (.object v {:align-context (.optiona v align-content-enum)
                :align-items  (.optiona v align-items-enum)
                :flex-direction  (.optiona v flex-direction-enum)
                :flex-wrap  (.optiona v flex-wrap-enum)
                :justify-content  (.optiona v justify-content)
                :gap  (.optiona v (.string v))
                :row-gap  (.optiona v (.string v))
                :column-gap  (.optiona v (.string v))

                :height  (.optiona v (.string v))
                :width  (.optiona v (.string v))

                :margin  (.optiona v (.string v))
                :padding  (.optiona v (.string v))})))

(defn Flex [props]
  {:pre [(check-props props flex-props-schema)]}
  (let [style {:display "flex"
               :align-content (when (:align-content props) (:align-content props))
               :align-items (when (:align-items props) (:align-items props))
               :flex-direction (when (:flex-direction props) (:flex-direction props))
               :flex-wrap (when (:flex-wrap props) (:flex-wrap props))
               :justify-content (when (:justify-content props) (:justify-content props))
               :gap (when (:gap props) (:gap props))
               :row-gap (when (:row-gap props) (:row-gap props))
               :column-gap (when (:column-gap props) (:column-gap props))

               :height (when (:height props) (:height props))
               :width (when (:width props) (:width props))

               :margin (when (:margin props) (:margin props))
               :padding (when (:padding props) (:padding props))}]

    #jsx [:div {:style style}
          (.-children props)]))
