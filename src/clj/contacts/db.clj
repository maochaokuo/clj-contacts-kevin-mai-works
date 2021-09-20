(ns contacts.db
  (:require [hugsql.core :as hugsql]))

(def config
  {:classname "org.postgresql.Driver"
   :subprotocol "postgresql"
   :subname "//localhost:5432/postgres"
   :user "postgres"
   :password "postgres"})

(hugsql/def-db-fns "sql/contacts.sql")
