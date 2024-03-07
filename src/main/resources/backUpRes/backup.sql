-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: information_portal
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrator`
--

DROP TABLE IF EXISTS `administrator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `administrator` (
  `admin_no` char(20) NOT NULL,
  `userID` char(20) NOT NULL,
  PRIMARY KEY (`admin_no`),
  UNIQUE KEY `userID` (`userID`),
  CONSTRAINT `administrator_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `allpeople` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrator`
--

LOCK TABLES `administrator` WRITE;
/*!40000 ALTER TABLE `administrator` DISABLE KEYS */;
INSERT INTO `administrator` VALUES ('1','1'),('2','2'),('3','3');
/*!40000 ALTER TABLE `administrator` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `allpeople`
--

DROP TABLE IF EXISTS `allpeople`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `allpeople` (
  `userID` char(20) NOT NULL,
  `username` char(20) NOT NULL,
  `sex` enum('男','女') NOT NULL DEFAULT '男',
  `tel` char(20) NOT NULL,
  `notice_deliver_priv` tinyint(1) NOT NULL,
  `pass_word` char(20) NOT NULL,
  `usertype_no` char(20) NOT NULL,
  `department_no` char(20) NOT NULL,
  PRIMARY KEY (`userID`),
  KEY `username_index` (`username`),
  KEY `department_no_index` (`department_no`),
  KEY `usertype_no_index` (`usertype_no`),
  CONSTRAINT `allpeople_ibfk_1` FOREIGN KEY (`usertype_no`) REFERENCES `usertype` (`usertype_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `allpeople_ibfk_2` FOREIGN KEY (`department_no`) REFERENCES `department` (`department_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `allpeople`
--

LOCK TABLES `allpeople` WRITE;
/*!40000 ALTER TABLE `allpeople` DISABLE KEYS */;
INSERT INTO `allpeople` VALUES ('1','张三','男','18888888877',1,'123456','4','1'),('10','郑庚','女','18888888888',1,'123456','4','9'),('10001','测试发件人','男','12312312312',1,'123456','1','6'),('2','李四','女','18888888888',1,'123456','4','2'),('3','王五','男','18888888888',1,'123456','4','3'),('4','赵甲','男','18888888888',0,'123456','1','4'),('5','钱乙','女','18888888888',0,'123456','1','4'),('6','孙丙','女','18888888888',0,'123456','1','9'),('8','周戊','男','18888888888',0,'123456','1','9'),('9','吴己','女','18888888888',0,'123456','2','5');
/*!40000 ALTER TABLE `allpeople` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `department_no` char(20) NOT NULL,
  `department_name` char(20) NOT NULL,
  `department_address` char(30) NOT NULL,
  PRIMARY KEY (`department_no`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES ('1','党委办公室','综合楼101'),('2','党委组织部','综合楼102'),('3','保卫部','综合楼103'),('4','民族学与社会学学院','文华楼101'),('5','经济学院','明德楼102'),('6','管理学院','明德楼101'),('7','法学院','文华楼102'),('8','历史文化学院','文华楼103'),('9','信息工程学院','理工楼101');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notice` (
  `notice_no` int NOT NULL AUTO_INCREMENT,
  `senderID` char(20) NOT NULL,
  `title` char(30) NOT NULL,
  `sendtime` timestamp NOT NULL,
  `content` varchar(15000) NOT NULL,
  `notice_type` enum('办公通知','教学通知','科研通知','学工通知') NOT NULL,
  `department_no` char(20) NOT NULL,
  PRIMARY KEY (`notice_no`),
  KEY `title_index` (`title`),
  KEY `sendtime_index` (`sendtime`),
  KEY `department_no_index` (`department_no`),
  KEY `notice_type_index` (`notice_type`),
  KEY `senderID_index` (`senderID`),
  CONSTRAINT `new_notice_ibfk_1` FOREIGN KEY (`senderID`) REFERENCES `allpeople` (`userID`),
  CONSTRAINT `new_notice_ibfk_2` FOREIGN KEY (`department_no`) REFERENCES `department` (`department_no`)
) ENGINE=InnoDB AUTO_INCREMENT=72 DEFAULT CHARSET=gbk;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice`
--

LOCK TABLES `notice` WRITE;
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
INSERT INTO `notice` VALUES (57,'1','新办公室入驻通知','2023-11-16 09:16:43','为了提升办公环境，公司将于下周搬入新的办公室，请各部门做好迁移准备。','办公通知','1'),(58,'1','学院活动通知','2023-11-16 09:17:08',' 下周五将在学院举行文艺汇演活动，欢迎大家积极报名参与。','学工通知','1'),(59,'1','科研项目启动通知','2023-11-16 09:17:34','新的科研项目即将启动，研究组成员请做好准备，准时参与项目启动会议。','科研通知','1'),(60,'2','重要教学事项通知','2023-11-16 09:18:12','请各位教师注意，下周将进行期末考试安排会议，请提前准备相关教材。','教学通知','2'),(62,'2','学生事务咨询服务通知','2023-11-16 09:18:49','学院设立学生事务咨询服务中心，提供学生心理辅导和学业咨询服务，欢迎同学们前来咨询。','学工通知','2'),(64,'3',' 教学培训通知','2023-11-16 09:19:53','教务处将组织一场关于新教学技术的培训，参加培训的教师请提前报名。','教学通知','3'),(65,'3',' 健康生活讲座通知','2023-11-16 09:20:22','学校将邀请专业医生为师生们讲解健康生活知识，欢迎大家踊跃参与。','学工通知','3'),(66,'3','科研项目成果展示通知','2023-11-16 09:20:44','科研项目成果展示将于下月举行，各研究组请准备好展示内容。','科研通知','3'),(67,'2','科研项目中期汇报通知','2023-11-16 09:22:10','各研究组请注意，科研项目中期汇报将在本周进行，请做好相关准备。','科研通知','2'),(68,'1','测试按部门','2023-11-17 14:52:42','测试按部门呢\n','办公通知','1'),(69,'1','测试按人员','2023-11-17 14:53:01','测试按人员','科研通知','1'),(71,'1','测试可见性','2023-11-18 01:20:47','测试','办公通知','1');
/*!40000 ALTER TABLE `notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice_receiver`
--

DROP TABLE IF EXISTS `notice_receiver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notice_receiver` (
  `notice_no` int NOT NULL,
  `receiverID` char(20) NOT NULL,
  PRIMARY KEY (`notice_no`,`receiverID`),
  KEY `receiverID` (`receiverID`),
  CONSTRAINT `notice_receiver_ibfk_1` FOREIGN KEY (`notice_no`) REFERENCES `notice` (`notice_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `notice_receiver_ibfk_2` FOREIGN KEY (`receiverID`) REFERENCES `allpeople` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice_receiver`
--

LOCK TABLES `notice_receiver` WRITE;
/*!40000 ALTER TABLE `notice_receiver` DISABLE KEYS */;
INSERT INTO `notice_receiver` VALUES (57,'1'),(58,'1'),(59,'1'),(60,'1'),(62,'1'),(64,'1'),(65,'1'),(66,'1'),(67,'1'),(68,'1'),(69,'1'),(57,'10'),(58,'10'),(59,'10'),(60,'10'),(62,'10'),(64,'10'),(65,'10'),(66,'10'),(67,'10'),(68,'10'),(69,'10'),(68,'10001'),(69,'10001'),(57,'2'),(58,'2'),(59,'2'),(60,'2'),(62,'2'),(64,'2'),(65,'2'),(66,'2'),(67,'2'),(68,'2'),(69,'2'),(71,'2'),(57,'3'),(58,'3'),(59,'3'),(60,'3'),(62,'3'),(64,'3'),(65,'3'),(66,'3'),(67,'3'),(68,'3'),(69,'3'),(71,'3'),(57,'4'),(58,'4'),(59,'4'),(60,'4'),(62,'4'),(64,'4'),(65,'4'),(66,'4'),(67,'4'),(68,'4'),(69,'4'),(71,'4'),(57,'5'),(58,'5'),(59,'5'),(60,'5'),(62,'5'),(64,'5'),(65,'5'),(66,'5'),(67,'5'),(68,'5'),(69,'5'),(71,'5'),(57,'6'),(58,'6'),(59,'6'),(60,'6'),(62,'6'),(64,'6'),(65,'6'),(66,'6'),(67,'6'),(68,'6'),(69,'6'),(71,'6'),(57,'8'),(58,'8'),(59,'8'),(60,'8'),(62,'8'),(64,'8'),(65,'8'),(66,'8'),(67,'8'),(68,'8'),(69,'8'),(57,'9'),(58,'9'),(59,'9'),(60,'9'),(62,'9'),(64,'9'),(65,'9'),(66,'9'),(68,'9'),(69,'9');
/*!40000 ALTER TABLE `notice_receiver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usertype`
--

DROP TABLE IF EXISTS `usertype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usertype` (
  `usertype_no` char(20) NOT NULL,
  `usertype_name` char(20) NOT NULL,
  PRIMARY KEY (`usertype_no`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usertype`
--

LOCK TABLES `usertype` WRITE;
/*!40000 ALTER TABLE `usertype` DISABLE KEYS */;
INSERT INTO `usertype` VALUES ('1','本科生'),('2','研究生'),('3','留学生'),('4','在职事业编'),('5','非事业编制合同制'),('6','外聘'),('7','博士后'),('8','师资博士后');
/*!40000 ALTER TABLE `usertype` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-18  9:21:40
