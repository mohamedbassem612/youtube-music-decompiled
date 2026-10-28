package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum bkl {
    DOUBLE(bkm.d, 1),
    FLOAT(bkm.c, 5),
    INT64(bkm.b, 0),
    UINT64(bkm.b, 0),
    INT32(bkm.a, 0),
    FIXED64(bkm.b, 1),
    FIXED32(bkm.a, 5),
    BOOL(bkm.e, 0),
    STRING(bkm.f, 2),
    GROUP(bkm.i, 3),
    MESSAGE(bkm.i, 2),
    BYTES(bkm.g, 2),
    UINT32(bkm.a, 0),
    ENUM(bkm.h, 0),
    SFIXED32(bkm.a, 5),
    SFIXED64(bkm.b, 1),
    SINT32(bkm.a, 0),
    SINT64(bkm.b, 0);

    public final bkm s;
    public final int t;

    bkl(bkm bkmVar, int i) {
        this.s = bkmVar;
        this.t = i;
    }
}
