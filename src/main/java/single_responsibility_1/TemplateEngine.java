package single_responsibility_1;

import java.util.Map;

public interface TemplateEngine {

    String render(String templateName, Map<String, Object> parameters);

}
