import React from 'react';
import Footer from '../Components/Footer';
import AddToDo from '../Containers/AddToDo';
import VisibleToDoList from '../Containers/VisibleToDoList';

const App = () => (
    <div>
        <AddToDo/>
        <VisibleToDoList/>
        <Footer/>
    </div>
)
export default App