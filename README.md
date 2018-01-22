# Getting started

Mundipagg API

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPI&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPI&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPI&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPI&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

## How to Use

The following section explains how to use the MundiAPI library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPI&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPI&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPI&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPI&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPI&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *MundiAPILib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPI&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

Clicking the ``` Add ``` button will open a dialog where you need to specify MundiAPI in ``` Group Id ``` and MundiAPILib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPI&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPI&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *MundiAPILib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| basicAuthUserName | The username to use with basic authentication |
| basicAuthPassword | The password to use with basic authentication |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String basicAuthUserName = "basicAuthUserName"; // The username to use with basic authentication
String basicAuthPassword = "basicAuthPassword"; // The password to use with basic authentication

MundiAPIClient client = new MundiAPIClient(basicAuthUserName, basicAuthPassword);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [ChargesController](#charges_controller)
* [CustomersController](#customers_controller)
* [InvoicesController](#invoices_controller)
* [PlansController](#plans_controller)
* [SubscriptionsController](#subscriptions_controller)
* [OrdersController](#orders_controller)
* [TokensController](#tokens_controller)
* [RecipientsController](#recipients_controller)
* [SellersController](#sellers_controller)

## <a name="charges_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.ChargesController") ChargesController

### Get singleton instance

The singleton instance of the ``` ChargesController ``` class can be accessed from the API Client.

```java
ChargesController charges = client.getCharges();
```

### <a name="get_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.getChargeAsync") getChargeAsync

> Get a charge from its id


```java
void getChargeAsync(
        final String chargeId,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |


#### Example Usage

```java
String chargeId = "charge_id";
// Invoking the API call with sample inputs
charges.getChargeAsync(chargeId, new APICallBack<GetChargeResponse>() {
    public void onSuccess(HttpContext context, GetChargeResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="retry_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.retryChargeAsync") retryChargeAsync

> Retries a charge


```java
void retryChargeAsync(
        final String chargeId,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |


#### Example Usage

```java
String chargeId = "charge_id";
// Invoking the API call with sample inputs
charges.retryChargeAsync(chargeId, new APICallBack<GetChargeResponse>() {
    public void onSuccess(HttpContext context, GetChargeResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.createChargeAsync") createChargeAsync

> Creates a new charge


```java
void createChargeAsync(
        final CreateChargeRequest request,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Request for creating a charge |


#### Example Usage

```java
try {
    CreateChargeRequest request = new CreateChargeRequest();
    // Invoking the API call with sample inputs
    charges.createChargeAsync(request, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_charge_card_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.updateChargeCardAsync") updateChargeCardAsync

> Updates the card from a charge


```java
void updateChargeCardAsync(
        final String chargeId,
        final UpdateChargeCardRequest request,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |
| request |  ``` Required ```  | Request for updating a charge's card |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    UpdateChargeCardRequest request = new UpdateChargeCardRequest();
    // Invoking the API call with sample inputs
    charges.updateChargeCardAsync(chargeId, request, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_charge_payment_method_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.updateChargePaymentMethodAsync") updateChargePaymentMethodAsync

> Updates a charge's payment method


```java
void updateChargePaymentMethodAsync(
        final String chargeId,
        final UpdateChargePaymentMethodRequest request,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |
| request |  ``` Required ```  | Request for updating the payment method from a charge |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    UpdateChargePaymentMethodRequest request = new UpdateChargePaymentMethodRequest();
    // Invoking the API call with sample inputs
    charges.updateChargePaymentMethodAsync(chargeId, request, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="cancel_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.cancelChargeAsync") cancelChargeAsync

> Cancel a charge


```java
void cancelChargeAsync(
        final String chargeId,
        final CreateCancelChargeRequest request,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |
| request |  ``` Optional ```  | Request for cancelling a charge |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    CreateCancelChargeRequest request = new CreateCancelChargeRequest();
    // Invoking the API call with sample inputs
    charges.cancelChargeAsync(chargeId, request, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="capture_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.captureChargeAsync") captureChargeAsync

> Captures a charge


```java
void captureChargeAsync(
        final String chargeId,
        final CreateCaptureChargeRequest request,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |
| request |  ``` Optional ```  | Request for capturing a charge |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    CreateCaptureChargeRequest request = new CreateCaptureChargeRequest();
    // Invoking the API call with sample inputs
    charges.captureChargeAsync(chargeId, request, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_charge_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.updateChargeMetadataAsync") updateChargeMetadataAsync

> Updates the metadata from a charge


```java
void updateChargeMetadataAsync(
        final String chargeId,
        final UpdateMetadataRequest request,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | The charge id |
| request |  ``` Required ```  | Request for updating the charge metadata |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    UpdateMetadataRequest request = new UpdateMetadataRequest();
    // Invoking the API call with sample inputs
    charges.updateChargeMetadataAsync(chargeId, request, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_charges_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.getChargesAsync") getChargesAsync

> Lists all charges


```java
void getChargesAsync(
        final Integer page,
        final Integer size,
        final String code,
        final String status,
        final String paymentMethod,
        final String customerId,
        final String orderId,
        final DateTime createdSince,
        final DateTime createdUntil,
        final APICallBack<ListChargesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| code |  ``` Optional ```  | Filter for charge's code |
| status |  ``` Optional ```  | Filter for charge's status |
| paymentMethod |  ``` Optional ```  | Filter for charge's payment method |
| customerId |  ``` Optional ```  | Filter for charge's customer id |
| orderId |  ``` Optional ```  | Filter for charge's order id |
| createdSince |  ``` Optional ```  | Filter for the beginning of the range for charge's creation |
| createdUntil |  ``` Optional ```  | Filter for the end of the range for charge's creation |


#### Example Usage

```java
Integer page = 212;
Integer size = 212;
String code = "code";
String status = "status";
String paymentMethod = "payment_method";
String customerId = "customer_id";
String orderId = "order_id";
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
// Invoking the API call with sample inputs
charges.getChargesAsync(page, size, code, status, paymentMethod, customerId, orderId, createdSince, createdUntil, new APICallBack<ListChargesResponse>() {
    public void onSuccess(HttpContext context, ListChargesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_charge_due_date_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.updateChargeDueDateAsync") updateChargeDueDateAsync

> Updates the due date from a charge


```java
void updateChargeDueDateAsync(
        final String chargeId,
        final UpdateChargeDueDateRequest request,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge Id |
| request |  ``` Required ```  | Request for updating the due date |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    UpdateChargeDueDateRequest request = new UpdateChargeDueDateRequest();
    // Invoking the API call with sample inputs
    charges.updateChargeDueDateAsync(chargeId, request, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="customers_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.CustomersController") CustomersController

### Get singleton instance

The singleton instance of the ``` CustomersController ``` class can be accessed from the API Client.

```java
CustomersController customers = client.getCustomers();
```

### <a name="create_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.createCustomerAsync") createCustomerAsync

> Creates a new customer


```java
void createCustomerAsync(
        final CreateCustomerRequest request,
        final APICallBack<GetCustomerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Request for creating a customer |


#### Example Usage

```java
try {
    CreateCustomerRequest request = new CreateCustomerRequest();
    // Invoking the API call with sample inputs
    customers.createCustomerAsync(request, new APICallBack<GetCustomerResponse>() {
        public void onSuccess(HttpContext context, GetCustomerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.getCustomerAsync") getCustomerAsync

> Get a customer


```java
void getCustomerAsync(
        final String customerId,
        final APICallBack<GetCustomerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |


#### Example Usage

```java
String customerId = "customer_id";
// Invoking the API call with sample inputs
customers.getCustomerAsync(customerId, new APICallBack<GetCustomerResponse>() {
    public void onSuccess(HttpContext context, GetCustomerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_card_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.updateCardAsync") updateCardAsync

> Updates a card


```java
void updateCardAsync(
        final String customerId,
        final String cardId,
        final UpdateCardRequest request,
        final APICallBack<GetCardResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| cardId |  ``` Required ```  | Card id |
| request |  ``` Required ```  | Request for updating a card |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    String cardId = "card_id";
    UpdateCardRequest request = new UpdateCardRequest();
    // Invoking the API call with sample inputs
    customers.updateCardAsync(customerId, cardId, request, new APICallBack<GetCardResponse>() {
        public void onSuccess(HttpContext context, GetCardResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.updateAddressAsync") updateAddressAsync

> Updates an address


```java
void updateAddressAsync(
        final String customerId,
        final String addressId,
        final UpdateAddressRequest request,
        final APICallBack<GetAddressResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| addressId |  ``` Required ```  | Address Id |
| request |  ``` Required ```  | Request for updating an address |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    String addressId = "address_id";
    UpdateAddressRequest request = new UpdateAddressRequest();
    // Invoking the API call with sample inputs
    customers.updateAddressAsync(customerId, addressId, request, new APICallBack<GetAddressResponse>() {
        public void onSuccess(HttpContext context, GetAddressResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.getAddressAsync") getAddressAsync

> Get a customer's address


```java
void getAddressAsync(
        final String customerId,
        final String addressId,
        final APICallBack<GetAddressResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| addressId |  ``` Required ```  | Address Id |


#### Example Usage

```java
String customerId = "customer_id";
String addressId = "address_id";
// Invoking the API call with sample inputs
customers.getAddressAsync(customerId, addressId, new APICallBack<GetAddressResponse>() {
    public void onSuccess(HttpContext context, GetAddressResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.deleteAddressAsync") deleteAddressAsync

> Delete a Customer's address


```java
void deleteAddressAsync(
        final String customerId,
        final String addressId,
        final APICallBack<GetAddressResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| addressId |  ``` Required ```  | Address Id |


#### Example Usage

```java
String customerId = "customer_id";
String addressId = "address_id";
// Invoking the API call with sample inputs
customers.deleteAddressAsync(customerId, addressId, new APICallBack<GetAddressResponse>() {
    public void onSuccess(HttpContext context, GetAddressResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_card_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.deleteCardAsync") deleteCardAsync

> Delete a customer's card


```java
void deleteCardAsync(
        final String customerId,
        final String cardId,
        final APICallBack<GetCardResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| cardId |  ``` Required ```  | Card Id |


#### Example Usage

```java
String customerId = "customer_id";
String cardId = "card_id";
// Invoking the API call with sample inputs
customers.deleteCardAsync(customerId, cardId, new APICallBack<GetCardResponse>() {
    public void onSuccess(HttpContext context, GetCardResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.createAddressAsync") createAddressAsync

> Creates a new address for a customer


```java
void createAddressAsync(
        final String customerId,
        final CreateAddressRequest request,
        final APICallBack<GetAddressResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| request |  ``` Required ```  | Request for creating an address |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    CreateAddressRequest request = new CreateAddressRequest();
    // Invoking the API call with sample inputs
    customers.createAddressAsync(customerId, request, new APICallBack<GetAddressResponse>() {
        public void onSuccess(HttpContext context, GetAddressResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_card_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.getCardAsync") getCardAsync

> Get a customer's card


```java
void getCardAsync(
        final String customerId,
        final String cardId,
        final APICallBack<GetCardResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| cardId |  ``` Required ```  | Card id |


#### Example Usage

```java
String customerId = "customer_id";
String cardId = "card_id";
// Invoking the API call with sample inputs
customers.getCardAsync(customerId, cardId, new APICallBack<GetCardResponse>() {
    public void onSuccess(HttpContext context, GetCardResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_card_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.createCardAsync") createCardAsync

> Creates a new card for a customer


```java
void createCardAsync(
        final String customerId,
        final CreateCardRequest request,
        final APICallBack<GetCardResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| request |  ``` Required ```  | Request for creating a card |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    CreateCardRequest request = new CreateCardRequest();
    // Invoking the API call with sample inputs
    customers.createCardAsync(customerId, request, new APICallBack<GetCardResponse>() {
        public void onSuccess(HttpContext context, GetCardResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.updateCustomerAsync") updateCustomerAsync

> Updates a customer


```java
void updateCustomerAsync(
        final String customerId,
        final UpdateCustomerRequest request,
        final APICallBack<GetCustomerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| request |  ``` Required ```  | Request for updating a customer |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    UpdateCustomerRequest request = new UpdateCustomerRequest();
    // Invoking the API call with sample inputs
    customers.updateCustomerAsync(customerId, request, new APICallBack<GetCustomerResponse>() {
        public void onSuccess(HttpContext context, GetCustomerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="delete_access_tokens_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.deleteAccessTokensAsync") deleteAccessTokensAsync

> Delete a Customer's access tokens


```java
void deleteAccessTokensAsync(
        final String customerId,
        final APICallBack<ListAccessTokensResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |


#### Example Usage

```java
String customerId = "customer_id";
// Invoking the API call with sample inputs
customers.deleteAccessTokensAsync(customerId, new APICallBack<ListAccessTokensResponse>() {
    public void onSuccess(HttpContext context, ListAccessTokensResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_customers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.getCustomersAsync") getCustomersAsync

> Get all Customers


```java
void getCustomersAsync(
        final String name,
        final String document,
        final Integer page,
        final Integer size,
        final String email,
        final APICallBack<ListCustomersResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Optional ```  | Name of the Customer |
| document |  ``` Optional ```  | Document of the Customer |
| page |  ``` Optional ```  ``` DefaultValue ```  | Current page the the search |
| size |  ``` Optional ```  ``` DefaultValue ```  | Quantity pages of the search |
| email |  ``` Optional ```  | Customer's email |


#### Example Usage

```java
String name = "name";
String document = "document";
Integer page = 1;
Integer size = 10;
String email = "email";
// Invoking the API call with sample inputs
customers.getCustomersAsync(name, document, page, size, email, new APICallBack<ListCustomersResponse>() {
    public void onSuccess(HttpContext context, ListCustomersResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_access_token_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.getAccessTokenAsync") getAccessTokenAsync

> Get a Customer's access token


```java
void getAccessTokenAsync(
        final String customerId,
        final String tokenId,
        final APICallBack<GetAccessTokenResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| tokenId |  ``` Required ```  | Token Id |


#### Example Usage

```java
String customerId = "customer_id";
String tokenId = "token_id";
// Invoking the API call with sample inputs
customers.getAccessTokenAsync(customerId, tokenId, new APICallBack<GetAccessTokenResponse>() {
    public void onSuccess(HttpContext context, GetAccessTokenResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_access_token_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.createAccessTokenAsync") createAccessTokenAsync

> Creates a access token for a customer


```java
void createAccessTokenAsync(
        final String customerId,
        final CreateAccessTokenRequest request,
        final APICallBack<GetAccessTokenResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| request |  ``` Required ```  | Request for creating a access token |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    CreateAccessTokenRequest request = new CreateAccessTokenRequest();
    // Invoking the API call with sample inputs
    customers.createAccessTokenAsync(customerId, request, new APICallBack<GetAccessTokenResponse>() {
        public void onSuccess(HttpContext context, GetAccessTokenResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="delete_access_token_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.deleteAccessTokenAsync") deleteAccessTokenAsync

> Delete a customer's access token


```java
void deleteAccessTokenAsync(
        final String customerId,
        final String tokenId,
        final APICallBack<GetAccessTokenResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| tokenId |  ``` Required ```  | Token Id |


#### Example Usage

```java
String customerId = "customer_id";
String tokenId = "token_id";
// Invoking the API call with sample inputs
customers.deleteAccessTokenAsync(customerId, tokenId, new APICallBack<GetAccessTokenResponse>() {
    public void onSuccess(HttpContext context, GetAccessTokenResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_customer_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.updateCustomerMetadataAsync") updateCustomerMetadataAsync

> Updates the metadata a customer


```java
void updateCustomerMetadataAsync(
        final String customerId,
        final UpdateMetadataRequest request,
        final APICallBack<GetCustomerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | The customer id |
| request |  ``` Required ```  | Request for updating the customer metadata |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    UpdateMetadataRequest request = new UpdateMetadataRequest();
    // Invoking the API call with sample inputs
    customers.updateCustomerMetadataAsync(customerId, request, new APICallBack<GetCustomerResponse>() {
        public void onSuccess(HttpContext context, GetCustomerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_access_tokens_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.getAccessTokensAsync") getAccessTokensAsync

> Get all access tokens from a customer


```java
void getAccessTokensAsync(
        final String customerId,
        final Integer page,
        final Integer size,
        final APICallBack<ListAccessTokensResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |


#### Example Usage

```java
String customerId = "customer_id";
Integer page = 212;
Integer size = 212;
// Invoking the API call with sample inputs
customers.getAccessTokensAsync(customerId, page, size, new APICallBack<ListAccessTokensResponse>() {
    public void onSuccess(HttpContext context, ListAccessTokensResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_addresses_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.getAddressesAsync") getAddressesAsync

> Gets all adressess from a customer


```java
void getAddressesAsync(
        final String customerId,
        final Integer page,
        final Integer size,
        final APICallBack<ListAddressesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |


#### Example Usage

```java
String customerId = "customer_id";
Integer page = 212;
Integer size = 212;
// Invoking the API call with sample inputs
customers.getAddressesAsync(customerId, page, size, new APICallBack<ListAddressesResponse>() {
    public void onSuccess(HttpContext context, ListAddressesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_cards_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.getCardsAsync") getCardsAsync

> Get all cards from a customer


```java
void getCardsAsync(
        final String customerId,
        final Integer page,
        final Integer size,
        final APICallBack<ListCardsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |


#### Example Usage

```java
String customerId = "customer_id";
Integer page = 212;
Integer size = 212;
// Invoking the API call with sample inputs
customers.getCardsAsync(customerId, page, size, new APICallBack<ListCardsResponse>() {
    public void onSuccess(HttpContext context, ListCardsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="invoices_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.InvoicesController") InvoicesController

### Get singleton instance

The singleton instance of the ``` InvoicesController ``` class can be accessed from the API Client.

```java
InvoicesController invoices = client.getInvoices();
```

### <a name="get_invoice_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.InvoicesController.getInvoiceAsync") getInvoiceAsync

> Gets an invoice


```java
void getInvoiceAsync(
        final String invoiceId,
        final APICallBack<GetInvoiceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| invoiceId |  ``` Required ```  | Invoice Id |


#### Example Usage

```java
String invoiceId = "invoice_id";
// Invoking the API call with sample inputs
invoices.getInvoiceAsync(invoiceId, new APICallBack<GetInvoiceResponse>() {
    public void onSuccess(HttpContext context, GetInvoiceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="cancel_invoice_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.InvoicesController.cancelInvoiceAsync") cancelInvoiceAsync

> Cancels an invoice


```java
void cancelInvoiceAsync(
        final String invoiceId,
        final APICallBack<GetInvoiceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| invoiceId |  ``` Required ```  | Invoice id |


#### Example Usage

```java
String invoiceId = "invoice_id";
// Invoking the API call with sample inputs
invoices.cancelInvoiceAsync(invoiceId, new APICallBack<GetInvoiceResponse>() {
    public void onSuccess(HttpContext context, GetInvoiceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_invoice_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.InvoicesController.updateInvoiceMetadataAsync") updateInvoiceMetadataAsync

> Updates the metadata from an invoice


```java
void updateInvoiceMetadataAsync(
        final String invoiceId,
        final UpdateMetadataRequest request,
        final APICallBack<GetInvoiceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| invoiceId |  ``` Required ```  | The invoice id |
| request |  ``` Required ```  | Request for updating the invoice metadata |


#### Example Usage

```java
try {
    String invoiceId = "invoice_id";
    UpdateMetadataRequest request = new UpdateMetadataRequest();
    // Invoking the API call with sample inputs
    invoices.updateInvoiceMetadataAsync(invoiceId, request, new APICallBack<GetInvoiceResponse>() {
        public void onSuccess(HttpContext context, GetInvoiceResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_invoices_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.InvoicesController.getInvoicesAsync") getInvoicesAsync

> Gets all invoices


```java
void getInvoicesAsync(
        final Integer page,
        final Integer size,
        final String code,
        final String customerId,
        final String subscriptionId,
        final DateTime createdSince,
        final DateTime createdUntil,
        final String status,
        final DateTime dueSince,
        final DateTime dueUntil,
        final APICallBack<ListInvoicesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| code |  ``` Optional ```  | Filter for Invoice's code |
| customerId |  ``` Optional ```  | Filter for Invoice's customer id |
| subscriptionId |  ``` Optional ```  | Filter for Invoice's subscription id |
| createdSince |  ``` Optional ```  | Filter for Invoice's creation date start range |
| createdUntil |  ``` Optional ```  | Filter for Invoices creation date end range |
| status |  ``` Optional ```  | Filter for Invoice's status |
| dueSince |  ``` Optional ```  | Filter for Invoice's due date start range |
| dueUntil |  ``` Optional ```  | Filter for Invoice's due date end range |


#### Example Usage

```java
Integer page = 212;
Integer size = 212;
String code = "code";
String customerId = "customer_id";
String subscriptionId = "subscription_id";
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
String status = "status";
DateTime dueSince = new Date();
DateTime dueUntil = new Date();
// Invoking the API call with sample inputs
invoices.getInvoicesAsync(page, size, code, customerId, subscriptionId, createdSince, createdUntil, status, dueSince, dueUntil, new APICallBack<ListInvoicesResponse>() {
    public void onSuccess(HttpContext context, ListInvoicesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_invoice_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.InvoicesController.createInvoiceAsync") createInvoiceAsync

> Create an Invoice


```java
void createInvoiceAsync(
        final String subscriptionId,
        final String cycleId,
        final APICallBack<GetInvoiceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |
| cycleId |  ``` Required ```  | Cycle Id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String cycleId = "cycle_id";
// Invoking the API call with sample inputs
invoices.createInvoiceAsync(subscriptionId, cycleId, new APICallBack<GetInvoiceResponse>() {
    public void onSuccess(HttpContext context, GetInvoiceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_invoice_status_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.InvoicesController.updateInvoiceStatusAsync") updateInvoiceStatusAsync

> Updates the status from an invoice


```java
void updateInvoiceStatusAsync(
        final String invoiceId,
        final UpdateInvoiceStatusRequest request,
        final APICallBack<GetInvoiceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| invoiceId |  ``` Required ```  | Invoice Id |
| request |  ``` Required ```  | Request for updating an invoice's status |


#### Example Usage

```java
try {
    String invoiceId = "invoice_id";
    UpdateInvoiceStatusRequest request = new UpdateInvoiceStatusRequest();
    // Invoking the API call with sample inputs
    invoices.updateInvoiceStatusAsync(invoiceId, request, new APICallBack<GetInvoiceResponse>() {
        public void onSuccess(HttpContext context, GetInvoiceResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="plans_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.PlansController") PlansController

### Get singleton instance

The singleton instance of the ``` PlansController ``` class can be accessed from the API Client.

```java
PlansController plans = client.getPlans();
```

### <a name="update_plan_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.updatePlanItemAsync") updatePlanItemAsync

> Updates a plan item


```java
void updatePlanItemAsync(
        final String planId,
        final String planItemId,
        final UpdatePlanItemRequest body,
        final APICallBack<GetPlanItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |
| planItemId |  ``` Required ```  | Plan item id |
| body |  ``` Required ```  | Request for updating the plan item |


#### Example Usage

```java
try {
    String planId = "plan_id";
    String planItemId = "plan_item_id";
    UpdatePlanItemRequest body = new UpdatePlanItemRequest();
    // Invoking the API call with sample inputs
    plans.updatePlanItemAsync(planId, planItemId, body, new APICallBack<GetPlanItemResponse>() {
        public void onSuccess(HttpContext context, GetPlanItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.getPlanAsync") getPlanAsync

> Gets a plan


```java
void getPlanAsync(
        final String planId,
        final APICallBack<GetPlanResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |


#### Example Usage

```java
String planId = "plan_id";
// Invoking the API call with sample inputs
plans.getPlanAsync(planId, new APICallBack<GetPlanResponse>() {
    public void onSuccess(HttpContext context, GetPlanResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_plan_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.createPlanItemAsync") createPlanItemAsync

> Adds a new item to a plan


```java
void createPlanItemAsync(
        final String planId,
        final CreatePlanItemRequest request,
        final APICallBack<GetPlanItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |
| request |  ``` Required ```  | Request for creating a plan item |


#### Example Usage

```java
try {
    String planId = "plan_id";
    CreatePlanItemRequest request = new CreatePlanItemRequest();
    // Invoking the API call with sample inputs
    plans.createPlanItemAsync(planId, request, new APICallBack<GetPlanItemResponse>() {
        public void onSuccess(HttpContext context, GetPlanItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.updatePlanAsync") updatePlanAsync

> Updates a plan


```java
void updatePlanAsync(
        final String planId,
        final UpdatePlanRequest request,
        final APICallBack<GetPlanResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |
| request |  ``` Required ```  | Request for updating a plan |


#### Example Usage

```java
try {
    String planId = "plan_id";
    UpdatePlanRequest request = new UpdatePlanRequest();
    // Invoking the API call with sample inputs
    plans.updatePlanAsync(planId, request, new APICallBack<GetPlanResponse>() {
        public void onSuccess(HttpContext context, GetPlanResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="create_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.createPlanAsync") createPlanAsync

> Creates a new plan


```java
void createPlanAsync(
        final CreatePlanRequest body,
        final APICallBack<GetPlanResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for creating a plan |


#### Example Usage

```java
try {
    CreatePlanRequest body = new CreatePlanRequest();
    // Invoking the API call with sample inputs
    plans.createPlanAsync(body, new APICallBack<GetPlanResponse>() {
        public void onSuccess(HttpContext context, GetPlanResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="delete_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.deletePlanAsync") deletePlanAsync

> Deletes a plan


```java
void deletePlanAsync(
        final String planId,
        final APICallBack<GetPlanResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |


#### Example Usage

```java
String planId = "plan_id";
// Invoking the API call with sample inputs
plans.deletePlanAsync(planId, new APICallBack<GetPlanResponse>() {
    public void onSuccess(HttpContext context, GetPlanResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_plan_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.getPlanItemAsync") getPlanItemAsync

> Gets a plan item


```java
void getPlanItemAsync(
        final String planId,
        final String planItemId,
        final APICallBack<GetPlanItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |
| planItemId |  ``` Required ```  | Plan item id |


#### Example Usage

```java
String planId = "plan_id";
String planItemId = "plan_item_id";
// Invoking the API call with sample inputs
plans.getPlanItemAsync(planId, planItemId, new APICallBack<GetPlanItemResponse>() {
    public void onSuccess(HttpContext context, GetPlanItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_plan_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.deletePlanItemAsync") deletePlanItemAsync

> Removes an item from a plan


```java
void deletePlanItemAsync(
        final String planId,
        final String planItemId,
        final APICallBack<GetPlanItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |
| planItemId |  ``` Required ```  | Plan item id |


#### Example Usage

```java
String planId = "plan_id";
String planItemId = "plan_item_id";
// Invoking the API call with sample inputs
plans.deletePlanItemAsync(planId, planItemId, new APICallBack<GetPlanItemResponse>() {
    public void onSuccess(HttpContext context, GetPlanItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_plan_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.updatePlanMetadataAsync") updatePlanMetadataAsync

> Updates the metadata from a plan


```java
void updatePlanMetadataAsync(
        final String planId,
        final UpdateMetadataRequest request,
        final APICallBack<GetPlanResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | The plan id |
| request |  ``` Required ```  | Request for updating the plan metadata |


#### Example Usage

```java
try {
    String planId = "plan_id";
    UpdateMetadataRequest request = new UpdateMetadataRequest();
    // Invoking the API call with sample inputs
    plans.updatePlanMetadataAsync(planId, request, new APICallBack<GetPlanResponse>() {
        public void onSuccess(HttpContext context, GetPlanResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_plans_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.getPlansAsync") getPlansAsync

> Gets all plans


```java
void getPlansAsync(
        final Integer page,
        final Integer size,
        final String name,
        final String status,
        final String billingType,
        final DateTime createdSince,
        final DateTime createdUntil,
        final APICallBack<ListPlansResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| name |  ``` Optional ```  | Filter for Plan's name |
| status |  ``` Optional ```  | Filter for Plan's status |
| billingType |  ``` Optional ```  | Filter for plan's billing type |
| createdSince |  ``` Optional ```  | Filter for plan's creation date start range |
| createdUntil |  ``` Optional ```  | Filter for plan's creation date end range |


#### Example Usage

```java
Integer page = 49;
Integer size = 49;
String name = "name";
String status = "status";
String billingType = "billing_type";
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
// Invoking the API call with sample inputs
plans.getPlansAsync(page, size, name, status, billingType, createdSince, createdUntil, new APICallBack<ListPlansResponse>() {
    public void onSuccess(HttpContext context, ListPlansResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="subscriptions_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.SubscriptionsController") SubscriptionsController

### Get singleton instance

The singleton instance of the ``` SubscriptionsController ``` class can be accessed from the API Client.

```java
SubscriptionsController subscriptions = client.getSubscriptions();
```

### <a name="update_subscription_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.updateSubscriptionItemAsync") updateSubscriptionItemAsync

> Updates a subscription item


```java
void updateSubscriptionItemAsync(
        final String subscriptionId,
        final String itemId,
        final UpdateSubscriptionItemRequest body,
        final APICallBack<GetSubscriptionItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |
| itemId |  ``` Required ```  | Item id |
| body |  ``` Required ```  | Request for updating a subscription item |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    String itemId = "item_id";
    UpdateSubscriptionItemRequest body = new UpdateSubscriptionItemRequest();
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionItemAsync(subscriptionId, itemId, body, new APICallBack<GetSubscriptionItemResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="create_usage_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.createUsageAsync") createUsageAsync

> Creates a usage


```java
void createUsageAsync(
        final String subscriptionId,
        final String itemId,
        final CreateUsageRequest body,
        final APICallBack<GetUsageResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |
| itemId |  ``` Required ```  | Item id |
| body |  ``` Required ```  | Request for creating a usage |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    String itemId = "item_id";
    CreateUsageRequest body = new CreateUsageRequest();
    // Invoking the API call with sample inputs
    subscriptions.createUsageAsync(subscriptionId, itemId, body, new APICallBack<GetUsageResponse>() {
        public void onSuccess(HttpContext context, GetUsageResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_subscription_billing_date_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.updateSubscriptionBillingDateAsync") updateSubscriptionBillingDateAsync

> Updates the billing date from a subscription


```java
void updateSubscriptionBillingDateAsync(
        final String subscriptionId,
        final UpdateSubscriptionBillingDateRequest request,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| request |  ``` Required ```  | Request for updating the subscription billing date |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateSubscriptionBillingDateRequest request = new UpdateSubscriptionBillingDateRequest();
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionBillingDateAsync(subscriptionId, request, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_subscription_card_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.updateSubscriptionCardAsync") updateSubscriptionCardAsync

> Updates the credit card from a subscription


```java
void updateSubscriptionCardAsync(
        final String subscriptionId,
        final UpdateSubscriptionCardRequest request,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| request |  ``` Required ```  | Request for updating a card |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateSubscriptionCardRequest request = new UpdateSubscriptionCardRequest();
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionCardAsync(subscriptionId, request, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="create_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.createSubscriptionAsync") createSubscriptionAsync

> Creates a new subscription


```java
void createSubscriptionAsync(
        final CreateSubscriptionRequest body,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for creating a subscription |


#### Example Usage

```java
try {
    CreateSubscriptionRequest body = new CreateSubscriptionRequest();
    // Invoking the API call with sample inputs
    subscriptions.createSubscriptionAsync(body, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="create_subscription_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.createSubscriptionItemAsync") createSubscriptionItemAsync

> Creates a new Subscription item


```java
void createSubscriptionItemAsync(
        final String subscriptionId,
        final CreateSubscriptionItemRequest request,
        final APICallBack<GetSubscriptionItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| request |  ``` Required ```  | Request for creating a subscription item |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    CreateSubscriptionItemRequest request = new CreateSubscriptionItemRequest();
    // Invoking the API call with sample inputs
    subscriptions.createSubscriptionItemAsync(subscriptionId, request, new APICallBack<GetSubscriptionItemResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="create_discount_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.createDiscountAsync") createDiscountAsync

> Creates a discount


```java
void createDiscountAsync(
        final String subscriptionId,
        final CreateDiscountRequest request,
        final APICallBack<GetDiscountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| request |  ``` Required ```  | Request for creating a discount |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    CreateDiscountRequest request = new CreateDiscountRequest();
    // Invoking the API call with sample inputs
    subscriptions.createDiscountAsync(subscriptionId, request, new APICallBack<GetDiscountResponse>() {
        public void onSuccess(HttpContext context, GetDiscountResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.getSubscriptionAsync") getSubscriptionAsync

> Gets a subscription


```java
void getSubscriptionAsync(
        final String subscriptionId,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
// Invoking the API call with sample inputs
subscriptions.getSubscriptionAsync(subscriptionId, new APICallBack<GetSubscriptionResponse>() {
    public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_subscription_payment_method_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.updateSubscriptionPaymentMethodAsync") updateSubscriptionPaymentMethodAsync

> Updates the payment method from a subscription


```java
void updateSubscriptionPaymentMethodAsync(
        final String subscriptionId,
        final UpdateSubscriptionPaymentMethodRequest request,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| request |  ``` Required ```  | Request for updating the paymentmethod from a subscription |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateSubscriptionPaymentMethodRequest request = new UpdateSubscriptionPaymentMethodRequest();
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionPaymentMethodAsync(subscriptionId, request, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="delete_discount_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.deleteDiscountAsync") deleteDiscountAsync

> Deletes a discount


```java
void deleteDiscountAsync(
        final String subscriptionId,
        final String discountId,
        final APICallBack<GetDiscountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| discountId |  ``` Required ```  | Discount Id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String discountId = "discount_id";
// Invoking the API call with sample inputs
subscriptions.deleteDiscountAsync(subscriptionId, discountId, new APICallBack<GetDiscountResponse>() {
    public void onSuccess(HttpContext context, GetDiscountResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="cancel_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.cancelSubscriptionAsync") cancelSubscriptionAsync

> Cancels a subscription


```java
void cancelSubscriptionAsync(
        final String subscriptionId,
        final CreateCancelSubscriptionRequest request,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| request |  ``` Optional ```  | Request for cancelling a subscription |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    CreateCancelSubscriptionRequest request = new CreateCancelSubscriptionRequest();
    // Invoking the API call with sample inputs
    subscriptions.cancelSubscriptionAsync(subscriptionId, request, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="delete_subscription_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.deleteSubscriptionItemAsync") deleteSubscriptionItemAsync

> Deletes a subscription item


```java
void deleteSubscriptionItemAsync(
        final String subscriptionId,
        final String subscriptionItemId,
        final APICallBack<GetSubscriptionItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| subscriptionItemId |  ``` Required ```  | Subscription item id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String subscriptionItemId = "subscription_item_id";
// Invoking the API call with sample inputs
subscriptions.deleteSubscriptionItemAsync(subscriptionId, subscriptionItemId, new APICallBack<GetSubscriptionItemResponse>() {
    public void onSuccess(HttpContext context, GetSubscriptionItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_usage_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.deleteUsageAsync") deleteUsageAsync

> Deletes a usage


```java
void deleteUsageAsync(
        final String subscriptionId,
        final String itemId,
        final String usageId,
        final APICallBack<GetUsageResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| itemId |  ``` Required ```  | The subscription item id |
| usageId |  ``` Required ```  | The usage id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String itemId = "item_id";
String usageId = "usage_id";
// Invoking the API call with sample inputs
subscriptions.deleteUsageAsync(subscriptionId, itemId, usageId, new APICallBack<GetUsageResponse>() {
    public void onSuccess(HttpContext context, GetUsageResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_usages_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.getUsagesAsync") getUsagesAsync

> Lists all usages from a subscription item


```java
void getUsagesAsync(
        final String subscriptionId,
        final String itemId,
        final Integer page,
        final Integer size,
        final APICallBack<ListUsagesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| itemId |  ``` Required ```  | The subscription item id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String itemId = "item_id";
Integer page = 49;
Integer size = 49;
// Invoking the API call with sample inputs
subscriptions.getUsagesAsync(subscriptionId, itemId, page, size, new APICallBack<ListUsagesResponse>() {
    public void onSuccess(HttpContext context, ListUsagesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_subscription_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.updateSubscriptionMetadataAsync") updateSubscriptionMetadataAsync

> Updates the metadata from a subscription


```java
void updateSubscriptionMetadataAsync(
        final String subscriptionId,
        final UpdateMetadataRequest request,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| request |  ``` Required ```  | Request for updating the subscrption metadata |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateMetadataRequest request = new UpdateMetadataRequest();
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionMetadataAsync(subscriptionId, request, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_subscriptions_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.getSubscriptionsAsync") getSubscriptionsAsync

> Gets all subscriptions


```java
void getSubscriptionsAsync(
        final Integer page,
        final Integer size,
        final String code,
        final String billingType,
        final String customerId,
        final String planId,
        final String cardId,
        final String status,
        final DateTime nextBillingSince,
        final DateTime nextBillingUntil,
        final DateTime createdSince,
        final DateTime createdUntil,
        final APICallBack<ListSubscriptionsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| code |  ``` Optional ```  | Filter for subscription's code |
| billingType |  ``` Optional ```  | Filter for subscription's billing type |
| customerId |  ``` Optional ```  | Filter for subscription's customer id |
| planId |  ``` Optional ```  | Filter for subscription's plan id |
| cardId |  ``` Optional ```  | Filter for subscription's card id |
| status |  ``` Optional ```  | Filter for subscription's status |
| nextBillingSince |  ``` Optional ```  | Filter for subscription's next billing date start range |
| nextBillingUntil |  ``` Optional ```  | Filter for subscription's next billing date end range |
| createdSince |  ``` Optional ```  | Filter for subscription's creation date start range |
| createdUntil |  ``` Optional ```  | Filter for subscriptions creation date end range |


#### Example Usage

```java
Integer page = 49;
Integer size = 49;
String code = "code";
String billingType = "billing_type";
String customerId = "customer_id";
String planId = "plan_id";
String cardId = "card_id";
String status = "status";
DateTime nextBillingSince = new Date();
DateTime nextBillingUntil = new Date();
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
// Invoking the API call with sample inputs
subscriptions.getSubscriptionsAsync(page, size, code, billingType, customerId, planId, cardId, status, nextBillingSince, nextBillingUntil, createdSince, createdUntil, new APICallBack<ListSubscriptionsResponse>() {
    public void onSuccess(HttpContext context, ListSubscriptionsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_an_usage_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.createAnUsageAsync") createAnUsageAsync

> Create Usage


```java
void createAnUsageAsync(
        final String subscriptionId,
        final String itemId,
        final APICallBack<GetUsageResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| itemId |  ``` Required ```  | Item id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String itemId = "item_id";
// Invoking the API call with sample inputs
subscriptions.createAnUsageAsync(subscriptionId, itemId, new APICallBack<GetUsageResponse>() {
    public void onSuccess(HttpContext context, GetUsageResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_subscription_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.getSubscriptionItemAsync") getSubscriptionItemAsync

> Get Subscription Item


```java
void getSubscriptionItemAsync(
        final String subscriptionId,
        final String itemId,
        final APICallBack<GetSubscriptionItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |
| itemId |  ``` Required ```  | Item id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String itemId = "item_id";
// Invoking the API call with sample inputs
subscriptions.getSubscriptionItemAsync(subscriptionId, itemId, new APICallBack<GetSubscriptionItemResponse>() {
    public void onSuccess(HttpContext context, GetSubscriptionItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_subscription_items_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.getSubscriptionItemsAsync") getSubscriptionItemsAsync

> Get Subscription Itens


```java
void getSubscriptionItemsAsync(
        final String subscriptionId,
        final String status,
        final String description,
        final APICallBack<ListSubscriptionsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |
| status |  ``` Required ```  | Status |
| description |  ``` Required ```  | Description |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String status = "status";
String description = "description";
// Invoking the API call with sample inputs
subscriptions.getSubscriptionItemsAsync(subscriptionId, status, description, new APICallBack<ListSubscriptionsResponse>() {
    public void onSuccess(HttpContext context, ListSubscriptionsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_subscription_affiliation_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.updateSubscriptionAffiliationIdAsync") updateSubscriptionAffiliationIdAsync

> TODO: Add a method description


```java
void updateSubscriptionAffiliationIdAsync(
        final String subscriptionId,
        final UpdateSubscriptionAffiliationIdRequest request,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | TODO: Add a parameter description |
| request |  ``` Required ```  | Request for updating a subscription affiliation id |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateSubscriptionAffiliationIdRequest request = new UpdateSubscriptionAffiliationIdRequest();
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionAffiliationIdAsync(subscriptionId, request, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="orders_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.OrdersController") OrdersController

### Get singleton instance

The singleton instance of the ``` OrdersController ``` class can be accessed from the API Client.

```java
OrdersController orders = client.getOrders();
```

### <a name="get_order_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.OrdersController.getOrderAsync") getOrderAsync

> Gets an order


```java
void getOrderAsync(
        final String orderId,
        final APICallBack<GetOrderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | Order id |


#### Example Usage

```java
String orderId = "order_id";
// Invoking the API call with sample inputs
orders.getOrderAsync(orderId, new APICallBack<GetOrderResponse>() {
    public void onSuccess(HttpContext context, GetOrderResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_order_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.OrdersController.createOrderAsync") createOrderAsync

> Creates a new Order


```java
void createOrderAsync(
        final CreateOrderRequest body,
        final APICallBack<GetOrderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for creating an order |


#### Example Usage

```java
try {
    CreateOrderRequest body = new CreateOrderRequest();
    // Invoking the API call with sample inputs
    orders.createOrderAsync(body, new APICallBack<GetOrderResponse>() {
        public void onSuccess(HttpContext context, GetOrderResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_order_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.OrdersController.updateOrderMetadataAsync") updateOrderMetadataAsync

> Updates the metadata from an order


```java
void updateOrderMetadataAsync(
        final String orderId,
        final UpdateMetadataRequest request,
        final APICallBack<GetOrderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | The order id |
| request |  ``` Required ```  | Request for updating the order metadata |


#### Example Usage

```java
try {
    String orderId = "order_id";
    UpdateMetadataRequest request = new UpdateMetadataRequest();
    // Invoking the API call with sample inputs
    orders.updateOrderMetadataAsync(orderId, request, new APICallBack<GetOrderResponse>() {
        public void onSuccess(HttpContext context, GetOrderResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_orders_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.OrdersController.getOrdersAsync") getOrdersAsync

> Gets all orders


```java
void getOrdersAsync(
        final Integer page,
        final Integer size,
        final String code,
        final String status,
        final DateTime createdSince,
        final DateTime createdUntil,
        final String customerId,
        final APICallBack<ListOrderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| code |  ``` Optional ```  | Filter for order's code |
| status |  ``` Optional ```  | Filter for order's status |
| createdSince |  ``` Optional ```  | Filter for order's creation date start range |
| createdUntil |  ``` Optional ```  | Filter for order's creation date end range |
| customerId |  ``` Optional ```  | Filter for order's customer id |


#### Example Usage

```java
Integer page = 49;
Integer size = 49;
String code = "code";
String status = "status";
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
String customerId = "customer_id";
// Invoking the API call with sample inputs
orders.getOrdersAsync(page, size, code, status, createdSince, createdUntil, customerId, new APICallBack<ListOrderResponse>() {
    public void onSuccess(HttpContext context, ListOrderResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_order_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.OrdersController.updateOrderItemAsync") updateOrderItemAsync

> TODO: Add a method description


```java
void updateOrderItemAsync(
        final String orderId,
        final String itemId,
        final UpdateOrderItemRequest request,
        final APICallBack<GetOrderItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | Order Id |
| itemId |  ``` Required ```  | Item Id |
| request |  ``` Required ```  | Item Model |


#### Example Usage

```java
try {
    String orderId = "orderId";
    String itemId = "itemId";
    UpdateOrderItemRequest request = new UpdateOrderItemRequest();
    // Invoking the API call with sample inputs
    orders.updateOrderItemAsync(orderId, itemId, request, new APICallBack<GetOrderItemResponse>() {
        public void onSuccess(HttpContext context, GetOrderItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="delete_order_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.OrdersController.deleteOrderItemAsync") deleteOrderItemAsync

> TODO: Add a method description


```java
void deleteOrderItemAsync(
        final String orderId,
        final String itemId,
        final APICallBack<GetOrderItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | Order Id |
| itemId |  ``` Required ```  | Item Id |


#### Example Usage

```java
String orderId = "orderId";
String itemId = "itemId";
// Invoking the API call with sample inputs
orders.deleteOrderItemAsync(orderId, itemId, new APICallBack<GetOrderItemResponse>() {
    public void onSuccess(HttpContext context, GetOrderItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_all_order_items_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.OrdersController.deleteAllOrderItemsAsync") deleteAllOrderItemsAsync

> TODO: Add a method description


```java
void deleteAllOrderItemsAsync(
        final String orderId,
        final APICallBack<GetOrderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | Order Id |


#### Example Usage

```java
String orderId = "orderId";
// Invoking the API call with sample inputs
orders.deleteAllOrderItemsAsync(orderId, new APICallBack<GetOrderResponse>() {
    public void onSuccess(HttpContext context, GetOrderResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_order_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.OrdersController.createOrderItemAsync") createOrderItemAsync

> TODO: Add a method description


```java
void createOrderItemAsync(
        final String orderId,
        final CreateOrderItemRequest request,
        final APICallBack<GetOrderItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | Order Id |
| request |  ``` Required ```  | Order Item Model |


#### Example Usage

```java
try {
    String orderId = "orderId";
    CreateOrderItemRequest request = new CreateOrderItemRequest();
    // Invoking the API call with sample inputs
    orders.createOrderItemAsync(orderId, request, new APICallBack<GetOrderItemResponse>() {
        public void onSuccess(HttpContext context, GetOrderItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_order_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.OrdersController.getOrderItemAsync") getOrderItemAsync

> TODO: Add a method description


```java
void getOrderItemAsync(
        final String orderId,
        final String itemId,
        final APICallBack<GetOrderItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | Order Id |
| itemId |  ``` Required ```  | Item Id |


#### Example Usage

```java
String orderId = "orderId";
String itemId = "itemId";
// Invoking the API call with sample inputs
orders.getOrderItemAsync(orderId, itemId, new APICallBack<GetOrderItemResponse>() {
    public void onSuccess(HttpContext context, GetOrderItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_order_status_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.OrdersController.updateOrderStatusAsync") updateOrderStatusAsync

> TODO: Add a method description


```java
void updateOrderStatusAsync(
        final String id,
        final UpdateOrderStatusRequest request,
        final APICallBack<GetOrderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | Order Id |
| request |  ``` Required ```  | Update Order Model |


#### Example Usage

```java
try {
    String id = "id";
    UpdateOrderStatusRequest request = new UpdateOrderStatusRequest();
    // Invoking the API call with sample inputs
    orders.updateOrderStatusAsync(id, request, new APICallBack<GetOrderResponse>() {
        public void onSuccess(HttpContext context, GetOrderResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="tokens_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.TokensController") TokensController

### Get singleton instance

The singleton instance of the ``` TokensController ``` class can be accessed from the API Client.

```java
TokensController tokens = client.getTokens();
```

### <a name="get_token_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.TokensController.getTokenAsync") getTokenAsync

> *Tags:*  ``` Skips Authentication ``` 

> Gets a token from its id


```java
void getTokenAsync(
        final String id,
        final String publicKey,
        final APICallBack<GetTokenResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | Token id |
| publicKey |  ``` Required ```  | Public key |


#### Example Usage

```java
String id = "id";
String publicKey = "public_key";
// Invoking the API call with sample inputs
tokens.getTokenAsync(id, publicKey, new APICallBack<GetTokenResponse>() {
    public void onSuccess(HttpContext context, GetTokenResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_token_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.TokensController.createTokenAsync") createTokenAsync

> *Tags:*  ``` Skips Authentication ``` 

> TODO: Add a method description


```java
void createTokenAsync(
        final String publicKey,
        final CreateTokenRequest request,
        final APICallBack<GetTokenResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| publicKey |  ``` Required ```  | Public key |
| request |  ``` Required ```  | Request for creating a token |


#### Example Usage

```java
try {
    String publicKey = "public_key";
    CreateTokenRequest request = new CreateTokenRequest();
    // Invoking the API call with sample inputs
    tokens.createTokenAsync(publicKey, request, new APICallBack<GetTokenResponse>() {
        public void onSuccess(HttpContext context, GetTokenResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="recipients_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.RecipientsController") RecipientsController

### Get singleton instance

The singleton instance of the ``` RecipientsController ``` class can be accessed from the API Client.

```java
RecipientsController recipients = client.getRecipients();
```

### <a name="create_recipient_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.RecipientsController.createRecipientAsync") createRecipientAsync

> Creates a new recipient


```java
void createRecipientAsync(
        final CreateRecipientRequest request,
        final APICallBack<GetRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Recipient data |


#### Example Usage

```java
try {
    CreateRecipientRequest request = new CreateRecipientRequest();
    // Invoking the API call with sample inputs
    recipients.createRecipientAsync(request, new APICallBack<GetRecipientResponse>() {
        public void onSuccess(HttpContext context, GetRecipientResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_recipient_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.RecipientsController.updateRecipientAsync") updateRecipientAsync

> Updates a recipient


```java
void updateRecipientAsync(
        final String recipientId,
        final UpdateRecipientRequest request,
        final APICallBack<GetRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| request |  ``` Required ```  | Recipient data |


#### Example Usage

```java
try {
    String recipientId = "recipient_id";
    UpdateRecipientRequest request = new UpdateRecipientRequest();
    // Invoking the API call with sample inputs
    recipients.updateRecipientAsync(recipientId, request, new APICallBack<GetRecipientResponse>() {
        public void onSuccess(HttpContext context, GetRecipientResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_recipient_default_bank_account_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.RecipientsController.updateRecipientDefaultBankAccountAsync") updateRecipientDefaultBankAccountAsync

> Updates the default bank account from a recipient


```java
void updateRecipientDefaultBankAccountAsync(
        final String recipientId,
        final UpdateRecipientBankAccountRequest request,
        final APICallBack<GetRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| request |  ``` Required ```  | Bank account data |


#### Example Usage

```java
try {
    String recipientId = "recipient_id";
    UpdateRecipientBankAccountRequest request = new UpdateRecipientBankAccountRequest();
    // Invoking the API call with sample inputs
    recipients.updateRecipientDefaultBankAccountAsync(recipientId, request, new APICallBack<GetRecipientResponse>() {
        public void onSuccess(HttpContext context, GetRecipientResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_recipient_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.RecipientsController.getRecipientAsync") getRecipientAsync

> Retrieves recipient information


```java
void getRecipientAsync(
        final String recipientId,
        final APICallBack<GetRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipiend id |


#### Example Usage

```java
String recipientId = "recipient_id";
// Invoking the API call with sample inputs
recipients.getRecipientAsync(recipientId, new APICallBack<GetRecipientResponse>() {
    public void onSuccess(HttpContext context, GetRecipientResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_recipients_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.RecipientsController.getRecipientsAsync") getRecipientsAsync

> Retrieves paginated recipients information


```java
void getRecipientsAsync(
        final Integer page,
        final Integer size,
        final APICallBack<ListRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |


#### Example Usage

```java
Integer page = 49;
Integer size = 49;
// Invoking the API call with sample inputs
recipients.getRecipientsAsync(page, size, new APICallBack<ListRecipientResponse>() {
    public void onSuccess(HttpContext context, ListRecipientResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_balance_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.RecipientsController.getBalanceAsync") getBalanceAsync

> Get balance information for a recipient


```java
void getBalanceAsync(
        final String recipientId,
        final APICallBack<GetBalanceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |


#### Example Usage

```java
String recipientId = "recipient_id";
// Invoking the API call with sample inputs
recipients.getBalanceAsync(recipientId, new APICallBack<GetBalanceResponse>() {
    public void onSuccess(HttpContext context, GetBalanceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_transfer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.RecipientsController.createTransferAsync") createTransferAsync

> Creates a transfer for a recipient


```java
void createTransferAsync(
        final String recipientId,
        final CreateTransferRequest request,
        final APICallBack<GetTransferResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient Id |
| request |  ``` Required ```  | Transfer data |


#### Example Usage

```java
try {
    String recipientId = "recipient_id";
    CreateTransferRequest request = new CreateTransferRequest();
    // Invoking the API call with sample inputs
    recipients.createTransferAsync(recipientId, request, new APICallBack<GetTransferResponse>() {
        public void onSuccess(HttpContext context, GetTransferResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_transfer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.RecipientsController.getTransferAsync") getTransferAsync

> Gets a transfer


```java
void getTransferAsync(
        final String recipientId,
        final String transferId,
        final APICallBack<GetTransferResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| transferId |  ``` Required ```  | Transfer id |


#### Example Usage

```java
String recipientId = "recipient_id";
String transferId = "transfer_id";
// Invoking the API call with sample inputs
recipients.getTransferAsync(recipientId, transferId, new APICallBack<GetTransferResponse>() {
    public void onSuccess(HttpContext context, GetTransferResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_transfers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.RecipientsController.getTransfersAsync") getTransfersAsync

> Gets a paginated list of transfers for the recipient


```java
void getTransfersAsync(
        final String recipientId,
        final Integer page,
        final Integer size,
        final String status,
        final DateTime createdSince,
        final DateTime createdUntil,
        final APICallBack<ListTransferResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| status |  ``` Optional ```  | Filter for transfer status |
| createdSince |  ``` Optional ```  | Filter for start range of transfer creation date |
| createdUntil |  ``` Optional ```  | Filter for end range of transfer creation date |


#### Example Usage

```java
String recipientId = "recipient_id";
Integer page = 49;
Integer size = 49;
String status = "status";
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
// Invoking the API call with sample inputs
recipients.getTransfersAsync(recipientId, page, size, status, createdSince, createdUntil, new APICallBack<ListTransferResponse>() {
    public void onSuccess(HttpContext context, ListTransferResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_anticipation_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.RecipientsController.createAnticipationAsync") createAnticipationAsync

> Creates an anticipation


```java
void createAnticipationAsync(
        final String recipientId,
        final CreateAnticipationRequest request,
        final APICallBack<GetAnticipationResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| request |  ``` Required ```  | Anticipation data |


#### Example Usage

```java
try {
    String recipientId = "recipient_id";
    CreateAnticipationRequest request = new CreateAnticipationRequest();
    // Invoking the API call with sample inputs
    recipients.createAnticipationAsync(recipientId, request, new APICallBack<GetAnticipationResponse>() {
        public void onSuccess(HttpContext context, GetAnticipationResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_anticipation_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.RecipientsController.getAnticipationAsync") getAnticipationAsync

> Gets an anticipation


```java
void getAnticipationAsync(
        final String recipientId,
        final String anticipationId,
        final APICallBack<GetAnticipationResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| anticipationId |  ``` Required ```  | Anticipation id |


#### Example Usage

```java
String recipientId = "recipient_id";
String anticipationId = "anticipation_id";
// Invoking the API call with sample inputs
recipients.getAnticipationAsync(recipientId, anticipationId, new APICallBack<GetAnticipationResponse>() {
    public void onSuccess(HttpContext context, GetAnticipationResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_anticipation_limits_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.RecipientsController.getAnticipationLimitsAsync") getAnticipationLimitsAsync

> Gets the anticipation limits for a recipient


```java
void getAnticipationLimitsAsync(
        final String recipientId,
        final String timeframe,
        final DateTime paymentDate,
        final APICallBack<GetAnticipationLimitResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| timeframe |  ``` Required ```  | Timeframe |
| paymentDate |  ``` Required ```  | Anticipation payment date |


#### Example Usage

```java
String recipientId = "recipient_id";
String timeframe = "timeframe";
DateTime paymentDate = new Date();
// Invoking the API call with sample inputs
recipients.getAnticipationLimitsAsync(recipientId, timeframe, paymentDate, new APICallBack<GetAnticipationLimitResponse>() {
    public void onSuccess(HttpContext context, GetAnticipationLimitResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_anticipations_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.RecipientsController.getAnticipationsAsync") getAnticipationsAsync

> Retrieves a paginated list of anticipations from a recipient


```java
void getAnticipationsAsync(
        final String recipientId,
        final Integer page,
        final Integer size,
        final String status,
        final String timeframe,
        final DateTime paymentDateSince,
        final DateTime paymentDateUntil,
        final DateTime createdSince,
        final DateTime createdUntil,
        final APICallBack<ListAnticipationResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| status |  ``` Optional ```  | Filter for anticipation status |
| timeframe |  ``` Optional ```  | Filter for anticipation timeframe |
| paymentDateSince |  ``` Optional ```  | Filter for start range for anticipation payment date |
| paymentDateUntil |  ``` Optional ```  | Filter for end range for anticipation payment date |
| createdSince |  ``` Optional ```  | Filter for start range for anticipation creation date |
| createdUntil |  ``` Optional ```  | Filter for end range for anticipation creation date |


#### Example Usage

```java
String recipientId = "recipient_id";
Integer page = 49;
Integer size = 49;
String status = "status";
String timeframe = "timeframe";
DateTime paymentDateSince = new Date();
DateTime paymentDateUntil = new Date();
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
// Invoking the API call with sample inputs
recipients.getAnticipationsAsync(recipientId, page, size, status, timeframe, paymentDateSince, paymentDateUntil, createdSince, createdUntil, new APICallBack<ListAnticipationResponse>() {
    public void onSuccess(HttpContext context, ListAnticipationResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_recipient_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.RecipientsController.updateRecipientMetadataAsync") updateRecipientMetadataAsync

> Updates recipient metadata


```java
void updateRecipientMetadataAsync(
        final String recipientId,
        final UpdateMetadataRequest request,
        final APICallBack<GetRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| request |  ``` Required ```  | Metadata |


#### Example Usage

```java
try {
    String recipientId = "recipient_id";
    UpdateMetadataRequest request = new UpdateMetadataRequest();
    // Invoking the API call with sample inputs
    recipients.updateRecipientMetadataAsync(recipientId, request, new APICallBack<GetRecipientResponse>() {
        public void onSuccess(HttpContext context, GetRecipientResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="sellers_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.SellersController") SellersController

### Get singleton instance

The singleton instance of the ``` SellersController ``` class can be accessed from the API Client.

```java
SellersController sellers = client.getSellers();
```

### <a name="create_seller_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SellersController.createSellerAsync") createSellerAsync

> TODO: Add a method description


```java
void createSellerAsync(
        final CreateSellerRequest request,
        final APICallBack<GetSellerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Seller Model |


#### Example Usage

```java
try {
    CreateSellerRequest request = new CreateSellerRequest();
    // Invoking the API call with sample inputs
    sellers.createSellerAsync(request, new APICallBack<GetSellerResponse>() {
        public void onSuccess(HttpContext context, GetSellerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="delete_seller_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SellersController.deleteSellerAsync") deleteSellerAsync

> TODO: Add a method description


```java
void deleteSellerAsync(
        final String sellerId,
        final APICallBack<GetSellerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| sellerId |  ``` Required ```  | Seller Id |


#### Example Usage

```java
String sellerId = "sellerId";
// Invoking the API call with sample inputs
sellers.deleteSellerAsync(sellerId, new APICallBack<GetSellerResponse>() {
    public void onSuccess(HttpContext context, GetSellerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_seller_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SellersController.getSellerByIdAsync") getSellerByIdAsync

> TODO: Add a method description


```java
void getSellerByIdAsync(
        final String id,
        final APICallBack<GetSellerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | Seller Id |


#### Example Usage

```java
String id = "id";
// Invoking the API call with sample inputs
sellers.getSellerByIdAsync(id, new APICallBack<GetSellerResponse>() {
    public void onSuccess(HttpContext context, GetSellerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_sellers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SellersController.getSellersAsync") getSellersAsync

> TODO: Add a method description


```java
void getSellersAsync(
        final Integer page,
        final Integer size,
        final String name,
        final String document,
        final String code,
        final String status,
        final String type,
        final DateTime createdSince,
        final DateTime createdUntil,
        final APICallBack<ListSellerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| name |  ``` Optional ```  | TODO: Add a parameter description |
| document |  ``` Optional ```  | TODO: Add a parameter description |
| code |  ``` Optional ```  | TODO: Add a parameter description |
| status |  ``` Optional ```  | TODO: Add a parameter description |
| type |  ``` Optional ```  | TODO: Add a parameter description |
| createdSince |  ``` Optional ```  | TODO: Add a parameter description |
| createdUntil |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
Integer page = 49;
Integer size = 49;
String name = "name";
String document = "document";
String code = "code";
String status = "status";
String type = "type";
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
// Invoking the API call with sample inputs
sellers.getSellersAsync(page, size, name, document, code, status, type, createdSince, createdUntil, new APICallBack<ListSellerResponse>() {
    public void onSuccess(HttpContext context, ListSellerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_seller_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SellersController.updateSellerAsync") updateSellerAsync

> TODO: Add a method description


```java
void updateSellerAsync(
        final String id,
        final UpdateSellerRequest request,
        final APICallBack<GetSellerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | TODO: Add a parameter description |
| request |  ``` Required ```  | Update Seller model |


#### Example Usage

```java
try {
    String id = "id";
    UpdateSellerRequest request = new UpdateSellerRequest();
    // Invoking the API call with sample inputs
    sellers.updateSellerAsync(id, request, new APICallBack<GetSellerResponse>() {
        public void onSuccess(HttpContext context, GetSellerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_seller_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SellersController.updateSellerMetadataAsync") updateSellerMetadataAsync

> TODO: Add a method description


```java
void updateSellerMetadataAsync(
        final String sellerId,
        final UpdateMetadataRequest request,
        final APICallBack<GetSellerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| sellerId |  ``` Required ```  | Seller Id |
| request |  ``` Required ```  | Request for updating the charge metadata |


#### Example Usage

```java
try {
    String sellerId = "seller_id";
    UpdateMetadataRequest request = new UpdateMetadataRequest();
    // Invoking the API call with sample inputs
    sellers.updateSellerMetadataAsync(sellerId, request, new APICallBack<GetSellerResponse>() {
        public void onSuccess(HttpContext context, GetSellerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)



