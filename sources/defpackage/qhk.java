package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qhk implements qdy {
    final /* synthetic */ aunn a;
    final /* synthetic */ ahey b;
    public final /* synthetic */ qhm c;

    public qhk(qhm qhmVar, aunn aunnVar, ahey aheyVar) {
        this.a = aunnVar;
        this.b = aheyVar;
        this.c = qhmVar;
    }

    @Override // defpackage.qdy
    public final void g(qci qciVar) {
        qhm qhmVar = this.c;
        qhmVar.d.a(3, qciVar.a);
        qhmVar.a();
        long jLongValue = ((Long) this.a.io()).longValue();
        qhmVar.f = this.b.schedule(new plj(this, qciVar, 7, null), jLongValue, TimeUnit.SECONDS);
    }

    @Override // defpackage.qdy
    public final void j(qci qciVar) {
        qhm qhmVar = this.c;
        qhmVar.d.a(4, qciVar.a);
        qhmVar.a();
        qhmVar.e = this.b.schedule(new lph(this, qciVar, 11, (char[]) null), 10L, TimeUnit.SECONDS);
    }
}
