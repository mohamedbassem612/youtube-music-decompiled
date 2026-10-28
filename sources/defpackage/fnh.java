package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fnh {
    public static fnh a;
    private final Set b = new LinkedHashSet();
    private final ArrayList c = new ArrayList();
    private final Map d = new HashMap();
    private boolean e = false;
    private final List f = new ArrayList();
    private final List g = new ArrayList();
    private boolean h = false;
    private final fnf i;

    public fnh(fnf fnfVar) {
        this.i = fnfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final synchronized void a(long j) {
        if (this.h) {
            ArrayList arrayList = this.c;
            arrayList.clear();
            Set set = this.b;
            if (set.size() != 0) {
                afx afxVar = new afx(0);
                aha ahaVar = new aha(0);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ArrayList arrayList2 = ((fnj) it.next()).b;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        fnp fnpVar = (fnp) arrayList2.get(i);
                        ArrayList arrayList3 = fnpVar.b;
                        int size2 = arrayList3 == null ? 0 : arrayList3.size();
                        if (size2 == 0) {
                            afxVar.add(fnpVar);
                        } else {
                            ahaVar.put(fnpVar, Integer.valueOf(size2));
                        }
                    }
                }
                if (!ahaVar.isEmpty() && afxVar.isEmpty()) {
                    throw new fni("Graph has nodes, but they represent a cycle with no leaf nodes!");
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.addAll(afxVar);
                while (!arrayDeque.isEmpty()) {
                    fnp fnpVar2 = (fnp) arrayDeque.pollFirst();
                    arrayList.add(fnpVar2);
                    for (fnp fnpVar3 : fnpVar2.h()) {
                        int iIntValue = ((Integer) ahaVar.get(fnpVar3)).intValue() - 1;
                        ahaVar.put(fnpVar3, Integer.valueOf(iIntValue));
                        if (iIntValue == 0) {
                            arrayDeque.addLast(fnpVar3);
                        } else if (iIntValue < 0) {
                            throw new fni("Detected cycle.");
                        }
                    }
                }
                if (arrayList.size() != ahaVar.d + afxVar.c) {
                    throw new fni("Had unreachable nodes in graph -- this likely means there was a cycle");
                }
                Collections.reverse(arrayList);
                this.h = false;
            }
        }
        ArrayList arrayList4 = this.c;
        int size3 = arrayList4.size();
        for (int i2 = 0; i2 < size3; i2++) {
            fnp fnpVar4 = (fnp) arrayList4.get(i2);
            float fA = fnpVar4.a(j);
            if (j == fnpVar4.d) {
                throw new RuntimeException("Got a calculate value call multiple times in the same frame. This isn't expected.");
            }
            fnpVar4.d = j;
            fnpVar4.c = fA;
        }
        int size4 = arrayList4.size();
        for (int i3 = 0; i3 < size4; i3++) {
            fnp fnpVar5 = (fnp) arrayList4.get(i3);
            Map map = this.d;
            atwg atwgVar = (atwg) map.get(fnpVar5);
            if (atwgVar != null && !atwgVar.a) {
                Iterator it2 = fnpVar5.h().iterator();
                do {
                    if (!it2.hasNext()) {
                        if ((fnpVar5 instanceof fnm) && !((fnm) fnpVar5).b()) {
                            break;
                        }
                        atwgVar.a = true;
                        break;
                    }
                } while (((atwg) map.get((fnp) it2.next())).a);
            }
        }
        this.e = true;
        for (fnj fnjVar : this.b) {
            ArrayList arrayList5 = fnjVar.b;
            int size5 = arrayList5.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size5) {
                    qcb qcbVar = fnjVar.e;
                    if (qcbVar != null) {
                        Object obj = qcbVar.a;
                        ((fms) obj).j();
                        ((fms) obj).f();
                    }
                    fnjVar.b();
                    break;
                }
                if (!((atwg) this.d.get(arrayList5.get(i4))).a) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        this.e = false;
        List list = this.g;
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            b((fnj) it3.next());
        }
        List list2 = this.f;
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            c((fnj) it4.next());
        }
        list.clear();
        list2.clear();
    }

    public final synchronized void b(fnj fnjVar) {
        if (!fnjVar.c) {
            throw new RuntimeException("Expected added GraphBinding to be active: ".concat(String.valueOf(String.valueOf(fnjVar))));
        }
        if (this.e) {
            this.g.add(fnjVar);
            return;
        }
        Set set = this.b;
        set.add(fnjVar);
        ArrayList arrayList = fnjVar.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fnp fnpVar = (fnp) arrayList.get(i);
            Map map = this.d;
            atwg atwgVar = (atwg) map.get(fnpVar);
            if (atwgVar != null) {
                atwgVar.b++;
            } else {
                atwg atwgVar2 = new atwg(null, null);
                atwgVar2.b = 1;
                map.put(fnpVar, atwgVar2);
            }
        }
        if (set.size() == 1) {
            fnf fnfVar = this.i;
            if (fnfVar.c == null) {
                throw new RuntimeException("Must set a binding graph first.");
            }
            if (fnfVar.d) {
                throw new RuntimeException("Tried to start but was already running.");
            }
            fnfVar.d = true;
            fnfVar.a();
        }
        this.h = true;
    }

    public final synchronized void c(fnj fnjVar) {
        if (this.e) {
            this.f.add(fnjVar);
            return;
        }
        Set set = this.b;
        if (!set.remove(fnjVar)) {
            throw new RuntimeException("Tried to unregister non-existent binding");
        }
        ArrayList arrayList = fnjVar.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fnp fnpVar = (fnp) arrayList.get(i);
            Map map = this.d;
            atwg atwgVar = (atwg) map.get(fnpVar);
            int i2 = atwgVar.b - 1;
            atwgVar.b = i2;
            if (i2 == 0) {
                map.remove(fnpVar);
            }
        }
        if (set.isEmpty()) {
            fnf fnfVar = this.i;
            if (!fnfVar.d) {
                throw new RuntimeException("Tried to stop but wasn't running.");
            }
            fnfVar.d = false;
            fmy fmyVar = fnfVar.a;
            fmx fmxVar = fnfVar.b;
            fmxVar.a.set(null);
            if (((fmz) fmyVar).b != null) {
                ((fmz) fmyVar).b.removeFrameCallback(fmxVar.a());
            } else {
                ((fmz) fmyVar).a.removeCallbacks(fmxVar.b());
            }
            fnfVar.e = false;
            this.c.clear();
            if (!this.d.isEmpty()) {
                throw new RuntimeException("Failed to clean up all nodes");
            }
        }
        this.h = true;
    }
}
