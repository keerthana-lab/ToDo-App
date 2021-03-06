
let count = 0
export const addToDo = text => ({
    type: 'ADD_TODO',
    id: count++,
    text: text
})

export const setVisibilityFilter = filter => ({
    type: 'SET_VISIBILITY_FILTER',
    filter: filter
})

export const toggleToDo = id => ({
    type: 'TOGGLE_TODO',
    id: id
})

export const VisibilityFilters = {
    SHOW_ALL: 'SHOW_ALL',
    SHOW_COMPLETED: 'SHOW_COMPLETED',
    SHOW_ACTIVE: 'SHOW_ACTIVE'
}