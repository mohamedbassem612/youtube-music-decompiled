package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ibs {
    private static final agrf c = agrf.h("com/google/android/apps/youtube/music/player/playbackrate/RecentlySelectedPlaybackRateChangeMonitor");
    public final aunn a;
    private final aunn d;
    private final AtomicBoolean e = new AtomicBoolean(false);
    public boolean b = false;

    public ibs(aunn aunnVar, aunn aunnVar2) {
        this.d = aunnVar;
        this.a = aunnVar2;
    }

    public final void a() {
        int i = 1;
        if (this.e.getAndSet(true)) {
            return;
        }
        avmm avmmVar = new avmm();
        aunn aunnVar = this.d;
        int i2 = 2;
        int i3 = 20;
        avmmVar.e(((abvn) aunnVar.io()).M(new iam(i2), new iam(3)).i(new abwr(i)).al(new ibr(this, 0), new hmd(i3)), ((abvn) aunnVar.io()).M(new iam(i2), new iam(4)).i(new abwr(i)).al(new ibr(this, i2), new hmd(i3)), ((abvn) aunnVar.io()).M(new iam(i2), new iam(5)).i(new abwr(i)).al(new ibr(this, i), new hmd(i3)));
    }
}
