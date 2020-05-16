import React from 'react';
import PropTypes from 'prop-types';
import ToDo from './ToDo';

const ToDoList = ({todos, toggleToDo}) => (
    <ul>
        {todos.map(todo => (
            <ToDo key={todo.id} {...todo} onClick={() => toggleToDo(todo.id)}/>
        ))}
    </ul>
)

ToDoList.propTypes = {
    todos: PropTypes.arrayOf(
            PropTypes.shape({
                id: PropTypes.number.isRequired,
                text: PropTypes.string.isRequired,
                completed: PropTypes.bool.isRequired
            }).isRequired
            ).isRequired,
    toggleToDo: PropTypes.func.isRequired
}

export default ToDoList