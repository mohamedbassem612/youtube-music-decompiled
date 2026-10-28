package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum axrt {
    DOUBLE(axru.d, 1),
    FLOAT(axru.c, 5),
    INT64(axru.b, 0),
    UINT64(axru.b, 0),
    INT32(axru.a, 0),
    FIXED64(axru.b, 1),
    FIXED32(axru.a, 5),
    BOOL(axru.e, 0),
    STRING(axru.f, 2),
    GROUP(axru.i, 3),
    MESSAGE(axru.i, 2),
    BYTES(axru.g, 2),
    UINT32(axru.a, 0),
    ENUM(axru.h, 0),
    SFIXED32(axru.a, 5),
    SFIXED64(axru.b, 1),
    SINT32(axru.a, 0),
    SINT64(axru.b, 0);

    public final axru s;
    public final int t;

    axrt(axru axruVar, int i) {
        this.s = axruVar;
        this.t = i;
    }
}
