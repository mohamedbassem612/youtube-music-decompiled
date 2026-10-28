package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvx {
    public byte a = 127;
    private int b;
    private float c;
    private float d;
    private boolean e;
    private boolean f;

    public nvx(nvy nvyVar) {
        this.b = nvyVar.a;
        this.c = nvyVar.b;
        this.d = nvyVar.c;
        this.e = nvyVar.d;
        this.f = nvyVar.e;
    }

    public final nvy a() {
        if (this.a == 127) {
            return new nvy(this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.a & 1) == 0) {
            sb.append(" initRangeSize");
        }
        if ((this.a & 2) == 0) {
            sb.append(" collectionRangeRatio");
        }
        if ((this.a & 4) == 0) {
            sb.append(" binderRangeRatio");
        }
        if ((this.a & 8) == 0) {
            sb.append(" recyclerViewItemPrefetch");
        }
        if ((this.a & 16) == 0) {
            sb.append(" useLegacyVisible");
        }
        if ((this.a & 32) == 0) {
            sb.append(" cleanupOnDetach");
        }
        if ((this.a & 64) == 0) {
            sb.append(" enableStableIds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(float f) {
        this.d = f;
        this.a = (byte) (this.a | 4);
    }

    public final void c(boolean z) {
        this.f = z;
        this.a = (byte) (this.a | 32);
    }

    public final void d(float f) {
        this.c = f;
        this.a = (byte) (this.a | 2);
    }

    public final void e(int i) {
        this.b = i;
        this.a = (byte) (this.a | 1);
    }

    public final void f(boolean z) {
        this.e = z;
        this.a = (byte) (this.a | 16);
    }
}
