<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="./assets/css/styles.css">
    <script src="./assets/js/scripts.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous" defer></script>
    <title>Carsharing</title>
</head>
<body>
    <section class="menu">
        <!-- inicio do cabeçalho -->
            <nav class="navbar navbar-expand-lg">
                <div class="container-fluid">
                    <a class="navbar-brand" href="index.html#">
                      <img src="./assets/img/logo.png" alt="">
                    </a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link" href="#">Início</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#sobre">Sobre</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="alugel.html#">Alugue</a>
                        </li>
                        </ul>
                    </div>
                    <!-- botão -->
                    <div class="wrapper">
                        <div class="link_wrapper">
                            <button href="#" class="botao" id="login-button" onclick="showLoginDialog()">Login</button>
                        </div>
                        <!-- area de login -->
                            <dialog id="login-dialog">
                                <h1>Usuário</h1>
                                <div class="mb-3">
                                    <label for="exampleFormControlInput1" class="form-label">Cadastro</label>
                                    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="Digite seu usuário">
                                  </div>
                                  <div class="mb-3">
                                    <label for="exampleFormControlInput2" class="form-label">Senha</label>
                                    <input class="form-control" id="exampleFormControlTextarea1" ></input>
                                  </div>

                                <div class="botao-novo-cadastro">
                                    <button>Login</button>
                                </div>

                                <a href="./cadastro.html" class="link-cadastro">Criar cadastro</a>

                                <button type="button" class="close-button" onclick="closeLoginDialog()">
                                    <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="5px" height="5px" fill="currentColor" class="bi bi-x" viewBox="0 0 16 16">
                                      <path d="M4.646 4.646a.5.5 0 0 1 .708 0L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 0 1 0-.708z"/>
                                    </svg>
                                  </button>
                                  
                            </dialog>   
                        <!-- fim area de login -->

                    </div>
                    <!-- fim botão -->
                </div>
            </nav>
        <!-- fim do cabeçalho -->
    </section>

    <section class="carousel">
        <div id="carouselExampleFade" class="carousel slide carousel-fade">
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img class="img" src="./assets/img/img5.png" class="d-block w-10" alt="...">
              </div>
              <div class="carousel-item">
                <img class="img" src="./assets/img/img4.png" class="d-block w-100" alt="...">
              </div>
              <div class="carousel-item">
                <img class="img" src="./assets/img/img6.png" class="d-block w-100" alt="...">
              </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="visually-hidden">Next</span>
            </button>
          </div>
    </section>
    <section class="conteudo_menu">
      <div href="#sobre" class="container">
          <div class="titulo">
              <h1>Mobilidade Verde: Carsharing com veículos elétricos</h1>
              <h5>Criar um serviço de carsharing com veículos elétricos, oferecendo aos clientes a oportunidade de alugar carros elétricos por períodos curtos de tempo. esse projeto pode contribuir para a sustentabilidade ambiental e atrair clientes interessados em mobilidade verde.
                </h5>
          </div>
          <div class="imagem">
              <img class="imagem" src="./assets/img/foto3.png" alt="">
          </div>
      </div>
  </section>

  <!-- conteudo meio --> 
        <section class="container_meio">
            <div class="container_imagem">
              <h2 class="beneficios_h2">Alugue seu carro!</h2>
              <!-- card -->
              <div class="beneficios_cartao">
                <div class="card text-bg-light mb-3" style="max-width: 18rem;">
                  <img class="card-img-top" src="./assets/img/car/ford.jpg" alt="Imagem do benefício">
                  <div class="card-body">
                    <h5 class="card-title">Ford F-150 Lightning</h5>
                    <p class="card-text"> A F-150 Lightning é a primeira picape elétrica da Ford, e ela é uma máquina impressionante. Tem um alcance de até 320 milhas e pode rebocar até 10.000 libras.</p>
                    <a href="alugel.html" class="btn btn-primary">Ver Mais</a>
                  </div>
                </div>
                <div class="card text-bg-light mb-3" style="max-width: 18rem;">
                  <img class="card-img-top" src="./assets/img/car/tesla.jpg" alt="Imagem do benefício">
                  <div class="card-body">
                    <h5 class="card-title">Tesla Model 3</h5>
                    <p class="card-text"> O Model 3 é o carro elétrico mais vendido do mundo, e por um bom motivo. É um carro elegante e eficiente, com um alcance de até 358 milhas..</p>
                    <a href="alugel.html" class="btn btn-primary">Ver Mais</a>
                  </div>
                </div>
                <div class="card text-bg-light mb-3" style="max-width: 18rem;">
                  <img class="card-img-top" src="./assets/img/car/volks.jpg" alt="Imagem do benefício">
                  <div class="card-body">
                    <h5 class="card-title">Volkswagen ID.4</h5>
                    <p class="card-text"> O ID.4 é um SUV elétrico compacto da Volkswagen, com um design moderno e arrojado. É um carro espaçoso e confortável, com um alcance de até 250 milhas</p>
                    <a href="alugel.html" class="btn btn-primary">Ver Mais</a>
                  </div>
                </div>
                <div class="card text-bg-light mb-3" style="max-width: 18rem;">
                  <img class="card-img-top" src="./assets/img/car/hyndai.jpg" alt="Imagem do benefício">
                  <div class="card-body">
                    <h5 class="card-title">Hyundai Ioniq 5</h5>
                    <p class="card-text"> O Ioniq 5 é um SUV elétrico compacto da Hyundai com um design futurista e inovador. É um carro elegante e moderno, com um alcance de até 303 milhas</p>
                    <a href="alugel.html" class="btn btn-primary">Ver Mais</a>
                  </div>
                </div>
              </div>
            <!-- fim card -->

            </div>
          </section>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>


      </body>
</html>