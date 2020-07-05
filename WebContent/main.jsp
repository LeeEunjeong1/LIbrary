<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
    <meta charset="utf-8" >
    <title>도서관 홈페이지</title>
    <style>
    body{
        background-image: url('images/다운로드.jpg');
        background-repeat: no-repeat;
        background-size : cover; 
        background-attachment: fixed;
    }
    #header{
        height:180px;
        width: 100%;
        margin-bottom:10px;
        float: left;
        border-bottom: 2px solid #1b5ac2 ;
        
        }
    #header ul{
        float: right;
        }
    #header ul li{
        list-style-type: none;
        display: inline-block;
        width:100px; height: 40px;
        padding:10px; margin:0px;
        color: gray;
        background-color : rgb(255,217,102);
        font-size: 20px;
        text-align: center;
        border-radius: 4px;
        }
        li{
            display: inline-block;
			border-style:solid;
			border-width:1px;
			padding: 10px 20px;
			margin: 10px;
			}
            #button{
            height: 40px;
            width: 100px;
            }
            #content{
                display:inline-block;
                background:white;
                opacity: 0.8;
                width: 30%; height: 300px;
                padding: 50px; margin: none 20px none none;
                   
            }
            #search{
                width: 300px;
                height: 200px;
                border: 1px dotted black;
            }
            #content #search{
                height: 40px;
                 width: 400px;
                 border: 2px solid #1b5ac2; 
            }
            #content #search input{
                font-size: 16px;
                width: 325px;
                padding: 10px;
                border: 0px;
                outline: none;
                float: left;
            }
            #content #search button{
                width: 50px;
                height: 100%;
                background: #1b5ac2;
                outline: none;
                float: right;
                color: white;

            }
            
            #content .book_list {
                color: gray;
                height:10%;
                width:40%;
                margin:10px;
                list-style-type: none;
                display: inline-block;
              
                border: 2px solid gray;
                font-size: 20px;
                text-align: center;
                border-radius: 4px;

            }
            #sidebar{   
                width: 40%;
                height: 600px;
                
                float: right;
            }
            #sidebar #ad{
                width: 90%;
                height: 60%;
                background-color: #cccccc;
                
                opacity: 0.9;
                
            }
            #sidebar #ad #text{
                width: 53%; height: 80%;
                float: right;
                font-family: '돋움';
            }
            #sidebar #ad img{
                padding: 5px;
                width: 45%; height: 80%;
                float: left;
                background-attachment: fixed;
            }
            #footer {
                background-color:rgb(211, 211, 211);
                height:130px; 
                clear:both;
                text-align: center;
                }
            
</style>
</head>
<body>
    <div id = " wrap">
        <div id="header">
            <img src="images/마이심5.png">
            <ul>
                <li><a href="#">관리자</a></li>
                <li><a href="login.jsp">Login</a></li>
                <li><a href="join.jsp">회원가입</a></li>
            </ul>
        </div>
    </div>
    
    <div id = "content">
            <h1 style="font-family: '돋움'">도서검색</h1>
            <form action = "bookSearch.do" method="post">
        <div id = "search">
            <input type ="text" placeholder="검색어 입력">
            <button>검색</button>
        </div>
     	</form>
        <div class = "book_list">
          <a href = "bookList.do">도서목록</a>
        </div>
        
        <div class = "book_list">
           <a href="book_plus.jsp">도서 추가</a>
        </div>
    </div>
   
    
    <div id = "sidebar">
        <div id = "ad">
            <div id ="text">
                <h2 style="color: #1b5ac2">이달의 책</h2>
                <hr>
                <pre>
『곰돌이 푸, 행복한 일은 매일 있어』는
푸의 메시지와 삽화가 담긴 책이다.
어떤 상황에서든 여유와 미소를 잊지 않는
곰돌이 푸를 다시 기억하고 만나는 일은,
반복되는 삶 속에서 무엇이 나를 행복하게 
하는지를 잊어가는 우리에게,다시 한번 행복에
관한 희망과 의미를 되새기게 해줄 것이다.
귀엽고 사랑스러운 모습부터 엉뚱한 모습까지
우리를 자꾸만 웃음 짓게 만드는 푸를,
진심 어린 말로 우리의 마음을 자꾸만 무장 
해제시키는 푸를, 초기 삽화부터 우리에게
익숙한 만화영화 속 곰돌이 푸의 모습을 
퀄리티 높은 디즈니의 삽화로 소장할 수 
있는 것도 큰 즐거움이다.</pre>
        </div>
            <img src="images/bookcover.jpg">
        </div>
    </div>
    <div id = "footer">copyright</div>

</body>
</html>
