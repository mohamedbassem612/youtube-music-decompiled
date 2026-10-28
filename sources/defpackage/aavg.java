package defpackage;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aavg {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/audiofocus/PlaybackAudioManager");
    public final Context b;
    public final abnc c;
    public final wis d;
    public final AudioManager e;
    public final aave f;
    public final axsp g;
    public final aavc h;
    public final abmt i;
    public final aavf j;
    public bqj k;
    public wjf l;
    public int m;
    public int n = 2;
    public abvk o;
    public final igp p;
    private final Executor q;

    public aavg(Context context, abnc abncVar, wis wisVar, Executor executor, axsp axspVar, aunn aunnVar, abmt abmtVar) {
        context.getClass();
        this.b = context;
        abncVar.getClass();
        this.c = abncVar;
        wisVar.getClass();
        this.d = wisVar;
        executor.getClass();
        this.q = executor;
        this.g = axspVar;
        this.m = 1;
        this.i = abmtVar;
        this.j = new aavf();
        this.e = (AudioManager) context.getSystemService("audio");
        this.f = new aave(this);
        aavc aavhVar = abmtVar.p.l(23, 45638551L, false) ? (aavc) aunnVar.io() : new aavh(context);
        this.h = aavhVar;
        igp igpVar = new igp(this);
        this.p = igpVar;
        aavhVar.a(igpVar);
    }

    public final void a() {
        if (this.i.p.l(27, 45641807L, false) && this.m == 1) {
            return;
        }
        abmx.a(abmw.AUDIOMANAGER, "AudioFocus Abandoned");
        AudioManager audioManager = this.e;
        if (audioManager != null && audioManager.abandonAudioFocus(this.f) == 1) {
            this.m = 1;
        }
        aave aaveVar = this.f;
        int i = aave.d;
        aaveVar.a(false);
    }

    public final void b() {
        if (this.j.a) {
            this.q.execute(afwl.i(new aadm(this, 16)));
        }
    }
}
