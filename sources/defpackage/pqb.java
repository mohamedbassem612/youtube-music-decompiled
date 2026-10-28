package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pqb implements aheh {
    final /* synthetic */ pqc a;
    final /* synthetic */ long b;
    final /* synthetic */ String c;
    final /* synthetic */ ppw d;

    public pqb(pqc pqcVar, long j, String str, ppw ppwVar) {
        this.a = pqcVar;
        this.b = j;
        this.c = str;
        this.d = ppwVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        th.getClass();
        ((agsj) ((agsj) pqc.a.c()).j(th)).E("Failed to schedule a job for package [%s] with ID: %s, type: %s via WorkManager", this.a.b.getApplicationContext().getPackageName(), this.c, Integer.valueOf(this.d.a()));
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((dzj) obj).getClass();
        this.d.a();
        this.a.c(this.b);
    }
}
