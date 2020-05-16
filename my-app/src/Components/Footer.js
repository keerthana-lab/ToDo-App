import React from 'react';
import FilterLink from '../Containers/FilterLink';
import { VisibilityFilters } from '../Actions';

const Footer = () => (
    <div>
        <span > Show : </span>
        <FilterLink filter={VisibilityFilters.SHOW_ALL} > ALL </FilterLink>
        <FilterLink filter={VisibilityFilters.SHOW_ACTIVE} > ACTIVE </FilterLink>
        <FilterLink filter={VisibilityFilters.SHOW_COMPLETED} > COMPLETED </FilterLink>
    </div>
)

export default Footer