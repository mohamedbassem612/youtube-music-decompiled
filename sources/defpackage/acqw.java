package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acqw implements acrm {
    final /* synthetic */ acqx a;

    public acqw(acqx acqxVar) {
        this.a = acqxVar;
    }

    @Override // defpackage.acrm
    public final void a() {
        acqz acqzVar = this.a.b;
        int i = acqzVar.Q;
        acqh acqhVar = acqzVar.ag;
        if (acqhVar == null || acqhVar.b(i) != 10001 || i <= 0) {
            return;
        }
        int i2 = i - 1;
        acqzVar.Q = i2;
        acqzVar.y.aj(i2);
    }

    @Override // defpackage.acrm
    public final void b() {
    }
}
