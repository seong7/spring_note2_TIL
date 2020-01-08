<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Spring Note2</h2>
	1. <a href="home">home</a>
	2. <a href="noteForm">noteForm</a>
	3. <a href="list">list</a>
	
	<h4>spring Note 2 개발 순서</h4>
	<ol>
		<li>
			springNote2 webapp 생성
		</li>
		<li>
			web.xml에 filter 추가
		</li>
		<li>
			controller, dto, dao 패키지 생성
		</li>
		<li>
			lombok을 pom.xml 추가
		</li>
		<li>
			NoteDto.java 생성(lombok 기능 추가)
		</li>
		<li>
			JDBC 드라이버를 pom.xml 추가
			<ul>
				<li>
					repositories (dependencies 위에 추가)
				</li>
				<li>
					5개 외부 jar 추가(dependencies 안에 추가)
				</li>
			</ul>
		</li>
		<li>
			IDao.java 생성, IDO.xml 구현
		</li>
		<li>
			servlet-context.xml 3개의 요소를 추가
		</li>
		<li>
			controller 및 jsp 구현
		</li>
		
	</ol>
</body>
</html>

