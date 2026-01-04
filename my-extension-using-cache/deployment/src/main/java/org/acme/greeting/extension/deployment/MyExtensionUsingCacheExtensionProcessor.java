package org.acme.greeting.extension.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class MyExtensionUsingCacheExtensionProcessor {

    private static final String FEATURE = "my-extension-using-cache-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
