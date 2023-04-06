import "./App.css";
import {} from "semantic-ui-react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import StSellerHeader from "./component/StudySellerHeader"
import Board from "./component/mainBoard";
import Menu from "./component/mainMenu";
import {} from "semantic-ui-react";
import MainPage from "./component/mainPage";

function App() {
  return (
    <BrowserRouter>
      <div className="App">
        <Routes>
          <Route path="/" element={<MainPage />} />
        </Routes>
      </div>
    </BrowserRouter>

  );
}

export default App;