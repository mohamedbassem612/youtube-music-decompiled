package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ahsq implements lot {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ahsq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ktg] */
    @Override // defpackage.lot
    public final void a(lpa lpaVar) {
        if (this.$cid != 0) {
            this.b.a(kyr.d((Context) ((kyr) this.a).b, lpaVar));
        } else {
            ((ahsr) this.a).e((Intent) this.b);
        }
    }
}
