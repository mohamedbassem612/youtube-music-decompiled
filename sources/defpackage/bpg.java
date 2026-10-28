package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class bpg implements Runnable {
    private final boh a;
    private final boa b;
    private boolean c;

    public bpg(boh bohVar, boa boaVar) {
        boaVar.getClass();
        this.a = bohVar;
        this.b = boaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.a.e(this.b);
        this.c = true;
    }
}
