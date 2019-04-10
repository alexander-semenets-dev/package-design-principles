package open_closed_principle_6;

class GenericEncoder {

    private final EncoderFactory encoderFactory;

    GenericEncoder(EncoderFactory encoderFactory) {
        this.encoderFactory = encoderFactory;
    }

    public String encodeToFormat(String data, String format) {
        final Encoder encoder = encoderFactory.getEncoder(format);
        final String preparedData = encoder.prepareData(data);

        return encoder.encode(preparedData);
    }

}