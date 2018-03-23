-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Ven 23 Mars 2018 à 21:40
-- Version du serveur :  5.7.11
-- Version de PHP :  7.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `jdr`
--

-- --------------------------------------------------------

--
-- Structure de la table `bateau`
--

CREATE TABLE `bateau` (
  `id` int(11) NOT NULL,
  `classe` varchar(50) NOT NULL,
  `exp` int(11) NOT NULL,
  `resistance` int(11) NOT NULL,
  `vitesse` double NOT NULL,
  `bonus_def` int(11) NOT NULL,
  `bonus_ref` int(11) NOT NULL,
  `nb_canon` int(11) NOT NULL,
  `idsoute` int(11) NOT NULL,
  `idequipage` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `bateau`
--

INSERT INTO `bateau` (`id`, `classe`, `exp`, `resistance`, `vitesse`, `bonus_def`, `bonus_ref`, `nb_canon`, `idsoute`, `idequipage`) VALUES
(1, 'Sloop', 453, 156, 1.5, 2, 1, 2, 1, 1),
(2, 'Caravelle', 734, 372, 1.5, 4, 2, 4, 2, 2),
(3, 'Galere', 1028, 516, 2, 2, 1, 7, 3, 3),
(4, 'Cuirasse', 1389, 732, 1, 6, 3, 10, 4, 4),
(5, 'Fregate', 1964, 1092, 3, 4, 2, 15, 5, 5),
(6, 'Gallion', 2699, 1452, 4, 4, 3, 20, 6, 6);

-- --------------------------------------------------------

--
-- Structure de la table `canon`
--

CREATE TABLE `canon` (
  `id` int(11) NOT NULL,
  `type` varchar(50) NOT NULL,
  `degat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `canon`
--

INSERT INTO `canon` (`id`, `type`, `degat`) VALUES
(1, 'Léger', '4d6'),
(2, 'Naval', '5d6'),
(3, 'Lourd', '6d6');

-- --------------------------------------------------------

--
-- Structure de la table `equipage`
--

CREATE TABLE `equipage` (
  `id` int(11) NOT NULL,
  `capitaine` int(11) NOT NULL,
  `medecin` int(11) NOT NULL,
  `cuisto` int(11) NOT NULL,
  `navigateur` int(11) NOT NULL,
  `ingenieur` int(11) DEFAULT NULL,
  `lance` int(11) NOT NULL,
  `cannonier` int(11) NOT NULL,
  `tireur` int(11) NOT NULL,
  `combattant` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `equipage`
--

INSERT INTO `equipage` (`id`, `capitaine`, `medecin`, `cuisto`, `navigateur`, `ingenieur`, `lance`, `cannonier`, `tireur`, `combattant`, `total`) VALUES
(1, 1, 1, 1, 1, 0, 2, 2, 2, 2, 14),
(2, 1, 1, 1, 1, 1, 5, 10, 3, 3, 26),
(3, 1, 1, 1, 1, 1, 7, 14, 5, 5, 36),
(4, 1, 1, 1, 1, 1, 10, 20, 7, 7, 49),
(5, 1, 1, 1, 1, 1, 15, 30, 10, 10, 70),
(6, 1, 1, 1, 1, 1, 20, 40, 15, 15, 95);

-- --------------------------------------------------------

--
-- Structure de la table `soute`
--

CREATE TABLE `soute` (
  `id` int(11) NOT NULL,
  `tonnage_max` int(11) NOT NULL,
  `reparation` int(11) NOT NULL,
  `munition` int(11) NOT NULL,
  `nourriture` int(11) NOT NULL,
  `inventaire` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `soute`
--

INSERT INTO `soute` (`id`, `tonnage_max`, `reparation`, `munition`, `nourriture`, `inventaire`) VALUES
(1, 2500, 500, 500, 420, 1080),
(2, 5000, 1000, 1000, 780, 2220),
(3, 10000, 2000, 2000, 1080, 4920),
(4, 15000, 3000, 3000, 1470, 7530),
(5, 20000, 4000, 4000, 2100, 9900),
(6, 30000, 6000, 6000, 2850, 15150);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `bateau`
--
ALTER TABLE `bateau`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_bat_soute` (`idsoute`),
  ADD KEY `fk_bat_equipage` (`idequipage`);

--
-- Index pour la table `canon`
--
ALTER TABLE `canon`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `equipage`
--
ALTER TABLE `equipage`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `soute`
--
ALTER TABLE `soute`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `bateau`
--
ALTER TABLE `bateau`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `canon`
--
ALTER TABLE `canon`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT pour la table `equipage`
--
ALTER TABLE `equipage`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `soute`
--
ALTER TABLE `soute`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `bateau`
--
ALTER TABLE `bateau`
  ADD CONSTRAINT `fk_bat_equipage` FOREIGN KEY (`idequipage`) REFERENCES `equipage` (`id`),
  ADD CONSTRAINT `fk_bat_soute` FOREIGN KEY (`idsoute`) REFERENCES `soute` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
