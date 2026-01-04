package org.acme.greeting.extension.deployment;

import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import org.acme.greeting.extension.runtime.WeatherForecastService;

class MyExtensionUsingCacheExtensionProcessor {

    private static final String FEATURE = "my-extension-using-cache-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    AdditionalBeanBuildItem additionalBeanBuildItemProducer() {
        return AdditionalBeanBuildItem.builder().addBeanClass(WeatherForecastService.class).build();
    }
}
