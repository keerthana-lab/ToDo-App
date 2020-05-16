import React from 'react';
import { connect } from 'react-redux';
import { addToDo } from '../Actions';

const AddToDo = ({ dispatch }) => {
    let input 
    return (
        <div>
            <form onSubmit={
                e => {
                    e.preventDefault();
                    if(!input.value.trim) {
                        return
                    }
                    dispatch(addToDo(input.value))
                    input.value=''
                }
            }>
                <input ref={node => (input=node)} />
                <button type="submit">ADD TO-DO</button>
            </form>
        </div>
    )
}

export default connect()(AddToDo)