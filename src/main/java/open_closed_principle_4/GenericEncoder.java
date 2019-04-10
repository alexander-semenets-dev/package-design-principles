package open_closed_principle_4;

@SuppressWarnings("Duplicates")
class GenericEncoder {

    private final EncoderFactory encoderFactory;

    GenericEncoder(EncoderFactory encoderFactory) {
        this.encoderFactory = encoderFactory;
    }

    public String encodeToFormat(String data, String format) {
        final Encoder encoder = encoderFactory.getEncoder(format);
        final String preparedData = prepareData(data, format);

        return encoder.encode(preparedData);
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