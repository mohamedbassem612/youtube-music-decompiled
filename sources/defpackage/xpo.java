package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xpo implements xpn {
    private final Context a;
    private final awmd b;
    private final vxz c;

    static {
        twu.b("MdxLocalNetworkPermissionManager");
    }

    public xpo(Context context, vxz vxzVar, awmd awmdVar) {
        context.getClass();
        vxzVar.getClass();
        this.a = context;
        this.c = vxzVar;
        this.b = awmdVar;
    }

    @Override // defpackage.xpn
    public final boolean a() {
        return Build.VERSION.SDK_INT < 37 || !this.c.l(201, 45738960L, false) || !((tfq) this.b.io()).j(1) || avg.c(this.a, "android.permission.ACCESS_LOCAL_NETWORK") == 0;
    }
}
