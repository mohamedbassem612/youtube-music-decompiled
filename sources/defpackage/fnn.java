package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fnn extends fnp implements fnm {
    private final fnr e;
    private long f = Long.MIN_VALUE;

    public fnn(fns fnsVar) {
        fnr fnrVar = new fnr();
        this.e = fnrVar;
        if (fnsVar != null) {
            fnrVar.a = fnsVar;
        }
    }

    @Override // defpackage.fnp
    public final float a(long j) {
        double d;
        boolean z;
        fnn fnnVar = this;
        long j2 = j;
        if (fnnVar.f == Long.MIN_VALUE) {
            fnnVar.f = j2;
            float f = fnnVar.f("initial").c;
            float f2 = fnnVar.f("end").c;
            fnr fnrVar = fnnVar.e;
            fnq fnqVar = fnrVar.b;
            fnqVar.a = f;
            Iterator it = fnrVar.h.iterator();
            while (it.hasNext()) {
                ((fnt) it.next()).d();
            }
            double d2 = fnqVar.a;
            fnrVar.e = d2;
            fnrVar.d.a = d2;
            fnqVar.b = 0.0d;
            fnrVar.b(f2);
            return f;
        }
        float f3 = fnnVar.f("end").c;
        fnr fnrVar2 = fnnVar.e;
        fnrVar2.b(f3);
        if (fnnVar.b()) {
            return f3;
        }
        long j3 = j2 - fnnVar.f;
        boolean zA = fnrVar2.a();
        double d3 = j3;
        if (!zA || !fnrVar2.f) {
            double d4 = d3 / 1.0E9d;
            if (d4 > 0.064d) {
                d4 = 0.064d;
            }
            fnrVar2.g += d4;
            fns fnsVar = fnrVar2.a;
            double d5 = fnsVar.c;
            double d6 = fnsVar.b;
            fnq fnqVar2 = fnrVar2.b;
            fnq fnqVar3 = fnrVar2.d;
            double d7 = fnqVar2.a;
            double d8 = fnqVar2.b;
            double d9 = fnqVar3.a;
            double d10 = fnqVar3.b;
            while (true) {
                d = fnrVar2.g;
                if (d < 0.001d) {
                    break;
                }
                double d11 = d - 0.001d;
                fnrVar2.g = d11;
                if (d11 < 0.001d) {
                    fnq fnqVar4 = fnrVar2.c;
                    fnqVar4.a = d7;
                    fnqVar4.b = d8;
                }
                double d12 = fnrVar2.e;
                double d13 = ((d12 - d9) * 230.2d) - (d8 * 22.0d);
                double d14 = d8 + (d13 * 0.001d * 0.5d);
                double d15 = ((d12 - (d7 + ((d8 * 0.001d) * 0.5d))) * 230.2d) - (d14 * 22.0d);
                double d16 = d8 + (d15 * 0.001d * 0.5d);
                double d17 = d7 + (d16 * 0.001d);
                double d18 = ((d12 - (d7 + ((d14 * 0.001d) * 0.5d))) * 230.2d) - (d16 * 22.0d);
                double d19 = d8 + (d18 * 0.001d);
                double d20 = d14 + d16;
                d7 += (d8 + d20 + d20 + d19) * 0.16666666666666666d * 0.001d;
                double d21 = d15 + d18;
                d8 += (d13 + d21 + d21 + (((d12 - d17) * 230.2d) - (22.0d * d19))) * 0.16666666666666666d * 0.001d;
                d9 = d17;
                d10 = d19;
            }
            fnqVar3.a = d9;
            fnqVar3.b = d10;
            fnqVar2.a = d7;
            fnqVar2.b = d8;
            if (d > 0.0d) {
                double d22 = d / 0.001d;
                fnq fnqVar5 = fnrVar2.c;
                double d23 = 1.0d - d22;
                fnqVar2.a = (d7 * d22) + (fnqVar5.a * d23);
                fnqVar2.b = (d8 * d22) + (fnqVar5.b * d23);
            }
            boolean z2 = true;
            if (fnrVar2.a()) {
                fnqVar2.a = fnrVar2.e;
                if (fnqVar2.b != 0.0d) {
                    fnqVar2.b = 0.0d;
                }
                zA = true;
            }
            if (fnrVar2.f) {
                fnrVar2.f = false;
                z = true;
            } else {
                z = false;
            }
            if (zA) {
                fnrVar2.f = true;
            } else {
                z2 = false;
            }
            for (fnt fntVar : fnrVar2.h) {
                if (z) {
                    fntVar.a();
                }
                fntVar.d();
                if (z2) {
                    fntVar.b();
                }
            }
            fnnVar = this;
            j2 = j;
        }
        fnnVar.f = j2;
        return (float) fnrVar2.b.a;
    }

    @Override // defpackage.fnm
    public final boolean b() {
        return this.e.a();
    }
}
