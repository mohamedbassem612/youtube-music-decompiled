package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ite {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/sideloaded/playlistwriter/SideloadedPlaylistExporterManager");
    public static final long b;
    public static final long c;
    public static final syj d;
    private static final int g;
    public final awmd e;
    public final awmd f;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        b = 86400L;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        c = 14400L;
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        g = 14400;
        TimeUnit timeUnit4 = TimeUnit.HOURS;
        d = new syj(1, 14400);
    }

    public ite(awmd awmdVar, awmd awmdVar2) {
        this.e = awmdVar;
        this.f = awmdVar2;
    }

    public final void a(String str) {
        ((syn) this.e.io()).b(str);
    }
}
