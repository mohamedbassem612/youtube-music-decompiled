package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum lyi {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(lxa.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class k;

    static {
        lxa lxaVar = lxa.d;
    }

    lyi(Class cls) {
        this.k = cls;
    }
}
