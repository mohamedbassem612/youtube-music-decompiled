package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ioj implements acwm {
    final /* synthetic */ boolean a;
    final /* synthetic */ iok b;

    public ioj(iok iokVar, boolean z) {
        this.a = z;
        this.b = iokVar;
    }

    @Override // defpackage.acwm
    public final void b() {
        iok iokVar = this.b;
        boolean z = iokVar.e;
        boolean z2 = this.a;
        if (z) {
            iokVar.b(z2);
        } else {
            iokVar.f = z2;
        }
    }

    @Override // defpackage.acwm
    public final void a() {
    }

    @Override // defpackage.acwm
    public final void c(boolean z) {
    }
}
