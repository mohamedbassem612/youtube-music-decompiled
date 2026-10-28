package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aawk {
    public final tre a;
    public final avmm b;
    private final boolean c;
    private final boolean d;

    public aawk(tqj tqjVar, tre treVar) {
        this.c = treVar.h.b() == 0;
        int i = tqr.a;
        this.d = tqjVar.k(1073829228);
        this.a = treVar;
        this.b = new avmm();
    }

    public final void a(avlh avlhVar, avlh avlhVar2) {
        if (this.c) {
            avmm avmmVar = this.b;
            avmmVar.c(avlhVar2.al(new aawi(this, 6), new jop(19)));
            avmmVar.c(avlhVar.p().W(new vvb(new aawe(12), 8)).al(new aawi(this, 7), new jop(19)));
            if (this.d) {
                avmmVar.c(avlhVar.p().W(new vvb(new aakt(12), 8)).al(new zgd(this, 17), new jop(19)));
                avmmVar.c(avlhVar.p().W(new vvb(new aakt(13), 8)).al(new zgd(this, 18), new jop(19)));
            }
            this.a.h.d().F(new isg(this, 5), new jop(19));
        }
    }
}
