package org.coding.springboot.ws.countrysoap.infraestructura.endpoint;


import org.coding.springboot.ws.countrysoap.domain.service.CountryService;
import org.coding.springboot.ws.countrysoap.infraestructura.endpoint.message.GetCountryRequest;
import org.coding.springboot.ws.countrysoap.infraestructura.endpoint.message.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

    private final CountryService service;

    @Autowired
    public CountryEndpoint(CountryService service) {
        this.service = service;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(service.findByName(request.getName()));

        return response;
    }
}
