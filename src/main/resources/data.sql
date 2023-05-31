INSERT INTO usuario (login, senha, role) VALUES ('lucas','$2a$12$4oMFnntbBIcR/O7lqEh0HeQNumX/hYyqtLeLCfPCmPUT9Bh46pnqq', 'admin')

-- Inserção na tabela cliente
INSERT INTO cliente (nome, telefone, email) VALUES ('João Silva', '(11) 98765-4321', 'joao.silva@example.com')
INSERT INTO cliente (nome, telefone, email) VALUES ('Maria Santos', '(22) 12345-6789', 'maria.santos@example.com')
INSERT INTO cliente (nome, telefone, email) VALUES ('Pedro Almeida', '(33) 55555-5555', 'pedro.almeida@example.com')
INSERT INTO cliente (nome, telefone, email) VALUES ('Ana Oliveira', '(44) 98765-4321', 'ana.oliveira@example.com')
INSERT INTO cliente (nome, telefone, email) VALUES ('Carlos Pereira', '(55) 11111-1111', 'carlos.pereira@example.com')

-- Inserção na tabela pedido
INSERT INTO pedido (cliente_id, data_pedido, total) VALUES (1, CURRENT_DATE, 150.00)
INSERT INTO pedido (cliente_id, data_pedido, total) VALUES (2, CURRENT_DATE, 75.50)
INSERT INTO pedido (cliente_id, data_pedido, total) VALUES (3, CURRENT_DATE, 200.20)
INSERT INTO pedido (cliente_id, data_pedido, total) VALUES (4, CURRENT_DATE, 300.75)
INSERT INTO pedido (cliente_id, data_pedido, total) VALUES (5, CURRENT_DATE, 50.00)

-- Inserção na tabela entrega
INSERT INTO entrega (pedido_id, endereco, status) VALUES (1, 'Rua X, 123', 'Entregue')
INSERT INTO entrega (pedido_id, endereco, status) VALUES (2, 'Av. Y, 456', 'Em trânsito')
INSERT INTO entrega (pedido_id, endereco, status) VALUES (3, 'Rua Z, 789', 'Pendente')
INSERT INTO entrega (pedido_id, endereco, status) VALUES (4, 'Rua W, 987', 'Entregue')
INSERT INTO entrega (pedido_id, endereco, status) VALUES (5, 'Av. V, 654', 'Em trânsito')