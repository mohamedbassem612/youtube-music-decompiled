package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agnm extends agnn {
    private final agnn c;

    public agnm(ReferenceQueue referenceQueue, Object obj, int i, agnn agnnVar) {
        super(referenceQueue, obj, i);
        this.c = agnnVar;
    }

    @Override // defpackage.agmn, defpackage.agms
    public final /* synthetic */ agms b() {
        return this.c;
    }
}
