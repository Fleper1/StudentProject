import Publications from "../pages/Publications";
import Registration from "../pages/Registration";
import Login from "../pages/Login";
import Reviews from "../pages/Reviews";
import CreatePublication from "../pages/CreatePublication";
import CurrentPublication from "../pages/CurrentPublication";
import Resume from "../pages/Resume";


export const privateRoutes = [
    {path: "/publications", element: <Publications/>},
    {path: "/publications/:id", element: <CurrentPublication/>},
    {path: "/reviews", element: <Reviews/> },
    {path: "/publications/add", element: <CreatePublication/>},
    {path: "/resume/:id", element: <Resume/>},
]

export const publicRoutes = [
    {path: "/publications", element: <Publications/>},
    {path: "/publications/:id", element: <CurrentPublication/>},
    {path: "/registration", element: <Registration/>},
    {path: "/login", element: <Login/>}
]