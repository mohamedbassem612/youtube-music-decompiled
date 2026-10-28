package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gxg extends gut {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/SetWatchHistoryPausedSettingCommandResolver");
    public final vxe b;
    public final ttm c;
    public final jkp d;
    private final Executor e;
    private final zwb f;
    private final xpl g;

    public gxg(xpl xplVar, vxe vxeVar, ttm ttmVar, jkp jkpVar, Executor executor, zwb zwbVar) {
        this.g = xplVar;
        this.d = jkpVar;
        this.b = vxeVar;
        this.c = ttmVar;
        this.e = executor;
        this.f = zwbVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        boolean zBooleanValue = ((Boolean) tym.T(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", Boolean.FALSE)).booleanValue();
        taf.i(afxd.f(this.g.h(this.f.e())).h(new hoy(ajwoVar, zBooleanValue, 1), MoreExecutors.directExecutor()), this.e, new gtq(this, 4), new rod(this, zBooleanValue, 1), null);
    }
}
