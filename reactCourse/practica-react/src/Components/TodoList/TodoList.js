import { useState } from "react";
import EmptyTodoList from "./EmptyTodoList";
import Todo from "./Todo";
import TodoForm from "./TodoForm"

function TodoList(){
    const [todos, setTodos] = useState([]);

    const addTodo = (text) => {
        setTodos([...todos, { text, isCompleted: false }]);
    }

    const completeTodo = (index) => {
        const newTodos = [...todos];
        newTodos[index].isCompleted = true;
        setTodos(newTodos);
    }

    const removeTodo = (index) => {
        const newTodos = [...todos];
        newTodos.splice(index, 1);
        setTodos(newTodos);
    }

    return(
        <div className="w-96 mx-auto mt-10 bg-gray-300 p-2">
            <div className="bg-gray-500 p-2">
                <TodoForm addTodo={addTodo} />
                {todos.length > 0 ? (todos.map((todo, index) => (
                    <Todo
                        key={index}
                        index={index}
                        todo={todo}
                        completeTodo={completeTodo}
                        removeTodo={removeTodo}
                    />
                ))) : (
                    <EmptyTodoList/>
                )}
            </div>
        </div>
    )
}

export default TodoList;