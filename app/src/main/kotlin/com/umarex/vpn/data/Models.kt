data class VpnServer(val id: String, val name: String, val address: String, val port: Int, val type: String) {
    // Additional functionalities or validation can be added here.
}


data class VpnConfig(val servers: List<VpnServer>, val currentServerId: String) {
    // Additional functionalities or validation can be added here.
}


data class DnsConfig(val servers: List<String>, val fallback: String) {
    // Additional functionalities or validation can be added here.
}


data class RoutingConfig(val rules: List<RoutingRule>, val enable: Boolean) {
    // Additional functionalities or validation can be added here.
}


data class RoutingRule(val ip: String, val action: String) {
    // Additional functionalities or validation can be added here.
}


data class OutboundConfig(val protocol: String, val settings: Map<String, Any>) {
    // Additional functionalities or validation can be added here.
}


data class VNextConfig(val address: String, val port: Int, val weight: Int) {
    // Additional functionalities or validation can be added here.
}


data class UserConfig(val id: String, val name: String, val permissions: List<String>) {
    // Additional functionalities or validation can be added here.
}


data class StreamSettings(val network: String, val security: String) {
    // Additional functionalities or validation can be added here.
}


data class RealitySettings(val enable: Boolean, val settings: Map<String, Any>) {
    // Additional functionalities or validation can be added here.
}


data class VpnConnectionState(val connected: Boolean, val connectionTime: String) {
    // Additional functionalities or validation can be added here.
}


data class AppSettings(val theme: String, val notificationsEnabled: Boolean, val language: String) {
    // Additional functionalities or validation can be added here.
}