package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qyt {
    public final qua a;
    public final rdd b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final qys h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public qyt(qua quaVar, rdd rddVar, int i, boolean z, boolean z2, int i2, int i3, qys qysVar, int i4, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = quaVar;
        this.b = rddVar;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = i2;
        this.g = i3;
        this.h = qysVar;
        this.i = i4;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qyt) {
            qyt qytVar = (qyt) obj;
            if (this.a.equals(qytVar.a) && this.b.equals(qytVar.b) && this.c == qytVar.c && this.d == qytVar.d && this.e == qytVar.e && this.f == qytVar.f && this.g == qytVar.g && this.h.equals(qytVar.h) && this.i == qytVar.i && this.j == qytVar.j && this.k == qytVar.k && this.l == qytVar.l && this.m == qytVar.m && this.n == qytVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = true != this.d ? 1237 : 1231;
        return (((((((((((((((((((((((((((((((iHashCode * 1000003) ^ this.c) * 1000003) ^ i) * (-721379959)) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.n ? 1237 : 1231);
    }

    public final String toString() {
        qys qysVar = this.h;
        rdd rddVar = this.b;
        return "Configuration{experimentalFlags=" + String.valueOf(this.a) + ", frameDroppingConfig=" + String.valueOf(rddVar) + ", globalForwardBufferSize=" + this.c + ", enableBackBuffering=" + this.d + ", fixedBackBufferingSize=0, enableLookahead=" + this.e + ", maxFramesBufferedPerRenderer=" + this.f + ", outputResolutionDownscalingFactor=" + this.g + ", exoPlayerConfiguration=" + String.valueOf(qysVar) + ", maxSkiaLayerLruCacheSize=" + this.i + ", remoteSourcesCachingSuggested=" + this.j + ", sharedCacheForRemoteSourcesSuggested=" + this.k + ", propagateOpenGlErrorsSuggested=false, skiaLayersSuggested=" + this.l + ", enablePrimarySegmentDrivenClock=false, waitOnCpuBeforeReusingPoolTextureFrameSuggested=false, zeroSizedSkiaCacheLimitSuggested=" + this.m + ", videoRendererRestartWhenDecoderTimedOutSuggested=false, optimizeForCompositionChanges=" + this.n + '}';
    }

    public qyt() {
        throw null;
    }
}
