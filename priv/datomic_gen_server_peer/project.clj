(defproject datomic_gen_server/peer "2.2.5"
  :description "Datomic peer server in Clojure, accepting edn strings which will be sent by Elixir"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.374"]
                 [org.clojure/core.match "0.3.0-alpha4"]
                 [org.clojure/tools.cli "0.3.3"]
                 [clojure-erlastic "0.3.1"]
                 [io.rkn/conformity "0.4.0"]
                 [com.datomic/datomic-free "0.9.5350"]
                 [vvvvalvalval/datomock "0.1.0"]
                ]
  :main datomic_gen_server.peer
  :aot :all)

; If you are using Datomic Pro, the repository above will be necessary and you'll
; need your credentials for it. You'll need to install gpg for this.
; 
; First write your credentials map to ~/.lein/credentials.clj like so:
; 
;   {#"my\.datomic\.com" {:username "[USERNAME]"
;                         :password "[LICENSE_KEY]"}}
; Then encrypt it with gpg:
; 
;   $ gpg --default-recipient-self -e ~/.lein/credentials.clj > ~/.lein/credentials.clj.gpg
;
; Remember to delete the plaintext credentials.clj once you've encrypted it.
