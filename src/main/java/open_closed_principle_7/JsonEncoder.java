package open_closed_principle_7;

class JsonEncoder implements Encoder {

    @Override
    public String encode(String data) {
        // Do some work

        return "";
    }

    private String prepareData(String data) {
        data = fixKeys(data);
        return fixValues(data);
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
