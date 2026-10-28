package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class glh {
    private static final agrf d = agrf.h("com/google/android/apps/youtube/music/application/plugins/PingFlushPlugin");
    public final aunn a;
    public final avlh b;
    public final avmb c;
    private final aunn e;

    public glh(avlh avlhVar, aunn aunnVar, aunn aunnVar2, avmb avmbVar) {
        this.b = avlhVar;
        this.e = aunnVar;
        this.a = aunnVar2;
        this.c = avmbVar;
    }

    public final void a() {
        try {
            ((zxs) this.e.io()).b();
        } catch (tmg e) {
            ((agrc) ((agrc) ((agrc) d.c()).j(e)).k("com/google/android/apps/youtube/music/application/plugins/PingFlushPlugin", "flushPings", '?', "PingFlushPlugin.java")).t("Failed to flush pings at startup");
        }
    }
}
