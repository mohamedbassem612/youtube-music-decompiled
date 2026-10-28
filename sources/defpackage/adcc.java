package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adcc {
    public int a;
    public float b;
    public adcb c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public short j;
    private boolean k;

    public final adcd a() {
        if (this.j == 511) {
            return new adcd(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.k);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" lithoInitRange");
        }
        if ((this.j & 2) == 0) {
            sb.append(" lithoRangeRatio");
        }
        if ((this.j & 4) == 0) {
            sb.append(" useIncrementalMountForRb");
        }
        if ((this.j & 8) == 0) {
            sb.append(" useLegacyVisible");
        }
        if ((this.j & 16) == 0) {
            sb.append(" horizontalCollectionTouchInterceptor");
        }
        if ((this.j & 32) == 0) {
            sb.append(" useSwipeToCameraLocalElementsConfig");
        }
        if ((this.j & 64) == 0) {
            sb.append(" useSizeSpecYouTubeElement");
        }
        if ((this.j & 128) == 0) {
            sb.append(" rebindAfterDetach");
        }
        if ((this.j & 256) == 0) {
            sb.append(" useFlatbufferRuntime");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.k = z;
        this.j = (short) (this.j | 256);
    }
}
