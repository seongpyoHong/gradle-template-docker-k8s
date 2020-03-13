### Gradle Template
The Gradle template for building docker image & deploy to k8s in multi-module project.

- Setting for GKE with Terraform :
**terraform-provider-google** (https://github.com/terraform-providers/terraform-provider-google)

- docker image build : **jib-gradle-plugin** 
(https://github.com/GoogleContainerTools/jib/tree/master/jib-gradle-plugin)

- k8s deploy : **Skaffold** https://github.com/GoogleContainerTools/skaffold


#### Create GKE Cluster
```
> terraform plan
> terraform apply
```

#### build docker image
```$xslt
> ./grdlew jib
```

#### deploy to k8s
```
> skaffold dev
```

### TODO
- The process by which skaffold detects changes in files needs to be modified.
