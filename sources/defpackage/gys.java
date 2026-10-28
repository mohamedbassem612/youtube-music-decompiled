package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gys extends gut {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/UserFeedbackCommandResolver");
    public final cf b;
    public final Executor c;
    public final vxz d;
    public final abhh e;
    public final xsc f;
    private final aeql g;

    public gys(cf cfVar, abhh abhhVar, aeql aeqlVar, xsc xscVar, vxz vxzVar, Executor executor) {
        this.b = cfVar;
        this.e = abhhVar;
        this.g = aeqlVar;
        this.f = xscVar;
        this.d = vxzVar;
        this.c = executor;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        taf.k(this.b, this.g.a(), new gnx(6), new gyr(this, ajwoVar, map, 0));
    }
}
