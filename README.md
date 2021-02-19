# plaid-java [![Circle CI](https://circleci.com/gh/plaid/plaid-java.svg?style=svg&circle-token=4ed876775bc0ac7fba18124bc835a9e82dab0c53)](https://app.circleci.com/pipelines/github/plaid/plaid-java) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.plaid/plaid-java/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.plaid/plaid-java)

Java Bindings for the Plaid API (https://www.plaid.com/docs).

Plaid API is defined in the `PlaidApi` interface.

Check the Junit test classes for examples of more use cases. Every API endpoint has at
least one integration test against the sandbox environment.

Uses [Retrofit](https://github.com/square/retrofit) and [OkHttp](https://github.com/square/okhttp) under
the hood. You may want to take a look at those libraries if you need to do anything out of the ordinary.

### Installation

Plaid-java is available at [Maven Central](https://search.maven.org/#search%7Cga%7C1%7Cplaid-java)

```xml
<dependency>
  <groupId>com.plaid</groupId>
  <artifactId>plaid-java</artifactId>
  <version>9.0.0-beta-1</version>
</dependency>
```

### Versioning

Each major version of `plaid-java` targets a specific version of the Plaid API:

| API version                                         | plaid-java release    |
| --------------------------------------------------- | --------------------- |
| [`2020-09-14`][api-version-2020-09-14] (**latest**) | `8.x.x`, `9.x.x`      |
| [`2019-05-29`][api-version-2019-05-29]              | `7.x.x`               |
| [`2018-05-22`][api-version-2018-05-22]              | `4.x.x` (and `3.x.x`) |
| `2017-03-08`                                        | `2.x.x`               |

For information about what has changed between versions and how to update your integration, head to the [version changelog][version-changelog].

### Basic Usage

```java

private PlaidApi plaidClient;

HashMap<String, String> apiKeys = new HashMap<String, String>();
apiKeys.put("clientId", plaidClientId);
apiKeys.put("secret", plaidSecret);
apiKeys.put("plaidVersion", "2020-09-14");
apiClient = new ApiClient(apiKeys);
apiClient.setPlaidAdapter(ApiClient.Sandbox); // or equivalent, depending on which environment you're calling into
plaidClient = apiClient.createService(PlaidApi.class);

// Synchronously exchange a Link public_token for an API access_token
// Required request parameters are always Request object constructor arguments
ItemPublicTokenExchangeRequest request = new ItemPublicTokenExchangeRequest().publicToken("the_link_public_token");
Response<ItemPublicTokenExchangeResponse> response = plaidClient()
    .itemPublicTokenExchange(request).execute();

if (response.isSuccessful()) {
  accessToken = response.body().getAccessToken();
}


// Asynchronously do the same thing. Useful for potentially long-lived calls.
ItemPublicTokenExchangeRequest request = new ItemPublicTokenExchangeRequest().publicToken(publicToken);
plaidClient()
    .itemPublicTokenExchange(request)
    .enqueue(new Callback<ItemPublicTokenExchangeResponse>() {
        @Override
        public void onResponse(Call<ItemPublicTokenExchangeResponse> call, Response<ItemPublicTokenExchangeResponse> response) {
          if (response.isSuccessful()) {
            accessToken = response.body.getAccessToken();
          }
        }

        @Override
        public void onFailure(Call<ItemPublicTokenExchangeResponse> call, Throwable t) {
          // handle the failure as needed
        }
    });


// Decoding an unsuccessful response
try {
  Gson gson = new Gson();
  Error error = gson.fromJson(response.errorBody().string(), Error.class);
} catch (Exception e) {
  throw new Exception(
    String.format(
      "Failed converting from API Response Error Body to Error %f",
      response.errorBody().string()
    )
  );
}
```

### Legacy API

If you're looking for a Java client that works with the legacy Plaid API, use
versions of `plaid-java` before `2.1.0`. The API and client are not backwards-compatible.

[version-changelog]: https://plaid.com/docs/api/versioning/
[api-version-2018-05-22]: https://plaid.com/docs/api/versioning/#2018-05-22
[api-version-2019-05-29]: https://plaid.com/docs/api/versioning/#2019-05-29
[api-version-2020-09-14]: https://plaid.com/docs/api/versioning/#2020-09-14
