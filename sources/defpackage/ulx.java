package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ulx {
    public final boolean a;
    public final float b;
    public final boolean c;
    public final ulw d;
    public final Optional e;
    public final Optional f;
    public final akhk g;
    public final akhj h;
    public final int i;

    public ulx(boolean z, int i, float f, boolean z2, ulw ulwVar, Optional optional, Optional optional2, akhk akhkVar, akhj akhjVar) {
        this.a = z;
        this.i = i;
        this.b = f;
        this.c = z2;
        this.d = ulwVar;
        this.e = optional;
        this.f = optional2;
        this.g = akhkVar;
        this.h = akhjVar;
    }

    public static ulv a() {
        ulv ulvVar = new ulv();
        ulvVar.d(false);
        ulvVar.d = (byte) (((byte) (((byte) (((byte) (((byte) (ulvVar.d | 8)) | 32)) | 16)) | 64)) | (-128));
        ulvVar.a = ulw.a;
        akhk akhkVar = akhk.a;
        if (akhkVar == null) {
            throw new NullPointerException("Null gestureConfig");
        }
        ulvVar.b = akhkVar;
        akhj akhjVar = akhj.a;
        if (akhjVar == null) {
            throw new NullPointerException("Null borderStyle");
        }
        ulvVar.c = akhjVar;
        return ulvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ulx) {
            ulx ulxVar = (ulx) obj;
            if (this.a == ulxVar.a) {
                int i = this.i;
                int i2 = ulxVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    if (Float.floatToIntBits(this.b) == Float.floatToIntBits(ulxVar.b) && this.c == ulxVar.c && this.d.equals(ulxVar.d) && this.e.equals(ulxVar.e) && this.f.equals(ulxVar.f) && this.g.equals(ulxVar.g) && this.h.equals(ulxVar.h)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.i;
        a.bj(i);
        return (((((((((((((((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ i) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.i;
        if (i != 1) {
            str = i != 2 ? "null" : "FILL_CONTAINERS_SMALLER_DIMENSION";
        } else {
            str = "FIT";
        }
        boolean z = this.a;
        float f = this.b;
        boolean z2 = this.c;
        ulw ulwVar = this.d;
        Optional optional = this.e;
        Optional optional2 = this.f;
        akhk akhkVar = this.g;
        akhj akhjVar = this.h;
        return "ShortsPlayerViewConfig{isScrollingView=" + z + ", contentScale=" + str + ", containerAspectRatio=" + f + ", useSurfaceView=" + z2 + ", isTapToPlayPauseEnabled=false, swipeConfig=" + String.valueOf(ulwVar) + ", isHorizontalCropEnabled=false, isBackgroundProtectionEnabled=false, enableLoadingSpinner=false, loadingSpinnerLabel=" + String.valueOf(optional) + ", blurUtil=" + String.valueOf(optional2) + ", isCropGuidelineEnabled=false, gestureConfig=" + String.valueOf(akhkVar) + ", borderStyle=" + String.valueOf(akhjVar) + '}';
    }

    public ulx() {
        throw null;
    }
}
