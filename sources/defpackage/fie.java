package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fie extends fip {
    public final List a;

    protected fie(fip fipVar, fip fipVar2) {
        super(null, -1, null);
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(fipVar);
        arrayList.add(fipVar2);
    }

    @Override // defpackage.fip, defpackage.fil
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a((fip) obj);
    }

    @Override // defpackage.fip
    /* JADX INFO: renamed from: c */
    public final boolean a(fip fipVar) {
        if (this == fipVar) {
            return true;
        }
        if (fipVar != null) {
            if (fipVar.getClass() == getClass()) {
                List list = ((fie) fipVar).a;
                List list2 = this.a;
                int size = list2.size();
                if (size == list.size()) {
                    for (int i = 0; i < size; i++) {
                        if (((fip) list2.get(i)).a((fip) list.get(i))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.fip
    public final void gK(Object obj) {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((fip) list.get(i)).gK(obj);
        }
    }
}
