package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ltt extends lxt implements ltu {
    public static final int CREATION_TIMESTAMP_MS_FIELD_NUMBER = 4;
    public static final ltt DEFAULT_INSTANCE;
    public static final int INTERNAL_FIELDS_FIELD_NUMBER = 9;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    private static volatile lyu PARSER = null;
    public static final int PROPERTIES_FIELD_NUMBER = 5;
    public static final int SCHEMA_FIELD_NUMBER = 3;
    public static final int SCORE_FIELD_NUMBER = 7;
    public static final int TTL_MS_FIELD_NUMBER = 8;
    public static final int URI_FIELD_NUMBER = 2;
    public int bitField0_;
    public long creationTimestampMs_;
    private lts internalFields_;
    public int score_;
    public long ttlMs_;
    public String namespace_ = "";
    public String uri_ = "";
    public String schema_ = "";
    public lye properties_ = lyx.a;

    static {
        ltt lttVar = new ltt();
        DEFAULT_INSTANCE = lttVar;
        lxt.E(ltt.class, lttVar);
    }

    private ltt() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b\u0007င\u0004\bဂ\u0005\tဉ\u0006", new Object[]{"bitField0_", "namespace_", "uri_", "schema_", "creationTimestampMs_", "properties_", luz.class, "score_", "ttlMs_", "internalFields_"});
        }
        if (i2 == 3) {
            return new ltt();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    @Override // defpackage.ltu
    public final int b() {
        return this.properties_.size();
    }

    @Override // defpackage.ltu
    public final luz c(int i) {
        return (luz) this.properties_.get(i);
    }

    public final void d() {
        lye lyeVar = this.properties_;
        if (lyeVar.c()) {
            return;
        }
        this.properties_ = lxt.A(lyeVar);
    }
}
