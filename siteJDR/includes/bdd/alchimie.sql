-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Ven 23 Mars 2018 à 21:41
-- Version du serveur :  5.7.11
-- Version de PHP :  7.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `alchimie`
--

-- --------------------------------------------------------

--
-- Structure de la table `ingredient`
--

CREATE TABLE `ingredient` (
  `id` int(11) NOT NULL,
  `nom` varchar(250) NOT NULL,
  `prix` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `ingredient`
--

INSERT INTO `ingredient` (`id`, `nom`, `prix`) VALUES
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

--
-- Index pour les tables exportées
--

--
-- Index pour la table `ingredient`
--
ALTER TABLE `ingredient`
  ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
