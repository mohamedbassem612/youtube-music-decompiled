package defpackage;

import com.google.android.apps.youtube.music.R;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hmi {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/actionscontroller/MusicOfflinePlaylistAutoDownloadActionsController");
    public final hpy b;
    public final ahbw c;
    public final Executor d;
    public final avmb e;
    public final huf f;
    public final cf g;
    public final zwb h;
    public final hef i;
    public final grj j;
    public final xsc k;
    private final jin l;

    public hmi(hpy hpyVar, hef hefVar, ahbw ahbwVar, Executor executor, avmb avmbVar, huf hufVar, xsc xscVar, grj grjVar, jin jinVar, cf cfVar, zwb zwbVar) {
        this.b = hpyVar;
        this.i = hefVar;
        this.c = ahbwVar;
        this.d = executor;
        this.e = avmbVar;
        this.f = hufVar;
        this.k = xscVar;
        this.j = grjVar;
        this.l = jinVar;
        this.g = cfVar;
        this.h = zwbVar;
    }

    public final void a(boolean z) {
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(this.g.getString(true != z ? R.string.auto_download_turned_off_message : R.string.auto_download_turned_on_message));
        this.l.d(jioVarE.b());
    }
}
