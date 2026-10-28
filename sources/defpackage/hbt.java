package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hbt extends qr {
    final /* synthetic */ aerj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbt(aerj aerjVar) {
        super(true);
        this.a = aerjVar;
    }

    @Override // defpackage.qr
    public final void b() {
        Object obj = this.a.f;
        if (obj != null) {
            vor vorVar = (vor) obj;
            agev agevVarG = vorVar.b.g();
            if (agevVarG.g()) {
                vorVar.h.a((ajwo) agevVarG.c());
            } else {
                vorVar.t();
            }
        }
    }
}
