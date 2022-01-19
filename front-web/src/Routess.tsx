import React from "react";

//yarn add react-router-dom - mecanismo ais adotado pela comunidade para fazer navegacao //yarn add @types/react-router-dom para ficar em type script
import { BrowserRouter, Switch ,Route } from 'react-router-dom';
import Navbar from "./core/components/NavBar";
import Admin from "./core/pages/Admin";
import Catalog from "./core/pages/Catalog";
import Home from "./core/pages/Home";

const Routess = () => (
    <BrowserRouter>
    <Navbar />
    <Switch>

        <Route path = "/" exact>
            <Home />

        </Route>

        <Route path = "/catalog">
            <Catalog />
        </Route>

        <Route path = "/admin">
            <Admin />

        </Route>

    </Switch>
    </BrowserRouter>

);

export default Routess;