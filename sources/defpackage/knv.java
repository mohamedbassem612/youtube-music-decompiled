package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class knv {
    private int e;
    public final afv b = new afv();
    private final afv d = new afv();
    public final kjc c = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
    private boolean f = false;
    public final afv a = new afv();

    public knv(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            knd kndVar = (knd) it.next();
            knu knuVarX = kndVar.x();
            this.a.put(knuVarX, null);
            this.b.put(knuVarX, kndVar);
        }
        this.e = this.a.d;
    }

    public final void a(knu knuVar, klo kloVar, String str) {
        afv afvVar = this.a;
        afvVar.put(knuVar, kloVar);
        afv afvVar2 = this.d;
        afvVar2.put(knuVar, str);
        this.e--;
        if (!kloVar.d()) {
            this.f = true;
        }
        if (this.e == 0) {
            if (this.f) {
                this.c.w(new kmw(afvVar));
            } else {
                this.c.x(afvVar2);
            }
            this.b.clear();
        }
    }
}
