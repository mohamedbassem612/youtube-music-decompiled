package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agnp extends agnq {
    private final agnq c;

    public agnp(ReferenceQueue referenceQueue, Object obj, int i, agnq agnqVar) {
        super(referenceQueue, obj, i);
        this.c = agnqVar;
    }

    @Override // defpackage.agmn, defpackage.agms
    public final /* synthetic */ agms b() {
        return this.c;
    }
}
