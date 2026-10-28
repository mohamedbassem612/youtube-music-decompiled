package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agwl extends aggd {
    public final agvw a;
    public final Iterator b;
    Object c = null;
    Iterator d = agpr.a.iterator();

    public agwl(agvw agvwVar) {
        this.a = agvwVar;
        this.b = agvwVar.e().iterator();
    }

    @Override // defpackage.aggd
    protected final /* synthetic */ Object a() {
        while (!this.d.hasNext()) {
            ahno.O(!this.d.hasNext());
            Iterator it = this.b;
            if (!it.hasNext()) {
                b();
                return null;
            }
            Object next = it.next();
            this.c = next;
            this.d = this.a.f(next).iterator();
        }
        Object obj = this.c;
        obj.getClass();
        return new agwk(obj, this.d.next());
    }
}
