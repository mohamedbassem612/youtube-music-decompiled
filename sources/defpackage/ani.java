package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ani implements apf {
    public ani(byte[] bArr) {
        int i = ali.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(anj anjVar, int i, int i2) {
        if (anjVar instanceof any) {
            ((any) anjVar).k();
        }
        long j = anjVar.e;
        long j2 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        anjVar.q((((long) (((int) (j2 >> 32)) + ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) + ((int) (j & 4294967295L)))) & 4294967295L));
    }

    public ani() {
    }
}
