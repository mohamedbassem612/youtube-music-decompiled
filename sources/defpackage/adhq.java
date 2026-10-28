package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adhq {
    public esf a;
    public boolean b;
    public boolean c;
    public adht d;
    public adhw e;
    public euc f;
    public byte g = -1;
    public int h;
    public int i;
    public int j;
    private boolean k;
    private int l;
    private boolean m;

    public adhq(adhr adhrVar) {
        this.k = adhrVar.c;
        this.h = adhrVar.l;
        this.i = adhrVar.m;
        this.a = adhrVar.d;
        this.l = adhrVar.e;
        this.b = adhrVar.f;
        this.c = adhrVar.g;
        this.j = adhrVar.n;
        this.d = adhrVar.h;
        this.e = adhrVar.i;
        this.f = adhrVar.j;
        this.m = adhrVar.k;
    }

    public final adhr a() {
        if (this.g == -1 && this.h != 0 && this.i != 0 && this.a != null && this.j != 0) {
            return new adhr(this.k, this.h, this.i, this.a, this.l, this.b, this.c, this.j, this.d, this.e, this.f, this.m);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" shouldUpdateOnLayoutChange");
        }
        if (this.h == 0) {
            sb.append(" animation");
        }
        if (this.i == 0) {
            sb.append(" preloadOptions");
        }
        if (this.a == null) {
            sb.append(" priority");
        }
        if ((this.g & 2) == 0) {
            sb.append(" placeholderResId");
        }
        if ((this.g & 4) == 0) {
            sb.append(" cleanUpDrawableWhenLoading");
        }
        if ((this.g & 8) == 0) {
            sb.append(" waitLayoutRequest");
        }
        if (this.j == 0) {
            sb.append(" retrieveFromCacheOption");
        }
        if ((this.g & 16) == 0) {
            sb.append(" notEligibleForThumbnailMonitor");
        }
        if ((this.g & 32) == 0) {
            sb.append(" checkRejectionBeforeViewlessIndex");
        }
        if ((this.g & 64) == 0) {
            sb.append(" disallowHardwareBitmap");
        }
        if ((this.g & 128) == 0) {
            sb.append(" glidePreloadFront");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.m = z;
        this.g = (byte) (this.g | 64);
    }

    public final void c(int i) {
        this.l = i;
        this.g = (byte) (this.g | 2);
    }

    public final void d(boolean z) {
        this.k = z;
        this.g = (byte) (this.g | 1);
    }
}
