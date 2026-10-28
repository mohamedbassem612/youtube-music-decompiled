package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acty implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ acty(acuc acucVar, abnl abnlVar, abnp abnpVar, String str, int i, int i2) {
        this.$cid = i2;
        this.b = acucVar;
        this.c = abnlVar;
        this.d = abnpVar;
        this.e = str;
        this.a = i;
    }

    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        if (this.$cid == 0) {
            int i = this.a;
            Object obj2 = this.e;
            Object obj3 = this.d;
            return ((acuc) this.b).i((abnl) this.c, (abnp) obj3, (String) obj2, true, i);
        }
        if (((Boolean) obj).booleanValue() || this.a == 4) {
            return aher.a;
        }
        Object obj4 = this.b;
        Object obj5 = this.c;
        Object obj6 = this.d;
        oip oipVar = (oip) obj6;
        return ((xgg) this.e).t(oipVar, (oin) obj5, (oiz) obj4, oipVar.l);
    }

    public /* synthetic */ acty(xgg xggVar, int i, oip oipVar, oin oinVar, oiz oizVar, int i2) {
        this.$cid = i2;
        this.e = xggVar;
        this.a = i;
        this.d = oipVar;
        this.c = oinVar;
        this.b = oizVar;
    }
}
