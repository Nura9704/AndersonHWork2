public enum EventCode {
    CONCERT_101(101),
    CONCERT_202(202);

    private final int code;

    EventCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
