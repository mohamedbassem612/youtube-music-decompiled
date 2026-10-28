package defpackage;

import com.google.android.gms.cast.CastDevice;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kgk extends ket {
    final /* synthetic */ kgo a;
    public final kyr b;

    public kgk(kgo kgoVar, kyr kyrVar) {
        this.a = kgoVar;
        this.b = kyrVar;
    }

    @Override // defpackage.ket
    public final void E() {
        kgo kgoVar = kgo.a;
        kyr kyrVar = this.b;
        Object obj = kyrVar.a;
        Object obj2 = kyrVar.b;
        khn.e();
        xsc.at(kyrVar);
        kgo kgoVar2 = this.a;
        synchronized (kgoVar2.i) {
            Iterator it = kgoVar2.e.iterator();
            while (it.hasNext()) {
                ((ket) it.next()).q(kyrVar);
            }
        }
    }

    @Override // defpackage.ket
    public final void F() {
        this.a.f.remove(((CastDevice) this.b.b).a);
    }
}
