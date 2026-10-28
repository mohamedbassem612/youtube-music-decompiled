package com.google.android.libraries.youtube.media.player.exo2.platypus.live;

import defpackage.axo;
import defpackage.bss;
import defpackage.zhq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveTimelineFactory {
    public boolean a;
    public long c;
    public long d;
    public long f;
    public boolean g;
    private final axo i;
    private final boolean j;
    public bss b = bss.a;
    public long e = -9223372036854775807L;
    public boolean h = true;

    public LiveTimelineFactory(axo axoVar, boolean z) {
        this.i = axoVar;
        this.j = z;
    }

    public final void a() {
        if (bss.a.equals(this.b)) {
            return;
        }
        boolean z = this.j;
        long j = z ? this.d : this.c;
        long j2 = this.d;
        boolean z2 = this.g;
        if (!z2 && z) {
            j2 = this.f;
        }
        LiveTimeline liveTimeline = new LiveTimeline(new AutoValue_LiveTimelineMetadata(this.a, this.b, this.c, j2, this.e, this.f, z2, j));
        zhq zhqVar = zhq.ABR;
        this.i.accept(liveTimeline);
    }
}
