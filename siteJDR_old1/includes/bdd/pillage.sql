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

CREATE DATABASE pillage;

USE pillage;

-- --------------------------------------------------------

--
-- Structure de la table `materiau`
--

CREATE TABLE `materiau` (
  `id` int(11) NOT NULL,
  `ressource` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `materiau`
--

INSERT INTO `materiau` (`id`, `ressource`) VALUES
(1, 'Rien'),
(2, 'Cuivre'),
(3, 'Or'),
(4, 'Diamand/Saphir'),
(5, 'Topaze/Rubis'),
(6, 'Emeraude'),
(7, 'Bouleau'),
(8, 'Pin'),
(9, 'Pierre'),
(10, 'Orme'),
(11, 'Chene'),
(12, 'Sapin'),
(13, 'Acajou'),
(14, 'Tissus'),
(15, 'Soie'),
(16, 'Laine'),
(17, 'Lin'),
(18, 'Parchemin'),
(19, 'Encre'),
(20, 'Poudre'),
(21, 'Voile'),
(22, 'Cordage'),
(23, 'Huile de baleine'),
(24, 'Acier'),
(25, 'Ebene'),
(26, 'Ebonite'),
(27, 'Fer'),
(28, 'Plume'),
(29, 'Argent'),
(30, 'Bronze');

-- --------------------------------------------------------

--
-- Structure de la table `vivres`
--

CREATE TABLE `vivres` (
  `id` int(11) NOT NULL,
  `ressource` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `vivres`
--

INSERT INTO `vivres` (`id`, `ressource`) VALUES
(1, 'Rien'),
(2, 'Ble'),
(3, 'Avoine'),
(4, 'Orge'),
(5, 'Riz'),
(6, 'Malte'),
(7, 'Pomme'),
(8, 'Banane'),
(9, 'Ananas'),
(10, 'Cafe'),
(11, 'Tomate'),
(12, 'Patate'),
(13, 'Vache/Lait'),
(14, 'Porc'),
(15, 'Mouton'),
(16, 'Farine'),
(17, 'Chevre/Lait'),
(18, 'Poule/oeuf'),
(19, 'Cerf'),
(20, 'Sanglier'),
(21, 'Sucre'),
(22, 'Rhum'),
(23, 'Biere'),
(24, 'Liqueur'),
(25, 'Raisin/Vin'),
(26, 'Caviar'),
(27, 'Choux'),
(28, 'Tabac'),
(29, 'Baleine'),
(30, 'Thon');

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
-- AUTO_INCREMENT pour les tables exportées
--

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
