package io.getmedusa.medusa.configuration;

import io.getmedusa.medusa.tags.ItemAttribute;
import io.getmedusa.medusa.tags.MedusaTag;
import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;

import java.util.HashSet;
import java.util.Set;

public class MedusaDialect extends AbstractProcessorDialect {

    protected MedusaDialect() {
        super("Medusa", "m", 10);
    }

    @Override
    public Set<IProcessor> getProcessors(String s) {
        final Set<IProcessor> processors = new HashSet<>();
        processors.add(new MedusaTag());
        processors.add(new ItemAttribute());
        return processors;
    }
}
