package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rkr implements nwg {
    final woz a;
    public final wbz b;
    public final zwb c;
    private final Executor d;

    public rkr(woz wozVar, Executor executor, wbz wbzVar, zwb zwbVar) {
        this.a = wozVar;
        this.d = executor;
        this.b = wbzVar;
        this.c = zwbVar;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return ajss.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return a.r();
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb c(Object obj, nwf nwfVar) {
        ajss ajssVar = (ajss) obj;
        String str = ajssVar.c;
        String str2 = ajssVar.d;
        String str3 = ajssVar.f;
        int iBh = a.bh(ajssVar.g);
        if (iBh == 0) {
            iBh = 1;
        }
        woz wozVar = this.a;
        wox woxVar = new wox(wozVar.b, wozVar.c);
        woxVar.a = str;
        woxVar.b = str2;
        woxVar.c = str3;
        woxVar.d = true;
        woxVar.D = iBh;
        return avlb.g(new rkq(this, wozVar.a(woxVar, this.d), ajssVar, 0));
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb d(mew mewVar, nwf nwfVar) {
        return nrb.a(this, mewVar, nwfVar);
    }
}
