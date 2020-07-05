<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        body{
            background-image: url('images/다운로드.jpg');
            background-repeat: no-repeat;
            background-size : cover; 
            background-attachment: fixed;
            background-position:center;   
            }
        .main{
            padding-top: 160px; 
        }
        .logo{
            width: 570px; margin: 0 auto 30px auto;
        }
        .logo img{
            width: 550px; height: 96px;
        }
        .login_box{
           width: 337px; height: 400px; background-color:whitesmoke;
           margin: 0 auto; padding: 45px 44px 38px 44px;
           opacity: 0.7; border-radius: 5px; 
        }
        .login_box .input_login{
            border-bottom: 2px solid #c4c4c4;
            padding: 20px 0 9px 0;
        }
        .login_box .input_login input{
            width: 100%; color: gray; font-size: 15px; font-family: '돋움'; border: none;  

        }
        .login_box .button input{
            width: 100%; height: 55px;
            background-color: dodgerblue; 
            color: white; font-size: 16px; font-family: '돋움';
            padding: 17px 0 16px;
            border: 0;
            cursor: pointer;
        }
        .login_box .join{
            float: left;
        }
    </style>                                     
</head>

<body>
<form action="login.do" method="post">
    <div class = "wrapper">
        <div class = "main">
            <div class="logo">
                <img src = "images/마이심3.png">
            </div>
            
            <div class = "login_box">
            ${error}
                <div class = "input_login">
                    <input type = "text" placeholder="아이디를 입력하세요." name = "id">
                </div>
                <div class = "input_login">
                    <input type = "password" placeholder="비밀번호를 입력하세요." name="passwd">
                </div>
                <div class = "button">
                    <input type = "submit" value = "로그인">
                <div class = "join"><a href="join.jsp">회원가입</a></div>
            </div>
               </div>
        
    </div>
    </div>
    </form>




    
</body>
</html>