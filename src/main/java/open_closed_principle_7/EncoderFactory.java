package open_closed_principle_7;

interface EncoderFactory {

    void addEncoder(String format, Encoder encoder);

    Encoder getEncoder(String format);

}
