package io.getmedusa.medusa.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.SpringWebFluxTemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

@Configuration
public class MedusaTagsConfiguration {

    @Bean
    public SpringWebFluxTemplateEngine  templateEngine(){
        SpringWebFluxTemplateEngine  templateEngine = new SpringWebFluxTemplateEngine();
        templateEngine.setEnableSpringELCompiler(true);
        templateEngine.setTemplateResolver(templateResolver());
        templateEngine.addDialect(medusaDialect());
        return templateEngine;
    }

    private static ITemplateResolver templateResolver() {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setPrefix("templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setCacheable(true);
        return templateResolver;
    }

    private static MedusaDialect medusaDialect(){
        return new MedusaDialect();
    }
}
