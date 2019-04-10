package open_closed_principle_4;

class CustomEncoderFactory implements EncoderFactory {

    private final EncoderFactory encoderFactory;
    private final EncoderFactory fallbackEncoderFactory;

    CustomEncoderFactory(EncoderFactory encoderFactory, EncoderFactory fallbackEncoderFactory) {
        this.encoderFactory = encoderFactory;
        this.fallbackEncoderFactory = fallbackEncoderFactory;
    }

    @Override
    public Encoder getEncoder(String format) {
        try {
            return encoderFactory.getEncoder(format);
        } catch (Exception e) {
            return fallbackEncoderFactory.getEncoder(format);
        }
    }

}
