package defpackage;

import android.content.Context;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahvl implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ahvl(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.agfr
    public final Object io() {
        if (this.$cid != 0) {
            return ((LayoutInflater) this.b).cloneInContext((Context) this.a);
        }
        int i = ahvq.d;
        return new qji((qjk) this.a, new glj(this.b, 19));
    }
}
