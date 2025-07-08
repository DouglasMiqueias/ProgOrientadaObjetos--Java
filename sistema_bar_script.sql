create database if not exists sistema_bar;
use sistema_bar;

create user 'douglas'@'localhost' identified by  'Miqueias@13579';

grant select, insert, update, DELETE ON sistema_bar.* TO 'douglas'@'localhost';

create table if not exists Produto(
id int auto_increment primary key,
nome varchar(100) not null,
tipo varchar(50),
preco decimal (6,2) not null,
quantidade_estoque int not null
);

create table if not exists Cliente(
id int auto_increment primary key,
nome varchar(100) not null,
telefone varchar(20),
cpf varchar(14) unique
);

create table if not exists Funcionario(
id int auto_increment primary key,
nome varchar(100) not null,
funcao varchar(50),
salario_hora decimal(10,2),
cpf varchar(14) unique
);

create table if not exists Pedido(
id int auto_increment primary key,
cliente_id int,
funcionario_id int,
data datetime default current_timestamp,
total decimal(10,2),
foreign key (cliente_id) references Cliente(id),
foreign key (funcionario_id) references Funcionario(id)
);

create table if not exists ItemPedido(
id int auto_increment primary key,
pedido_id int,
produto_id int,
quantidade int,
preco_unitario decimal(10,2),
foreign key (pedido_id) references Pedido(id),
foreign key (produto_id) references Produto(id)
);

insert into Produto(nome, tipo, preco, quantidade_estoque)
values
('Cerveja Pilsen', 'Bebida', 7.50, 100),
('Refrigerante Lata', 'Bebida', 5.00, 50),
('Porção de Batata', 'Comida', 18.90, 20),
('Espetinho de Frango', 'Comida', 9.00, 30),
('Água Mineral', 'Bebida', 3.00, 40);

insert into Cliente (nome, telefone, cpf)
values
('Douglas Mota', '99999-0000', '123.456.789-00'),
('Carlos Silva', '98888-1111', '222.333.444-55'),
('Maria Oliveira', '97777-2222', '333.444.555-66');

insert into Funcionario (nome, funcao, salario_hora, cpf)
values
('Camila Santos', 'Caixa', 10.00, '111.222.333-44'),
('Rafael Souza', 'Garçom', 9.50, '555.666.777-88');

insert into Pedido (cliente_id, funcionario_id, total)
values
(1, 1, 30.90),
(2, 2, 18.00);

insert into ItemPedido (pedido_id, produto_id, quantidade, preco_unitario)
values
(1, 1, 2, 7.50),
(1, 3, 1, 18.90),
(2, 2, 2, 5.00),
(2, 5, 1, 3.00);

SELECT 
    p.id AS pedido_id,
    c.nome AS cliente,
    f.nome AS funcionario,
    p.data,
    pr.nome AS produto,
    ip.quant0idade,
    ip.preco_unitario,
    (ip.quantidade * ip.preco_unitario) AS subtotal
FROM Pedido p
JOIN Cliente c ON p.cliente_id = c.id
JOIN Funcionario f ON p.funcionario_id = f.id
JOIN ItemPedido ip ON p.id = ip.pedido_id
JOIN Produto pr ON ip.produto_id = pr.id
ORDER BY p.id, ip.id;

