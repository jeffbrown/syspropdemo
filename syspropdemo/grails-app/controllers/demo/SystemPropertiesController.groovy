package demo

class SystemPropertiesController {

    SystemPropertiesService systemPropertiesService

    def index() {
        String automaticProperty = systemPropertiesService.automaticProperty
        String propertyFromConfig = systemPropertiesService.propertyFromConfig
        String propertyFromSystem = systemPropertiesService.propertyFromSystem

        [automaticProperty: automaticProperty,
         propertyFromConfig: propertyFromConfig,
         propertyFromSystem: propertyFromSystem]
    }
}
