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
        .make_book{
           width: 650px; height: 1040px; background-color:white;
           margin: 50px auto; padding: 43px 44px 38px 44px;
           opacity: 0.9; border-radius: 5px; 
        }
        
        .make_book .book{
            border-bottom: 2px solid #c4c4c4;
            padding: 20px 0 9px 0;
        }
        .make_book .book input{
            width: 100%; color: gray; font-size: 15px; font-family: '돋움'; border: none;  
        }
       

        .make_book .button input{
            width: 100%; height: 55px;
            background-color: dodgerblue; 
            color: white; font-size: 16px; font-family: '돋움';
            padding: 17px 0 16px;
            border: 0;
            cursor: pointer;
            margin-top : 100px;
        }
    </style>                                     
</head>

<body>

<form action="bookInsert.do" method="post">
    <div class = "wrapper">
        <div class = "main">
            <div class = "make_book">
                <h1>도서추가</h1>
                <h2>책 정보</h2>
                ${error}
                <div class = "book">
                    <p>책 이름</p>
                    <input type = "text" placeholder="책이름을 입력해주세요." name="bookname">
                </div>
                <div class = "book">
                    <p>저자</p>
                    <input type = "text" placeholder="저자를 입력해주세요." name="author">  
                </div>
                <div class = "book">
                    <p>도서 분야</p>
                    <input type = "text" placeholder="도서분야를 입력해주세요." name="bookfield">
                </div>
                <div class = "book">
                    <p>출판사</p>
                    <input type = "text" placeholder="출판사를 입력해주세요." name="publisher">
                </div>
                <div class = "book">
                    <p>출판 연도</p>
                    <input type = "text" placeholder="출판연도를 입력해주세요." name="publishyear">
                   
                </div> 
                <div class = "button">
                    <input type = "submit" value = "도서정보 저장">   
                </div>
            </div>
        </div>
    </div>   
    </form>
</body>
</html>