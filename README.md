
![Claims Processing System](https://github.com/user-attachments/assets/0c1d2959-b1c0-4493-ad9a-636f63ee7169)

# Claims Processing System

Claims Processing System is a centralized, monolithic Java-based application built to efficiently manage and process insurance claims. It is designed for internal use by insurance agents to streamline workflows and enhance productivity with features like real-time claim status updates, automated validation, and comprehensive reporting.

## Key Features

- **Claims Management**: Submit, validate, and process claims with automated rule-based evaluation.
- **Real-Time Notifications**: Kafka-based notifications for claim updates and status changes.
- **Secure Access**: OAuth-based authentication and role-based access control.
- **In-Memory Caching**: Redis cache integration for rapid data retrieval and reduced database load.
- **Comprehensive Reporting**: Generate detailed and summary reports on claim status and history.
- **Logging & Monitoring**: Integrated with Log4j2 and Splunk for centralized log management and visualization.
- **CI/CD & Deployment**: Automated pipeline using Jenkins, Docker, and Kubernetes for seamless delivery.

## System Architecture
![IMG_0273](https://github.com/user-attachments/assets/91e97bcf-7568-4e8f-ac98-31ac2879b284)

- **Backend**: Monolithic Spring Boot application
- **Database**: MySQL for relational data storage
- **Cache**: Redis for caching frequent queries and claim status
- **Messaging**: Apache Kafka for real-time updates
- **Logging**: Log4j2 and Splunk for asynchronous structured logging
- **Authentication**: OAuth2 for secure user access

## Project Flow

1. **Claim Submission**
   - Agent logs in and submits a claim.
   - OAuth token used for secure API access.

2. **Claim Validation & Processing**
   - Claims Processing Module applies business rules to validate and process.
   - Valid claims are forwarded for settlement.

3. **Reporting**
   - Generates reports using the Reporting Module.
   - Shared with agents or emailed to clients.

Throughout all steps:
- Kafka handles real-time claim status notifications.
- Logs are recorded and pushed to Splunk via Log4j2.

## REST API Endpoints

### Claims Management
- `POST /claims`
- `GET /claims/{claimId}`
- `PUT /claims/{claimId}`
- `DELETE /claims/{claimId}`
- `GET /claims/user/{userId}`

### User Management
- `POST /users/register`
- `POST /users/login`
- `GET /users/{userId}`
- `PUT /users/{userId}`
- `DELETE /users/{userId}`

### Reporting
- `GET /reports/claims/status`
- `GET /reports/claims/summary`

### Notifications
- `POST /notifications/subscribe`
- `POST /notifications/unsubscribe`

### Admin
- `GET /admin/logs`

## Technologies Used

- **Java, Spring Boot**
- **MySQL**
- **Redis**
- **Kafka**
- **Log4j2**
- **Splunk**
- **Docker & Kubernetes**
- **Jenkins (CI/CD)**
- **GitLab (Version Control)**

## Deployment

- Application is containerized using Docker.
- Managed via Kubernetes clusters.
- Jenkins handles build, test, and deployment.
- Follows blue-green and canary deployment strategies.

## Use Cases

- **Insurance Agents**: Efficient and secure claim management and reporting.
- **Operations Teams**: Monitor real-time claim status and system performance.
- **Business Analysts**: Analyze trends and summaries for decision-making.
