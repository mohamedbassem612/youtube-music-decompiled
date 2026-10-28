package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rod implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rod(Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        ListenableFuture listenableFutureL;
        int i = this.$cid;
        Object obj2 = this.b;
        if (i != 0) {
            gxg gxgVar = (gxg) obj2;
            jkp jkpVar = gxgVar.d;
            boolean z = this.a;
            jko jkoVarEdit = jkpVar.edit();
            jkoVarEdit.a(gzj.PAUSE_WATCH_HISTORY, z);
            jkoVarEdit.apply();
            gxgVar.b.b(((alyd) obj).c);
            return;
        }
        Boolean bool = (Boolean) obj;
        if (this.a && bool != null && bool.booleanValue()) {
            ((roe) obj2).o.set(false);
            return;
        }
        roe roeVar = (roe) obj2;
        rnp rnpVar = roeVar.b;
        String str = roeVar.c.a;
        omj omjVar = roeVar.p;
        alkk alkkVar = rnpVar.c;
        if (alkkVar == null || !alkkVar.k.containsKey("user_auth_first_time")) {
            listenableFutureL = aher.a;
        } else {
            vxe vxeVar = rnpVar.b;
            ajwo ajwoVar = (ajwo) rnpVar.c.k.get("user_auth_first_time");
            if (ajwoVar == null) {
                throw new IllegalArgumentException();
            }
            vxeVar.a(ajwoVar);
            typ.f(str);
            listenableFutureL = omjVar.L(new rhk(str, 10));
        }
        taf.i(listenableFutureL, roeVar.e, new roc(obj2, 1), new ixb(obj2, 3), null);
    }
}
