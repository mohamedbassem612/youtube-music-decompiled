package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yqm implements aheh {
    public aqi a;

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        this.a.d(th);
    }

    @Override // defpackage.aheh
    public final void b(Object obj) {
        if (obj != null) {
            this.a.b(obj);
        }
        this.a.d(new NullPointerException());
    }
}
