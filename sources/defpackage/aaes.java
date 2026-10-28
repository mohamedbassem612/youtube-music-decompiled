package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaes implements aafg {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public aaes(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.aafg
    public final void a(aamh aamhVar) {
        int i = this.$cid;
        if (i == 0) {
            aaok aaokVar = aamhVar.l;
            if (aaokVar != null) {
                ((aaeu) this.a).a((String) aaokVar.b);
            }
            Object obj = this.a;
            String str = aamhVar.a;
            aalf aalfVar = ((aaeu) obj).b;
            aalfVar.l(aalfVar.c(str));
            return;
        }
        Object obj2 = this.a;
        if (i == 1) {
            ((aaqu) ((aadk) obj2).r.io()).f(aamhVar.a);
            return;
        }
        aagg aaggVar = (aagg) obj2;
        int size = aaggVar.b().size();
        aaggVar.l(aamhVar.a);
        if (size <= 0 || !aaggVar.b().isEmpty()) {
            return;
        }
        Iterator it = aaggVar.g.iterator();
        while (it.hasNext()) {
            aado aadoVar = (aado) ((hzo) it.next()).a;
            aadoVar.h.a(aadoVar.b);
        }
    }

    @Override // defpackage.aafg
    public final void b(Collection collection, aoen aoenVar) {
        if (this.$cid == 0) {
            ((aaeu) this.a).b(collection, aoenVar);
        }
    }

    @Override // defpackage.aafg
    public final void c(aamh aamhVar, Collection collection, HashSet hashSet, aohx aohxVar, int i, byte[] bArr, Set set, aamn aamnVar, boolean z) {
        int i2 = this.$cid;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((aamo) it.next()).d());
        }
        String str = aamhVar.a;
        aagg aaggVar = (aagg) this.a;
        aafj aafjVar = aaggVar.e;
        aogf aogfVarG = aafjVar.g(str);
        long jC = aafjVar.c(str);
        long jD = aafjVar.d(str);
        aaggVar.l(str);
        aaggVar.h(aamhVar, arrayList, aohxVar, i, jC, jD, aogfVarG);
        if (z) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                aamo aamoVar = (aamo) it2.next();
                String strD = aamoVar.d();
                String str2 = str;
                aagg aaggVar2 = aaggVar;
                aaggVar2.k(aamoVar, str2, aohxVar, i, bArr, aamnVar, hashSet.contains(strD), set.contains(strD) ? aamg.ACTIVE : aamg.STREAM_DOWNLOAD_PENDING);
                aaggVar = aaggVar2;
                str = str2;
            }
        }
    }
}
