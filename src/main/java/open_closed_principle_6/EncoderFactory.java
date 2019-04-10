package open_closed_principle_6;

interface EncoderFactory {

    void addEncoder(String format, Encoder encoder);

    Encoder getEncoder(String format);

}
