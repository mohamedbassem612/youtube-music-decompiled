package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dg extends bpi {
    public static final bpl a = new df();
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public dg(boolean z) {
        this.e = z;
    }

    public final void a(cc ccVar) {
        if (this.g) {
            return;
        }
        HashMap map = this.b;
        if (map.containsKey(ccVar.mWho)) {
            return;
        }
        map.put(ccVar.mWho, ccVar);
        if (dd.aa(2)) {
            Objects.toString(ccVar);
        }
    }

    public final void b(cc ccVar, boolean z) {
        if (dd.aa(3)) {
            Objects.toString(ccVar);
        }
        c(ccVar.mWho, z);
    }

    public final void c(String str, boolean z) {
        HashMap map = this.c;
        dg dgVar = (dg) map.get(str);
        if (dgVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(dgVar.c.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    dgVar.c((String) arrayList.get(i), true);
                }
            }
            dgVar.d();
            map.remove(str);
        }
        HashMap map2 = this.d;
        bpo bpoVar = (bpo) map2.get(str);
        if (bpoVar != null) {
            bpoVar.a();
            map2.remove(str);
        }
    }

    @Override // defpackage.bpi
    protected final void d() {
        if (dd.aa(3)) {
            toString();
        }
        this.f = true;
    }

    public final void e(cc ccVar) {
        if (this.g || this.b.remove(ccVar.mWho) == null || !dd.aa(2)) {
            return;
        }
        Objects.toString(ccVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dg dgVar = (dg) obj;
            if (this.b.equals(dgVar.b) && this.c.equals(dgVar.c) && this.d.equals(dgVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(cc ccVar) {
        if (this.b.containsKey(ccVar.mWho) && this.e) {
            return this.f;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
