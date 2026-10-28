package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ti extends vm {
    final uz a;
    private ss b;

    public ti(uz uzVar, List list, List list2, List list3) {
        super((byte[]) null);
        this.a = uzVar;
        azs.l(list);
        azs.l(list2);
        DesugarCollections.unmodifiableList(list2);
        if (list3 != null) {
            DesugarCollections.unmodifiableList(list3);
        } else {
            List list4 = Collections.EMPTY_LIST;
        }
    }

    public final ss a() {
        ss ssVar = this.b;
        if (ssVar != null) {
            return ssVar;
        }
        ss ssVar2 = new ss(this.a);
        this.b = ssVar2;
        return ssVar2;
    }
}
