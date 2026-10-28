package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qyr {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public short k;
    private boolean l;
    private boolean m;

    public final qys a() {
        if (this.k == 8191) {
            return new qys(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.l, this.j, this.m);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.k & 1) == 0) {
            sb.append(" enableBestEffortDecoding");
        }
        if ((this.k & 2) == 0) {
            sb.append(" enableOverrideTimestampForFirstFrameAfterSeek");
        }
        if ((this.k & 4) == 0) {
            sb.append(" enableReadingPositionBasedClock");
        }
        if ((this.k & 8) == 0) {
            sb.append(" disableFrameDroppingInMediaCodec");
        }
        if ((this.k & 16) == 0) {
            sb.append(" enableKeyOperatingRateInMediaCodecForSpeedAdjustedVideos");
        }
        if ((this.k & 32) == 0) {
            sb.append(" clampStartTimeToSourceDuration");
        }
        if ((this.k & 64) == 0) {
            sb.append(" cleanUpUnreleasedDecodersOnClose");
        }
        if ((this.k & 128) == 0) {
            sb.append(" enableFrameDroppingBeforeDecodingSurface");
        }
        if ((this.k & 256) == 0) {
            sb.append(" treatSurfaceSemaphoreTimeoutsAsUnrecoverable");
        }
        if ((this.k & 512) == 0) {
            sb.append(" enableExoPlayerDecodingEosHandlingFix");
        }
        if ((this.k & 1024) == 0) {
            sb.append(" forceSoftwareDecoderOnDecoderRetry");
        }
        if ((this.k & 2048) == 0) {
            sb.append(" optimizeForCompositionChanges");
        }
        if ((this.k & 4096) == 0) {
            sb.append(" enableFailFastOnNetworkError");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.l = z;
        this.k = (short) (this.k | 512);
    }

    public final void c() {
        this.m = true;
        this.k = (short) (this.k | 2048);
    }
}
