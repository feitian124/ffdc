# financail data discovery competition 2018
A股主板上市公司公告信息抽取

# 分词
https://github.com/hankcs/HanLP
https://github.com/NLPchina/ansj_seg

## db

CREATE TABLE `shareholder_changes` (
  `id` int(20) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `shortname` varchar(60) DEFAULT NULL,
  `change_date` datetime NOT NULL,
  `price` decimal(22,4) DEFAULT NULL,
  `quantity` bigint(20) NOT NULL,
  `total` bigint(20) DEFAULT NULL,
  `ratio` decimal(22,4) DEFAULT NULL,
  PRIMARY KEY (`id`,`fullname`,`change_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='股东增减持';
