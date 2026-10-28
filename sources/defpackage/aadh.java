package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aadh implements sxu {
    final /* synthetic */ aadk a;

    public aadh(aadk aadkVar) {
        this.a = aadkVar;
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        List list = (List) obj2;
        if (list == null || list.isEmpty()) {
            return;
        }
        aadk aadkVar = this.a;
        ((aari) aadkVar.f.io()).e(aadkVar.d);
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
    }
}
