package io.getmedusa.medusa.tags;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractAttributeTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

public class ItemAttribute extends AbstractAttributeTagProcessor {

    public ItemAttribute() {
        super(TemplateMode.HTML, "m",
                null, false,
                "item", true,
                100, false);
    }

    @Override
    protected void doProcess(ITemplateContext iTemplateContext,
                             IProcessableElementTag iProcessableElementTag,
                             AttributeName attributeName, String value,
                             IElementTagStructureHandler iElementTagStructureHandler) {
        iElementTagStructureHandler.setBody( iTemplateContext.getVariable(value).toString(), true);
    }
}
