-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 01, 2018 at 07:55 AM
-- Server version: 5.7.11
-- PHP Version: 7.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `commerce`
--

-- --------------------------------------------------------

--
-- Table structure for table `atrodia`
--

CREATE TABLE `atrodia` (
  `id` int(11) NOT NULL,
  `vivre` varchar(50) NOT NULL,
  `materiau` varchar(50) NOT NULL,
  `recherche` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `atrodia`
--

INSERT INTO `atrodia` (`id`, `vivre`, `materiau`, `recherche`) VALUES
(1, 'Vache/Lait', 'Tissus', 'Avoine'),
(2, 'Sucre', 'Acier', 'Rhum'),
(3, 'Poule/Oeuf', 'Or', 'Mouton'),
(4, 'Ananas', 'Pin', 'Plume'),
(5, 'Tomate', 'Orme', 'Huile de Baleine'),
(6, 'Cafe', 'Lin', 'Fer');

-- --------------------------------------------------------

--
-- Table structure for table `corlantae`
--

CREATE TABLE `corlantae` (
  `id` int(11) NOT NULL,
  `vivre` varchar(50) NOT NULL,
  `materiau` varchar(50) NOT NULL,
  `recherche` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `corlantae`
--

INSERT INTO `corlantae` (`id`, `vivre`, `materiau`, `recherche`) VALUES
(1, 'Porc', 'Cuivre', 'Baleine'),
(2, 'Rhum', 'Fer', 'Cafe'),
(3, 'Orge', 'Ebonite', 'Mouton'),
(4, 'Patate', 'Pin', 'Acajou'),
(5, 'Tabac', 'Bouleau', 'Parchemin'),
(6, 'Thon', 'Lin', 'Diamand');

-- --------------------------------------------------------

--
-- Table structure for table `hepothysus`
--

CREATE TABLE `hepothysus` (
  `id` int(11) NOT NULL,
  `vivre` varchar(50) NOT NULL,
  `materiau` varchar(50) NOT NULL,
  `recherche` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hepothysus`
--

INSERT INTO `hepothysus` (`id`, `vivre`, `materiau`, `recherche`) VALUES
(1, 'Sanglier', 'Voile', 'Tomate'),
(2, 'Cafe', 'Fer', 'Or'),
(3, 'Orge', 'Parchemin', 'Acajou'),
(4, 'Mouton', 'Topaze/Rubis', 'Bronze'),
(5, 'Rhum', 'Cordage', 'Soie'),
(6, 'Bière', 'Argent', 'Cuivre');

-- --------------------------------------------------------

--
-- Table structure for table `materiau`
--

CREATE TABLE `materiau` (
  `id` int(11) NOT NULL,
  `ressource` varchar(50) NOT NULL,
  `prix` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `materiau`
--

INSERT INTO `materiau` (`id`, `ressource`, `prix`) VALUES
(1, 'Rien', 0),
(2, 'Cuivre', 2000),
(3, 'Or', 25000),
(4, 'Diamand/Saphir', 50000),
(5, 'Topaze/Rubis', 50000),
(6, 'Emeraude', 55000),
(7, 'Bouleau', 1000),
(8, 'Pin', 1000),
(9, 'Pierre', 1000),
(10, 'Orme', 1500),
(11, 'Chene', 1200),
(12, 'Sapin', 1000),
(13, 'Acajou', 2000),
(14, 'Tissus', 750),
(15, 'Soie', 5000),
(16, 'Laine', 1000),
(17, 'Lin', 1500),
(18, 'Parchemin', 6000),
(19, 'Encre', 5000),
(20, 'Poudre', 3000),
(21, 'Voile', 2000),
(22, 'Cordage', 3000),
(23, 'Huile de baleine', 4000),
(24, 'Acier', 5000),
(25, 'Ebene', 6000),
(26, 'Ebonite', 25000),
(27, 'Fer', 2000),
(28, 'Plume', 750),
(29, 'Argent', 10000),
(30, 'Bronze', 2500);

-- --------------------------------------------------------

--
-- Table structure for table `olegea`
--

CREATE TABLE `olegea` (
  `id` int(11) NOT NULL,
  `vivre` varchar(50) NOT NULL,
  `materiau` varchar(50) NOT NULL,
  `recherche` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `olegea`
--

INSERT INTO `olegea` (`id`, `vivre`, `materiau`, `recherche`) VALUES
(1, 'Poule/Oeuf', 'Diamand/Saphir', 'Chevre/Lait'),
(2, 'Sucre', 'Pierre', 'Avoine'),
(3, 'Raisin/Vin', 'Sapin', 'Porc'),
(4, 'Ananas', 'Soie', 'Bronze'),
(5, 'Tomate', 'Bouleau', 'Fer'),
(6, 'Farine', 'Lin', 'Acajou');

-- --------------------------------------------------------

--
-- Table structure for table `revus`
--

CREATE TABLE `revus` (
  `id` int(11) NOT NULL,
  `vivre` varchar(50) NOT NULL,
  `materiau` varchar(50) NOT NULL,
  `recherche` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `revus`
--

INSERT INTO `revus` (`id`, `vivre`, `materiau`, `recherche`) VALUES
(1, 'Malte', 'Laine', 'Cafe'),
(2, 'Banane', 'Fer', 'Liqueur'),
(3, 'Pomme', 'Cuivre', 'Ananas'),
(4, 'Orge', 'Topaze/Rubis', 'Caviar'),
(5, 'Riz', 'Poudre', 'Pin'),
(6, 'Cerf', 'Acier', 'Pierre');

-- --------------------------------------------------------

--
-- Table structure for table `tertio`
--

CREATE TABLE `tertio` (
  `id` int(11) NOT NULL,
  `vivre` varchar(50) NOT NULL,
  `materiau` varchar(50) NOT NULL,
  `recherche` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tertio`
--

INSERT INTO `tertio` (`id`, `vivre`, `materiau`, `recherche`) VALUES
(1, 'Chevre/Lait', 'Bouleau', 'Farine'),
(2, 'Banane', 'Or', 'Avoine'),
(3, 'Malte', 'Huile de Baleine', 'Pierre'),
(4, 'Orge', 'Soie', 'Parchemin'),
(5, 'Blé', 'Emeraude', 'Encre'),
(6, 'Raisin/Vin', 'Poudre', 'Ebonite');

-- --------------------------------------------------------

--
-- Table structure for table `verkonos`
--

CREATE TABLE `verkonos` (
  `id` int(11) NOT NULL,
  `vivre` varchar(50) NOT NULL,
  `materiau` varchar(50) NOT NULL,
  `recherche` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `verkonos`
--

INSERT INTO `verkonos` (`id`, `vivre`, `materiau`, `recherche`) VALUES
(1, 'Tabac', 'Encre', 'Cerf'),
(2, 'Cafe', 'Parchemin', 'Orge'),
(3, 'Tomate', 'Argent', 'Malte'),
(4, 'Farine', 'Chene', 'Ebonite'),
(5, 'Ble', 'Ebene', 'Or'),
(6, 'Liqueur', 'Fer', 'Tissus');

-- --------------------------------------------------------

--
-- Table structure for table `vivres`
--

CREATE TABLE `vivres` (
  `id` int(11) NOT NULL,
  `ressource` varchar(50) NOT NULL,
  `prix` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vivres`
--

INSERT INTO `vivres` (`id`, `ressource`, `prix`) VALUES
(1, 'Rien', 0),
(2, 'Ble', 500),
(3, 'Avoine', 750),
(4, 'Orge', 750),
(5, 'Riz', 2000),
(6, 'Malte', 750),
(7, 'Pomme', 750),
(8, 'Banane', 850),
(9, 'Ananas', 1500),
(10, 'Cafe', 2500),
(11, 'Tomate', 1000),
(12, 'Patate', 750),
(13, 'Vache/Lait', 1500),
(14, 'Porc', 750),
(15, 'Mouton', 1500),
(16, 'Farine', 1000),
(17, 'Chevre/Lait', 1500),
(18, 'Poule/oeuf', 750),
(19, 'Cerf', 4000),
(20, 'Sanglier', 2000),
(21, 'Sucre', 750),
(22, 'Rhum', 1000),
(23, 'Biere', 500),
(24, 'Liqueur', 60000),
(25, 'Raisin/Vin', 3000),
(26, 'Caviar', 5000),
(27, 'Choux', 750),
(28, 'Tabac', 2500),
(29, 'Baleine', 7500),
(30, 'Thon', 2500);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `atrodia`
--
ALTER TABLE `atrodia`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `corlantae`
--
ALTER TABLE `corlantae`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `hepothysus`
--
ALTER TABLE `hepothysus`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `olegea`
--
ALTER TABLE `olegea`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `revus`
--
ALTER TABLE `revus`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tertio`
--
ALTER TABLE `tertio`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `verkonos`
--
ALTER TABLE `verkonos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `atrodia`
--
ALTER TABLE `atrodia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `corlantae`
--
ALTER TABLE `corlantae`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `hepothysus`
--
ALTER TABLE `hepothysus`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `olegea`
--
ALTER TABLE `olegea`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `revus`
--
ALTER TABLE `revus`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `tertio`
--
ALTER TABLE `tertio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `verkonos`
--
ALTER TABLE `verkonos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
