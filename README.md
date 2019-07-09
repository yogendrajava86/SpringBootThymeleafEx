# SpringBootThymeleafEx
Spring Boot Thymeleaf Example

## Thymeleaf Rules

<html xmlns:th="http://www.thymeleaf.org/">

@{url}
${EL}
*{variable}
-----------------------------

th:action="@{url}

ModelAttribute -> th:object="${modelAttributeObjectName}"

Form Field Mapping-> th:field="*{variableName}"

Collection itrate ->loop 

th:each="tempVar:${CollectionObjectName}"
  th:text="${tempVar.variableName}"
