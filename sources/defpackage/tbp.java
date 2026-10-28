package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tbp implements awmd {
    private final awmd a;
    private final boolean b;
    private Object c;

    public tbp(awmd awmdVar, boolean z) {
        this.b = z;
        this.a = awmdVar;
        if (z) {
            return;
        }
        this.c = b();
    }

    private final Object b() {
        return this.a.io();
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        return this.b ? b() : this.c;
    }
}
