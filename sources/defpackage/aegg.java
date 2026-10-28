package defpackage;

import android.webkit.CookieManager;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aegg implements jyd {
    private final /* synthetic */ int $cid;
    public final Object a;

    public aegg(int i, byte[] bArr) {
        this.$cid = i;
        CookieManager cookieManager = CookieManager.getInstance();
        kro.l(cookieManager);
        this.a = cookieManager;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.jyd
    public final void a(String str, String str2) {
        if (this.$cid != 0) {
            ((CookieManager) this.a).setCookie(str, str2);
        } else {
            ((List) Map.EL.computeIfAbsent(this.a, str, new aegf(0))).add(str2);
        }
    }

    public aegg(int i) {
        this.$cid = i;
        this.a = new ConcurrentHashMap();
    }
}
