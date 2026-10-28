package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eyy implements eyv {
    private final List a;
    private final axr b;

    public eyy(List list, axr axrVar) {
        this.a = list;
        this.b = axrVar;
    }

    @Override // defpackage.eyv
    public final boolean a(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((eyv) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [ett] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.eyv
    public final hed b(Object obj, int i, int i2, ety etyVar) {
        hed hedVarB;
        List list = this.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        int i3 = 0;
        ?? r5 = 0;
        while (i3 < size) {
            eyv eyvVar = (eyv) list.get(i3);
            if (eyvVar.a(obj) && (hedVarB = eyvVar.b(obj, i, i2, etyVar)) != null) {
                arrayList.add(hedVarB.a);
                r5 = hedVarB.b;
            }
            i3++;
            r5 = r5;
        }
        if (arrayList.isEmpty() || r5 == 0) {
            return null;
        }
        return new hed((ett) r5, new eyx(arrayList, this.b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}
