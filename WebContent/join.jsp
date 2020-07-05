<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Join</title>
    <style>
        body{
            background-image: url('images/다운로드.jpg');
            background-repeat: no-repeat;
            background-size : cover; 
            background-attachment: fixed;
            background-position:center;   
            }
        .main{
            padding-top: 77px; 
        }
       h1{ 
           color: dodgerblue;
           font-family: '돋움';
       }
       h2{
           color:darkslategray;
           font-family: '돋움';
       }
        .join_box{
           width: 650px; height: 1040px; background-color:whitesmoke;
           margin: 50px auto; padding: 43px 44px 38px 44px;
           opacity: 0.7; border-radius: 5px; 
        }
        
        .join_box .input_join{
            border-bottom: 2px solid #c4c4c4;
            padding: 20px 0 9px 0;
        }
        .join_box .input_join input{
            width: 60%; color: gray; font-size: 15px; font-family: '돋움'; border: none;  
        }
        .join_box .button input{
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
        .login_box .button input{
            width: 100%; height: 55px;
            background-color: dodgerblue; 
            color: white; font-size: 16px; font-family: '돋움';
            padding: 17px 0 16px;
            border: 0;
            cursor: pointer;
        }
        #error{
        	margin-top: 10px;
        	
        }
    </style>                                     
</head>

<body>


<form action="join.do" method="post">
    <div class = "wrapper">
        <div class = "main">
        
            <div class = "join_box">
            <p name="error">${error}</p>
                <h1>회원가입</h1>
                <h2>SIGN UP</h2>
                <div class = "input_join">
                    <p>ID*</p>
                    <input type = "text" placeholder="아이디를 입력해주세요." name="id">
             
                </div>
                <div class = "input_join">
                    <p>PASSWORD*</p>
                    <input type = "password" placeholder="비밀번호를 입력해주세요." name="passwd">  
                </div>
                <div class = "input_join">
                    <input type = "password" placeholder="비밀번호를 한번 더 입력해주세요." name="passwd">
                </div>
                <div class ="input_join">
                	<p>이름*</p>
                	<input type="text" placeholder="이름을 입력해주세요" name ="name">
                </div>
                <div class = "input_join">
                   	 <p>이메일*</p>
                    <span>
                    <input type = "text" placeholder="이메일을 입력해주세요" name="email">@
                    <select name="email">
                        <option value="naver">naver.com</option>
                        <option value="daum">daum.net</option>
                        <option value="gmail">gmail.com</option>
                    </select>
                    </span>
                </div>    
                <div class = "input_join">
                    <label for="birth">생년 월일</label>
                    <label><input type="date" id="birth" name="birth"></label>
                </div>
                <div class = "button">
                    <input type = "submit" value = "회원가입">
                </div>
            </div>
        </div>
    </div>   
    </form>
</body>
</html>