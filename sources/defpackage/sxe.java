package defpackage;

import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sxe implements Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ sxe(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r2v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final Object get() {
        Object vwtVar;
        int i = this.$cid;
        if (i == 0) {
            vwtVar = new vwt(this.a);
        } else {
            if (i == 1) {
                return (hnz) this.a.io();
            }
            if (i != 2) {
                if (i == 3) {
                    return this.a.e();
                }
                ?? r2 = this.a;
                return i != 4 ? (acyz) r2.io() : (acdx) r2.io();
            }
            heg hegVar = (heg) this.a;
            if (hegVar.a == null) {
                hegVar.a = agpr.a;
            }
            vwtVar = new twj((agkz) hegVar.a);
        }
        return vwtVar;
    }
}
