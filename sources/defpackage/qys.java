package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qys {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    private final boolean k;
    private final boolean l;

    public qys(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.k = z9;
        this.i = z10;
        this.l = z11;
        this.j = z12;
    }

    public static qyr a(qua quaVar) {
        qyr qyrVar = new qyr();
        qyrVar.a = quaVar.b;
        short s = qyrVar.k;
        qyrVar.b = quaVar.c;
        qyrVar.c = quaVar.d;
        qyrVar.d = quaVar.f;
        qyrVar.e = quaVar.g;
        qyrVar.f = quaVar.q;
        qyrVar.g = quaVar.y;
        qyrVar.i = quaVar.G;
        qyrVar.h = quaVar.B;
        qyrVar.k = (short) (s | 511);
        qyrVar.b(quaVar.D);
        qyrVar.j = quaVar.T;
        qyrVar.k = (short) (qyrVar.k | 1024);
        qyrVar.c();
        qyrVar.k = (short) (qyrVar.k | 4096);
        return qyrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qys) {
            qys qysVar = (qys) obj;
            if (this.a == qysVar.a && this.b == qysVar.b && this.c == qysVar.c && this.d == qysVar.d && this.e == qysVar.e && this.f == qysVar.f && this.g == qysVar.g && this.h == qysVar.h && this.k == qysVar.k && this.i == qysVar.i && this.l == qysVar.l && this.j == qysVar.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((((((((((((((((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "ExoPlayerConfiguration{enableBestEffortDecoding=" + this.a + ", enableOverrideTimestampForFirstFrameAfterSeek=" + this.b + ", enableReadingPositionBasedClock=" + this.c + ", disableFrameDroppingInMediaCodec=" + this.d + ", enableKeyOperatingRateInMediaCodecForSpeedAdjustedVideos=" + this.e + ", clampStartTimeToSourceDuration=" + this.f + ", cleanUpUnreleasedDecodersOnClose=" + this.g + ", enableFrameDroppingBeforeDecodingSurface=" + this.h + ", treatSurfaceSemaphoreTimeoutsAsUnrecoverable=" + this.k + ", enableExoPlayerDecodingEosHandlingFix=" + this.i + ", forceSoftwareDecoderOnDecoderRetry=" + this.l + ", optimizeForCompositionChanges=" + this.j + ", enableFailFastOnNetworkError=false}";
    }

    public qys() {
        throw null;
    }
}
