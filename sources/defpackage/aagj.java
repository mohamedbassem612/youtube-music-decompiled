package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aagj {
    public aamh a;
    public aogf b;
    public final /* synthetic */ aagn c;
    private final List d;
    private final aohx e;
    private final int f;
    private final long g;
    private final long h;
    private aamj i;
    private int j;

    public aagj(aagn aagnVar, aamh aamhVar, List list, aohx aohxVar, int i, long j, long j2, aogf aogfVar) {
        this.c = aagnVar;
        this.a = aamhVar;
        this.d = list;
        this.e = aohxVar;
        this.f = i;
        this.g = j;
        this.h = j2;
        this.b = aogfVar;
    }

    private final int d() {
        agkz agkzVarQ;
        aagn aagnVar = this.c;
        int i = 0;
        if (aagnVar.l) {
            aagn aagnVar2 = this.c;
            synchronized (aagnVar2.k) {
                agkzVarQ = tym.Q(aagnVar2.g, this.a.a);
            }
            if (!agkzVarQ.isEmpty()) {
                Iterator it = agkzVarQ.iterator();
                while (it.hasNext()) {
                    aagl aaglVarN = this.c.n((String) it.next());
                    if (aaglVarN != null && aaglVarN.e().t()) {
                        i++;
                    }
                }
            }
        } else {
            synchronized (aagnVar.k) {
                Iterator it2 = tym.V(aagnVar.g, this.a.a).iterator();
                while (it2.hasNext()) {
                    aagl aaglVarN2 = aagnVar.n((String) it2.next());
                    if (aaglVarN2 != null && aaglVarN2.e().t()) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    public final aamh a() {
        aamh aamhVar;
        synchronized (this.c.k) {
            aamhVar = this.a;
        }
        return aamhVar;
    }

    public final aamj b() {
        aamj aamjVar;
        int i;
        aagn aagnVar = this.c;
        if (aagnVar.l) {
            synchronized (this.c.k) {
                aamjVar = this.i;
                i = this.j;
            }
            if (aamjVar == null) {
                int iD = d();
                synchronized (this.c.k) {
                    aamjVar = this.i;
                    if (aamjVar == null) {
                        aamj aamjVar2 = new aamj(this.a, this.d, this.e, this.f, iD, this.g, this.h, this.b);
                        if (i == this.j) {
                            this.i = aamjVar2;
                        }
                        aamjVar = aamjVar2;
                    }
                }
            }
        } else {
            synchronized (aagnVar.k) {
                aamjVar = this.i;
                if (aamjVar == null) {
                    aamj aamjVar3 = new aamj(this.a, this.d, this.e, this.f, d(), this.g, this.h, this.b);
                    this.i = aamjVar3;
                    aamjVar = aamjVar3;
                }
            }
        }
        return aamjVar;
    }

    public final void c() {
        this.i = null;
        this.j++;
    }
}
