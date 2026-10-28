package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abwj {
    public static final abwj a = a().a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public abwj(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = z11;
    }

    public static abwi a() {
        abwi abwiVar = new abwi();
        abwiVar.i(false);
        abwiVar.h(false);
        abwiVar.a = (short) (abwiVar.a | 12);
        abwiVar.c(false);
        abwiVar.k(false);
        abwiVar.g(false);
        abwiVar.j(false);
        abwiVar.l(false);
        abwiVar.b(false);
        abwiVar.f(false);
        abwiVar.e(false);
        abwiVar.d(false);
        return abwiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abwj) {
            abwj abwjVar = (abwj) obj;
            if (this.b == abwjVar.b && this.c == abwjVar.c && this.d == abwjVar.d && this.e == abwjVar.e && this.f == abwjVar.f && this.g == abwjVar.g && this.h == abwjVar.h && this.i == abwjVar.i && this.j == abwjVar.j && this.k == abwjVar.k && this.l == abwjVar.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231);
    }

    public final String toString() {
        return "PlaybackServiceFeatures{enableSequencerV2=" + this.b + ", enableSabrPrefetch=" + this.c + ", playbackTransience=false, keepLastFrame=false, emitSequencerNavigationRequestEvents=" + this.d + ", useGetPlayerWhenOnlyPrefetching=" + this.e + ", enableMultipleVideoQueuing=" + this.f + ", propagateWatchNextExceptionsForQueuedVideos=" + this.g + ", useQueueVideosForQueueNextVideoInternally=" + this.h + ", androidSabrDontCancelFuturePrefetch=" + this.i + ", enableGetPlayerUnifiedControllerMigration=" + this.j + ", enableAsyncClientPrefetch=" + this.k + ", enableBeforeQueuedVideoTransitionCallback=" + this.l + '}';
    }

    public abwj() {
        throw null;
    }
}
