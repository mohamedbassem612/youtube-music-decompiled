package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xvt {
    public final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    public xvt(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = 1;
        this.a = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xvt) {
            xvt xvtVar = (xvt) obj;
            if (this.b == xvtVar.b && this.c == xvtVar.c && this.d == xvtVar.d && this.e == xvtVar.e && this.f == xvtVar.f && this.g == xvtVar.g) {
                int i = this.h;
                int i2 = xvtVar.h;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && this.a == xvtVar.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        a.bj(this.h);
        return ((((((((((((((((((((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ 1) * (-721379959)) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * (-429739981)) ^ this.a;
    }

    public final String toString() {
        String str = this.h != 1 ? "null" : "BROWSE";
        int i = this.g;
        int i2 = this.f;
        int i3 = this.e;
        int i4 = this.d;
        int i5 = this.c;
        return "MdxUserContext{mdxConnectionCountDay=" + this.b + ", mdxConnectionCountWeek=" + i5 + ", mdxConnectionCountMonth=" + i4 + ", castAvailableSessionCountDay=" + i3 + ", castAvailableSessionCountWeek=" + i2 + ", castAvailableSessionCountMonth=" + i + ", pageType=" + str + ", currentVideoDuration=0, fullScreen=false, hd=false, sd=false, playlistPlayback=false, videoControlsVisible=false, uncastedVideoCount=0, videoId=null, playlistId=null, currentTime=0, casterCategory=" + this.a + '}';
    }

    public xvt() {
        throw null;
    }
}
