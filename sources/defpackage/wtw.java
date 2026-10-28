package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wtw implements vxc {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/services/setting/SetSettingCommandResolver");
    public final awmd b;
    public final ttm c;
    private final Executor d;
    private final zwb e;
    private final xpl f;

    public wtw(xpl xplVar, awmd awmdVar, ttm ttmVar, Executor executor, zwb zwbVar) {
        this.f = xplVar;
        this.b = awmdVar;
        this.c = ttmVar;
        this.d = executor;
        this.e = zwbVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        afxd.f(this.f.h(this.e.e())).h(new uzh(ajwoVar, 14), this.d).i(new wtv(this, ajwoVar, map), MoreExecutors.directExecutor());
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
