package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oha extends ogu {
    final /* synthetic */ ohb a;

    public oha(ohb ohbVar) {
        this.a = ohbVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0143  */
    /* JADX WARN: Code duplicated, block: B:41:0x0149  */
    /* JADX WARN: Code duplicated, block: B:42:0x0157  */
    @Override // defpackage.ogu
    public final void a(long j) {
        double d;
        double d2;
        boolean z;
        double d3;
        ohb ohbVar = this.a;
        ohbVar.f = false;
        long j2 = ohbVar.d;
        long j3 = j / 1000000;
        if (j2 == -1) {
            j2 = j3;
        }
        ohbVar.d = j3;
        if (ohbVar.c != 0) {
            double d4 = (j3 - j2) / 1000.0d;
            if (d4 > 0.064d) {
                d4 = 0.064d;
            }
            for (ogy ogyVar : ohbVar.a) {
                aha ahaVar = ohbVar.b;
                Boolean bool = (Boolean) ahaVar.get(ogyVar);
                if (bool != null && bool.booleanValue()) {
                    boolean zA = ogyVar.a();
                    if (zA && ogyVar.k) {
                        d = d4;
                    } else {
                        ogyVar.m += d4;
                        double d5 = ogyVar.f;
                        double d6 = ogyVar.g;
                        double d7 = ogyVar.h;
                        double d8 = ogyVar.d;
                        d = d4;
                        double d9 = ogyVar.e;
                        while (true) {
                            d2 = ogyVar.m;
                            if (d2 < 0.001d) {
                                break;
                            }
                            ogyVar.m = d2 - 0.001d;
                            double d10 = ogyVar.a;
                            double d11 = ogyVar.j;
                            double d12 = ogyVar.b;
                            double d13 = ((d11 - d5) * 100.0d) - (d6 * 18.0d);
                            double d14 = d6 + (d13 * 0.001d * 0.5d);
                            double d15 = ((d11 - (d5 + ((d6 * 0.001d) * 0.5d))) * 100.0d) - (d14 * 18.0d);
                            double d16 = d6 + (d15 * 0.001d * 0.5d);
                            double d17 = d5 + (d16 * 0.001d);
                            double d18 = ((d11 - (d5 + ((d14 * 0.001d) * 0.5d))) * 100.0d) - (d16 * 18.0d);
                            double d19 = d6 + (d18 * 0.001d);
                            double d20 = d14 + d16;
                            double d21 = d5 + ((((d6 + (d20 + d20)) + d19) / 6.0d) * 0.001d);
                            double d22 = d15 + d18;
                            double d23 = ((((d13 + (d22 + d22)) + (((d11 - d17) * 100.0d) - (d19 * 18.0d))) / 6.0d) * 0.001d) + d6;
                            if (ogyVar.l) {
                                d3 = d21;
                                if (ogy.d(d3, ogyVar.i, d11)) {
                                    ogyVar.m = 0.0d;
                                }
                            } else {
                                d3 = d21;
                            }
                            d8 = d5;
                            d9 = d6;
                            d6 = d23;
                            d5 = d3;
                            d7 = d17;
                        }
                        ogyVar.h = d7;
                        ogyVar.f = d5;
                        ogyVar.g = d6;
                        ogyVar.d = d8;
                        ogyVar.e = d9;
                        if (d2 > 0.0d) {
                            double d24 = d2 / 0.001d;
                            double d25 = 1.0d - d24;
                            d5 = (d5 * d24) + (d8 * d25);
                            ogyVar.f = d5;
                            ogyVar.g = (d6 * d24) + (d9 * d25);
                        }
                        if (ogyVar.l) {
                            double d26 = ogyVar.a;
                            if (ogy.d(d5, ogyVar.i, ogyVar.j)) {
                                double d27 = ogyVar.a;
                                double d28 = ogyVar.j;
                                ogyVar.i = d28;
                                ogyVar.f = d28;
                                ogyVar.g = 0.0d;
                                ogyVar.m = 0.0d;
                                z = true;
                            } else if (ogyVar.a()) {
                                double d29 = ogyVar.a;
                                double d210 = ogyVar.j;
                                ogyVar.i = d210;
                                ogyVar.f = d210;
                                ogyVar.g = 0.0d;
                                ogyVar.m = 0.0d;
                                z = true;
                            } else {
                                z = zA;
                            }
                        } else if (ogyVar.a()) {
                            double d211 = ogyVar.a;
                            double d212 = ogyVar.j;
                            ogyVar.i = d212;
                            ogyVar.f = d212;
                            ogyVar.g = 0.0d;
                            ogyVar.m = 0.0d;
                            z = true;
                        } else {
                            z = zA;
                        }
                        boolean z2 = ogyVar.k;
                        ogyVar.k = z;
                        Iterator it = ogyVar.c.iterator();
                        while (it.hasNext()) {
                            ((nsa) it.next()).b(ogyVar.f);
                        }
                        if (z) {
                        }
                        d4 = d;
                    }
                    ahaVar.put(ogyVar, Boolean.FALSE);
                    ohbVar.c--;
                    d4 = d;
                }
            }
            ohbVar.a();
        }
    }
}
