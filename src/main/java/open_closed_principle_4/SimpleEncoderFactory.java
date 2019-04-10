package open_closed_principle_4;

@SuppressWarnings("Duplicates")
class SimpleEncoderFactory implements EncoderFactory {

    @Override
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
