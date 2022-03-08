-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 07 mars 2022 à 19:15
-- Version du serveur : 10.4.22-MariaDB
-- Version de PHP : 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `ez`
--

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE `categorie` (
  `idcat` int(11) NOT NULL,
  `domaine` varchar(50) NOT NULL,
  `nomcat` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `categorie`
--

INSERT INTO `categorie` (`idcat`, `domaine`, `nomcat`) VALUES
(18, 'wwwww', 'waaa'),
(10, 'xxxxxxxx', 'dsqd');

-- --------------------------------------------------------

--
-- Structure de la table `cours`
--

CREATE TABLE `cours` (
  `id` int(11) NOT NULL,
  `titre` varchar(100) NOT NULL,
  `description` varchar(250) NOT NULL,
  `duree` varchar(200) NOT NULL,
  `datecreate` varchar(200) NOT NULL,
  `support` varchar(200) NOT NULL,
  `etat` int(1) NOT NULL,
  `idcat` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `cours`
--

INSERT INTO `cours` (`id`, `titre`, `description`, `duree`, `datecreate`, `support`, `etat`, `idcat`) VALUES
(1, 'javafx', 'dsqdfqsf', '4', '2022-03-07', 'cours', 1, 0),
(2, 'mobile', 'sqdqsd', '6', '2022-03-06', 'aldfi', 0, 0),
(3, 'ddsd', 'dsqdqs', '33', '2022-03-06', 'aaa', 1, 0),
(4, 'rrrr', 'vffffff', '6', '2022-03-06', 'fff', 1, 0),
(7, 'AAAA', 'dddddd', '8', '2022-03-07', 'kkk', 1, 0),
(8, 'SGBD', 'Ce cours est en mp4', '5', '2022-03-07', '/bureau/sgbd.mp4', 1, 0),
(9, 'rrr', 'dddd', '3', '2022-03-07', 'ddd', 1, 0),
(11, 'dd', 'ddd', '6', '2022-03-07', 'dd', 1, 0);

-- --------------------------------------------------------

--
-- Structure de la table `demande`
--

CREATE TABLE `demande` (
  `id` int(11) NOT NULL,
  `description` varchar(255) NOT NULL,
  `pathCv` varchar(255) NOT NULL,
  `idOffre` int(11) NOT NULL,
  `idEtudiant` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `demande`
--

INSERT INTO `demande` (`id`, `description`, `pathCv`, `idOffre`, `idEtudiant`) VALUES
(1, 'fdsdf', 'sdfdsf', 1, 2),
(2, 'fdsdf', 'sdfdsf', 1, 2),
(3, 'fdsdf', 'sdfdsf', 1, 2),
(4, 'fdsdf', 'sdfdsf', 1, 2),
(5, 'fdsdf', 'sdfdsf', 1, 2),
(6, 'fdsdf', 'sdfdsf', 1, 2);

-- --------------------------------------------------------

--
-- Structure de la table `evaluation`
--

CREATE TABLE `evaluation` (
  `id` int(11) NOT NULL,
  `idformateur` int(11) NOT NULL,
  `idformation` int(11) NOT NULL,
  `eval` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `evenement`
--

CREATE TABLE `evenement` (
  `idEvent` int(250) NOT NULL,
  `idOrg` varchar(30) NOT NULL,
  `description` varchar(1000) NOT NULL,
  `date` date NOT NULL,
  `heure` varchar(100) NOT NULL,
  `lien` varchar(200) NOT NULL,
  `imgEv` varchar(200) NOT NULL,
  `nbrParticipant` int(11) NOT NULL,
  `idUni` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `evenement`
--

INSERT INTO `evenement` (`idEvent`, `idOrg`, `description`, `date`, `heure`, `lien`, `imgEv`, `nbrParticipant`, `idUni`) VALUES
(190, 'Mr Badreddine Nouri', 'Evenement (Formation en SQL)', '2022-03-25', '12h', 'https://eventsql.sssme/e/nTIsYiFwN', 'null', 70, NULL),
(188, 'Mme Rahma Mejri', 'Evenement (Formation en POO)', '2022-03-16', '13h', 'https://eventPOO.sssme/e/nTIsYiFwN', 'null', 100, NULL),
(186, 'Mr Riadh Mezni', 'Evenement (Formation en Python)', '2022-03-15', '13h', 'https://even.sssme/e/nTIsYiFwN', 'null', 30, NULL),
(189, 'Mme Halima Antar', 'Evenement (Formation en Web Development)', '2022-03-12', '15h', 'https://eventWD.sssme/e/nTIsYiFwN', 'null', 20, NULL),
(187, 'Mr Ahmed Hajji', 'Evenement (Formation en JAVA)', '2022-03-23', '16h', 'https://event77.sssme/e/nTIsYiFwN', 'null', 10, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `like_cours`
--

CREATE TABLE `like_cours` (
  `idLike` int(11) NOT NULL,
  `iduser` int(11) NOT NULL,
  `like_etat` int(1) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `like_cours`
--

INSERT INTO `like_cours` (`idLike`, `iduser`, `like_etat`, `id`) VALUES
(60, 1, 0, 4);

-- --------------------------------------------------------

--
-- Structure de la table `offre`
--

CREATE TABLE `offre` (
  `id` int(11) NOT NULL,
  `titre` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `dateFin` date NOT NULL,
  `idRecruteur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `offre`
--

INSERT INTO `offre` (`id`, `titre`, `type`, `dateFin`, `idRecruteur`) VALUES
(1, 'hh', 'qdsd', '1932-09-10', 1);

-- --------------------------------------------------------

--
-- Structure de la table `questions`
--

CREATE TABLE `questions` (
  `id` int(11) NOT NULL,
  `contenu` varchar(255) NOT NULL,
  `testid` int(11) NOT NULL,
  `reponses` varchar(255) NOT NULL,
  `reponsecorrect` int(11) NOT NULL,
  `note` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `questions`
--

INSERT INTO `questions` (`id`, `contenu`, `testid`, `reponses`, `reponsecorrect`, `note`) VALUES
(1, 'contenu du question jdid', 1, '[\'qestion 1\'],[\'qestion 2\'],[\'qestion 3\']', 2, 3);

-- --------------------------------------------------------

--
-- Structure de la table `reclamation`
--

CREATE TABLE `reclamation` (
  `idrec` int(11) NOT NULL,
  `type` varchar(100) NOT NULL,
  `description` text NOT NULL,
  `idetudiant` varchar(200) NOT NULL,
  `idcours` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `reclamation`
--

INSERT INTO `reclamation` (`idrec`, `type`, `description`, `idetudiant`, `idcours`) VALUES
(12, 'aaa', 'bbb', 'vccc', 'rrrr'),
(1, 'aaa', 'bbb', 'vccc', 'rrrr'),
(22, 'Nabil', 'Bettaieb', 'EZLEARN', 'AFFICHER'),
(2, 'Nap', 'Bettaieb', 'EZLEARN', 'AFFICHER'),
(100, 'eeep', 'Betddd', 'EZLEARN', 'AFFICHER'),
(16, 'eeep', 'Betddd', 'EZLEARN', 'AFFICHER');

-- --------------------------------------------------------

--
-- Structure de la table `resultattest`
--

CREATE TABLE `resultattest` (
  `id` int(11) NOT NULL,
  `idtest` int(11) NOT NULL,
  `idetudiant` int(11) NOT NULL,
  `score` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `societe`
--

CREATE TABLE `societe` (
  `idsoc` varchar(200) NOT NULL,
  `nom` varchar(100) NOT NULL,
  `email` varchar(200) NOT NULL,
  `adresse` varchar(250) NOT NULL,
  `imgsoc` varchar(250) NOT NULL,
  `mdpsoc` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `societe`
--

INSERT INTO `societe` (`idsoc`, `nom`, `email`, `adresse`, `imgsoc`, `mdpsoc`) VALUES
('30', 'esprit', 'nab@esp.tn', 'ariana', 'src/img/pdp', '1234'),
('302', 'esprit', 'nab@esp.tn', 'ariana', 'src/img/pdp', '1234'),
('5', 'msb', 'nab@esp.tn', 'ariana', 'src/img/pdp', '1234');

-- --------------------------------------------------------

--
-- Structure de la table `test`
--

CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `titre` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `test`
--

INSERT INTO `test` (`id`, `titre`, `description`) VALUES
(1, 'titre jdid', 'des jdida');

-- --------------------------------------------------------

--
-- Structure de la table `universite`
--

CREATE TABLE `universite` (
  `idUni` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `email` varchar(200) NOT NULL,
  `adresse` varchar(200) NOT NULL,
  `imguni` varchar(200) NOT NULL,
  `mdpuni` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `universite`
--

INSERT INTO `universite` (`idUni`, `nom`, `email`, `adresse`, `imguni`, `mdpuni`) VALUES
(5240, 'Esprit', 'contact@esprit.ens.tn', ' Ariana', 'null', 'null'),
(5241, 'Insat', 'insat@insat.rnu.tn', 'Tunis Cedex', 'null', 'null'),
(5242, 'FST', 'fst@fst.rnu.tn', 'Rue de Tolède Tunis ', 'null', 'null'),
(5243, 'ENSI', 'http://www.ensi.rnu.tn ', 'Manouba 2010', 'null', 'null'),
(5245, 'ULT', 'contact@ult-tunisie.com', 'Kheireddine Pacha Tunis 1002', 'null', 'null');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`idcat`);

--
-- Index pour la table `cours`
--
ALTER TABLE `cours`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `demande`
--
ALTER TABLE `demande`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `evaluation`
--
ALTER TABLE `evaluation`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `evenement`
--
ALTER TABLE `evenement`
  ADD PRIMARY KEY (`idEvent`);

--
-- Index pour la table `like_cours`
--
ALTER TABLE `like_cours`
  ADD PRIMARY KEY (`idLike`);

--
-- Index pour la table `offre`
--
ALTER TABLE `offre`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `reclamation`
--
ALTER TABLE `reclamation`
  ADD PRIMARY KEY (`idrec`);

--
-- Index pour la table `resultattest`
--
ALTER TABLE `resultattest`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `societe`
--
ALTER TABLE `societe`
  ADD PRIMARY KEY (`idsoc`);

--
-- Index pour la table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `universite`
--
ALTER TABLE `universite`
  ADD PRIMARY KEY (`idUni`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `categorie`
--
ALTER TABLE `categorie`
  MODIFY `idcat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT pour la table `cours`
--
ALTER TABLE `cours`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT pour la table `demande`
--
ALTER TABLE `demande`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `evaluation`
--
ALTER TABLE `evaluation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `evenement`
--
ALTER TABLE `evenement`
  MODIFY `idEvent` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=193;

--
-- AUTO_INCREMENT pour la table `like_cours`
--
ALTER TABLE `like_cours`
  MODIFY `idLike` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- AUTO_INCREMENT pour la table `offre`
--
ALTER TABLE `offre`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `questions`
--
ALTER TABLE `questions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `resultattest`
--
ALTER TABLE `resultattest`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `test`
--
ALTER TABLE `test`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `universite`
--
ALTER TABLE `universite`
  MODIFY `idUni` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5248;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
