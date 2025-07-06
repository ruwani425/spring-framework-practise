package org.example;

import org.example.config.WebAppConfig;
import org.example.config.WebRootConfig;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//API development walata use karanne meka
//spring use karala web server ekak hadana widiya
public class WebAppinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //context.register() kiyala kalin karapu eka wgema ekak tmai methana wenne
    //WebRootConfig kiyana class eka null wenna be.eka aniwaryen configuration class ekk wenna ona
    @Override
    protected Class<?> @Nullable [] getRootConfigClasses() {
        //business logics(parent context)
        return new Class<?>[]{WebRootConfig.class};
    }

    //web mvc eka context eka kotas 2 kata kadagannawa
    //ekak servletWebApplicationContext eka,anika rootWebApplication context eka
    //web servlet tika ,http request response handle karana classes tika manage karanne servletWebApplicationContext eken
    @Override
    protected Class<?> @Nullable [] getServletConfigClasses() {
        //request mapping,controllers,view controllers(child context)
        return new Class<?>[]{WebAppConfig.class};
    }

    // meka tmai default mapping eka
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
