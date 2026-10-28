package defpackage;

import java.util.EnumSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ogl extends oft {
    public long k;
    public int o;
    public int r;
    private final boolean x;
    public double i = -1.0d;
    public double j = -1.0d;
    public final oge l = new oge();
    public final oge m = new oge();
    public final elr v = new elr((byte[]) null);
    public final oge n = new oge();
    public final oge p = new oge();
    public int q = 1;
    public final tld w = new tld((byte[]) null);
    public final oga s = new oga();
    public final oga t = new oga();
    public final oga u = new oga();

    public ogl(boolean z) {
        this.x = z;
    }

    private static final boolean i(double d) {
        return d > 0.0d;
    }

    @Override // defpackage.oft
    protected final int a() {
        return this.x ? 1000 : 2000;
    }

    public final long d() {
        return this.l.b(1);
    }

    public final void e(long j, double d, double d2, double d3, boolean z, boolean z2, boolean z3, double d4) {
        double d5;
        ofs ofsVar;
        double dMin = d4;
        if (j > 0) {
            this.g.i(d, j);
            this.h.i(dMin, j);
            this.e += j;
            if (d == 0.0d) {
                this.f += j;
            }
        }
        this.b = Math.max(d, this.b);
        double d6 = this.a;
        this.a = d6 == -1.0d ? d : Math.min(d, d6);
        this.d = Math.max(dMin, this.d);
        double d7 = this.c;
        if (d7 != -1.0d) {
            dMin = Math.min(dMin, d7);
        }
        this.c = dMin;
        if (z3) {
            this.g.j();
        }
        if (j > 0) {
            int i = (int) j;
            long j2 = i;
            this.l.d(j2);
            boolean z4 = i(d2) && i(d3);
            if (z4) {
                this.m.d(j2);
            }
            d5 = 0.0d;
            if (z) {
                this.k += j2;
                this.o += i;
            }
            elr elrVar = this.v;
            if (z4) {
                elrVar.i(d, j2);
            } else {
                elrVar.j();
            }
            if (d >= ofs.HALF.f) {
                this.n.d(j2);
                oge ogeVar = this.p;
                if (!z4) {
                    j2 = 0;
                }
                ogeVar.d(j2);
            }
        } else {
            d5 = 0.0d;
        }
        this.j = Math.max(d2, this.j);
        double d8 = this.i;
        this.i = d8 == -1.0d ? d2 : Math.min(d2, d8);
        tld tldVar = this.w;
        ((EnumSet) tldVar.b).clear();
        tldVar.I(ofp.AUDIBLE_MEASURABLE);
        tldVar.I(ofp.BACKGROUNDED_MEASURABLE);
        tldVar.I(ofp.COVERAGE_MEASURABLE);
        boolean zI = i(d2);
        ofs ofsVar2 = ofs.HALF;
        double d9 = ofsVar2.f;
        if (d >= d9) {
            tldVar.I(ofp.VISIBLE_50_PERCENT);
        }
        if (b()) {
            tldVar.I(ofp.VIEWABLE);
            if (this.x) {
                tldVar.I(ofp.YT_SHORTS_ONE_SECOND_VIEWABLE);
            }
        }
        if (zI) {
            tldVar.I(ofp.AUDIBLE);
        } else {
            tldVar.I(ofp.MUTED);
        }
        if (d >= d9 && zI) {
            tldVar.I(ofp.AUDIBLE_AND_VISIBLE_50_PERCENT);
        }
        if (b() && zI) {
            tldVar.I(ofp.AUDIBLE_AND_VIEWABLE);
        }
        if (z) {
            tldVar.I(ofp.FULLSCREEN);
        }
        if (d > d5) {
            tldVar.I(ofp.PARTIALLY_VIEWABLE);
        }
        if (g()) {
            tldVar.I(ofp.GROUPM_DURATION_REACHED);
        }
        Long[] lArrC = c(true);
        ofs ofsVar3 = ofs.FULL;
        if (lArrC[ofsVar3.ordinal()].longValue() >= 2000) {
            tldVar.I(ofp.PMX_VIEWABLE);
        }
        if (z2) {
            tldVar.I(ofp.BACKGROUNDED);
            if (zI) {
                tldVar.I(ofp.UNMUTED_AND_BACKGROUNDED);
            }
        }
        int i2 = (int) j;
        if (d >= ofsVar3.f) {
            ofsVar = ofsVar3;
        } else {
            ofsVar = ofs.THREE_QUARTER;
            if (d < ofsVar.f) {
                if (d >= d9) {
                    ofsVar = ofsVar2;
                } else {
                    ofsVar = ofs.QUARTER;
                    if (d < ofsVar.f) {
                        ofsVar = ofs.NONE;
                        if (d <= ofsVar.f) {
                            ofsVar = null;
                        }
                    }
                }
            }
        }
        oga ogaVar = this.s;
        if (ofsVar == null) {
            ogaVar.a(i2, false);
            this.t.a(i2, false);
        } else {
            ogaVar.a(i2, ofsVar.ordinal() <= ofsVar2.ordinal());
            this.t.a(i2, ofsVar.ordinal() <= ofsVar3.ordinal());
        }
        this.u.a(i2, i(d2));
    }

    public final boolean f() {
        return i(this.i);
    }

    public final boolean g() {
        return h(d());
    }

    public final boolean h(long j) {
        if (j >= 15000) {
            return true;
        }
        int i = this.r;
        return i > 0 && j >= ((long) (i >> 1));
    }
}
