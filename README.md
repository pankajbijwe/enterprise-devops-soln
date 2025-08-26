Enterprise grade production-ready DevSecOps CI/CD solution for microservices

Key features/roadmap
- Gatekeepers at Every Stage: quality, security, container, and deploy gates
- Immutable Artifacts: every Maven deploy and Docker image is versioned by commit SHA
- Least-Privilege & Secrets Management: OpenShift secrets, GitLab CI variables
- Observability Hooks: readiness/liveness probes, Fortify and Sonar reporting artifacts
- Self-Healing & Rollback: easy oc rollout undo, autoscaling, multi-AZ pods
- Governance & Audit: Git history, protected branches, MR approvals, pipeline logs


Branching Strategy 
- Establish a clear branching model and commit policy.
- Main Branch Protection
- main (or master) always reflects production.
- Block direct pushes—only merged via pull requests with passing pipelines.
- Require at least one approving code review.
- Branch Naming
- Features: feature/<JIRA-ID>-short-description
- Hotfixes: hotfix/<ticket>-urgent-fix
- Releases: release/<version>
- Commit Message Convention:  <type>(<scope>): <short summary>
 E.g.  ci(pipeline): add SonarQube quality gate step | Enforces code coverage and static analysis metrics before allowing deploy to staging.

Workflow
- Developer creates feature/JIRA-123-add-payment-api.
- They add code, update openshift/ manifests (if needed), and enhance .gitlab-ci.yml.
- They commit following <type>(<scope>): commit message convention.
- Pushes branch to GitHub, opens a pull request against main.
- CI runs:
  - Maven build → Nexus publish
  - Unit tests
  - SonarQube quality gate
  - Fortify, Nexus IQ, WebInspect scans
  - Docker build & push
  - If any stage fails, the pipeline breaks and the PR is blocked.
  - After approval and green pipeline, merge to main.
- CD kicks off:
  - deploy to OpenShift
  - rollout status monitored.
  - Route health checked
  - monitoring dashboards updated automatically.
