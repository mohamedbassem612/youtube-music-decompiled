package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahwo {
    public static final ahws a = new ahws(1.0d, 1.0d, 1.0d);

    static {
        new ahws(0.0d, 0.0d, 0.0d);
        afxw.w("^#[0-9a-fA-F]{6}$");
        afxw.w("^rgb\\(([0-9]{1,3}),\\s*([0-9]{1,3}),\\s*([0-9]{1,3})\\)$");
    }

    public static ahwp a(ahws ahwsVar) {
        double d;
        double d2;
        double dC = ahwsVar.c();
        double dB = ahwsVar.b();
        double dA = ahwsVar.a();
        double dMax = Math.max(Math.max(dC, dB), dA);
        double dMin = dMax - Math.min(Math.min(dC, dB), dA);
        double d3 = 0.0d;
        if (Math.abs(dMin) < 1.0E-10d) {
            d2 = 0.0d;
        } else {
            double d4 = dMin / dMax;
            if (Math.abs(dC - dMax) < 1.0E-10d) {
                d = ((dB - dA) * 60.0d) / dMin;
            } else {
                d = Math.abs(dB - dMax) < 1.0E-10d ? (((dA - dC) / dMin) * 60.0d) + 120.0d : 240.0d + (((dC - dB) / dMin) * 60.0d);
            }
            if (d < 0.0d) {
                d += 360.0d;
            }
            double d5 = d;
            if (d5 > 360.0d) {
                d5 -= 360.0d;
            }
            d2 = d5;
            d3 = d4;
        }
        return new ahwp(d2, d3, dMax);
    }

    public static ahws b(ahwp ahwpVar) {
        double d;
        double d2;
        double d3 = ahwpVar.b;
        double d4 = ahwpVar.c;
        if (d3 < 1.0E-10d) {
            d2 = d4;
            d = d2;
        } else {
            double d5 = ahwpVar.a / 60.0d;
            int iFloor = (int) Math.floor(d5);
            double d6 = (1.0d - d3) * d4;
            double d7 = d5 - ((double) iFloor);
            double d8 = (1.0d - (d3 * d7)) * d4;
            double d9 = (1.0d - (d3 * (1.0d - d7))) * d4;
            if (iFloor == 1) {
                d = d6;
                d2 = d8;
            } else if (iFloor == 2) {
                d = d9;
                d2 = d6;
            } else if (iFloor == 3) {
                d = d4;
                d2 = d6;
                d4 = d8;
            } else if (iFloor != 4) {
                d2 = d4;
                if (iFloor != 5) {
                    d4 = d9;
                    d = d6;
                } else {
                    d4 = d6;
                    d = d8;
                }
            } else {
                d = d4;
                d2 = d9;
                d4 = d6;
            }
        }
        return new ahws(d2, d4, d);
    }

    public static double c(double d) {
        return Math.max(0.0d, Math.min(1.0d, d));
    }
}
