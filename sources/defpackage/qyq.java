package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qyq {
    public qua a;
    public rdd b;
    public int c;
    public boolean d;
    public boolean e;
    public qys f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public short k = -1;
    private int l;
    private int m;
    private int n;
    private boolean o;

    public qyq(qyt qytVar) {
        this.a = qytVar.a;
        this.b = qytVar.b;
        this.c = qytVar.c;
        this.d = qytVar.d;
        this.e = qytVar.e;
        this.l = qytVar.f;
        this.m = qytVar.g;
        this.f = qytVar.h;
        this.n = qytVar.i;
        this.g = qytVar.j;
        this.h = qytVar.k;
        this.o = qytVar.l;
        this.i = qytVar.m;
        this.j = qytVar.n;
    }

    public final qyt a() {
        qua quaVar;
        rdd rddVar;
        qys qysVar;
        if (this.k == -1 && (quaVar = this.a) != null && (rddVar = this.b) != null && (qysVar = this.f) != null) {
            return new qyt(quaVar, rddVar, this.c, this.d, this.e, this.l, this.m, qysVar, this.n, this.g, this.h, this.o, this.i, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" experimentalFlags");
        }
        if (this.b == null) {
            sb.append(" frameDroppingConfig");
        }
        if ((this.k & 1) == 0) {
            sb.append(" globalForwardBufferSize");
        }
        if ((this.k & 2) == 0) {
            sb.append(" enableBackBuffering");
        }
        if ((this.k & 4) == 0) {
            sb.append(" fixedBackBufferingSize");
        }
        if ((this.k & 8) == 0) {
            sb.append(" enableLookahead");
        }
        if ((this.k & 16) == 0) {
            sb.append(" maxFramesBufferedPerRenderer");
        }
        if ((this.k & 32) == 0) {
            sb.append(" outputResolutionDownscalingFactor");
        }
        if (this.f == null) {
            sb.append(" exoPlayerConfiguration");
        }
        if ((this.k & 64) == 0) {
            sb.append(" maxSkiaLayerLruCacheSize");
        }
        if ((this.k & 128) == 0) {
            sb.append(" remoteSourcesCachingSuggested");
        }
        if ((this.k & 256) == 0) {
            sb.append(" sharedCacheForRemoteSourcesSuggested");
        }
        if ((this.k & 512) == 0) {
            sb.append(" propagateOpenGlErrorsSuggested");
        }
        if ((this.k & 1024) == 0) {
            sb.append(" skiaLayersSuggested");
        }
        if ((this.k & 2048) == 0) {
            sb.append(" enablePrimarySegmentDrivenClock");
        }
        if ((this.k & 4096) == 0) {
            sb.append(" waitOnCpuBeforeReusingPoolTextureFrameSuggested");
        }
        if ((this.k & 8192) == 0) {
            sb.append(" zeroSizedSkiaCacheLimitSuggested");
        }
        if ((this.k & 16384) == 0) {
            sb.append(" videoRendererRestartWhenDecoderTimedOutSuggested");
        }
        if ((this.k & Short.MIN_VALUE) == 0) {
            sb.append(" optimizeForCompositionChanges");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.l = i;
        this.k = (short) (this.k | 16);
    }

    public final void c(int i) {
        this.n = i;
        this.k = (short) (this.k | 64);
    }

    public final void d(int i) {
        this.m = i;
        this.k = (short) (this.k | 32);
    }

    public final void e(boolean z) {
        this.o = z;
        this.k = (short) (this.k | 1024);
    }
}
