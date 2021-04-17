/*eslint-disable*/
import React, { useState } from 'react';
import logo from './logo.svg';
import './App.css';

function App() {

  let [글제목, 글제목변경] = useState(['남자 팬티 추천', '남자 폴댄스 추천', '남자 핫요가 추천']);
  let [따봉, 따봉변경] = useState(0);
  // function 제목바꾸기() {
  //   let newArray = [...글제목];
  //   newArray[0] = '여자 코트 추천';
  //   글제목변경(newArray);
  // }

  function 순서바꾸기() {
    let number = [...글제목];
    number.sort();
    글제목변경(number);
  }

  return (
    <div className="App">
      <div className="black-nav">
        <div>개발 blog</div>
      </div>
      <button onClick={순서바꾸기}>이름변경</button>
      <div className="list">
        <h3>{글제목[0]} <span onClick={() => { 따봉변경(따봉 + 1) }}>😊</span> <span>{따봉}</span> </h3>
        <p>2월 17일 발행</p>
        <hr />
      </div>

      <div className="list">
        <h3>{글제목[1]}</h3>
        <p>2월 17일 발행</p>
        <hr />
      </div>

      <div className="list">
        <h3>{글제목[2]}</h3>
        <p>2월 17일 발행</p>
        <hr />
      </div>

    </div>
  )
}

export default App;