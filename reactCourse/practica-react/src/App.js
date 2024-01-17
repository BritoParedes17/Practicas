import header from './Img/banner.jpg';
import './App.css';
import Counter from './Components/Counter';
import User from './Components/User';
import TodoList from './Components/TodoList/TodoList';

function App() {
  const user = {
    name: 'Gabriel',
    age: 36,
    skills: ['hardworing, vegetables knowlegde, group selectivism']
  }
  return (
    <div className="App">
      <img src={header} alt='cabezera' />
      <Counter />
      <User {...user}/>
      <hr />
      <TodoList />
    </div>
  );
}

export default App;
