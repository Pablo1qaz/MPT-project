-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2025 at 09:52 PM
-- Wersja serwera: 10.4.32-MariaDB
-- Wersja PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `registration`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `company_types`
--

CREATE TABLE `company_types` (
  `company_type_id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `type` varchar(255) NOT NULL,
  `type_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `company_types`
--

INSERT INTO `company_types` (`company_type_id`, `description`, `type`, `type_name`) VALUES
(1, 'Wedding halls', 'halls', 'Wedding halls'),
(2, 'Photographer', 'photographer', 'Photographer'),
(3, 'Dj', 'dj', 'Dj'),
(4, 'Car', 'car', 'Car'),
(5, 'Makeup', 'makeup', 'Makeup'),
(6, 'Decorations', 'decorations', 'Decorations'),
(7, 'Cameraman', 'cameraman', 'Cameraman'),
(8, 'Dresses', 'dresses', 'Dresses'),
(9, 'Suits', 'suits', 'Suits'),
(10, 'Invitations', 'invitations', 'Invitations'),
(11, 'Rings', 'rings', 'Rings'),
(12, 'Gifts', 'gifts', 'Gifts');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `company_types`
--
ALTER TABLE `company_types`
  ADD PRIMARY KEY (`company_type_id`),
  ADD UNIQUE KEY `UK41f99v4fdyfywyb5wmk6os0vr` (`type`),
  ADD UNIQUE KEY `UKmg7v3yphk6vwebhkbshlkynh1` (`type_name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `company_types`
--
ALTER TABLE `company_types`
  MODIFY `company_type_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
