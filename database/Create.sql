CREATE TABLE `bill` (
  `bno` int NOT NULL AUTO_INCREMENT,
  `ubid` int NOT NULL,
  `amt` float NOT NULL,
  `mid` int NOT NULL,
  `date` date NOT NULL,
  `transaction_id` varchar(45) NOT NULL,
  PRIMARY KEY (`bno`),
  UNIQUE KEY `bno_UNIQUE` (`bno`),
  UNIQUE KEY `transaction_id_UNIQUE` (`transaction_id`),
  KEY `ubid_idx` (`ubid`),
  KEY `mid_idx` (`mid`),
  CONSTRAINT `mid` FOREIGN KEY (`mid`) REFERENCES `payment_mode` (`mid`),
  CONSTRAINT `ubid` FOREIGN KEY (`ubid`) REFERENCES `user` (`uid`)
) 



CREATE TABLE `city` (
  `cid` int NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cid`),
  UNIQUE KEY `cid_UNIQUE` (`cid`)
) 

CREATE TABLE `farmerproducttype` (
  `fptid` int NOT NULL AUTO_INCREMENT,
  `ufpid` int NOT NULL,
  `ptfpid` int NOT NULL,
  `qty` int NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`fptid`),
  UNIQUE KEY `fptid_UNIQUE` (`fptid`),
  KEY `ufpid_idx` (`ufpid`),
  KEY `ptfpid_idx` (`ptfpid`),
  CONSTRAINT `ptfpid` FOREIGN KEY (`ptfpid`) REFERENCES `producttype` (`ptid`),
  CONSTRAINT `ufpid` FOREIGN KEY (`ufpid`) REFERENCES `user` (`uid`)
) 


CREATE TABLE `order` (
  `oid` int NOT NULL AUTO_INCREMENT,
  `uoid` int NOT NULL,
  `odate` date NOT NULL,
  `total_price` int NOT NULL,
  PRIMARY KEY (`oid`),
  UNIQUE KEY `oid_UNIQUE` (`oid`),
  KEY `uoid_idx` (`uoid`),
  CONSTRAINT `uoid` FOREIGN KEY (`uoid`) REFERENCES `user` (`uid`)
) 


CREATE TABLE `orderdetails` (
  `odid` int NOT NULL AUTO_INCREMENT,
  `fptoiod` int NOT NULL,
  `oid` int NOT NULL,
  `qty` int NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`odid`),
  UNIQUE KEY `d_UNIQUE` (`odid`),
  KEY `fptoid_idx` (`fptoiod`),
  KEY `oid_idx` (`oid`),
  CONSTRAINT `fptoid` FOREIGN KEY (`fptoiod`) REFERENCES `farmerproducttype` (`fptid`),
  CONSTRAINT `oid` FOREIGN KEY (`oid`) REFERENCES `order` (`oid`)
) 


CREATE TABLE `payment_mode` (
  `mid` int NOT NULL AUTO_INCREMENT,
  `mname` varchar(15) NOT NULL,
  PRIMARY KEY (`mid`)
)


CREATE TABLE `product` (
  `pid` int NOT NULL AUTO_INCREMENT,
  `pname` varchar(15) NOT NULL,
  PRIMARY KEY (`pid`),
  UNIQUE KEY `pid_UNIQUE` (`pid`)
) 


CREATE TABLE `producttype` (
  `ptid` int NOT NULL AUTO_INCREMENT,
  `pid` int NOT NULL,
  `ptname` varchar(15) NOT NULL,
  PRIMARY KEY (`ptid`),
  UNIQUE KEY `pid_UNIQUE` (`ptid`),
  KEY `pid_idx` (`pid`),
  CONSTRAINT `pid` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`)
)


CREATE TABLE `role` (
  `rid` int NOT NULL AUTO_INCREMENT,
  `rname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`rid`),
  UNIQUE KEY `rid_UNIQUE` (`rid`)
)



CREATE TABLE `user` (
  `uid` int NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) NOT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `rid` int NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `cid` int NOT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `adhaar` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `uid_UNIQUE` (`uid`),
  UNIQUE KEY `pwd_UNIQUE` (`pwd`),
  UNIQUE KEY `uname_UNIQUE` (`uname`),
  UNIQUE KEY `adhaar_UNIQUE` (`adhaar`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  KEY `rid_idx` (`rid`),
  KEY `cid_idx` (`cid`),
  CONSTRAINT `cid` FOREIGN KEY (`cid`) REFERENCES `city` (`cid`),
  CONSTRAINT `rid` FOREIGN KEY (`rid`) REFERENCES `role` (`rid`)
) 