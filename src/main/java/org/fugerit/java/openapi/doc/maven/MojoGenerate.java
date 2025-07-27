package org.fugerit.java.openapi.doc.maven;

import java.util.Properties;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;


import lombok.Setter;
import org.fugerit.java.openapi.doc.OpenAPIDocMain;

@Mojo( name = "generate")
public class MojoGenerate extends AbstractMojo {
	
    @Parameter(property = "configPath", required = true )
    @Setter private String configPath;
    
    @Parameter(property = "idCatalog", required = true )
    @Setter private String idCatalog;
    
    public void execute() throws MojoExecutionException {
        try {
        	Properties props = new Properties();
        	props.setProperty( OpenAPIDocMain.ARG_MODE , OpenAPIDocMain.ARG_MODE_CONFIG );
        	props.setProperty( OpenAPIDocMain.ARG_CONFIG_PATH , this.configPath );
        	props.setProperty( OpenAPIDocMain.ARG_ID_CATALOG , this.idCatalog );
        	this.getLog().info( "props : "+props );
            OpenAPIDocMain.worker( props );
        } catch (Exception e) {
        	throw new MojoExecutionException( "Error generating code : "+e, e );
        }
    }

}