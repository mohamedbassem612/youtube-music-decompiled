package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iev {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/queue/requester/OfflineQueueItemRequester");
    public final hpy b;
    public final hpd c;
    public final hpb d;
    public final hfn e;
    private final hfn f;

    public iev(hpy hpyVar, hpd hpdVar, hpb hpbVar, hfn hfnVar, hfn hfnVar2) {
        this.b = hpyVar;
        this.c = hpdVar;
        this.d = hpbVar;
        this.e = hfnVar;
        this.f = hfnVar2;
    }

    public final ListenableFuture a(anyx anyxVar, int i) {
        zh zhVar = new zh();
        zhVar.a = 2;
        imk imkVarD = zhVar.d();
        vzq vzqVarA = ini.a();
        vzqVarA.e(i);
        vzqVarA.d("");
        return this.f.ao(anyx.class, aoun.class, anyxVar, agkj.k("display_context", imkVarD, "playlist_panel_video_context", vzqVarA.c()));
    }
}
