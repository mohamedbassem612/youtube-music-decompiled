package defpackage;

import android.graphics.Color;
import android.graphics.PointF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ema implements emw {
    private final /* synthetic */ int $cid;
    public static final ema f = new ema(5);
    public static final ema e = new ema(4);
    public static final ema d = new ema(3);
    public static final ema c = new ema(2);
    public static final ema b = new ema(1);
    public static final ema a = new ema(0);

    private ema(int i) {
        this.$cid = i;
    }

    @Override // defpackage.emw
    public final /* synthetic */ Object a(emz emzVar, float f2) {
        boolean z;
        int i = this.$cid;
        if (i == 0) {
            return Float.valueOf(emg.a(emzVar) * f2);
        }
        if (i == 1) {
            z = emzVar.p() == 1;
            if (z) {
                emzVar.g();
            }
            double dA = emzVar.a();
            double dA2 = emzVar.a();
            double dA3 = emzVar.a();
            double dA4 = emzVar.p() == 7 ? emzVar.a() : 1.0d;
            if (z) {
                emzVar.i();
            }
            if (dA <= 1.0d && dA2 <= 1.0d && dA3 <= 1.0d) {
                dA *= 255.0d;
                dA2 *= 255.0d;
                dA3 *= 255.0d;
                if (dA4 <= 1.0d) {
                    dA4 *= 255.0d;
                }
            }
            return Integer.valueOf(Color.argb((int) dA4, (int) dA, (int) dA2, (int) dA3));
        }
        if (i == 2) {
            return Integer.valueOf(Math.round(emg.a(emzVar) * f2));
        }
        if (i == 3) {
            return emg.c(emzVar, f2);
        }
        if (i != 4) {
            z = emzVar.p() == 1;
            if (z) {
                emzVar.g();
            }
            float fA = (float) emzVar.a();
            float fA2 = (float) emzVar.a();
            while (emzVar.n()) {
                emzVar.m();
            }
            if (z) {
                emzVar.i();
            }
            return new enq((fA / 100.0f) * f2, (fA2 / 100.0f) * f2);
        }
        int iP = emzVar.p();
        if (iP == 1) {
            return emg.c(emzVar, f2);
        }
        if (iP == 3) {
            return emg.c(emzVar, f2);
        }
        if (iP != 7) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(a.aH(iP)));
        }
        PointF pointF = new PointF(((float) emzVar.a()) * f2, ((float) emzVar.a()) * f2);
        while (emzVar.n()) {
            emzVar.m();
        }
        return pointF;
    }
}
