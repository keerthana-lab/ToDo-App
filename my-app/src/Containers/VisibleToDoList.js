import { connect } from 'react-redux';
import { toggleToDo, VisibilityFilters } from '../Actions';
import ToDoList from '../Components/ToDoList';

const getVisibleToDos = (todos, filter) => {
    switch(filter) {
        case VisibilityFilters.SHOW_ALL: 
            return todos
        case VisibilityFilters.SHOW_COMPLETED: 
            return todos.filter(t => t.completed)
        case VisibilityFilters.SHOW_ACTIVE: 
            return todos.filter(t => !t.completed)
        default: 
            throw new Error('unknown filter: ' + filter)        
    }
}

const mapStateToProps = state => ({
    todos: getVisibleToDos(state.todos, state.visibilityFilter)
})

const mapDispatchToProps = dispatch => ({
    toggleToDo: id => dispatch(toggleToDo(id)) 
})

export default connect(mapStateToProps, mapDispatchToProps)(ToDoList)