package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class axb implements axo {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public axb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.axo
    public final /* synthetic */ void accept(Object obj) {
        if (this.$cid != 0) {
            aami aamiVar = (aami) obj;
            if (aamiVar == null) {
                aamiVar = new aami(-3);
            }
            ((eol) this.a).E(aamiVar);
            return;
        }
        aami aamiVar2 = (aami) obj;
        synchronized (axc.c) {
            aha ahaVar = axc.d;
            Object obj2 = this.a;
            ArrayList arrayList = (ArrayList) ahaVar.get(obj2);
            if (arrayList != null) {
                ahaVar.remove(obj2);
                for (int i = 0; i < arrayList.size(); i++) {
                    ((axo) arrayList.get(i)).accept(aamiVar2);
                }
            }
        }
    }
}
