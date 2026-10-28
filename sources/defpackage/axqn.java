package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum axqn {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(axpo.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class k;

    static {
        axpo axpoVar = axpo.d;
    }

    axqn(Class cls) {
        this.k = cls;
    }
}
