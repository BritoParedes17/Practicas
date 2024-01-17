import { useState } from "react";

function TodoForm( {addTodo} ){
    const [value, setValue] = useState("");

    const handleSubmit = (e) => {
        e.preventDefault();
        if(!value) return;
        addTodo(value);
        setValue("");
    }

    return(
        <form onSubmit={handleSubmit}>
            <input
                autoFocus={true}
                className="block w-full rounded-2xl p-2 mb-2"
                placeholder="Ingresa la tarea a realizar"
                value={value} 
                onChange={e => setValue(e.target.value)} 
            />
        </form>
    )
}

export default TodoForm;