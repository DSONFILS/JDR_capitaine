-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Sam 02 Septembre 2017 à 10:49
-- Version du serveur :  5.7.11
-- Version de PHP :  7.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `pillage`
--

CREATE DATABASE hykosya;

USE hykosya;

-- --------------------------------------------------------

--
-- Structure de la table `materiau`
--

CREATE TABLE `materiau` (
  `id` int(11) NOT NULL,
  `ressource` varchar(50) NOT NULL,
  `prix` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `materiau`
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
-- Structure de la table `vivres`
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

-- --------------------------------------------------------

--
-- Structure de la table `ingredient`
--

CREATE TABLE `alchimie` (
  `id` int(11) NOT NULL,
  `nom` varchar(250) NOT NULL,
  `prix` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `ingredient`
--

INSERT INTO `alchimie` (`id`, `nom`, `prix`) VALUES
(1, 'Vitriol', '2000'),
(2, 'Vermillon', '5000'),
(3, 'Rebis', '5000'),
(4, 'Ether', '17000'),
(5, 'Querbith', '8000'),
(6, 'Lotus noir', '6000'),
(7, 'Grâce cristalline', '6000'),
(8, 'Fade ortie', '8000'),
(9, 'Fade ortie brulante', '20000'),
(10, 'Coeur d\'orage', '20000'),
(11, 'Sang de dragon', '35000'),
(12, 'Felandaris', '15000'),
(13, 'Elfidée', '2000'),
(14, 'Poudre d\'os', '2000'),
(15, 'Arin vadale', '8000'),
(16, 'Ninnroot', '10000'),
(17, 'Obscurcine', '12000');

-- --------------------------------------------------------

--
-- Structure de la table `ingredient`
--

CREATE TABLE `continent` (
  `id` int(11) NOT NULL,
  `nom` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `ingredient`
--

INSERT INTO `alchimie` (`id`, `nom`) VALUES
(1, 'Atrodia'),
(2, 'Corlantae'),
(3, 'Hepothysus'),
(4, 'Revus'),
(5, 'Tertio'),
(6, 'Verkonos'),
(7, 'Les Terres désolées');

-- --------------------------------------------------------

--
-- Table structure for table `atrodia`
--

CREATE TABLE `atrodia` (
  `id` int(11) NOT NULL,
  `idnom` varchar(50) NOT NULL,
  `idvivre` varchar(50) NOT NULL,
  `idmateriau` varchar(50) DEFAULT NULL,
  `idmat_r` varchar(50) DEFAULT NULL,
  `idviv_r` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `atrodia`
--

INSERT INTO `atrodia` (`id`, `idnom`,`idvivre`, `idmateriau`, `idmat_r`, `idviv_r`) VALUES
(1, 1, 13, 14, NULL, 3),
(2, 1, 21, 24, NULL, 22),
(3, 1, 18, 3, NULL, 15),
(4, 1, 9, 8, 28, NULL),
(5, 1, 11, 10, 23, NULL),
(6, 1, 10, 17, 27, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `corlantae`
--

CREATE TABLE `corlantae` (
  `id` int(11) NOT NULL,
  `idnom` varchar(50) NOT NULL,
  `idvivre` varchar(50) NOT NULL,
  `idmateriau` varchar(50) DEFAULT NULL,
  `idmat_r` varchar(50) DEFAULT NULL,
  `idviv_r` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `corlantae`
--

INSERT INTO `corlantae` (`id`, `idnom`,`idvivre`, `idmateriau`, `idmat_r`, `idviv_r`) VALUES
(1, 2, 14, 2, NULL, 29),
(2, 2, 22, 27, NULL, 10),
(3, 2, 4, 26, NULL, 15),
(4, 2, 12, 8, 13, NULL),
(5, 2, 28, 7, 18, NULL),
(6, 2, 30, 17, 4, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `hepothysus`
--

CREATE TABLE `hepothysus` (
  `id` int(11) NOT NULL,
  `idnom` varchar(50) NOT NULL,
  `idvivre` varchar(50) NOT NULL,
  `idmateriau` varchar(50) DEFAULT NULL,
  `idmat_r` varchar(50) DEFAULT NULL,
  `idviv_r` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hepothysus`
--

INSERT INTO `hepothysus` (`id`, `idnom`,`idvivre`, `idmateriau`, `idmat_r`, `idviv_r`) VALUES
(1, 3, 20, 21, NULL, 11),
(2, 3, 10, 27, 3, NULL),
(3, 3, 4, 18, 13, NULL),
(4, 3, 15, 5, 30, NULL),
(5, 3, 22, 22, 15, NULL),
(6, 3, 23, 29, 2, NULL);

--
-- Table structure for table `olegea`
--

CREATE TABLE `olegea` (
  `id` int(11) NOT NULL,
  `idnom` varchar(50) NOT NULL,
  `idvivre` varchar(50) NOT NULL,
  `idmateriau` varchar(50) DEFAULT NULL,
  `idmat_r` varchar(50) DEFAULT NULL,
  `idviv_r` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `olegea`
--

INSERT INTO `olegea` (`id`, `idnom`,`idvivre`, `idmateriau`, `idmat_r`, `idviv_r`) VALUES
(1, 4, 18, 4, NULL, 17),
(2, 4, 21, 9, NULL, 3),
(3, 4, 25, 12, NULL, 14),
(4, 4, 9, 15, 30, NULL),
(5, 4, 11, 7, 27, NULL),
(6, 4, 16, 17, 13, NULL);

--
-- Table structure for table `revus`
--

CREATE TABLE `revus` (
  `id` int(11) NOT NULL,
  `idnom` varchar(50) NOT NULL,
  `idvivre` varchar(50) NOT NULL,
  `idmateriau` varchar(50) DEFAULT NULL,
  `idmat_r` varchar(50) DEFAULT NULL,
  `idviv_r` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `revus`
--

INSERT INTO `revus` (`id`, `idnom`,`idvivre`, `idmateriau`, `idmat_r`, `idviv_r`) VALUES
(1, 4, 6, 16, NULL, 10),
(2, 4, 8, 27, NULL, 24),
(3, 4, 7, 2, NULL, 9),
(4, 4, 4, 5, NULL, 26),
(5, 4, 5, 20, 8, NULL),
(6, 4, 19, 24, 9, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tertio`
--

CREATE TABLE `tertio` (
  `id` int(11) NOT NULL,
  `idnom` varchar(50) NOT NULL,
  `idvivre` varchar(50) NOT NULL,
  `idmateriau` varchar(50) DEFAULT NULL,
  `idmat_r` varchar(50) DEFAULT NULL,
  `idviv_r` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tertio`
--

INSERT INTO `tertio` (`id`, `idnom`,`idvivre`, `idmateriau`, `idmat_r`, `idviv_r`) VALUES
(1, 5, 17, 7, NULL, 16),
(2, 5, 8, 3, NULL, 3),
(3, 5, 6, 23, 9, NULL),
(4, 5, 4, 15, 18, NULL),
(5, 5, 2, 6, 19, NULL),
(6, 5, 25, 20, 26, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `verkonos`
--

CREATE TABLE `verkonos` (
  `id` int(11) NOT NULL,
  `idnom` varchar(50) NOT NULL,
  `idvivre` varchar(50) NOT NULL,
  `idmateriau` varchar(50) DEFAULT NULL,
  `idmat_r` varchar(50) DEFAULT NULL,
  `idviv_r` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `verkonos`
--

INSERT INTO `verkonos` (`id`, `idnom`,`idvivre`, `idmateriau`, `idmat_r`, `idviv_r`) VALUES
(1, 6, 28, 19, NULL, 19),
(2, 6, 10, 18, NULL, 4),
(3, 6, 11, 29, NULL, 6),
(4, 6, 16, 11, 26, NULL),
(5, 6, 2, 25, 3, NULL),
(6, 6, 24, 27, 14, NULL);

-- --------------------------------------------------------

--
-- Index pour les tables exportées
--

--
-- Index pour la table `materiau`
--
ALTER TABLE `materiau`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `vivres`
--
ALTER TABLE `vivres`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `alchimie`
--
ALTER TABLE `alchimie`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `alchimie`
--
ALTER TABLE `continent`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `atrodia`
--
ALTER TABLE `atrodia`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `alchimie`
--
ALTER TABLE `corlantae`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `alchimie`
--
ALTER TABLE `hepothysus`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `alchimie`
--
ALTER TABLE `olegea`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `alchimie`
--
ALTER TABLE `revus`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `alchimie`
--
ALTER TABLE `tertio`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `alchimie`
--
ALTER TABLE `verkonos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour la table `materiau`
--
ALTER TABLE `materiau`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT pour la table `vivres`
--
ALTER TABLE `vivres`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
