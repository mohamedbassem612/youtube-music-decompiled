package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abzt {
    public final bye a;
    public final int b;
    public volatile boolean c = false;
    public Thread d;
    public final vxz e;
    public final tgr f;
    private final Executor g;
    private final byi h;

    public abzt(Executor executor, zgy zgyVar, tgr tgrVar, vxz vxzVar, Uri uri, int i, String str) {
        this.g = executor;
        this.e = vxzVar;
        this.a = new byz(zgyVar.a(), tgrVar, -10);
        this.f = tgrVar;
        byi byiVar = null;
        if (uri != null && ("https".equals(uri.getScheme()) || "http".equals(uri.getScheme()))) {
            if (!TextUtils.isEmpty(str)) {
                tyt tytVar = new tyt(uri);
                tytVar.f("cpn", str);
                uri = tytVar.a();
            }
            Uri uri2 = uri;
            if (vxzVar.m(14, 45627566L)) {
                byh byhVar = new byh(new byi(uri2, 0L, -1L, null));
                ypp yppVarA = ypq.a();
                yppVarA.j(tok.PLAYER_CMS_PATH_PROBE_CLIENT);
                byhVar.k = yppVarA.a();
                byiVar = byhVar.a();
            } else {
                byiVar = new byi(uri2, 0L, -1L, null);
            }
        }
        this.h = byiVar;
        this.b = i;
    }

    public final void a() {
        this.c = true;
        Thread thread = this.d;
        if (thread != null) {
            thread.interrupt();
        }
    }

    public final void b() {
        byi byiVar = this.h;
        if (byiVar != null) {
            this.g.execute(new abwl(this, byiVar, 7));
        }
    }
}
