package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axfc extends awuq {
    public static final axfc a = new axfc();

    @Override // defpackage.awuq
    public final void a(awou awouVar, Runnable runnable) {
        axex.a.c(runnable, false);
    }

    @Override // defpackage.awuq
    public final awuq e(int i) {
        awrc.ab(i);
        return i < axfb.d ? super.e(i) : this;
    }

    @Override // defpackage.awuq
    public final void i(awou awouVar, Runnable runnable) {
        axex.a.c(runnable, true);
    }

    @Override // defpackage.awuq
    public final String toString() {
        return "Dispatchers.IO";
    }
}
