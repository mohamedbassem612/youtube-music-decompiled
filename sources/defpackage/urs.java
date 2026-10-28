package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class urs {
    public final Set a;
    public auhs b;
    private long c;
    private final ujg d;

    public urs(auhs auhsVar) {
        auhsVar.getClass();
        this.d = new ujg();
        this.a = new LinkedHashSet();
        this.b = auhsVar;
        aiie aiieVar = auhsVar.d;
        aiieVar.getClass();
        ArrayList arrayList = new ArrayList(atqq.N(aiieVar, 10));
        Iterator<E> it = aiieVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((augy) it.next()).e));
        }
        aiie aiieVar2 = auhsVar.e;
        aiieVar2.getClass();
        ArrayList arrayList2 = new ArrayList(atqq.N(aiieVar2, 10));
        Iterator<E> it2 = aiieVar2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((aufa) it2.next()).e));
        }
        Long l = (Long) atqq.U(atqq.aj(arrayList, arrayList2));
        this.c = (l != null ? l.longValue() : 0L) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c A[EDGE_INSN: B:23:0x005c->B:20:0x005c BREAK  A[LOOP:0: B:2:0x0000->B:22:0x0062], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x005c A[EDGE_INSN: B:24:0x005c->B:20:0x005c BREAK  A[LOOP:0: B:2:0x0000->B:22:0x0062, LOOP_LABEL: LOOP:0: B:2:0x0000->B:22:0x0062], SYNTHETIC] */
    public final long a() {
        aiie aiieVar;
        Iterator<E> it;
        loop0: while (true) {
            if (!this.a.contains(Long.valueOf(this.c))) {
                aiie aiieVar2 = this.b.d;
                aiieVar2.getClass();
                if (!aiieVar2.isEmpty()) {
                    Iterator<E> it2 = aiieVar2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            aiieVar = this.b.e;
                            aiieVar.getClass();
                            if (aiieVar.isEmpty()) {
                                it = aiieVar.iterator();
                                do {
                                    if (it.hasNext()) {
                                        break loop0;
                                    }
                                } while (((aufa) it.next()).e != this.c);
                            } else {
                                break;
                            }
                        } else if (((augy) it2.next()).e == this.c) {
                        }
                    }
                } else {
                    aiieVar = this.b.e;
                    aiieVar.getClass();
                    if (aiieVar.isEmpty()) {
                        break;
                        break;
                    }
                    it = aiieVar.iterator();
                    do {
                        if (it.hasNext()) {
                            break loop0;
                            break loop0;
                        }
                    } while (((aufa) it.next()).e != this.c);
                }
            }
            this.c++;
        }
        long j = this.c;
        this.c = 1 + j;
        return j;
    }

    public final utw b(utv... utvVarArr) {
        auhs auhsVar = this.b;
        ArrayList arrayList = new ArrayList();
        utw e = null;
        for (char c = 0; c <= 0; c = 1) {
            utv utvVar = utvVarArr[0];
            if (e != null) {
                arrayList.add(new urq(utvVar, null, true));
            } else {
                try {
                    this.b = utvVar.h(this.b);
                    arrayList.add(new urq(utvVar, null, false));
                    e = null;
                } catch (utw e2) {
                    e = e2;
                    twu.d("CompositionDataManager", 6, "Failed to apply composition mutation.", e);
                    arrayList.add(new urq(utvVar, e, false));
                }
            }
        }
        if (e == null) {
            this.d.f(this.b, arrayList);
            return null;
        }
        twu.d("CompositionDataManager", 5, "Transaction failed - Rolling back composition", null);
        this.b = auhsVar;
        this.d.e(auhsVar, arrayList);
        return e;
    }

    public final void c(urr urrVar) {
        this.d.h(urrVar);
    }
}
