package defpackage;

import com.google.android.libraries.blocks.runtime.BaseClient;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class voo implements bnu {
    final /* synthetic */ vov a;
    final /* synthetic */ aunn b;
    final /* synthetic */ vor c;
    final /* synthetic */ vxz d;

    public voo(vor vorVar, vov vovVar, vxz vxzVar, aunn aunnVar) {
        this.a = vovVar;
        this.d = vxzVar;
        this.b = aunnVar;
        this.c = vorVar;
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        Map map = this.a.a;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((vou) it.next()).c();
        }
        map.clear();
        vor vorVar = this.c;
        vorVar.b.h();
        Object obj = vorVar.p;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
        Object obj2 = vorVar.q;
        if (obj2 != null) {
            avnr.b((AtomicReference) obj2);
        }
        if (this.d.l(296, 45739301L, true)) {
            wjr wjrVar = (wjr) this.b.io();
            ((mav) wjrVar.a).d((BaseClient) ((vwt) wjrVar.b).a);
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
