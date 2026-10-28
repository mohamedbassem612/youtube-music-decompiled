package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aeii {
    final Object a;
    final aeii b;
    public aeij c;
    protected final List d = new ArrayList();
    protected final Map e = new HashMap();
    protected List f;
    public aeii g;
    protected Runnable h;
    protected Runnable i;
    private aeii j;

    public aeii(Object obj, aeii aeiiVar) {
        this.a = obj;
        this.b = aeiiVar;
        aeij aeijVar = aeiiVar != null ? aeiiVar.c : null;
        this.c = aeijVar;
        if (aeijVar != null) {
            boolean zContainsKey = aeijVar.b.containsKey(obj);
            aeij aeijVar2 = this.c;
            if (zContainsKey) {
                throw new IllegalArgumentException(String.format("%s: already contains id: %s = %s", aeijVar2, obj, aeijVar2.b.get(obj)));
            }
            aeijVar2.b.put(obj, this);
        }
        if (aeiiVar != null) {
            aeiiVar.d.add(this);
        }
    }

    protected final List a() {
        if (this.f == null) {
            ArrayDeque arrayDeque = new ArrayDeque();
            for (aeii aeiiVar = this; aeiiVar != null; aeiiVar = aeiiVar.b) {
                arrayDeque.addFirst(aeiiVar);
            }
            this.f = new ArrayList(arrayDeque);
        }
        return this.f;
    }

    final void b(List list) {
        aeii aeiiVar;
        if (!d()) {
            if (!f() && (aeiiVar = this.b) != null) {
                aeiiVar.j = this;
            }
            twu.d("StateMachine", 4, String.format("%s: enter", this), null);
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
        if (this != aguu.K(list)) {
            ((aeii) list.get(list.indexOf(this) + 1)).b(list);
            return;
        }
        aeii aeiiVar2 = this.g;
        if (aeiiVar2 != null) {
            String.format("%s: entered - transition to initialState(%s)", this, aeiiVar2);
            i(this.g, null, new aeih());
        }
    }

    final void c(List list) {
        aeii aeiiVar = this.j;
        if (aeiiVar != null) {
            aeiiVar.c(list);
        }
        aeii aeiiVar2 = this.b;
        if (aeiiVar2 != null && aeiiVar2.j == this) {
            aeiiVar2.j = null;
        }
        String.format("%s: exit", this);
        Runnable runnable = this.i;
        if (runnable != null) {
            runnable.run();
        }
    }

    protected boolean d() {
        aeij aeijVar;
        aeii aeiiVar = this.b;
        if (aeiiVar == null || aeiiVar.j != this) {
            return f() && (aeijVar = this.c) != null && aeijVar.c;
        }
        return true;
    }

    protected final boolean e(aeii aeiiVar) {
        do {
            this = this.b;
            if (this == null) {
                return false;
            }
        } while (this != aeiiVar);
        return true;
    }

    protected final boolean f() {
        aeij aeijVar = this.c;
        return aeijVar != null && aeijVar.a == this;
    }

    protected final void g(Object obj, aeii aeiiVar, aeif aeifVar, aeie aeieVar) {
        ArrayList arrayList = new ArrayList();
        Map map = this.e;
        j$.util.Map.EL.putIfAbsent(map, obj, arrayList);
        ((List) map.get(obj)).add(new aeig(aeiiVar, aeifVar, aeieVar));
    }

    public final boolean h(Object obj) {
        aeii aeiiVar = this.j;
        if (aeiiVar != null && aeiiVar.h(obj)) {
            return true;
        }
        Map map = this.e;
        if (map.get(obj) == null) {
            twu.d("StateMachine", 4, String.format("%s: does not handle %s", this, obj), null);
        } else {
            for (aeig aeigVar : (List) map.get(obj)) {
                aeif aeifVar = aeigVar.b;
                if (aeifVar == null || aeifVar.a()) {
                    String.format("%s[%s]: guard check passed for %s", this, obj, aeigVar);
                    twu.d("StateMachine", 4, String.format("%s: handling %s", this, aeigVar), null);
                    if (aeigVar.e) {
                        twu.d("StateMachine", 4, String.format("%s[%s]: internal transition", this, obj), null);
                        aeie aeieVar = aeigVar.c;
                        if (aeieVar == null) {
                            return true;
                        }
                        aeieVar.a();
                        return true;
                    }
                    aeii aeiiVar2 = aeigVar.a;
                    if (aeiiVar2 == null) {
                        return true;
                    }
                    boolean z = aeigVar.d;
                    i(aeiiVar2, obj, aeigVar.c);
                    return true;
                }
            }
            twu.d("StateMachine", 4, String.format("%s: did not handle %s", this, obj), null);
        }
        return false;
    }

    protected final void i(aeii aeiiVar, Object obj, aeie aeieVar) {
        aeii aeiiVar2;
        aeii aeiiVar3;
        aeii aeiiVar4;
        boolean z = aeieVar != null;
        String.format("%s: transition(%s, local=%s, event=%s, action=%s)", this, aeiiVar, Boolean.TRUE, obj, Boolean.valueOf(z));
        boolean z2 = e(aeiiVar) || aeiiVar.e(this);
        if (z2) {
            aeiiVar2 = aeiiVar.e(this) ? this : aeiiVar;
        } else {
            Iterator it = a().iterator();
            Iterator it2 = aeiiVar.a().iterator();
            aeiiVar2 = null;
            while (it.hasNext() && it2.hasNext() && (aeiiVar4 = (aeii) it.next()) == ((aeii) it2.next())) {
                aeiiVar2 = aeiiVar4;
            }
            if ((aeiiVar2 == this || aeiiVar2 == aeiiVar) && (aeiiVar3 = aeiiVar2.b) != null) {
                aeiiVar2 = aeiiVar3;
            }
        }
        if (aeiiVar2 == null) {
            throw new IllegalStateException("No common ancestor found");
        }
        List listA = aeiiVar.a();
        List listSubList = listA.subList(listA.indexOf(aeiiVar2) + 1, listA.size());
        twu.d("StateMachine", 4, String.format("%s: transition to %s (local: %s, action: %s, lca: %s, entering: %s)", this, aeiiVar, Boolean.valueOf(z2), Boolean.valueOf(z), aeiiVar2, listSubList), null);
        aeii aeiiVar5 = aeiiVar2.j;
        if (aeiiVar5 != null) {
            aeiiVar5.c(listA);
        }
        if (aeieVar != null) {
            aeieVar.a();
        }
        if (listSubList.isEmpty()) {
            return;
        }
        ((aeii) listSubList.get(0)).b(listA);
    }

    public final String toString() {
        return String.format("State(%s)", this.a);
    }
}
