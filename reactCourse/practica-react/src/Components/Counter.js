import { useState } from "react";

function Counter(){
    const [count, setCount] = useState(0);
    return(
        <div className="mb-5 mx-auto">
            <h1 className="text-3xl mb-3">Contador</h1>

            <button 
                onClick={()=>setCount(count + 1)}
                className="btn bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded"
            >
                    Incrementar
            </button>
            <p id="increment" className="mt-2 mb-2">{count}</p>
            <button
                onClick={()=>setCount(count - 1)}
                className="btn bg-orange-500 hover:bg-orange -700 text-white font-bold py-2 px-4 rounded"
            >
                Decrementar
            </button>
        </div>
    )
}

export default Counter;