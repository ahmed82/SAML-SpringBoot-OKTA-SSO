# SAML-SpringBoot-OKTA-SSO

## SAML-SpringBoot-OKTA-SSO
### Spring boot application using for security SAML protocol for Single Sign on "SSO" using OKTA as an IDP

```xml
https://developer.okta.com/blog/2017/03/16/spring-boot-saml
```

### keystore Generate 
From a terminal window, navigate to the src/main/resources directory of your app and create a saml directory.
 Navigate into the directory and run the following command.
  Use “secret” when prompted for a keystore password.
    

#### Milestone

You can find the latest milestone in the [Spring Milestone repository](https://repo.spring.io/libs-milestone/org/springframework/security/extensions/spring-security-saml-dsl/) Below is an example using M3.

```xml
<dependencies>
	<dependency>
		<groupId>org.springframework.security.extensions</groupId>
		<artifactId>spring-security-saml-dsl</artifactId>
		<version>1.0.0.M3</version>
	</dependency>
</dependencies>
<repositories>
	<repository>
		<id>spring-snapshots</id>
		<name>Spring Snapshots</name>
		<url>https://repo.spring.io/libs-milestone</url>
	</repository>
</repositories>
```

#### Snapshot

```xml
<dependencies>
	<dependency>
		<groupId>org.springframework.security.extensions</groupId>
		<artifactId>spring-security-saml-dsl</artifactId>
		<version>1.0.0.BUILD-SNAPSHOT</version>
	</dependency>
</dependencies>
<repositories>
	<repository>
		<id>spring-snapshots</id>
		<name>Spring Snapshots</name>
		<url>https://repo.spring.io/libs-snapshot</url>
		<snapshots>
			<enabled>true</enabled>
		</snapshots>
	</repository>
</repositories>
```

#### Ref:
```xml
https://developer.okta.com/blog/2017/03/16/spring-boot-saml
```