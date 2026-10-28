package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class soz {
    public final apzz a;
    public final spb b;
    public final sgn c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final slm h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final float l;
    public final int m;
    public final amud n;
    public final boolean o;
    public final boolean p;
    public final Duration q;
    public final boolean r;

    public soz(apzz apzzVar, spb spbVar, sgn sgnVar, int i, boolean z, int i2, int i3, slm slmVar, boolean z2, boolean z3, boolean z4, float f, int i4, amud amudVar, boolean z5, boolean z6, Duration duration, boolean z7) {
        this.a = apzzVar;
        this.b = spbVar;
        this.c = sgnVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = slmVar;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = f;
        this.m = i4;
        this.n = amudVar;
        this.o = z5;
        this.p = z6;
        this.q = duration;
        this.r = z7;
    }

    public static soy b() {
        soy soyVar = new soy();
        soyVar.o(apzz.a);
        soyVar.f(spb.a);
        soyVar.b(sgn.a);
        soyVar.p(3);
        soyVar.k(false);
        soyVar.u();
        soyVar.s(-1);
        soyVar.q(-1);
        soyVar.d(slm.PRE_ROLL);
        soyVar.i(false);
        soyVar.j(false);
        soyVar.t();
        soyVar.g(false);
        soyVar.n(0.0f);
        soyVar.m(0);
        soyVar.e(amud.b);
        soyVar.c(false);
        soyVar.l(false);
        soyVar.r(Duration.ZERO);
        soyVar.h(false);
        return soyVar;
    }

    public final soy a() {
        soy soyVarB = b();
        soyVarB.o(this.a);
        soyVarB.f(this.b);
        soyVarB.b(this.c);
        soyVarB.p(this.d);
        soyVarB.k(this.e);
        soyVarB.u();
        soyVarB.s(this.f);
        soyVarB.q(this.g);
        soyVarB.d(this.h);
        soyVarB.i(this.i);
        soyVarB.j(this.j);
        soyVarB.t();
        soyVarB.g(this.k);
        soyVarB.n(this.l);
        soyVarB.m(this.m);
        soyVarB.e(this.n);
        soyVarB.c(this.o);
        soyVarB.l(this.p);
        soyVarB.r(this.q);
        soyVarB.h(this.r);
        return soyVarB;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof soz) {
            soz sozVar = (soz) obj;
            if (this.a.equals(sozVar.a) && this.b.equals(sozVar.b) && this.c.equals(sozVar.c) && this.d == sozVar.d && this.e == sozVar.e && this.f == sozVar.f && this.g == sozVar.g && this.h.equals(sozVar.h) && this.i == sozVar.i && this.j == sozVar.j && this.k == sozVar.k) {
                if (Float.floatToIntBits(this.l) == Float.floatToIntBits(sozVar.l) && this.m == sozVar.m && this.n.equals(sozVar.n) && this.o == sozVar.o && this.p == sozVar.p && this.q.equals(sozVar.q) && this.r == sozVar.r) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231)) * (-721379959)) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.l)) * 1000003) ^ this.m) * 1000003) ^ this.n.hashCode()) * 1000003) ^ (true != this.o ? 1237 : 1231)) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ this.q.hashCode()) * 1000003) ^ (true != this.r ? 1237 : 1231);
    }

    public final String toString() {
        Duration duration = this.q;
        amud amudVar = this.n;
        slm slmVar = this.h;
        sgn sgnVar = this.c;
        spb spbVar = this.b;
        return "SkipButtonState{skipAdRenderer=" + String.valueOf(this.a) + ", contentMetadata=" + String.valueOf(spbVar) + ", adCountMetadata=" + String.valueOf(sgnVar) + ", skipState=" + this.d + ", hidden=" + this.e + ", swipeToSkipProgress=0.0, timeRemainingUntilSkippableMillis=" + this.f + ", timeRemainingInAdMillis=" + this.g + ", breakType=" + String.valueOf(slmVar) + ", DRCtaEnabled=" + this.i + ", fullscreen=" + this.j + ", countdownOnThumbnail=false, countdownNextToThumbnail=" + this.k + ", preskipScalingFactor=" + this.l + ", preskipPadding=" + this.m + ", clientVeLoggingDirectives=" + String.valueOf(amudVar) + ", autoskipCountdownEnabled=" + this.o + ", keepWatchingButtonEnabled=" + this.p + ", timeRemainingUntilAutoskip=" + String.valueOf(duration) + ", ctaRendersInPortraitNonFullscreen=" + this.r + '}';
    }

    public soz() {
        throw null;
    }
}
