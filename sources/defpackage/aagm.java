package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aagm {
    public List a;
    final /* synthetic */ aagn b;
    public aaok c;
    private final aamq d;
    private final List e;
    private final aogf f;

    public aagm(aagn aagnVar, aamq aamqVar, List list, List list2, aogf aogfVar) {
        this.b = aagnVar;
        this.d = aamqVar;
        list.getClass();
        this.e = list;
        this.a = list2;
        this.f = aogfVar;
    }

    public final aaok a() {
        aaok aaokVar;
        synchronized (this.b.k) {
            aaokVar = this.c;
            if (aaokVar == null) {
                aaokVar = new aaok(this.d, this.e, this.a, this.f);
                this.c = aaokVar;
            }
        }
        return aaokVar;
    }
}
