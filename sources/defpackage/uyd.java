package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uyd extends uhv {
    private final uye b;

    public uyd(cc ccVar, uye uyeVar) {
        super(ccVar, true);
        this.b = uyeVar;
    }

    @Override // defpackage.uhv
    public final void d() {
        uye uyeVar = this.b;
        if (uyeVar.b.A()) {
            uyeVar.a.u(false);
        }
    }

    @Override // defpackage.uhv
    protected final void g() {
        uye uyeVar = this.b;
        uyeVar.a().setOnTouchListener(uyeVar);
    }

    @Override // defpackage.uhv
    protected final void iX() {
        uye uyeVar = this.b;
        uyeVar.a().setOnTouchListener(null);
        if (uyeVar.b.A()) {
            return;
        }
        uyeVar.a.u(false);
    }
}
