package demo

import grails.config.Config
import grails.core.support.GrailsConfigurationAware
import org.springframework.beans.factory.annotation.Value

class SystemPropertiesService implements GrailsConfigurationAware{

    /**
     * This will be automatically initialized with
     * the corresponding system property
     */
    @Value('${some.custom.property}')
    String automaticProperty

    String propertyFromConfig

    /**
     * This will retrieve the property from System.properties
     * @return
     */
    String getPropertyFromSystem() {
        System.getProperty('some.custom.property')
    }

    @Override
    void setConfiguration(Config co) {
        propertyFromConfig = co.getProperty('some.custom.property', '<undefined>')
    }
}
