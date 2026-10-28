package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wyo implements Runnable {
    public final String a;
    public final Object b;
    public final long c;
    public final long d;
    public ajwo e;
    final /* synthetic */ wyq f;

    public wyo(wyq wyqVar, String str, Object obj, long j, long j2) {
        this.f = wyqVar;
        this.a = str;
        this.b = obj;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wyq wyqVar = this.f;
        wyqVar.b.remove(this.b);
        wyqVar.c.remove(this.a);
    }
}
