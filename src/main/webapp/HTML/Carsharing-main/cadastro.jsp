<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./assets/css/cadastro.css">
    <title>Cadastro</title>
</head>
<body>
    <main>
        <nav class="navbar navbar-expand-lg">
            <div class="container-fluid">
                <a class="navbar-brand" href="index.html#">
                  <img src="./assets/img/logo.png" alt="logo">
                </a>
            </div>
        </nav>
        <div class="div-cadastro">
            <div class="div-formulario">
                <h1>Formulario de cadastro</h1>
                <form action="processar_formulario.php" method="POST">
                    <label for="nome">Nome</label>
                    <input type="text" id="nome" name="nome" required><br><br>
            
                    <label for="email">Email</label>
                    <input type="email" id="email" name="email" required><br><br>
            
                    <label for="nome_login">Nome de Usuário</label>
                    <input type="text" id="nome_login" name="nome_login" required><br><br>
            
                    <label for="senha">Senha</label>
                    <input type="password" id="senha" name="senha" required><br><br>
            
                    <label for="confirmar_senha">Confirmar Senha</label>
                    <input type="password" id="confirmar_senha" name="confirmar_senha" required><br><br>
            
                    <button class="botao-registrar">Criar</button>
                </form>
            </div>
        </div>
    </main>

</body>
</html>