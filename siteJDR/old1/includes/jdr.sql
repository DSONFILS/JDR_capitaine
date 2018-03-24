-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Ven 05 Mai 2017 à 22:36
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.18



SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `jdr`
--
CREATE DATABASE IF NOT EXISTS `jdr` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `jdr`;
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
  `idcanon` int(11) NOT NULL,
  `idequipage` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `canon`
--

CREATE TABLE `canon` (
  `id` int(11) NOT NULL,
  `type` varchar(50) NOT NULL,
  `degat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `equipage`
--

CREATE TABLE `equipage` (
  `id` int(11) NOT NULL,
  `capitaine` int(11) NOT NULL,
  `medecin` int(11) NOT NULL,
  `cuisto` int(11) NOT NULL,
  `ingenieur` int(11) DEFAULT NULL,
  `tireur` int(11) NOT NULL,
  `combattant` int(11) NOT NULL,
  `cannonier` int(11) NOT NULL,
  `lance` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
-- Index pour les tables exportées
--

--
-- Index pour la table `bateau`
--
ALTER TABLE `bateau`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_bat_soute` (`idsoute`),
  ADD KEY `fk_bat_canon` (`idcanon`),
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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `canon`
--
ALTER TABLE `canon`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `equipage`
--
ALTER TABLE `equipage`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `soute`
--
ALTER TABLE `soute`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `bateau`
--
ALTER TABLE `bateau`
  ADD CONSTRAINT `fk_bat_canon` FOREIGN KEY (`idcanon`) REFERENCES `canon` (`id`),
  ADD CONSTRAINT `fk_bat_equipage` FOREIGN KEY (`idequipage`) REFERENCES `equipage` (`id`),
  ADD CONSTRAINT `fk_bat_soute` FOREIGN KEY (`idsoute`) REFERENCES `soute` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
