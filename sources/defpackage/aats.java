package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aats implements zgx {
    private final /* synthetic */ int $cid;
    final /* synthetic */ aatt a;

    public aats(aatt aattVar, int i) {
        this.$cid = i;
        this.a = aattVar;
    }

    @Override // defpackage.zgx
    public final void c(long j) {
        int i = this.$cid;
        if (i == 0) {
            this.a.f = j;
            return;
        }
        aatt aattVar = this.a;
        if (i == 1) {
            aattVar.e = j;
        } else if (i != 2) {
            aattVar.h = j;
        } else {
            aattVar.g = j;
        }
    }

    @Override // defpackage.zgx
    public final void a(Exception exc) {
    }

    @Override // defpackage.zgx
    public final void b(int i) {
    }
}
