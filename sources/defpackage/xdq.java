package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xdq implements vxc {
    public final Activity a;
    public final wwd b;
    private long c = 0;
    private final wwh d;
    private final wrb e;
    private final mbc f;
    private final wwn g;
    private final vxz h;
    private final vxz i;
    private final xpl k;

    public xdq(Activity activity, wwn wwnVar, wwh wwhVar, xpl xplVar, vxz vxzVar, wrb wrbVar, wwd wwdVar, mbc mbcVar, vxz vxzVar2) {
        this.a = activity;
        this.g = wwnVar;
        this.d = wwhVar;
        this.k = xplVar;
        this.h = vxzVar;
        this.e = wrbVar;
        this.b = wwdVar;
        this.f = mbcVar;
        this.i = vxzVar2;
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void c(ajwo ajwoVar, Map map) {
        if (!this.i.m(24, 45805349L)) {
            long jB = this.f.b();
            if (jB - this.c < 1000) {
                return;
            } else {
                this.c = jB;
            }
        }
        this.g.f();
        dd supportFragmentManager = ((cf) this.a).getSupportFragmentManager();
        if (this.h.m(0, 45382597L)) {
            wrb wrbVar = this.e;
            wrbVar.h(wrbVar.g(ajwoVar), new gtg(this, 11));
            return;
        }
        boolean z = ((amoo) this.k.b).f;
        wwh wwhVar = this.d;
        if (!z) {
            wzo wzoVar = new wzo();
            Bundle bundle = new Bundle();
            bundle.putByteArray("navigation_endpoint", ajwoVar.toByteArray());
            wzoVar.setArguments(bundle);
            wzoVar.s = wwhVar;
            wzoVar.h(supportFragmentManager, "live_chat_item_context_menu_dialog");
            return;
        }
        wwhVar.getClass();
        wzn wznVar = new wzn();
        Bundle bundle2 = new Bundle();
        bundle2.putByteArray("navigation_endpoint", ajwoVar.toByteArray());
        wznVar.setArguments(bundle2);
        wznVar.v = wwhVar;
        wznVar.h(supportFragmentManager, "live_chat_item_context_menu_bottom_sheet_fragment");
    }
}
