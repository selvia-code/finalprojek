-- phpMyAdmin SQL Dump
-- version 4.9.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Waktu pembuatan: 05 Jun 2020 pada 13.53
-- Versi server: 10.1.45-MariaDB
-- Versi PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `souj3944_dbmodel`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblmoddel`
--

CREATE TABLE `tblmoddel` (
  `id` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `version` varchar(30) NOT NULL,
  `image` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tblmoddel`
--

INSERT INTO `tblmoddel` (`id`, `nama`, `version`, `image`) VALUES
('1', 'Cupcake', '1.5', 'cupcake.png'),
('2', 'Donut', '1.6', 'donut.png'),
('3', 'Eclair', '2.0-2.1', 'eclair.png');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
