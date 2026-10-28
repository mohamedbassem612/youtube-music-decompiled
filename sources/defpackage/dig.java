package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dig {
    final dhn a;
    final int b;
    final dii c;
    final List d;
    private final boolean e;
    private final dii f;
    private final dii g;
    private final WeakReference h;
    private boolean i = false;
    private boolean j = false;

    public dig(dgr dgrVar, dii diiVar, dhn dhnVar, int i, boolean z, dii diiVar2, Collection collection) {
        this.h = new WeakReference(dgrVar);
        this.c = diiVar;
        this.a = dhnVar;
        this.b = i;
        this.e = z;
        this.f = dgrVar.e;
        this.g = diiVar2;
        this.d = collection == null ? null : new ArrayList(collection);
        dgrVar.b.postDelayed(new cqc(this, 14), 15000L);
    }

    final void a() {
        if (this.i || this.j) {
            return;
        }
        this.j = true;
        dhn dhnVar = this.a;
        if (dhnVar != null) {
            dhnVar.q(0);
            dhnVar.b();
        }
    }

    public final void b() {
        dif difVarE;
        dii diiVar;
        dij.c();
        if (this.i || this.j) {
            return;
        }
        WeakReference weakReference = this.h;
        dgr dgrVar = (dgr) weakReference.get();
        if (dgrVar == null || dgrVar.g != this) {
            a();
            return;
        }
        this.i = true;
        dgrVar.g = null;
        dgr dgrVar2 = (dgr) weakReference.get();
        if (dgrVar2 != null && dgrVar2.e == (diiVar = this.f)) {
            dgl dglVar = dgrVar2.b;
            int i = this.b;
            Message messageObtainMessage = dglVar.obtainMessage(263, diiVar);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
            dhn dhnVar = dgrVar2.f;
            if (dhnVar != null) {
                dhnVar.q(i);
                dgrVar2.f.b();
            }
            Map map = dgrVar2.c;
            if (!map.isEmpty()) {
                for (dhn dhnVar2 : map.values()) {
                    dhnVar2.q(i);
                    dhnVar2.b();
                }
                map.clear();
            }
            dgrVar2.f = null;
        }
        dgr dgrVar3 = (dgr) weakReference.get();
        if (dgrVar3 != null) {
            dii diiVar2 = this.c;
            dgrVar3.e = diiVar2;
            dgrVar3.f = this.a;
            afft afftVar = new afft(null, null);
            afftVar.a = this.b;
            ytt yttVar = new ytt(afftVar);
            dii diiVar3 = this.g;
            if (diiVar3 == null) {
                dgrVar3.b.b(this.f, diiVar2, yttVar, this.e);
            } else {
                Message messageObtainMessage2 = dgrVar3.b.obtainMessage(264, new dgq(diiVar3, diiVar2, yttVar, this.e));
                messageObtainMessage2.arg1 = yttVar.a;
                messageObtainMessage2.sendToTarget();
            }
            dgrVar3.c.clear();
            dgrVar3.j();
            dgrVar3.p();
            List list = this.d;
            if (list == null || (difVarE = dgrVar3.e.e()) == null) {
                return;
            }
            difVarE.a(list);
        }
    }
}
