package open_closed_principle_1;

@SuppressWarnings("Duplicates")
class GenericEncoder {

    public String encodeToFormat(String data, String format) {
        final String preparedData = prepareData(data, format);

        if (format.equals("json")) {
            final JsonEncoder jsonEncoder = new JsonEncoder();
            return jsonEncoder.encode(preparedData);
        }

        if (format.equals("xml")) {
            final XmlEncoder xmlEncoder = new XmlEncoder();
            return xmlEncoder.encode(preparedData);
        }

        throw new IllegalArgumentException("Unknown format");
    }

    private String prepareData(String data, String format) {
        switch (format) {
            case "json":
                data = fixKeys(data);
                data = fixValues(data);
                break;
            case "xml":
                data = fixAttributes(data);
                break;
            default:
                throw new IllegalArgumentException("Unknown format");
        }

        return data;
    }

    private String fixKeys(String data) {
        // Do some work

        return data;
    }

    private String fixValues(String data) {
        // Do some work

        return data;
    }

    private String fixAttributes(String data) {
        // Do some work

        return data;
    }
}