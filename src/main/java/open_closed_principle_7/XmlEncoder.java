package open_closed_principle_7;

class XmlEncoder implements Encoder {

    @Override
    public String encode(String data) {
        // Do some work

        return "";
    }

    private String prepareData(String data) {
        return fixAttributes(data);
    }

    private String fixAttributes(String data) {
        // Do some work

        return data;
    }

}
