package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class soi {
    public static final soi a = b().a();
    public final agev b;
    public final agev c;
    public final aigj d;
    public final agke e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;

    public soi(agev agevVar, agev agevVar2, aigj aigjVar, agke agkeVar, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.b = agevVar;
        this.c = agevVar2;
        this.d = aigjVar;
        this.e = agkeVar;
        this.l = i;
        this.f = j;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public static soh b() {
        soh sohVar = new soh();
        agdf agdfVar = agdf.a;
        sohVar.f(agdfVar);
        sohVar.e(agdfVar);
        sohVar.h(aigj.d);
        sohVar.k(agpi.a);
        sohVar.l(1);
        sohVar.c(0L);
        sohVar.b(false);
        sohVar.d(false);
        sohVar.g(false);
        sohVar.j(false);
        sohVar.i(false);
        sohVar.m();
        return sohVar;
    }

    public final soh a() {
        soh sohVarB = b();
        sohVarB.f(this.b);
        sohVarB.e(this.c);
        sohVarB.h(this.d);
        sohVarB.k(this.e);
        sohVarB.l(this.l);
        sohVarB.c(this.f);
        sohVarB.b(this.g);
        sohVarB.d(this.h);
        sohVarB.g(this.i);
        sohVarB.j(this.j);
        sohVarB.i(this.k);
        sohVarB.m();
        return sohVarB;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof soi) {
            soi soiVar = (soi) obj;
            if (this.b.equals(soiVar.b) && this.c.equals(soiVar.c) && this.d.equals(soiVar.d) && aguu.v(this.e, soiVar.e)) {
                int i = this.l;
                int i2 = soiVar.l;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.f == soiVar.f && this.g == soiVar.g && this.h == soiVar.h && this.i == soiVar.i && this.j == soiVar.j && this.k == soiVar.k) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        int i = this.l;
        a.by(i);
        int i2 = true != this.k ? 1237 : 1231;
        int i3 = true != this.j ? 1237 : 1231;
        int i4 = true != this.i ? 1237 : 1231;
        int i5 = true != this.h ? 1237 : 1231;
        int i6 = true != this.g ? 1237 : 1231;
        long j = this.f;
        return (((((((((((((((iHashCode * 1000003) ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ i6) * 1000003) ^ i5) * 1000003) ^ i4) * 1000003) ^ i3) * 1000003) ^ i2) * 1000003) ^ 1237;
    }

    public final String toString() {
        int i = this.l;
        return "AdCtaOverlayState{renderer=" + String.valueOf(this.b) + ", onClickedRenderer=" + String.valueOf(this.c) + ", trackingParams=" + String.valueOf(this.d) + ", visualStateChangeTriggers=" + String.valueOf(this.e) + ", visualState=" + (i != 0 ? Integer.toString(i - 1) : "null") + ", currentPositionMillis=" + this.f + ", animate=" + this.g + ", fullscreen=" + this.h + ", shownLogged=" + this.i + ", visualChanged=" + this.j + ", visaPortraitCtaVisible=" + this.k + ", dismissed=false}";
    }

    public soi() {
        throw null;
    }
}
