package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvy {
    public final int a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;

    public nvy(int i, float f, float f2, boolean z, boolean z2) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = z2;
    }

    public static nvx a() {
        nvx nvxVar = new nvx();
        nvxVar.e(4);
        nvxVar.d(0.45f);
        nvxVar.b(0.5f);
        nvxVar.a = (byte) (nvxVar.a | 8);
        nvxVar.f(false);
        nvxVar.c(false);
        nvxVar.a = (byte) (nvxVar.a | 64);
        return nvxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nvy) {
            nvy nvyVar = (nvy) obj;
            if (this.a == nvyVar.a) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(nvyVar.b)) {
                    if (Float.floatToIntBits(this.c) == Float.floatToIntBits(nvyVar.c) && this.d == nvyVar.d && this.e == nvyVar.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ 1237) * 1525764945) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "RecyclerConfig{initRangeSize=" + this.a + ", collectionRangeRatio=" + this.b + ", binderRangeRatio=" + this.c + ", recyclerViewItemPrefetch=false, layoutHandlerFactory=null, changeSetExecutor=null, layoutInfo=null, useLegacyVisible=" + this.d + ", cleanupOnDetach=" + this.e + ", enableStableIds=false}";
    }

    public nvy() {
        throw null;
    }
}
