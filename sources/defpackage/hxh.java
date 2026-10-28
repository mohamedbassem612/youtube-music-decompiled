package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxh {
    public final /* synthetic */ Object a;

    public hxh(Object obj) {
        this.a = obj;
    }

    public final void a() {
        ((TabbedView) this.a).r(-1);
    }

    public final zwk b(String str) {
        int i = typ.a;
        if (ahno.aa(str)) {
            throw new IllegalArgumentException();
        }
        return c(str, null, null, false);
    }

    public final zwk c(String str, Intent intent, Exception exc, boolean z) {
        ght ghtVar = ((ghs) this.a).a;
        return new zwk(str, intent, exc, z, (tqj) ghtVar.q.io(), ghtVar.dO);
    }

    @tcc
    public void handleMdxSessionStatusEvent(xzh xzhVar) {
        boolean z = xzhVar.a != null;
        hxj hxjVar = (hxj) this.a;
        boolean z2 = hxjVar.f;
        hxjVar.f = z;
        if (z2 != z) {
            hxjVar.e();
        }
    }

    public hxh() {
        throw null;
    }

    public /* synthetic */ hxh(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
