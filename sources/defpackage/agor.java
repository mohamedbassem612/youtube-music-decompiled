package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class agor implements agof {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ agor(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [agek, java.lang.Object] */
    @Override // defpackage.agof
    public final Object a(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return this.a.apply(obj2);
        }
        if (i == 1) {
            return this.a.apply(obj2);
        }
        return ((agov) this.a).a(obj, (Collection) obj2);
    }
}
