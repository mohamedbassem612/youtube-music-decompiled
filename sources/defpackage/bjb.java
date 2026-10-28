package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum bjb {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(bhy.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class k;

    static {
        bhy bhyVar = bhy.d;
    }

    bjb(Class cls) {
        this.k = cls;
    }
}
