# APIGenius
API Rest que consome API do Genius e retorna as 10 músicas mais tocadas de um dado artista.


### Importando o Projeto:
1. Baixe o zip.
2. Extraia os arquivos.
3. No Eclipse, clique em file > import.
4. Import as Existing Maven Project.
5. Selecione a pasta para qual extraiu os arquivos.
6. Marque o pom.xml e clique em finish.

### Resolvendo Erros
Ao baixar, o projeto conterá erros de Build Path. <br/>
Vamos resolvê-los.

1. Clique com o botão direito em cima do projeto, depois clique em properties.
2. Clique em Java Build Path na esquerda, depois em Libraries.
3. Clique em ClassPath, depois Add Library.
4. Selecione JUnit, clique em Next e Depois Finish.
5. Agora, Clique em Add JARs...: <br/>

![lib1](https://user-images.githubusercontent.com/19733510/65981673-ffff9500-e44f-11e9-80c2-4674ef8cab6c.PNG)<br/>
 6. Na janela que abriu, expanda a pasta 'testeapi', expanda a pasta 'libs' e selecione todos os arquivos.<br/>
 (Dica: segure shift e use a seta para baixo para selecionar vários de uma vez) <br/>
![lib2](https://user-images.githubusercontent.com/19733510/65981674-00982b80-e450-11e9-8ec0-75a7a0706a52.PNG)
 7. Clique em Ok, depois clique em Apply and Close e aguarde alguns instantes enquanto o Eclipse processa as mudanças.
 
 # Executando a API
 
 1. Na aba Project Explorer, expanda o pacote src/main/java.
 2. Depois, expanda api.wellington.api.
 3. Clique com o botão direito na classe ApiApplication.java.
 4. Clique em Run As > Java Application.
 ![Execute2](https://user-images.githubusercontent.com/19733510/65981666-ff66fe80-e44f-11e9-9edb-cd22f0ae2f6a.PNG)<br/>
 
 # Testando a API
 
 1. No Browser, ou no PostMan, digite a seguinte url: http://localhost:8080/busca/{nomeDoArtista}, onde o nome será o artista <br/>
 do qual deseja retornar as músicas.
 ![PostmanResult](https://user-images.githubusercontent.com/19733510/65981676-00982b80-e450-11e9-91fa-99a4442c3a6f.png)
