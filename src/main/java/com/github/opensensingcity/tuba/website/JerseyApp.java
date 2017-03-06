/*
 * Copyright ANR-14-CE24-0029 OpenSensingCity Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.opensensingcity.tuba.website;

import com.github.thesmartenergy.rdfp.BaseURI;
import com.github.thesmartenergy.rdfp.DevelopmentBaseURI;
import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author maxime.lefrancois
 */
@ApplicationPath("api")
public class JerseyApp extends ResourceConfig {

    private static final Logger LOG = Logger.getLogger(JerseyApp.class.getSimpleName());

    public JerseyApp() {
        packages("com.github.thesmartenergy.rdfp.jersey");
        packages("com.github.opensensingcity.tuba.website");
    }
    
    static final boolean DEV = true;

    @Produces
    @BaseURI
    static final String BASE = "http://opensensingcity.emse.fr/tuba/";

    @Produces
    @DevelopmentBaseURI
    static final String DEV_BASE = DEV ? "http://localhost:8080/tuba/" : BASE;

}
