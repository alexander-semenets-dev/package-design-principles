package open_closed_principle_6;

class JsonEncoder implements Encoder {

    @Override
    public String prepareData(String data) {
        data = fixKeys(data);
        return fixValues(data);
    }

    @Override
    public String encode(String data) {
        // Do some work

        return "";
    }

    private String fixKeys(String data) {
        // Do some work

        return data;
    }

    private String fixValues(String data) {
        // Do some work

        return data;
    }

}
