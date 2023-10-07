package eJSonSchemaValidation;

import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;

public class usingNewtorkNt {

    public void usingnetworkAndJackson(){

        //Mention the version
        JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V4);
    }
}
