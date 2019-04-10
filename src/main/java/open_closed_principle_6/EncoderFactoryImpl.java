package open_closed_principle_6;

import java.util.HashMap;
import java.util.Map;

class EncoderFactoryImpl implements EncoderFactory {

    private Map<String, Encoder> encoderByFormat = new HashMap<>();

    @Override
    public void addEncoder(String format, Encoder encoder) {
        encoderByFormat.put(format, encoder);
    }

    @Override
    public Encoder getEncoder(String format) {
        if (!encoderByFormat.containsKey(format)) {
            throw new IllegalArgumentException("Unknown format");
        }

        return encoderByFormat.get(format);
    }

}
