package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aupo implements aupn, aunn {
    public static final aupo a = new aupo(null);
    public final Object b;

    public aupo(Object obj) {
        this.b = obj;
    }

    public static aupn b(Object obj) {
        obj.getClass();
        return new aupo(obj);
    }

    public static aupn c(Object obj) {
        return obj == null ? a : new aupo(obj);
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        return this.b;
    }
}
