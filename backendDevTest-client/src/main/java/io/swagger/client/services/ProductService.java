package io.swagger.client.services;

import java.util.ArrayList;
import java.util.List;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.ProductDetail;
import io.swagger.client.model.SimilarProducts;
import lombok.Getter;

@Getter
public class ProductService {
    private final DefaultApi defaultApi;

    public ProductService() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:3001");
        this.defaultApi = new DefaultApi(apiClient);
    }

    public List<ProductDetail> getSimilarProductDetails(String productId) throws ApiException {
        SimilarProducts similares = defaultApi.getProductSimilarids(productId);
        ArrayList<ProductDetail> products = new ArrayList<>();
        for (String idSimilar : similares) products.add(defaultApi.getProductProductId(idSimilar));
        return products;
    }

}
