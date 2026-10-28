package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class alp implements alv {
    private final /* synthetic */ int $cid;

    public /* synthetic */ alp(int i) {
        this.$cid = i;
    }

    @Override // defpackage.alv
    public final double a(double d) {
        int i = this.$cid;
        if (i == 0) {
            float[] fArr = alq.a;
            return Math.copySign(ace.b(d < 0.0d ? -d : d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d);
        }
        if (i == 1) {
            float[] fArr2 = alq.a;
            return Math.copySign(ace.a(d < 0.0d ? -d : d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d);
        }
        if (i == 2) {
            return alq.b(alq.c, d);
        }
        if (i == 3) {
            return alq.a(alq.c, d);
        }
        if (i != 4) {
            return i == 5 ? alq.c(alq.d, d) : d;
        }
        return alq.d(alq.d, d);
    }
}
