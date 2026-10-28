package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nwn {
    private final Object a = new Object();
    private volatile Object b;

    public final Object a(nwm nwmVar) {
        if (this.b == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    this.b = nwmVar.a();
                }
            }
        }
        return this.b;
    }
}
