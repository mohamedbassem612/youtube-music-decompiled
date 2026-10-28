package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kon implements kpu {
    public final kmt a;
    public final knu b;
    public final /* synthetic */ koq e;
    public krc f = null;
    public Set c = null;
    public boolean d = false;

    public kon(koq koqVar, kmt kmtVar, knu knuVar) {
        this.e = koqVar;
        this.a = kmtVar;
        this.b = knuVar;
    }

    @Override // defpackage.kpu
    public final void a(klo kloVar) {
        this.e.q.post(new ihq(this, kloVar, 8, (char[]) null));
    }

    public final void b(klo kloVar) {
        kol kolVar = (kol) this.e.k.get(this.b);
        if (kolVar != null) {
            kolVar.l(kloVar);
        }
    }

    public final void c() {
        krc krcVar;
        if (!this.d || (krcVar = this.f) == null) {
            return;
        }
        this.a.z(krcVar, this.c);
    }
}
