package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vgz extends qr {
    final /* synthetic */ vhc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgz(vhc vhcVar) {
        super(true);
        this.a = vhcVar;
    }

    @Override // defpackage.qr
    public final void b() {
        vhc vhcVar = this.a;
        if (vhcVar.D.getVisibility() == 0) {
            vhcVar.D.setVisibility(8);
        } else if (vhcVar.E.getVisibility() == 0) {
            vhcVar.s.a();
        } else {
            vhcVar.k(false, null);
        }
    }
}
