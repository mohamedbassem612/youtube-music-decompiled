package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xrt extends zik {
    final /* synthetic */ xru a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrt(xru xruVar) {
        super((byte[]) null);
        this.a = xruVar;
    }

    @Override // defpackage.zik
    public final void gX(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ((agrc) ((agrc) xru.a.b().i(agso.a, "MDX.MediaRouteManager")).k("com/google/android/libraries/youtube/mdx/mediaroute/MediaRouteManager$StreamTransferSessionListener", "onTransferSession", 948, "MediaRouteManager.java")).t("Transfer session target routeId is empty.");
            return;
        }
        xru xruVar = this.a;
        synchronized (xruVar) {
            xruVar.m = Optional.of(str);
            xruVar.n = Optional.of(str2);
        }
        xru xruVar2 = this.a;
        xruVar2.P();
        ((wjr) xruVar2.f.io()).w(179, "cx_dfss");
    }
}
