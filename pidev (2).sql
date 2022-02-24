-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 24, 2022 at 03:54 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pidev`
--

-- --------------------------------------------------------

--
-- Table structure for table `cour`
--

DROP TABLE IF EXISTS `cour`;
CREATE TABLE IF NOT EXISTS `cour` (
  `id` int(11) DEFAULT NULL,
  `id_enseignant` int(11) NOT NULL,
  `titre` varchar(50) NOT NULL,
  `prix` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cour`
--

INSERT INTO `cour` (`id`, `id_enseignant`, `titre`, `prix`) VALUES
(6, 1000, 'equation differentielle', 3),
(1, 1000, 'équation non linéaire', 2),
(2, 1000, 'équations linéaires', 2),
(7, 1001, 'ADF', 3),
(3, 1002, 'C/C#', 8),
(4, 1002, 'Java', 12);

-- --------------------------------------------------------

--
-- Table structure for table `enseignant`
--

DROP TABLE IF EXISTS `enseignant`;
CREATE TABLE IF NOT EXISTS `enseignant` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `tel` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `pwd` varchar(30) NOT NULL,
  `carte_banq` varchar(28) NOT NULL,
  `role` varchar(20) NOT NULL,
  `universite` varchar(20) NOT NULL,
  `section` varchar(20) NOT NULL,
  `niveau` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `etudiant`
--

DROP TABLE IF EXISTS `etudiant`;
CREATE TABLE IF NOT EXISTS `etudiant` (
  `id_etudiant` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `tel` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `pwd` varchar(30) NOT NULL,
  `carte_banq` varchar(28) NOT NULL,
  `role` varchar(20) NOT NULL,
  `section` varchar(20) NOT NULL,
  `niveau` int(2) NOT NULL,
  `score` int(6) NOT NULL,
  PRIMARY KEY (`id_etudiant`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `etudiant`
--

INSERT INTO `etudiant` (`id_etudiant`, `nom`, `prenom`, `tel`, `email`, `pwd`, `carte_banq`, `role`, `section`, `niveau`, `score`) VALUES
(1, 'Rami', 'bd', 55646466, 'mail@mail', 'motps', 'aaaaa', 'etudiant', 'info', 3, 100),
(2, 'hana', 'bd', 55646466, 'mail@mail', 'motps', 'aaaaa', 'etudiant', 'info', 3, 100),
(3, 'adfasf', 'acasca', 5614, 'casdc321', 'caca', 'caca', 'etudiant', 'caca', 3, 1500);

-- --------------------------------------------------------

--
-- Table structure for table `responsable`
--

DROP TABLE IF EXISTS `responsable`;
CREATE TABLE IF NOT EXISTS `responsable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `tel` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `pwd` varchar(30) NOT NULL,
  `carte_banq` varchar(28) NOT NULL,
  `role` varchar(20) NOT NULL,
  `universite` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `tel` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `pwd` varchar(30) NOT NULL,
  `carte_banq` varchar(28) NOT NULL,
  `role` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nom`, `prenom`, `tel`, `email`, `pwd`, `carte_banq`, `role`) VALUES
(1, 'Trabelsi', 'fatma', 55646466, 'mail@mail', 'motps', 'aaaaa', NULL),
(2, 'Rami', 'bd', 55646466, 'mail@mail', 'motps', 'aaaaa', NULL),
(3, 'Rami', 'loooool', 55646466, 'mail@mail', 'motps', 'aaaaa', NULL),
(5, 'ahmed', 'ali', 56464, 'haja', 'pass', '6464sdsa', NULL),
(8, 'hana', 'mensia', 555532, 'hana.mensia@esprit.tn', 'hahahaha', 'fsdssvd', NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
