-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2022 at 01:13 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `stdemail` varchar(50) NOT NULL,
  `stdpassword` varchar(50) NOT NULL,
  `stdname` varchar(50) NOT NULL,
  `stdgrade` int(10) NOT NULL,
  `stdclass` varchar(50) DEFAULT NULL,
  `stdrollnumber` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `stdemail`, `stdpassword`, `stdname`, `stdgrade`, `stdclass`, `stdrollnumber`) VALUES
(1, 'admin@admin.com', 'admin', 'admin', 0, NULL, '2022/00'),
(2, 'a.mohamed@alustudent.com', '12345678', 'Ahmed Mohamed', 11, 'Rejected', '2022/02'),
(3, 'Ednah@alustudent.com', '12345678', 'Ednah', 14, 'BA', '2022/03'),
(4, 'Myra@alustudent.com', '12345678', 'Myra', 16, 'GC', '2022/04'),
(5, 'sam@alustudent.com', '12345678', 'Samuel', 20, 'CS', '2022/05'),
(6, 'fail@alustudent.com', '12345678', 'fail', 10, 'Rejected', '2022/06');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
