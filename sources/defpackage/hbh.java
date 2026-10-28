package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class hbh implements avnd {
    private final Bitmap a;
    private final wby b;
    private final String c;
    private final iwm d;

    public hbh(Bitmap bitmap, wby wbyVar, iwm iwmVar, anyh anyhVar) {
        this.a = bitmap;
        this.b = wbyVar;
        this.d = iwmVar;
        this.c = anyhVar.f;
    }

    @Override // defpackage.avnd
    public final void a() {
        iwl iwlVarA = this.d.a(this.a);
        auiu auiuVar = iwlVarA.f;
        String str = this.c;
        wer werVarE = this.b.e();
        anme anmeVarE = anmg.e(str);
        anmeVarE.am(a.bw(auiuVar));
        anmeVarE.an(a.bw(iwlVarA.e));
        werVarE.m(anmeVarE);
        werVarE.b();
    }
}
