package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class icl {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueueContinuationRequester");
    public acjx c;
    public icj d;
    public final jij e;
    private final wuo f;
    private final wne g = new ick();
    public Map b = new HashMap();

    public icl(wuo wuoVar, jij jijVar) {
        this.f = wuoVar;
        this.e = jijVar;
    }

    public final void a(acjw acjwVar, zza zzaVar) {
        agrx agrxVar = agso.a;
        acjwVar.name();
        acjx acjxVar = (acjx) this.b.get(acjwVar);
        if (acjxVar == null || TextUtils.isEmpty(acjxVar.c()) || acjxVar == this.c) {
            return;
        }
        this.c = acjxVar;
        wuo wuoVar = this.f;
        wuq wuqVarA = wuoVar.a(acjxVar);
        wuqVarA.M = this.e.j();
        taf.i(zik.ch(wuoVar, wuqVarA, this.g), MoreExecutors.directExecutor(), new gou(this, acjxVar, 12), new gsu(this, acjxVar, zzaVar, 19, (byte[]) null), null);
    }

    public final boolean b(acjw acjwVar) {
        return this.b.get(acjwVar) != null;
    }
}
