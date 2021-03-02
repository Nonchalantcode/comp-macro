(ns composition-macro.core
  (:gen-class))

 (defmacro comp-macro [& funcs]
  `(fn [~'arg]
     ~@(reduce (fn [acc curr]
                 (if (list? curr)
                   (if (or (= 'fn (first curr)) (= '*fn (first curr)))
                     (list (list* curr acc))
                     (list (apply list (conj (vec curr) (first acc)))))
                   (list (conj acc curr))))
              (list 'arg)
              funcs)))
