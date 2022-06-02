package io.getmedusa.medusa.tags;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractElementTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

public class MedusaTag extends AbstractElementTagProcessor {

    public MedusaTag() {
        super(TemplateMode.HTML, "m", "medusa", true, null, false, 10);
    }

    @Override
    protected void doProcess(ITemplateContext iTemplateContext,
                             IProcessableElementTag iProcessableElementTag,
                             IElementTagStructureHandler iElementTagStructureHandler) {
        iElementTagStructureHandler.replaceWith(  "\uD83E\uDD91" ,false);
    }
}
