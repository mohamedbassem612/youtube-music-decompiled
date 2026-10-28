package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aika {
    DOUBLE(aikb.d, 1),
    FLOAT(aikb.c, 5),
    INT64(aikb.b, 0),
    UINT64(aikb.b, 0),
    INT32(aikb.a, 0),
    FIXED64(aikb.b, 1),
    FIXED32(aikb.a, 5),
    BOOL(aikb.e, 0),
    STRING(aikb.f, 2),
    GROUP(aikb.i, 3),
    MESSAGE(aikb.i, 2),
    BYTES(aikb.g, 2),
    UINT32(aikb.a, 0),
    ENUM(aikb.h, 0),
    SFIXED32(aikb.a, 5),
    SFIXED64(aikb.b, 1),
    SINT32(aikb.a, 0),
    SINT64(aikb.b, 0);

    public final aikb s;
    public final int t;

    aika(aikb aikbVar, int i) {
        this.s = aikbVar;
        this.t = i;
    }
}
