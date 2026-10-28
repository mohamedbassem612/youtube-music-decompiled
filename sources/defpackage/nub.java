package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nub {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public nub(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = i;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = false;
        this.m = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nub) {
            nub nubVar = (nub) obj;
            if (this.a == nubVar.a && this.b == nubVar.b && this.c == nubVar.c && this.d == nubVar.d && this.e == nubVar.e && this.f == nubVar.f && this.g == nubVar.g && this.h == nubVar.h && this.i == nubVar.i && this.j == nubVar.j && this.k == nubVar.k) {
                boolean z = nubVar.l;
                if (this.m == nubVar.m) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((((((((((((((((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.m ? 1237 : 1231);
    }

    public final String toString() {
        return "ElementsDrawableOptions{enableDetailedBorderImageProcessorException=" + this.a + ", enableHwBitmapCopyFallback=" + this.b + ", enableDrawableUpdateBitmapHandling=" + this.c + ", useGlideDefaultDownsampleStrategy=" + this.d + ", mapContentModeAspectFitToScaleTypeFitCenter=" + this.e + ", enableDefaultScaleTypeSetting=" + this.f + ", defaultScaleType=" + this.g + ", enableBorderImageProcessorImageTintForVectorDrawable=" + this.h + ", enableBorderImageProcessorDrawableRewrite=" + this.i + ", enableEmptySourceForDefaultAndErrorImage=" + this.j + ", enableSkipMemoryCacheForVideoLockupThumbnails=" + this.k + ", enableGlideRequestManagerCaching=false, enableGlideScaleAspectFillCenterOutsideFix=" + this.m + '}';
    }

    public nub() {
        throw null;
    }
}
