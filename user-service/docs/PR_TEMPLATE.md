## [JIRA-ID] Short summary of change

### Description
- What does this PR do?
- Why is this change needed?

### Changes
- List key changes made
- Updated pipelines, added tests, etc.

### Verification Steps
1. Checkout branch
2. Run `mvn clean test`
3. Observe pipeline results

### QA & Release Notes
- QA: smoke test in staging
- Rollback: `oc rollout undo deployment/java-microservice`