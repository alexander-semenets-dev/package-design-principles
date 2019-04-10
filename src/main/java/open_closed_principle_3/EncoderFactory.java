package open_closed_principle_3;

@SuppressWarnings("Duplicates")
class EncoderFactory {

    public Encoder getEncoder(String format) {
        if (format.equals("json")) {
            return new JsonEncoder();
        }

        if (format.equals("xml")) {
            return new XmlEncoder();
        }

        if (format.equals("yaml")) {
            return new YamlEncoder();
        }

        throw new IllegalArgumentException("Unknown format");
    }

}
