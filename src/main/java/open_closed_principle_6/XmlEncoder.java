package open_closed_principle_6;

class XmlEncoder implements Encoder {

    @Override
    public String prepareData(String data) {
        return fixAttributes(data);
    }

    @Override
    public String encode(String data) {
        // Do some work

        return "";
    }

    private String fixAttributes(String data) {
        // Do some work

        return data;
    }

}
