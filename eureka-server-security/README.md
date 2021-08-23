# eureka-server-security

Eureka Server Security 注册中心

## http://127.0.0.1:8761/eureka/apps

```
<applications>
    <versions__delta>1</versions__delta>
    <apps__hashcode>UP_1_</apps__hashcode>
    <application>
        <name>EUREKA-CLIENT</name>
        <instance>
            <instanceId>host.docker.internal:eureka-client:182</instanceId>
            <hostName>192.168.5.3</hostName>
            <app>EUREKA-CLIENT</app>
            <ipAddr>192.168.5.3</ipAddr>
            <status>UP</status>
            <overriddenstatus>UNKNOWN</overriddenstatus>
            <port enabled="true">182</port>
            <securePort enabled="false">443</securePort>
            <countryId>1</countryId>
            <dataCenterInfo class="com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo">
                <name>MyOwn</name>
            </dataCenterInfo>
            <leaseInfo>
                <renewalIntervalInSecs>30</renewalIntervalInSecs>
                <durationInSecs>90</durationInSecs>
                <registrationTimestamp>1629731058660</registrationTimestamp>
                <lastRenewalTimestamp>1629731328801</lastRenewalTimestamp>
                <evictionTimestamp>0</evictionTimestamp>
                <serviceUpTimestamp>1629731058660</serviceUpTimestamp>
            </leaseInfo>
            <metadata>
                <management.port>182</management.port>
            </metadata>
            <homePageUrl>http://192.168.5.3:182/</homePageUrl>
            <statusPageUrl>http://192.168.5.3:182/actuator/info</statusPageUrl>
            <healthCheckUrl>http://192.168.5.3:182/actuator/health</healthCheckUrl>
            <vipAddress>eureka-client</vipAddress>
            <secureVipAddress>eureka-client</secureVipAddress>
            <isCoordinatingDiscoveryServer>false</isCoordinatingDiscoveryServer>
            <lastUpdatedTimestamp>1629731058661</lastUpdatedTimestamp>
            <lastDirtyTimestamp>1629731058617</lastDirtyTimestamp>
            <actionType>ADDED</actionType>
        </instance>
    </application>
</applications>
```
