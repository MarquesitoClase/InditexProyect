# DefaultApi

All URIs are relative to *http://localhost:3001*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProductProductId**](DefaultApi.md#getProductProductId) | **GET** /product/{productId} | Gets a product detail
[**getProductSimilarids**](DefaultApi.md#getProductSimilarids) | **GET** /product/{productId}/similarids | Gets the ids of the similar products

<a name="getProductProductId"></a>
# **getProductProductId**
> ProductDetail getProductProductId(productId)

Gets a product detail

Returns the product detail for a given productId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String productId = "productId_example"; // String | 
try {
    ProductDetail result = apiInstance.getProductProductId(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getProductProductId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**|  |

### Return type

[**ProductDetail**](ProductDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductSimilarids"></a>
# **getProductSimilarids**
> SimilarProducts getProductSimilarids(productId)

Gets the ids of the similar products

Returns the similar products to a given one ordered by similarity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String productId = "productId_example"; // String | 
try {
    SimilarProducts result = apiInstance.getProductSimilarids(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getProductSimilarids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**|  |

### Return type

[**SimilarProducts**](SimilarProducts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

