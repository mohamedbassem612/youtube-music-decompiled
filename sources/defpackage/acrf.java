package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acrf implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ acrf(acrn acrnVar, acrk acrkVar, boolean z, boolean z2, int i) {
        this.$cid = i;
        this.c = acrnVar;
        this.d = acrkVar;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        if (this.$cid != 0) {
            if (this.a && !this.b) {
                return ahng.n(agpn.b);
            }
            return ((olp) this.c).m.m((oip) this.d);
        }
        Throwable th = (Throwable) obj;
        boolean z = this.b;
        ((acrn) this.c).a(th, (acrk) this.d, this.a, z);
        return ahng.m(th);
    }

    public /* synthetic */ acrf(olp olpVar, boolean z, boolean z2, oip oipVar, int i) {
        this.$cid = i;
        this.c = olpVar;
        this.a = z;
        this.b = z2;
        this.d = oipVar;
    }
}
