package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jru extends lxt implements lyq {
    public static final int ACCOUNT_ID_FIELD_NUMBER = 5;
    public static final int ACCOUNT_NAME_FIELD_NUMBER = 4;
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 3;
    public static final jru DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    private static volatile lyu PARSER;
    public int bitField0_;
    private String namespace_ = "";
    private String id_ = "";
    public String accountType_ = "";
    public String accountName_ = "";
    public String accountId_ = "";

    static {
        jru jruVar = new jru();
        DEFAULT_INSTANCE = jruVar;
        lxt.E(jru.class, jruVar);
    }

    private jru() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "namespace_", "id_", "accountType_", "accountName_", "accountId_"});
        }
        if (i2 == 3) {
            return new jru();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }
}
