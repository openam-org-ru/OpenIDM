CREATE SCHEMA IF NOT EXISTS `contractordb` DEFAULT CHARACTER SET utf8;
USE `contractordb` ;

#
# drop any existing tables that need to be created
#

CREATE TABLE contractordb.people (
  UNIQUE_ID     VARCHAR(12) NOT NULL PRIMARY KEY,
  STATUS        VARCHAR(16) NOT NULL,
  TYPE          VARCHAR(32) NOT NULL,
  CONTRACTOR_NUMBER        VARCHAR(12),
  NAME_FIRST    VARCHAR(30) NOT NULL,
  NAME_LAST     VARCHAR(30) NOT NULL,
  NAME_FULL     VARCHAR(60),
  NAME_FIRST_UTF8 VARCHAR(30),
  NAME_LAST_UTF8 VARCHAR(30),
  NAME_FULL_UTF8 VARCHAR(60),
  SUNRISE_DATE DATE,
  SUNSET_DATE DATE,
  TITLE         VARCHAR(48),
  EMAIL         VARCHAR(60),
  PHONE_WORK    VARCHAR(20),
  ORGANIZATION  VARCHAR(48),
  LOCATION      VARCHAR(20),
  SPONSOR       VARCHAR(12),
  DATE_BIRTH    VARCHAR(12),
  SSN_LASTFOUR  VARCHAR(4),
  CHANGE_TIMESTEMP TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  INDEX INDEX1 (CONTRACTOR_NUMBER),
  INDEX INDEX2 (NAME_FIRST),
  INDEX INDEX3 (NAME_LAST),
  INDEX INDEX4 (SPONSOR),
  INDEX INDEX5 (ORGANIZATION)
) ENGINE = InnoDB;