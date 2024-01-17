function User ({name, age, skills}){
    return(
        <div className="mb-5 mp-5 mx-auto">
            <h1 className="text-3xl mb-3">Info del usuario</h1>
            <h2 className="text-2xl font-bold text-gray-900">
                {name} - {age}
            </h2>
            <h3 className="text-sm font-medium text-gray-500">
                {skills.join(', ')}
            </h3>
        </div>
    )
} export default User;