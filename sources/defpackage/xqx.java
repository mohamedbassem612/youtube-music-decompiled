package defpackage;

import j$.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xqx implements xyz {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xqx(xql xqlVar, int i) {
        this.$cid = i;
        this.a = xqlVar;
    }

    @Override // defpackage.xyz
    public final void a() {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            xqz xqzVar = (xqz) obj;
            xqzVar.n.execute(afwl.i(new xoy(this, xqzVar.a(), 2, null)));
        } else {
            xql xqlVar = (xql) obj;
            List list = xqlVar.d;
            if (Collection.EL.stream(list).anyMatch(new xdn(9))) {
                xqlVar.i.kk(list);
            }
        }
    }

    public xqx(xqz xqzVar, int i) {
        this.$cid = i;
        this.a = xqzVar;
    }

    @Override // defpackage.xyz
    public final /* synthetic */ void b() {
    }
}
