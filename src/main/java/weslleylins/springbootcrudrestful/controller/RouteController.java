package weslleylins.springbootcrudrestful.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("*")
public class RouteController {

     @GetMapping
     public String getRouteMessage()
          { return "<h2>Demo Project Spring Boot CRUD RESTful</h2>" +
                "<p>API Route: /api/users"; }

}
