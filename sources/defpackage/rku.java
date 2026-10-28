package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rku implements nwg {
    private final /* synthetic */ int $cid;
    public final Object a;
    public final Object b;
    public final Object c;
    private final Object d;

    public rku(tbt tbtVar, vxe vxeVar, avmb avmbVar, hef hefVar, vxz vxzVar, int i) {
        this.$cid = i;
        tbtVar.getClass();
        vxeVar.getClass();
        avmbVar.getClass();
        hefVar.getClass();
        vxzVar.getClass();
        this.a = tbtVar;
        this.d = avmbVar;
        this.b = hefVar;
        this.c = vxzVar;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        if (this.$cid == 0) {
            return alcq.b;
        }
        aihl aihlVar = apbq.b;
        aihlVar.getClass();
        return aihlVar;
    }

    @Override // defpackage.nrx
    public final /* synthetic */ aslz b() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.nwg
    public final /* synthetic */ avlb c(Object obj, nwf nwfVar) {
        if (this.$cid != 0) {
            apbq apbqVar = (apbq) obj;
            apbqVar.getClass();
            avlb avlbVarN = avlb.n(new hmg(apbqVar, this, 1, null));
            return !awrc.c(Looper.myLooper(), Looper.getMainLooper()) ? avlbVarN.v((avmb) this.d) : avlbVarN;
        }
        alcq alcqVar = (alcq) obj;
        String str = alcqVar.c;
        woz wozVar = (woz) this.a;
        wox woxVar = new wox(wozVar.b, wozVar.c);
        woxVar.e = str;
        return avlb.g(new rkq(this, wozVar.a(woxVar, this.d), alcqVar, 2));
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb d(mew mewVar, nwf nwfVar) {
        return this.$cid != 0 ? nrb.a(this, mewVar, nwfVar) : nrb.a(this, mewVar, nwfVar);
    }

    public rku(woz wozVar, Executor executor, wbz wbzVar, zwb zwbVar, int i) {
        this.$cid = i;
        this.a = wozVar;
        this.d = executor;
        this.b = wbzVar;
        this.c = zwbVar;
    }
}
