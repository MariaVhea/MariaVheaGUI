-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2025 at 09:51 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mariavhea`
--

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `log_id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `action` varchar(255) DEFAULT NULL,
  `timestamp` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`log_id`, `user_id`, `action`, `timestamp`) VALUES
(1, 17, 'Logged in to the system', '2025-03-26 04:35:39'),
(2, 17, 'Logged in to the system', '2025-03-26 10:03:57'),
(3, 17, 'Logged in to the system', '2025-03-26 10:04:41'),
(4, 17, 'Logged in to the system', '2025-03-26 10:09:27'),
(5, 17, 'Logged in to the system', '2025-03-26 10:13:43'),
(6, 17, 'Logged in to the system', '2025-03-26 10:35:40'),
(7, 17, 'Logged in to the system', '2025-03-26 10:40:10'),
(8, 17, 'Logged in to the system', '2025-03-26 10:50:59'),
(9, 17, 'Logged in to the system', '2025-03-26 11:16:02'),
(10, 17, 'Logged in to the system', '2025-03-26 11:24:41'),
(11, 17, 'Logged out from the system', '2025-03-26 11:25:45'),
(12, 17, 'Logged in to the system', '2025-03-26 11:38:53'),
(13, 17, 'Logged in to the system', '2025-03-26 12:01:23'),
(14, 17, 'Logged in to the system', '2025-03-26 12:06:49'),
(15, 17, 'Logged out from the system', '2025-03-26 12:07:57'),
(16, 17, 'Logged in to the system', '2025-03-26 13:59:30'),
(17, 17, 'Logged out from the system', '2025-03-26 14:00:16'),
(18, 17, 'Logged in to the system', '2025-03-26 14:05:24'),
(19, 17, 'Logged out from the system', '2025-03-26 14:06:58'),
(20, 17, 'Logged in to the system', '2025-03-26 15:00:29'),
(21, 17, 'Logged in to the system', '2025-03-26 15:02:11'),
(22, 17, 'Logged in to the system', '2025-03-26 15:18:47'),
(23, 17, 'Logged out from the system', '2025-03-26 15:19:01'),
(24, 17, 'Logged in to the system', '2025-03-26 15:19:17'),
(25, 17, 'Logged out from the system', '2025-03-26 15:20:00'),
(26, 17, 'Logged in to the system', '2025-03-27 02:55:24'),
(27, 17, 'Logged out from the system', '2025-03-27 02:55:34'),
(28, 17, 'Logged in to the system', '2025-03-27 03:15:09'),
(29, 17, 'Logged out from the system', '2025-03-27 03:15:51'),
(30, 17, 'Logged in to the system', '2025-03-27 03:21:22'),
(31, 17, 'Logged in to the system', '2025-03-27 03:28:19'),
(32, 17, 'Logged in to the system', '2025-03-27 03:33:09'),
(33, 17, 'Logged out from the system', '2025-03-27 03:33:29'),
(34, 17, 'Logged in to the system', '2025-03-27 03:38:46'),
(35, 17, 'Logged in to the system', '2025-03-27 03:40:31'),
(36, 17, 'Logged in to the system', '2025-03-27 03:54:05'),
(37, 17, 'Logged out from the system', '2025-03-27 03:54:30'),
(38, 17, 'Logged in to the system', '2025-03-27 04:01:49'),
(39, 17, 'Logged in to the system', '2025-03-27 04:56:02'),
(40, 17, 'Logged in to the system', '2025-03-27 04:58:32'),
(41, 17, 'Logged in to the system', '2025-03-27 05:12:08'),
(42, 17, 'Logged in to the system', '2025-03-27 05:16:35'),
(43, 17, 'Logged in to the system', '2025-03-27 05:31:03'),
(44, 17, 'Logged in to the system', '2025-03-27 05:44:12'),
(45, 17, 'Logged in to the system', '2025-03-27 05:50:45'),
(46, 17, 'Logged in to the system', '2025-03-27 05:56:20'),
(47, 17, 'Logged in to the system', '2025-03-27 06:01:42'),
(48, 17, 'Logged in to the system', '2025-05-04 05:31:07'),
(49, 17, 'Logged in to the system', '2025-05-04 07:14:11'),
(50, 17, 'Logged in to the system', '2025-05-04 07:18:26'),
(51, 17, 'Logged in to the system', '2025-05-04 07:24:01'),
(52, 17, 'Logged in to the system', '2025-05-04 07:35:15'),
(53, 17, 'Logged in to the system', '2025-05-04 07:40:40'),
(54, 17, 'Logged in to the system', '2025-05-04 07:46:16'),
(55, 17, 'Logged in to the system', '2025-05-04 07:48:51'),
(56, 17, 'Logged out from the system', '2025-05-04 07:54:09'),
(57, 23, 'Logged in to the system', '2025-05-21 16:31:54'),
(58, 23, 'Logged out from the system', '2025-05-21 16:33:32'),
(59, 24, 'Logged in to the system', '2025-05-21 16:33:51'),
(60, 24, 'Logged out from the system', '2025-05-21 16:38:15'),
(61, 23, 'Logged in to the system', '2025-05-21 17:12:11'),
(62, 23, 'Logged in to the system', '2025-05-21 17:13:52'),
(63, 23, 'Logged in to the system', '2025-05-21 17:15:45'),
(64, 23, 'Logged in to the system', '2025-05-21 17:22:02'),
(65, 23, 'Logged in to the system', '2025-05-21 18:09:53'),
(66, 23, 'Logged in to the system', '2025-05-21 18:14:03'),
(67, 23, 'Logged in to the system', '2025-05-21 18:15:35'),
(68, 23, 'Logged in to the system', '2025-05-21 18:18:11'),
(69, 23, 'Logged in to the system', '2025-05-21 18:20:52'),
(70, 23, 'Logged in to the system', '2025-05-21 18:29:50'),
(71, 23, 'Logged in to the system', '2025-05-21 18:30:38'),
(72, 23, 'Logged in to the system', '2025-05-21 18:31:00'),
(73, 23, 'Logged in to the system', '2025-05-21 18:32:07'),
(74, 23, 'Logged in to the system', '2025-05-21 18:32:59'),
(75, 23, 'Logged in to the system', '2025-05-21 19:20:09'),
(76, 23, 'Logged in to the system', '2025-05-21 19:41:05'),
(77, 23, 'Logged in to the system', '2025-05-21 19:44:06');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `student_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL,
  `student_number` varchar(50) NOT NULL,
  `course` varchar(100) NOT NULL,
  `year_level` int(2) NOT NULL,
  `section` varchar(50) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`student_id`, `u_id`, `student_number`, `course`, `year_level`, `section`, `created_at`) VALUES
(1, 17, '923434545454', 'BSIT', 2, 'B', '2025-05-21 17:16:00');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `u_id` int(11) NOT NULL,
  `fn` varchar(255) NOT NULL,
  `ln` varchar(255) NOT NULL,
  `cn` varchar(255) NOT NULL,
  `em` varchar(255) NOT NULL,
  `us` varchar(255) NOT NULL,
  `ps` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  `image` varchar(50) NOT NULL,
  `sq` varchar(255) DEFAULT NULL,
  `ans` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`u_id`, `fn`, `ln`, `cn`, `em`, `us`, `ps`, `type`, `status`, `image`, `sq`, `ans`) VALUES
(17, 'Maria', 'Vhea', '09232368863', 'mariavhea@gmail.com', 'MariaVhea123', '8k92QqZZB3BJiedDOEMyDf0fq38O83hyOY44bh1AQAQ=', 'Admin', 'Active', '', NULL, NULL),
(23, 'admin', 'admin', '0923243434', 'admin@gmail.com', 'administrator', '4CfyzCHB4X7lcxBwT8xSLnrRWwB4n8caQCWjDQmiat0=', 'Admin', 'Active', '', NULL, NULL),
(24, 'user', 'user', '09232432432', 'user@gmail.com', 'user123', 'RyUMjdExlDHn+QOIDP7on9hqVld9tV7PXqnpcjjiGm4=', 'User', 'Active', 'src/Images3.PNG', NULL, NULL),
(25, 'testtt', 'testtttt', '092323232', 'testtttt@gmail.com', 'test1234', 'h3bxCOJHqx4rMjBCwEnCZkB8gfutQb3h6N/Bu2b9Jn4=', 'User', 'Active', 'src/Images7.PNG', NULL, NULL),
(26, 'hahay', 'hay', '092324345435', 'hays@gmail.com', 'hays123', 'NR/pOBFz5Ie7WRTEA4qbYQOQKCP2LTfUH8W6XpaPDN8=', 'Admin', 'Pending', '', 'What is my favorite code?', 'Gummy Bear');

-- --------------------------------------------------------

--
-- Table structure for table `violations`
--

CREATE TABLE `violations` (
  `violation_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `violation_type` varchar(255) NOT NULL,
  `description` text DEFAULT NULL,
  `date_reported` date NOT NULL,
  `status` varchar(50) DEFAULT 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `violations`
--

INSERT INTO `violations` (`violation_id`, `student_id`, `violation_type`, `description`, `date_reported`, `status`) VALUES
(1, 1, 'Harrass', 'He Punched his classmate', '2025-05-22', 'Resolved');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`student_id`),
  ADD UNIQUE KEY `student_number` (`student_number`),
  ADD KEY `u_id` (`u_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`u_id`),
  ADD KEY `u_id` (`u_id`);

--
-- Indexes for table `violations`
--
ALTER TABLE `violations`
  ADD PRIMARY KEY (`violation_id`),
  ADD KEY `fk_violations_students` (`student_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=78;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `student_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `violations`
--
ALTER TABLE `violations`
  MODIFY `violation_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `logs_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`u_id`) ON DELETE CASCADE;

--
-- Constraints for table `students`
--
ALTER TABLE `students`
  ADD CONSTRAINT `students_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `users` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `violations`
--
ALTER TABLE `violations`
  ADD CONSTRAINT `fk_violations_students` FOREIGN KEY (`student_id`) REFERENCES `students` (`student_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
