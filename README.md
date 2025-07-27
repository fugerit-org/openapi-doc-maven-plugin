# openapi-doc-maven-plugin

Simple maven plugin for [openapi-doc-tool](https://github.com/fugerit-org/openapi-doc-tool) project.

[![Keep a Changelog v1.1.0 badge](https://img.shields.io/badge/changelog-Keep%20a%20Changelog%20v1.1.0-%23E05735)](CHANGELOG.md) 
[![Maven Central](https://img.shields.io/maven-central/v/org.fugerit.java/openapi-doc-maven-plugin.svg)](https://central.sonatype.com/artifact/org.fugerit.java/openapi-doc-maven-plugin)
[![license](https://img.shields.io/badge/License-Apache%20License%202.0-teal.svg)](https://opensource.org/licenses/Apache-2.0)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=fugerit-org_openapi-doc-maven-plugin&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=fugerit-org_openapi-doc-maven-plugin)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=fugerit-org_openapi-doc-maven-plugin&metric=coverage)](https://sonarcloud.io/summary/new_code?id=fugerit-org_openapi-doc-maven-plugin)

Accepted config params are :  
* configPath
* idCatalog

Here a sample configuration  :

```
			<plugin>
				<groupId>org.fugerit.java</groupId>
				<artifactId>openapi-doc-maven-plugin</artifactId>
				<version>${openapi-doc-version}</version>	
				<configuration>
					<configPath>src/config/openapi-doc-config.xml</configPath>
					<idCatalog>openapi</idCatalog>		
				</configuration>							
				<executions>
					<execution>
						<id>openapi</id>
						<goals>
							<goal>generate</goal>
						</goals>
					</execution>		
				</executions>
			</plugin>	
```