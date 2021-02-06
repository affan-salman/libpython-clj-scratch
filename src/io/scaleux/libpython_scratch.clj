(ns io.scaleux.libpython-scratch
  (:gen-class))

(comment

  ;; Evaluate the following forms while following the suggestions in the
  ;; comments below.

  (require '[libpython-clj.python :as py])

  (py/initialize!)

  ;; If the last call failed due to version detection failure or because the
  ;; libpython dynamic library was not found, you can use the next form instead
  ;; after supplying the respective paths below:
  ;;
  ;; The example below is for pyenv on macOS.
  ;;
  ;; For this, I found the dylib through:
  ;;
  ;;    $ find ~/.pyenv -name 'libpython*.dylib'
  ;;
  ;;    $ file /Users/affan/.pyenv/versions/3.8.7/Python.framework/Versions/3.8/lib/libpython3.8.dylib
  ;;    Mach-O 64-bit dynamically linked shared library x86_64
  (py/initialize! :python-executable
                  "/Users/affan/.pyenv/versions/3.8.7/Python.framework/Versions/3.8/bin/python3.8"
                  :library-path
                  "/Users/affan/.pyenv/versions/3.8.7/Python.framework/Versions/3.8/lib/libpython3.8.dylib")

  (def test-dict (py/->python {:a 1 :b 2}))

  (py/att-type-map test-dict)

  ,)
