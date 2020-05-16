import todos from './todos';
import visibilityFilter from './visibilityFilter';
//import React from  'react';
import {combineReducers} from 'redux';
 
export default combineReducers({
    todos,
    visibilityFilter
})
