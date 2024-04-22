package tn.insat.tpmicro.proxyservice.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class GatewayRoutesController {
    private final RouteLocator routeLocator;

    public GatewayRoutesController(RouteLocator routeLocator) {
        this.routeLocator = routeLocator;
    }

    @GetMapping("/actuator/gateway/routes")
    public Flux<Route> getRoutes() {
        return routeLocator.getRoutes();
    }
}
