package io.swagger.api;

import io.swagger.client.services.ProductService;
import io.swagger.model.SimilarProducts;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-06-09T18:39:20.385404216Z[GMT]")
@RestController
public class ProductApiController implements ProductApi {
    private ProductService productService = new ProductService();

    private static final Logger log = LoggerFactory.getLogger(ProductApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<SimilarProducts> getProductSimilar(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("productId") String productId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                List<io.swagger.client.model.ProductDetail> productsDetails = productService.getSimilarProductDetails(productId);
                SimilarProducts respuesta = new SimilarProducts();
                for (int i = 0; i < productsDetails.size(); i++) {
                    io.swagger.model.ProductDetail anadir = new io.swagger.model.ProductDetail();
                    anadir.setId(productsDetails.get(i).getId());
                    anadir.setName(productsDetails.get(i).getName());
                    anadir.setAvailability(productsDetails.get(i).isAvailability());
                    anadir.setPrice(productsDetails.get(i).getPrice());
                    respuesta.add(anadir);
                }
                return new ResponseEntity<SimilarProducts>(respuesta, HttpStatus.OK);
            } catch (io.swagger.client.ApiException e) {
                return new ResponseEntity<SimilarProducts>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SimilarProducts>(HttpStatus.NOT_IMPLEMENTED);
    }

}