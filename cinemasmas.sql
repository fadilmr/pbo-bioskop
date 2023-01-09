-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 10, 2023 at 12:01 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cinemasmas`
--

-- --------------------------------------------------------

--
-- Table structure for table `movie`
--

CREATE TABLE `movie` (
  `Movie_ID` int(11) NOT NULL,
  `Title` varchar(50) NOT NULL,
  `Duration` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `movie`
--

INSERT INTO `movie` (`Movie_ID`, `Title`, `Duration`) VALUES
(1, 'Bocchi The Rock!', 5),
(3, 'MiddMan', 3),
(10, 'onimai', 2),
(11, 'kiseki', 72),
(12, 'onepiece', 2);

-- --------------------------------------------------------

--
-- Table structure for table `screening`
--

CREATE TABLE `screening` (
  `Screening_ID` int(11) NOT NULL,
  `TheaterNum` int(11) NOT NULL,
  `MovieTitle` varchar(50) NOT NULL,
  `JamTayang` varchar(50) NOT NULL,
  `Price` int(11) NOT NULL,
  `SeatAvailability` varchar(36) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `screening`
--

INSERT INTO `screening` (`Screening_ID`, `TheaterNum`, `MovieTitle`, `JamTayang`, `Price`, `SeatAvailability`) VALUES
(1, 1, 'Bocchi The Rock!', '12:00', 40000, '000000001101111100001111111011111010'),
(3, 2, 'Bocchi The Rock!', '12:00', 40000, '111111111111111111111111111111111111'),
(5, 3, 'onimai', '14:00', 20000, '001111111111111100011111111111111111'),
(7, 3, 'MiddMan', '15:00', 40000, '111111111111111111111111111111111111'),
(8, 3, 'kiseki', '15:00', 40000, '111111111111111111111111111111111111'),
(9, 3, 'MiddMan', '15:00', 40000, '111111111111111111111111111111111111'),
(10, 2, 'onimai', '15:00', 40000, '111111111111111111111111111111111111'),
(12, 1, 'onepiece', '11:00', 20000, '111111111111111111111111111111111111');

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `Transaction_ID` int(11) NOT NULL,
  `Movie` varchar(255) NOT NULL,
  `Theater` varchar(50) NOT NULL,
  `Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`Transaction_ID`, `Movie`, `Theater`, `Price`) VALUES
(1, 'Bocchi The Rock!', '1', 50000),
(2, 'Bocchi The Rock!', '1', 50000),
(3, 'Bocchi The Rock!', '1', 75000),
(4, 'Bocchi The Rock!', '1', 50000),
(5, 'Chainsaw MId', '1', 50000),
(6, 'Chainsaw MId', '1', 50000),
(7, 'Chainsaw MId', '1', 50000),
(8, 'Chainsaw MId', '1', 50000),
(9, 'Chainsaw MId', '3', 50000),
(12, 'Chainsaw MId', '1', 25000),
(13, 'onimai', '3', 75000),
(14, 'onimai', '3', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `User_ID` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Username` varchar(255) NOT NULL,
  `Role` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`User_ID`, `Name`, `Username`, `Role`, `Password`) VALUES
(1, 'Fadil', 'diru', 'Admin', 'a'),
(3, 'Rafli', 'Raflidev', 'Kasir', 'asdasdasd'),
(4, 'Sien', 'a', 'Cashier', 'a'),
(5, 'saf', 'safads', 'Admin', 'asdasdasd'),
(6, 'asd', 'asd', 'Cashier', 'asdasdasd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `movie`
--
ALTER TABLE `movie`
  ADD PRIMARY KEY (`Movie_ID`);

--
-- Indexes for table `screening`
--
ALTER TABLE `screening`
  ADD PRIMARY KEY (`Screening_ID`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`Transaction_ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`User_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `movie`
--
ALTER TABLE `movie`
  MODIFY `Movie_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `screening`
--
ALTER TABLE `screening`
  MODIFY `Screening_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `Transaction_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `User_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
