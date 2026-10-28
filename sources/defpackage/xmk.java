package defpackage;

import com.google.android.gms.cast.CastDevice;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class xmk extends ket {
    final /* synthetic */ kgo a;
    final /* synthetic */ wjr b;

    public xmk(wjr wjrVar, kgo kgoVar) {
        this.a = kgoVar;
        this.b = wjrVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.ket
    public final void q(kyr kyrVar) {
        this.b.b.add(((CastDevice) kyrVar.b).a);
    }

    @Override // defpackage.ket
    public final void r(kyr kyrVar) {
        Object obj = kyrVar.b;
    }

    @Override // defpackage.ket
    public final void s(kyr kyrVar) {
        ket ketVar = new ket(null);
        xsc.aw(kyrVar, false);
        String str = ((CastDevice) kyrVar.b).a;
        kgo kgoVar = this.a;
        if (kgoVar.g.containsKey(str)) {
            Map map = kgoVar.f;
            kgj kgjVar = (kgj) map.get(str);
            if (kgjVar != null) {
                kgjVar.b(kgoVar.g(), kgoVar.h(), false);
                return;
            }
            kgj kgjVar2 = new kgj(kgoVar.c, kyrVar, ketVar, kgoVar.d, new kgk(kgoVar, kyrVar), kgoVar.k);
            map.put(str, kgjVar2);
            kgjVar2.b(kgoVar.g(), kgoVar.h(), false);
            return;
        }
        kbp kbpVar = new kbp();
        kbpVar.b = 2425;
        kbpVar.a();
        khn.e();
        xsc.ar(kyrVar, 2425);
        synchronized (kgoVar.i) {
            Iterator it = kgoVar.e.iterator();
            while (it.hasNext()) {
                ((ket) it.next()).u(kyrVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.ket
    public final void t(kyr kyrVar) {
        this.b.b.remove(((CastDevice) kyrVar.b).a);
    }

    @Override // defpackage.ket
    public final void u(kyr kyrVar) {
        Object obj = kyrVar.b;
    }

    @Override // defpackage.ket
    public final void v(kyr kyrVar) {
        Object obj = kyrVar.b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ket
    public final void w(kyr kyrVar) {
        Object obj = kyrVar.b;
        Iterator it = this.b.a.iterator();
        while (it.hasNext()) {
            ((xmg) it.next()).a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.ket
    public final void x(kyr kyrVar) {
        this.b.b.remove(((CastDevice) kyrVar.b).a);
    }
}
