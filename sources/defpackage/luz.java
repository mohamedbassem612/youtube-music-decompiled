package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class luz extends lxt implements lyq {
    public static final int BLOB_HANDLE_VALUES_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUES_FIELD_NUMBER = 5;
    public static final int BYTES_VALUES_FIELD_NUMBER = 6;
    public static final luz DEFAULT_INSTANCE;
    public static final int DOCUMENT_VALUES_FIELD_NUMBER = 7;
    public static final int DOUBLE_VALUES_FIELD_NUMBER = 4;
    public static final int INT64_VALUES_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile lyu PARSER = null;
    public static final int STRING_VALUES_FIELD_NUMBER = 2;
    public static final int VECTOR_VALUES_FIELD_NUMBER = 8;
    public int bitField0_;
    public lye blobHandleValues_;
    public lxv booleanValues_;
    public lye bytesValues_;
    public lye documentValues_;
    public lxw doubleValues_;
    public lyd int64Values_;
    public String name_ = "";
    public lye stringValues_;
    public lye vectorValues_;

    static {
        luz luzVar = new luz();
        DEFAULT_INSTANCE = luzVar;
        lxt.E(luz.class, luzVar);
    }

    private luz() {
        lyx lyxVar = lyx.a;
        this.stringValues_ = lyxVar;
        this.int64Values_ = lyl.a;
        this.doubleValues_ = lxi.a;
        this.booleanValues_ = lws.a;
        this.bytesValues_ = lyxVar;
        this.documentValues_ = lyxVar;
        this.vectorValues_ = lyxVar;
        this.blobHandleValues_ = lyxVar;
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\b\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u0014\u0004\u0012\u0005\u0019\u0006\u001c\u0007\u001b\b\u001b\t\u001b", new Object[]{"bitField0_", "name_", "stringValues_", "int64Values_", "doubleValues_", "booleanValues_", "bytesValues_", "documentValues_", ltt.class, "vectorValues_", luy.class, "blobHandleValues_", lux.class});
        }
        if (i2 == 3) {
            return new luz();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final int b() {
        return this.blobHandleValues_.size();
    }

    public final int c() {
        return this.booleanValues_.size();
    }

    public final int d() {
        return this.bytesValues_.size();
    }

    public final int e() {
        return this.documentValues_.size();
    }

    public final int f() {
        return this.doubleValues_.size();
    }

    public final int g() {
        return this.int64Values_.size();
    }

    public final int h() {
        return this.stringValues_.size();
    }

    public final int i() {
        return this.vectorValues_.size();
    }

    public final ltt j(int i) {
        return (ltt) this.documentValues_.get(i);
    }

    public final void k() {
        lye lyeVar = this.documentValues_;
        if (lyeVar.c()) {
            return;
        }
        this.documentValues_ = lxt.A(lyeVar);
    }
}
