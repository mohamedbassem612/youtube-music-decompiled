package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uxs extends tmn {
    final /* synthetic */ String l;
    final /* synthetic */ String m;
    final /* synthetic */ uxt n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxs(uxt uxtVar, String str, tng tngVar, String str2, String str3) {
        super(1, str, tngVar);
        this.l = str2;
        this.m = str3;
        this.n = uxtVar;
    }

    @Override // defpackage.tns
    public final tnx aa(tnm tnmVar) {
        return tnx.e(tnmVar.e());
    }

    @Override // defpackage.tns
    public final Class ab() {
        return byte[].class;
    }

    @Override // defpackage.tns
    public final /* bridge */ /* synthetic */ void ad(Object obj) {
        new uxr(this, this.l, this.m, (byte[]) obj).execute(new Void[0]);
    }
}
