package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnp implements awzc {
    final /* synthetic */ awzc a;
    final /* synthetic */ dmq b;
    final /* synthetic */ awqg c;

    public dnp(awzc awzcVar, dmq dmqVar, awqg awqgVar) {
        this.a = awzcVar;
        this.b = dmqVar;
        this.c = awqgVar;
    }

    @Override // defpackage.awzc
    public final Object collect(awzd awzdVar, awoq awoqVar) {
        Object objCollect = this.a.collect(new dno(awzdVar, this.b, this.c), awoqVar);
        return objCollect != awox.a ? awmy.a : objCollect;
    }
}
