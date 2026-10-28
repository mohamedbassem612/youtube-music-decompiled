package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class drr extends dsb {
    final /* synthetic */ Object a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ Object c;
    final /* synthetic */ ArrayList d;
    final /* synthetic */ drt e;

    public drr(drt drtVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = drtVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // defpackage.dsb, defpackage.drx
    public final void b(dsa dsaVar) {
        dsaVar.F(this);
    }

    @Override // defpackage.dsb, defpackage.drx
    public final void f() {
        Object obj = this.a;
        if (obj != null) {
            this.e.g(obj, this.b, (ArrayList) null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            this.e.g(obj2, this.d, (ArrayList) null);
        }
    }
}
