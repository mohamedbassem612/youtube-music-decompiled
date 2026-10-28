package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afuo implements afvn {
    public final /* synthetic */ afvn a;
    public final /* synthetic */ afvn b;
    public final /* synthetic */ afvl c;

    public /* synthetic */ afuo(afvn afvnVar, afvn afvnVar2, afvl afvlVar) {
        this.a = afvnVar;
        this.b = afvnVar2;
        this.c = afvlVar;
    }

    @Override // defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        afvn afvnVar = this.b;
        if (afvnVar != null) {
            afvnVar.close();
        }
        afty.d(this.c);
    }
}
