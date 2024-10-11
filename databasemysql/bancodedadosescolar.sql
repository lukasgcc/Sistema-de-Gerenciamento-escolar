-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Tempo de geração: 18/06/2024 às 04:23
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `escolar`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `disciplinas`
--

CREATE TABLE `disciplinas` (
  `Disciplina1` varchar(255) NOT NULL,
  `Disciplina2` varchar(255) NOT NULL,
  `Disciplina3` varchar(255) NOT NULL,
  `Disciplina4` varchar(255) NOT NULL,
  `Disciplina5` varchar(255) NOT NULL,
  `Disciplina6` varchar(255) NOT NULL,
  `Disciplina7` varchar(255) NOT NULL,
  `Disciplina8` varchar(255) NOT NULL,
  `Disciplina9` varchar(255) NOT NULL,
  `Disciplina10` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `disciplinas`
--

INSERT INTO `disciplinas` (`Disciplina1`, `Disciplina2`, `Disciplina3`, `Disciplina4`, `Disciplina5`, `Disciplina6`, `Disciplina7`, `Disciplina8`, `Disciplina9`, `Disciplina10`) VALUES
('Analise de Dados em Python', 'Principios de Programação', 'Modelagem de Software', 'Vida e Carreira', 'Desenvolvimento web e Mobile', 'Historia da Arte', 'Cinematografia', 'Corpo e Voz', 'Analise critica ', 'Calculo I');

-- --------------------------------------------------------

--
-- Estrutura para tabela `estucad`
--

CREATE TABLE `estucad` (
  `id` int(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `nomemae` varchar(255) NOT NULL,
  `nascimento` bigint(255) NOT NULL,
  `tel` bigint(255) NOT NULL,
  `cpf` bigint(255) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `bairro` varchar(255) NOT NULL,
  `numero` int(255) NOT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `senha` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `palavra` varchar(255) NOT NULL,
  `disciplina1` varchar(255) NOT NULL,
  `disciplina2` varchar(255) NOT NULL,
  `disciplina3` varchar(255) NOT NULL,
  `disciplina4` varchar(255) NOT NULL,
  `disciplina5` varchar(255) NOT NULL,
  `curso` varchar(255) NOT NULL,
  `Turma` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `estucad`
--

INSERT INTO `estucad` (`id`, `nome`, `nomemae`, `nascimento`, `tel`, `cpf`, `endereco`, `bairro`, `numero`, `complemento`, `senha`, `email`, `palavra`, `disciplina1`, `disciplina2`, `disciplina3`, `disciplina4`, `disciplina5`, `curso`, `Turma`) VALUES
(202430257, 'Mario', 'Maria', 12122012, 349, 219, 'rua tal', 'bairro 4', 123, '', '2024@51341', 'mario@gmail.com', 'pao', 'Sem Matéria', 'Sem Matéria', 'Sem Matéria', 'Sem Matéria', 'Sem Matéria', 'Sem Curso', ''),
(202491299, 'Caio', 'Maria', 12122012, 349, 219, 'rua tal', 'bairro 4', 123, '', '123', 'mario@gmail.com', 'pao', 'Analise de Dados em Python', 'Modelagem de Software', 'Principios de Programação', 'Desenvolvimento web e Mobile', 'Vida e Carreira', 'Análise e Desenvolvimento de Sistemas', 'TurmaADS1'),
(202484046, 'Pedro Paulo', 'Maria', 1072001, 349, 1, 'rua joao carlos', 'bairro quinze', 123, 'em frente ao mercado', '1234', 'pedropaulo@gmail.com', 'carro', 'Calculo I', 'Principios de Programação', 'Analise de Dados em Python', 'Modelagem de Software', 'Vida e Carreira', 'Ciência da Computação', 'TurmaCC1'),
(202470829, 'Joao da Silva', 'Maria da Silva', 10052003, 34988766543, 4456678890, 'Rua das andorinhas', 'Centro', 344, '', 'joao123', 'joaodasilva@gmail.com', 'carro', 'Calculo I', 'Principios de Programação', 'Analise de Dados em Python', 'Modelagem de Software', 'Vida e Carreira', 'Ciência da Computação', 'TurmaCC1'),
(202431501, 'Amanda Castro Cunha', 'Rafaela Cunha Matos', 25032004, 34985564300, 75445665698, 'Rua do quartel', 'Chácaras Tubalina', 1678, 'próximo do quartel ', '2024@35837', 'amandacc2004@gmail.com', 'soldado', 'Analise critica', 'Corpo e Voz', 'Historia da Arte', 'Cinematografia', 'Vida e Carreira', 'Teatro', 'TurmaTeatro1'),
(202455381, 'Thiago Fernandes Ribeiro da Costa', 'Silvio Ribeiro da Costa', 30082005, 21982455678, 80187765622, 'Rua Das Palmeiras', 'Recanto dos passaros', 1954, 'Apartamento 4. Bloco 2.', '2024@49547', 'Thiago.Fernandes2005@outlook.com', 'mae', 'Analise critica', 'Corpo e Voz', 'Historia da Arte', 'Cinematografia', 'Vida e Carreira', 'Teatro', 'TurmaTeatro1'),
(202414113, 'Felix Matos de Freitas', 'Darla Matos Strozzi', 5082005, 47986755433, 1125546703, 'Rua das Andorinhas', 'Santa Mônica', 477, 'antiga 4', '2024@13862', 'ggfelix0508@yahoo.com.br', 'teatro', 'Analise critica', 'Corpo e Voz', 'Historia da Arte', 'Cinematografia', 'Vida e Carreira', 'Teatro', 'TurmaTeatro1'),
(202461350, 'Cayo Marques Macedo', 'Andrea Marques Assis Macedo', 10012006, 34996477091, 14944402636, 'Rua das Galinhas', 'Copacabana', 455, 'Apto. 3 Bloco 2.', '2024@37252', 'cayomacedo00@gmail.com', 'roblox', 'Calculo I', 'Principios de Programação', 'Analise de Dados em Python', 'Modelagem de Software', 'Vida e Carreira', 'Ciência da Computação', 'TurmaCC1'),
(202445510, 'Rogerio Guimarães Castro ', 'Carla Diaz de Castro ', 9052001, 47988765443, 4456789871, 'Rua Almeida ', 'Centro', 0, '', '2024@23199', 'rogerio.castro2001@gmail.com', 'sushi', 'Analise de Dados em Python', 'Modelagem de Software', 'Principios de Programação', 'Desenvolvimento web e Mobile', 'Vida e Carreira', 'Análise e Desenvolvimento de Sistemas', 'TurmaADS1'),
(202484750, 'Lucas Gonçalves da Cruz', 'Debora da Silva Santana', 10062003, 34988851000, 4191367614, 'Rua Caracuri', 'Jardim Karaiba', 42, '', '1234', 'lucascruz3@gmail.com', 'java', 'Analise de Dados em Python', 'Modelagem de Software', 'Principios de Programação', 'Desenvolvimento web e Mobile', 'Vida e Carreira', 'Análise e Desenvolvimento de Sistemas', 'TurmaADS1');

-- --------------------------------------------------------

--
-- Estrutura para tabela `extensao`
--

CREATE TABLE `extensao` (
  `id` int(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `extensao` varchar(255) NOT NULL,
  `notaextensao` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `extensao`
--

INSERT INTO `extensao` (`id`, `nome`, `extensao`, `notaextensao`) VALUES
(202484046, 'Pedro Paulo', 'Banco De Dados', NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `notas`
--

CREATE TABLE `notas` (
  `id` int(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `curso` varchar(255) NOT NULL,
  `disciplina` varchar(255) NOT NULL,
  `nota1` int(255) DEFAULT NULL,
  `nota2` int(255) DEFAULT NULL,
  `notatrabalho` int(255) DEFAULT NULL,
  `feedback` varchar(255) DEFAULT NULL,
  `presenca` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `notas`
--

INSERT INTO `notas` (`id`, `nome`, `curso`, `disciplina`, `nota1`, `nota2`, `notatrabalho`, `feedback`, `presenca`) VALUES
(202491299, 'Caio', 'Análise e Desenvolvimento de Sistemas', 'Analise de Dados em Python', 70, 70, 70, 'ok!', '10/06/2024 - Presente\n11/06/2024 - Falta\n10/06/2024 - Presente\n12/01/2025 - Falta\n'),
(202491299, 'Caio', 'Análise e Desenvolvimento de Sistemas', 'Modelagem de Software', NULL, NULL, NULL, '', ''),
(202491299, 'Caio', 'Análise e Desenvolvimento de Sistemas', 'Principios de Programação', NULL, NULL, NULL, '', ''),
(202491299, 'Caio', 'Análise e Desenvolvimento de Sistemas', 'Desenvolvimento web e Mobile', NULL, NULL, NULL, '', ''),
(202491299, 'Caio', 'Análise e Desenvolvimento de Sistemas', 'Vida e Carreira', NULL, NULL, NULL, '', ''),
(202484046, 'Pedro Paulo', 'Ciência da Computação', 'Calculo I', 100, 100, 100, '', '22/02/2024 - Presente\n23/02/2024 - Falta\n11/03/2024 - Presente\n\n10/06/2024 - Presente\n'),
(202484046, 'Pedro Paulo', 'Ciência da Computação', 'Principios de Programação', NULL, NULL, NULL, NULL, ''),
(202484046, 'Pedro Paulo', 'Ciência da Computação', 'Analise de Dados em Python', 100, 50, 100, '', '15/06/2024 - Presente\n15/06/2024 - Presente\n15/06/2024 - Falta\n15/06/2024 - Falta\n16/06/2024 - Falta\n16/06/2024 - Falta'),
(202484046, 'Pedro Paulo', 'Ciência da Computação', 'Modelagem de Software', NULL, NULL, NULL, NULL, ''),
(202484046, 'Pedro Paulo', 'Ciência da Computação', 'Vida e Carreira', NULL, NULL, NULL, NULL, ''),
(202470829, 'Joao da Silva', 'Ciência da Computação', 'Calculo I', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202470829, 'Joao da Silva', 'Ciência da Computação', 'Principios de Programação', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202470829, 'Joao da Silva', 'Ciência da Computação', 'Analise de Dados em Python', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202470829, 'Joao da Silva', 'Ciência da Computação', 'Modelagem de Software', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202470829, 'Joao da Silva', 'Ciência da Computação', 'Vida e Carreira', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202431501, 'Amanda Castro Cunha', 'Teatro', 'Analise critica', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202431501, 'Amanda Castro Cunha', 'Teatro', 'Corpo e Voz', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202431501, 'Amanda Castro Cunha', 'Teatro', 'Historia da Arte', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202431501, 'Amanda Castro Cunha', 'Teatro', 'Cinematografia', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202431501, 'Amanda Castro Cunha', 'Teatro', 'Vida e Carreira', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202455381, 'Thiago Fernandes Ribeiro da Costa', 'Teatro', 'Analise critica', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202455381, 'Thiago Fernandes Ribeiro da Costa', 'Teatro', 'Corpo e Voz', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202455381, 'Thiago Fernandes Ribeiro da Costa', 'Teatro', 'Historia da Arte', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202455381, 'Thiago Fernandes Ribeiro da Costa', 'Teatro', 'Cinematografia', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202455381, 'Thiago Fernandes Ribeiro da Costa', 'Teatro', 'Vida e Carreira', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202414113, 'Felix Matos de Freitas', 'Teatro', 'Analise critica', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202414113, 'Felix Matos de Freitas', 'Teatro', 'Corpo e Voz', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202414113, 'Felix Matos de Freitas', 'Teatro', 'Historia da Arte', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202414113, 'Felix Matos de Freitas', 'Teatro', 'Cinematografia', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202414113, 'Felix Matos de Freitas', 'Teatro', 'Vida e Carreira', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202461350, 'Cayo Marques Macedo', 'Ciência da Computação', 'Calculo I', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202461350, 'Cayo Marques Macedo', 'Ciência da Computação', 'Principios de Programação', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202461350, 'Cayo Marques Macedo', 'Ciência da Computação', 'Analise de Dados em Python', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202461350, 'Cayo Marques Macedo', 'Ciência da Computação', 'Modelagem de Software', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202461350, 'Cayo Marques Macedo', 'Ciência da Computação', 'Vida e Carreira', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202445510, 'Rogerio Guimarães Castro ', 'Análise e Desenvolvimento de Sistemas', 'Analise de Dados em Python', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202445510, 'Rogerio Guimarães Castro ', 'Análise e Desenvolvimento de Sistemas', 'Modelagem de Software', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202445510, 'Rogerio Guimarães Castro ', 'Análise e Desenvolvimento de Sistemas', 'Principios de Programação', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202445510, 'Rogerio Guimarães Castro ', 'Análise e Desenvolvimento de Sistemas', 'Desenvolvimento web e Mobile', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202445510, 'Rogerio Guimarães Castro ', 'Análise e Desenvolvimento de Sistemas', 'Vida e Carreira', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202484750, 'Lucas Gonçalves da Cruz', 'Análise e Desenvolvimento de Sistemas', 'Analise de Dados em Python', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202484750, 'Lucas Gonçalves da Cruz', 'Análise e Desenvolvimento de Sistemas', 'Modelagem de Software', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202484750, 'Lucas Gonçalves da Cruz', 'Análise e Desenvolvimento de Sistemas', 'Principios de Programação', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202484750, 'Lucas Gonçalves da Cruz', 'Análise e Desenvolvimento de Sistemas', 'Desenvolvimento web e Mobile', NULL, NULL, NULL, 'Sem Comentários', ' '),
(202484750, 'Lucas Gonçalves da Cruz', 'Análise e Desenvolvimento de Sistemas', 'Vida e Carreira', 100, 75, 85, 'Muito bem!', ' \n25/06/2024 - Presente\n');

-- --------------------------------------------------------

--
-- Estrutura para tabela `profcad`
--

CREATE TABLE `profcad` (
  `id` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `telefone` bigint(255) NOT NULL,
  `cpf` bigint(255) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `numero` int(255) NOT NULL,
  `bairro` varchar(255) NOT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `senha` varchar(255) NOT NULL,
  `palavra` varchar(255) NOT NULL,
  `disciplinas` varchar(255) NOT NULL,
  `disciplinas2` varchar(255) NOT NULL,
  `disciplinas3` varchar(255) NOT NULL,
  `Turma1` varchar(255) NOT NULL,
  `Turma2` varchar(255) NOT NULL,
  `Turma3` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `profcad`
--

INSERT INTO `profcad` (`id`, `nome`, `email`, `telefone`, `cpf`, `endereco`, `numero`, `bairro`, `complemento`, `senha`, `palavra`, `disciplinas`, `disciplinas2`, `disciplinas3`, `Turma1`, `Turma2`, `Turma3`) VALUES
('prof64998', 'Cassio', 'Cassio@ulife.com.br', 123, 10000000011, 'Rua Tal', 123, 'Centro', 'Em frente ao correios e mercado 2p', 'joao', 'joao', 'Analise de Dados em Python', 'Calculo I', 'Sem Matéria', '', '', ''),
('prof86225', 'Carlos', 'carlos@ulife.com.br', 349, 21, 'rua tal', 0, 'jd. das palmeiras', 'sem complemento', 'prof@81363', 'mel', 'Analise de Dados em Python', 'Modelagem de Software', 'Principios de Programação', '', '', ''),
('prof41700', 'Joana', 'Joana@ulife.com.br', 349, 21, 'rua do pastor', 0, 'bairro silva rocha', '', 'prof@99099', 'ulife', 'Sem Matéria', 'Sem Matéria', 'Sem Matéria', 'Sem Turma', 'SemTurma', 'TurmaCC1'),
('prof81114', 'Cassia', 'Cassia@gmail.com', 349, 21, 'rua castro', 0, 'bairro tal', 'em frente ao hospital', '123', 'musica', 'Corpo e Voz', 'Historia da Arte', 'Cinematografia', 'TurmaTeatro1', 'TurmaTeatro2', 'Sem Turma'),
('prof33105', 'Michele', 'Michele@gmail.com', 349, 1, 'Rua Das Garças', 33, 'Centro', 'em frente aos correios', 'michele123', 'filho', 'Calculo I', 'Desenvolvimento web e Mobile', 'Analise de Dados em Python', 'TurmaCC1', 'TurmaADS1', 'Sem Turma'),
('prof22398', 'Juliana Santos', 'julianasantos@hotmail.com', 34977655634, 33199095312, 'Rua do astronauta', 0, 'Segismundo Pereira', '', 'prof@96620', 'teatro', 'Cinematografia', 'Corpo e Voz', 'Historia da Arte', 'TurmaTeatro2', 'TurmaTeatro1', 'Sem Turma'),
('prof90919', 'Andrea Marques Assis Macedo', 'andreamarques@outlook.com', 3498877654, 9889007765, 'Rua Espirito Santo', 1530, 'Nova Esperança', 'em frente ao mercado supermaxi ', 'prof@24209', 'bruna', 'Vida e Carreira', 'Sem Matéria', 'Sem Matéria', 'TurmaADS1', 'TurmaTeatro1', 'TurmaCC1');

-- --------------------------------------------------------

--
-- Estrutura para tabela `recados`
--

CREATE TABLE `recados` (
  `recados` varchar(400) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `recados`
--

INSERT INTO `recados` (`recados`) VALUES
('Dia 28/06/2024 será o fim do período. ');

-- --------------------------------------------------------

--
-- Estrutura para tabela `turma`
--

CREATE TABLE `turma` (
  `TurmaADS1` longtext DEFAULT NULL,
  `TurmaADS2` longtext DEFAULT NULL,
  `TurmaCC1` longtext DEFAULT NULL,
  `TurmaCC2` longtext DEFAULT NULL,
  `TurmaTeatro1` longtext DEFAULT NULL,
  `TurmaTeatro2` longtext DEFAULT NULL,
  `SemTurma` longtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `turma`
--

INSERT INTO `turma` (`TurmaADS1`, `TurmaADS2`, `TurmaCC1`, `TurmaCC2`, `TurmaTeatro1`, `TurmaTeatro2`, `SemTurma`) VALUES
('202484750 - Lucas Gonçalves da Cruz', NULL, '', NULL, NULL, NULL, '');

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario_login`
--

CREATE TABLE `usuario_login` (
  `id` int(200) NOT NULL,
  `usuario` varchar(200) NOT NULL,
  `senha` varchar(200) NOT NULL,
  `senhaadm` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `usuario_login`
--

INSERT INTO `usuario_login` (`id`, `usuario`, `senha`, `senhaadm`) VALUES
(1, 'LucasADM', 'lucas123adm', 'lucas@123adm'),
(2, '1', '1', '1');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
