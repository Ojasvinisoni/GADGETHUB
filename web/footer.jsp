<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Contact Us</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <style>
        body {
            font-family: 'Montserrat', sans-serif;
            background: linear-gradient(135deg, #f3e5f5, #ce93d8); /* Soft pastel purple to pink */
            margin: 0;
            padding: 0;
            color: #333;
        }

        .contact-section {
            background: linear-gradient(135deg, #fce4ec, #f8bbd0); /* Soft pink gradient for the section */
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.15);
            padding: 50px;
            margin: 0;
            width: 100%;
            max-width: none;
        }

        .contact-section h2 {
            color: #6a11cb; /* Purple heading */
            text-align: center;
            margin-bottom: 20px;
        }

        .contact-section p {
            text-align: center;
            margin-bottom: 30px;
            font-size: 18px;
            color: #444;
        }

        .contact-section .contact-info {
            font-size: 18px;
            line-height: 1.8;
            color: #444;
        }

        .contact-section .contact-info i {
            margin-right: 10px;
            color: #9c27b0; /* Purple icon color */
        }

        .contact-section form .form-control {
            border: 2px solid #f06292;
            border-radius: 12px;
            padding: 16px;
            font-size: 16px;
            transition: border-color 0.3s ease;
        }

        .contact-section form .form-control:focus {
            border-color: #9c27b0;
            box-shadow: 0 0 12px rgba(156, 39, 176, 0.4);
        }

        .contact-section form .btn-warning {
            background: linear-gradient(135deg, #ba68c8, #ab47bc); /* Lavender to purple button */
            border: none;
            padding: 18px 40px;
            font-size: 18px;
            border-radius: 12px;
            color: white;
            font-weight: 600;
            transition: transform 0.2s ease, box-shadow 0.2s ease;
        }

        .contact-section form .btn-warning:hover {
            transform: translateY(-5px);
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
        }
    </style>
</head>
<body>
    <div class="contact-section">
        <h2>Contact Us</h2>
        <p>We'd love to hear from you!</p>
        <div class="row">
            <div class="col-md-4 contact-info">
                <p><i class="fa-solid fa-phone"></i> Phone: +91 9770127656</p>
                <p><i class="fa-solid fa-envelope"></i> Email: ojasvinisoni02@gmail.com</p>
                <p><i class="fa-solid fa-signs-post"></i> Postal Code: 462022</p>
            </div>
            <div class="col-md-8">
                <form action="#">
                    <div class="row">
                        <div class="col-sm-6 form-group mt-1">
                            <input type="text" class="form-control" placeholder="Name" required />
                        </div>
                        <div class="col-sm-6 form-group mt-1">
                            <input type="email" class="form-control" placeholder="Email" required />
                        </div>
                    </div>
                    <textarea name="" id="" rows="5" class="form-control mt-1" placeholder="Enter your message.."></textarea>
                    <div class="row">
                        <div class="col-md-12 form-group mt-1">
                            <button type="button" class="btn btn-warning">Send</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script>
    (function(){
        if(!window.chatbase || window.chatbase("getState") !== "initialized"){
            window.chatbase = (...arguments) => {
                if(!window.chatbase.q) { window.chatbase.q = [] }
                window.chatbase.q.push(arguments);
            };
            window.chatbase = new Proxy(window.chatbase, {
                get(target, prop) {
                    if(prop === "q") return target.q;
                    return (...args) => target(prop, ...args);
                }
            });
        }
        const onLoad = function(){
            const script = document.createElement("script");
            script.src = "https://www.chatbase.co/embed.min.js";
            script.id = "d0e39hs6ns3OfteMWhT_D";
            script.domain = "www.chatbase.co";
            document.body.appendChild(script);
        };
        if(document.readyState === "complete"){
            onLoad();
        } else {
            window.addEventListener("load", onLoad);
        }
    })();
    </script>
</body>
</html>
