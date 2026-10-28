package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adcd {
    public final int a;
    public final float b;
    public final adcb c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    private final boolean i;
    private final boolean j;

    public adcd(int i, float f, adcb adcbVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = i;
        this.b = f;
        this.c = adcbVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.i = z4;
        this.g = z5;
        this.h = z6;
        this.j = z7;
    }

    public static adcc a(adcb adcbVar) {
        agke agkeVar;
        adcc adccVar = new adcc();
        agke agkeVar2 = adce.m;
        int i = ((agpi) agkeVar2).d;
        for (int i2 = 0; i2 < i; i2++) {
            ((abxv) agkeVar2.get(i2)).N(adccVar);
        }
        if (adcbVar != null && (agkeVar = (agke) adce.n.get(adcbVar)) != null) {
            int size = agkeVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((abxv) agkeVar.get(i3)).N(adccVar);
            }
        }
        return adccVar;
    }

    public final boolean equals(Object obj) {
        adcb adcbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof adcd) {
            adcd adcdVar = (adcd) obj;
            if (this.a == adcdVar.a) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(adcdVar.b) && ((adcbVar = this.c) != null ? adcbVar.equals(adcdVar.c) : adcdVar.c == null) && this.d == adcdVar.d && this.e == adcdVar.e && this.f == adcdVar.f && this.i == adcdVar.i && this.g == adcdVar.g && this.h == adcdVar.h && this.j == adcdVar.j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
        adcb adcbVar = this.c;
        return (((((((((((((((iFloatToIntBits * 1000003) ^ (adcbVar == null ? 0 : adcbVar.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true == this.j ? 1231 : 1237);
    }

    public final String toString() {
        return "SurfaceConfig{lithoInitRange=" + this.a + ", lithoRangeRatio=" + this.b + ", surfaceName=" + String.valueOf(this.c) + ", useIncrementalMountForRb=" + this.d + ", useLegacyVisible=" + this.e + ", horizontalCollectionTouchInterceptor=" + this.f + ", useSwipeToCameraLocalElementsConfig=" + this.i + ", useSizeSpecYouTubeElement=" + this.g + ", rebindAfterDetach=" + this.h + ", useFlatbufferRuntime=" + this.j + '}';
    }

    public adcd() {
        throw null;
    }
}
