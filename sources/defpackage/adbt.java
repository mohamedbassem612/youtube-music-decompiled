package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adbt extends adce {
    public final agkj a;
    public final boolean b;
    public final float c;
    public final String d;
    public final boolean e;
    public final float f;
    public final boolean g;
    public final float h;
    public final boolean i;
    public final boolean j;
    private final int o;
    private final int p;
    private final boolean q;
    private final int r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final boolean y;

    public adbt(agkj agkjVar, boolean z, float f, String str, int i, int i2, boolean z2, int i3, boolean z3, boolean z4, boolean z5, float f2, boolean z6, boolean z7, boolean z8, float f3, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = agkjVar;
        this.b = z;
        this.c = f;
        this.d = str;
        this.o = i;
        this.p = i2;
        this.q = z2;
        this.r = i3;
        this.s = z3;
        this.t = z4;
        this.e = z5;
        this.f = f2;
        this.g = z6;
        this.u = z7;
        this.v = z8;
        this.h = f3;
        this.i = z9;
        this.w = z10;
        this.x = z11;
        this.y = z12;
        this.j = z13;
    }

    @Override // defpackage.adce
    public final float a() {
        return this.f;
    }

    @Override // defpackage.adce
    public final float b() {
        return this.c;
    }

    @Override // defpackage.adce
    public final float c() {
        return this.h;
    }

    @Override // defpackage.adce
    public final int d() {
        return this.p;
    }

    @Override // defpackage.adce
    public final int e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adce) {
            adce adceVar = (adce) obj;
            if (aguu.q(this.a, adceVar.g()) && this.b == adceVar.m() && Float.floatToIntBits(this.c) == Float.floatToIntBits(adceVar.b()) && this.d.equals(adceVar.h()) && this.o == adceVar.e() && this.p == adceVar.d() && this.q == adceVar.j() && this.r == adceVar.f() && this.s == adceVar.i() && this.t == adceVar.q() && this.e == adceVar.r() && Float.floatToIntBits(this.f) == Float.floatToIntBits(adceVar.a()) && this.g == adceVar.t() && this.u == adceVar.s() && this.v == adceVar.l() && Float.floatToIntBits(this.h) == Float.floatToIntBits(adceVar.c()) && this.i == adceVar.o() && this.w == adceVar.n() && this.x == adceVar.p() && this.y == adceVar.u() && this.j == adceVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adce
    public final int f() {
        return this.r;
    }

    @Override // defpackage.adce
    public final agkj g() {
        return this.a;
    }

    @Override // defpackage.adce
    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.o) * 1000003) ^ this.p) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ this.r) * 1000003) ^ (true != this.s ? 1237 : 1231)) * 1000003) ^ (true != this.t ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.u ? 1237 : 1231)) * 1000003) ^ (true != this.v ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.h)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.w ? 1237 : 1231)) * 1000003) ^ (true != this.x ? 1237 : 1231)) * 1000003) ^ (true != this.y ? 1237 : 1231)) * 1000003) ^ (true == this.j ? 1231 : 1237);
    }

    @Override // defpackage.adce
    public final boolean i() {
        return this.s;
    }

    @Override // defpackage.adce
    public final boolean j() {
        return this.q;
    }

    @Override // defpackage.adce
    public final boolean k() {
        return this.j;
    }

    @Override // defpackage.adce
    public final boolean l() {
        return this.v;
    }

    @Override // defpackage.adce
    public final boolean m() {
        return this.b;
    }

    @Override // defpackage.adce
    public final boolean n() {
        return this.w;
    }

    @Override // defpackage.adce
    public final boolean o() {
        return this.i;
    }

    @Override // defpackage.adce
    public final boolean p() {
        return this.x;
    }

    @Override // defpackage.adce
    public final boolean q() {
        return this.t;
    }

    @Override // defpackage.adce
    public final boolean r() {
        return this.e;
    }

    @Override // defpackage.adce
    public final boolean s() {
        return this.u;
    }

    @Override // defpackage.adce
    public final boolean t() {
        return this.g;
    }

    public final String toString() {
        return "ElementsLaunchConfig{surfaceConfigMap=" + String.valueOf(this.a) + ", enableElementsPerformanceMetric=" + this.b + ", elementsPerformanceMetricSampleRate=" + this.c + ", elementsPerformanceMetricSubSampleRate=" + this.d + ", elementsPerformanceMetricPipeline=" + this.o + ", ekoProcessorMaxLruCacheSize=" + this.p + ", defaultProperties=" + this.q + ", thumbnailResolutionType=" + this.r + ", androidUseClipBounds=" + this.s + ", reportMissingImageSources=" + this.t + ", sectionsConfigurationUseBackgroundChangeSets=" + this.e + ", collectionRangeRatio=" + this.f + ", useExecutorLithoHandler=" + this.g + ", useCompositeDisposableForCommands=" + this.u + ", enableElementsPbToFbMetric=" + this.v + ", imagePrefetchRangeRatio=" + this.h + ", enableHorizontalSwipeProtectorForShorts=" + this.i + ", enableHorizontalFadedScrim=" + this.w + ", enableVerticalFadedScrim=" + this.x + ", useNoScheduledPerfFlush=" + this.y + ", elementPresenterRetainsLithoState=" + this.j + '}';
    }

    @Override // defpackage.adce
    public final boolean u() {
        return this.y;
    }
}
