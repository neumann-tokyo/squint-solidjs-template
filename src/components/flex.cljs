(ns components.flex)

;; TODO 引数のパラメータをバリデーションする

(defn Flex [props]
  (let [style {:display "flex"
               :align-content (when (:align-content props) (:align-content props))
               :align-items (when (:align-items props) (:align-items props))
               :flex-direction (when (:flex-direction props) (:flex-direction props))
               :flex-grow (when (:flex-grow props) (:flex-grow props))
               :flex-shrink (when (:flex-shrink props) (:flex-shrink props))
               :flex-wrap (when (:flex-wrap props) (:flex-wrap props))
               :justify-content (when (:justify-content props) (:justify-content props))
               :order (when (:order props) (:order props))
               :gap (when (:gap props) (:gap props))
               :row-gap (when (:row-gap props) (:row-gap props))
               :column-gap (when (:column-gap props) (:column-gap props))

               :height (when (:height props) (:height props))
               :width (when (:width props) (:width props))

               :margin (when (:margin props) (:margin props))
               :padding (when (:padding props) (:padding props))}]

    #jsx [:div {:style style}
          (.-children props)]))
