package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lab extends laq {
    final /* synthetic */ Boolean a;
    final /* synthetic */ lay b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lab(lay layVar, Boolean bool) {
        super(layVar, true);
        this.a = bool;
        this.b = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = this.b.e;
        if (kzjVar == null) {
            throw new NullPointerException("null reference");
        }
        Boolean bool = this.a;
        kzjVar.setMeasurementEnabled(bool.booleanValue(), this.f);
    }
}
