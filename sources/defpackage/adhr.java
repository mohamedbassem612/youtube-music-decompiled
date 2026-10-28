package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adhr {
    public static final adhr a = a().a();
    public static final adhr b;
    public final boolean c;
    public final esf d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final adht h;
    public final adhw i;
    public final euc j;
    public final boolean k;
    public final int l;
    public final int m;
    public final int n;

    static {
        adhq adhqVarA = a();
        adhqVarA.d(true);
        b = adhqVarA.a();
        adhq adhqVarA2 = a();
        adhqVarA2.j = 2;
        adhqVarA2.a();
        adhq adhqVarA3 = a();
        adhqVarA3.j = 3;
        adhqVarA3.a();
    }

    public adhr(boolean z, int i, int i2, esf esfVar, int i3, boolean z2, boolean z3, int i4, adht adhtVar, adhw adhwVar, euc eucVar, boolean z4) {
        this.c = z;
        this.l = i;
        this.m = i2;
        this.d = esfVar;
        this.e = i3;
        this.f = z2;
        this.g = z3;
        this.n = i4;
        this.h = adhtVar;
        this.i = adhwVar;
        this.j = eucVar;
        this.k = z4;
    }

    public static adhq a() {
        adhq adhqVar = new adhq();
        adhqVar.d(false);
        adhqVar.h = 2;
        adhqVar.c(0);
        adhqVar.b = true;
        int i = adhqVar.g | 4;
        adhqVar.c = true;
        adhqVar.g = (byte) (((byte) i) | 8);
        adhqVar.d = null;
        adhqVar.j = 1;
        adhqVar.b(false);
        adhqVar.i = 1;
        adhqVar.a = esf.d;
        adhqVar.f = null;
        adhqVar.g = (byte) (((byte) (adhqVar.g | 16)) | (-96));
        return adhqVar;
    }

    public final boolean equals(Object obj) {
        adht adhtVar;
        adhw adhwVar;
        euc eucVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof adhr) {
            adhr adhrVar = (adhr) obj;
            if (this.c == adhrVar.c) {
                int i = this.l;
                int i2 = adhrVar.l;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.m;
                    int i4 = adhrVar.m;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4 && this.d.equals(adhrVar.d) && this.e == adhrVar.e && this.f == adhrVar.f && this.g == adhrVar.g) {
                        int i5 = this.n;
                        int i6 = adhrVar.n;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i5 == i6 && ((adhtVar = this.h) != null ? adhtVar.equals(adhrVar.h) : adhrVar.h == null) && ((adhwVar = this.i) != null ? adhwVar.equals(adhrVar.i) : adhrVar.i == null) && ((eucVar = this.j) != null ? eucVar.equals(adhrVar.j) : adhrVar.j == null) && this.k == adhrVar.k) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.l;
        a.bj(i);
        int i2 = this.m;
        a.bj(i2);
        int iHashCode = (((((((true != this.c ? 1237 : 1231) ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ this.d.hashCode();
        int i3 = this.n;
        a.bj(i3);
        adht adhtVar = this.h;
        int iHashCode2 = ((((((((((((iHashCode * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ i3) * (-721379959)) ^ (adhtVar == null ? 0 : adhtVar.hashCode())) * (-721379959)) ^ (this.i == null ? 0 : 582896280)) * 1000003;
        euc eucVar = this.j;
        return (((((((((iHashCode2 ^ (eucVar != null ? eucVar.hashCode() : 0)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.k ? 1237 : 1231)) * (-721379959)) ^ 1237) * 1000003;
    }

    public final String toString() {
        String str;
        String str2;
        int i = this.l;
        String str3 = "null";
        if (i == 1) {
            str = "NONE";
        } else if (i != 2) {
            str = i != 3 ? "null" : "CROSS_FADE";
        } else {
            str = "FADE";
        }
        int i2 = this.m;
        if (i2 == 1) {
            str2 = "DEFAULT";
        } else if (i2 != 2) {
            str2 = i2 != 3 ? "null" : "SINGLE_IMAGE_AS_DRAWABLE_SPECIFY_SIZE";
        } else {
            str2 = "SINGLE_IMAGE_AS_BITMAP_NO_SIZE";
        }
        esf esfVar = this.d;
        int i3 = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        int i4 = this.n;
        String strValueOf = String.valueOf(esfVar);
        if (i4 == 1) {
            str3 = "DEFAULT";
        } else if (i4 == 2) {
            str3 = "CACHE_ONLY";
        } else if (i4 == 3) {
            str3 = "CACHE_PREFERRED";
        }
        boolean z3 = this.c;
        adht adhtVar = this.h;
        adhw adhwVar = this.i;
        euc eucVar = this.j;
        boolean z4 = this.k;
        return "ImageLoadOptions{shouldUpdateOnLayoutChange=" + z3 + ", animation=" + str + ", preloadOptions=" + str2 + ", priority=" + strValueOf + ", placeholderResId=" + i3 + ", cleanUpDrawableWhenLoading=" + z + ", waitLayoutRequest=" + z2 + ", retrieveFromCacheOption=" + str3 + ", preloadRendererFactory=null, loadListener=" + String.valueOf(adhtVar) + ", preloadListener=null, imageParams=" + String.valueOf(adhwVar) + ", bitmapTransformation=" + String.valueOf(eucVar) + ", notEligibleForThumbnailMonitor=false, checkRejectionBeforeViewlessIndex=false, disallowHardwareBitmap=" + z4 + ", interactionLogger=null, glidePreloadFront=false, glideThreadPriority=null}";
    }

    public adhr() {
        throw null;
    }
}
