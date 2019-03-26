package single_responsibility_principle_2;

import java.util.Map;

public interface TemplateEngine {

    String render(String templateName, Map<String, Object> parameters);

}
