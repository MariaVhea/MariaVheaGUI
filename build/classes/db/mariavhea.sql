-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2025 at 06:26 AM
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
(57, 23, 'Logged in to the system', '2025-05-21 16:31:54'),
(58, 23, 'Logged out from the system', '2025-05-21 16:33:32'),
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
(77, 23, 'Logged in to the system', '2025-05-21 19:44:06'),
(98, 29, 'Logged in to the system', '2025-05-23 06:47:55'),
(99, 29, 'Logged out from the system', '2025-05-23 06:48:37'),
(100, 29, 'Logged in to the system', '2025-05-23 06:49:52'),
(101, 29, 'Added a student record', '2025-05-23 06:50:45'),
(102, 29, 'Added a student violation', '2025-05-23 06:51:28'),
(103, 29, 'Logged out from the system', '2025-05-23 06:51:59'),
(104, 30, 'Logged in to the system', '2025-05-23 06:52:09'),
(105, 29, 'Logged in to the system', '2025-05-28 02:55:19'),
(106, 29, 'Logged out from the system', '2025-05-28 02:56:52'),
(107, 31, 'Logged in to the system', '2025-05-28 02:59:14'),
(108, 31, 'Logged out from the system', '2025-05-28 02:59:28'),
(109, 29, 'Logged in to the system', '2025-05-28 02:59:38'),
(110, 29, 'Added a student record', '2025-05-28 03:00:38'),
(111, 29, 'Added a student violation', '2025-05-28 03:02:12'),
(112, 29, 'Logged out from the system', '2025-05-28 03:10:43'),
(113, 30, 'Logged in to the system', '2025-05-28 03:10:50'),
(114, 29, 'Logged in to the system', '2025-05-28 03:12:12'),
(115, 29, 'Logged out from the system', '2025-05-28 03:12:30'),
(116, 30, 'Logged in to the system', '2025-05-28 03:12:39'),
(117, 30, 'Logged out from the system', '2025-05-28 03:14:34'),
(118, 29, 'Logged in to the system', '2025-05-28 04:24:35');

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
(4, 30, '54321', 'bsit', 2, 'c', '2025-05-23 06:50:45'),
(5, 31, '12345', 'BSIT', 4, 'C', '2025-05-28 03:00:37');

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
(23, 'admin', 'admin', '0923243434', 'admin@gmail.com', 'administrator', '4CfyzCHB4X7lcxBwT8xSLnrRWwB4n8caQCWjDQmiat0=', 'Admin', 'Active', '', NULL, NULL),
(29, 'Vhea', 'Vhea', '09232368863', 'vhea@gmail.com', 'Mvhea123', 'f49917bb43497c66b9a9826c42ae4996b9e478ce0442825f625d5093c69d1ae4', 'Admin', 'Active', '', 'Food?', 'siya'),
(30, 'wow', 'wow', '09232368863', 'wow@gmail.com', 'wow123', '7c569eb299a221cba6b2438a7e8dbba13dc44bdf68b4e0f9de495c9a086a7395', 'User', 'Active', '', 'pet?', 'dog'),
(31, 'Wew', 'wew', '09323256678', 'wew@gmail.com', 'wew123', 'c6a43bfb3669ffd2f5788141ca3f41f5ea69d7b965b150164fde912aeeddfe5b', 'User', 'Active', '', 'Food?', 'adobo');

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
(4, 4, 'Harass', 'Punching', '2025-05-23', 'Resolved'),
(5, 5, 'Academic Dishonesty', 'Cheating', '2025-05-28', 'Pending');

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
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=119;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `student_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `violations`
--
ALTER TABLE `violations`
  MODIFY `violation_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

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
