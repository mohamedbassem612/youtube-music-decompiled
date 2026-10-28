package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class adbv {
    private final Object a = new Object();
    private volatile adce b = null;
    private final awmd c;

    public adbv(awmd awmdVar) {
        this.c = awmdVar;
    }

    public final adce a() {
        adce adceVarIo = this.b;
        if (adceVarIo == null) {
            synchronized (this.a) {
                adceVarIo = ((adbu) this.c).io();
                this.b = adceVarIo;
            }
        }
        return adceVarIo;
    }
}
