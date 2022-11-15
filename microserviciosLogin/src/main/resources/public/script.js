

function saveTweet(){
    var tweet = document.getElementById("message").value;
    document.getElementById("muro").innerHTML += tweet + "<br>" + new Date() +  "<br>" + "<br>";
}

function loginUser() {
    console.log("Logging in...")
    var isLogged = false;
    var userName = document.getElementById("GET-Username").value;
    var password = document.getElementById("GET-Password").value;

    login()
        .then(hashHex => {
            console.log("User:", userName, " - Password:", password);
            urlLogin = "http://localhost:4567/login/"+userName+"/"+password;
            return urlLogin
        })
        .then(urlLogin => {
            console.log("urlLogin: ", urlLogin)
            fetch(urlLogin)
                .then(response => response.json())
                .then(data => {
                    isLogged = data;
                    console.log("isLogged:", isLogged);
                    if (isLogged) {
                        alert("Login Correcto");
                        window.location.href = "http://localhost:4567/twitter.html";
                    } else {
                        alert("Login Incorrecto");
                    }
                });
        });
}

async function login(password) {
    const hash = await crypto.subtle.digest('SHA-256', new TextEncoder().encode(password));
    const hashHex = Array.from(new Uint8Array(hash)).map(b => b.toString(16).padStart(2, '0')).join('');
    return hashHex;
}
    
