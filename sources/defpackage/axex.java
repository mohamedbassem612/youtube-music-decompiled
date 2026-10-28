package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axex extends axey {
    public static final axex a = new axex();

    private axex() {
        super(axfb.c, axfb.d, axfb.e, axfb.a);
    }

    @Override // defpackage.axey, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.awuq
    public final awuq e(int i) {
        awrc.ab(i);
        return i < axfb.c ? super.e(i) : this;
    }

    @Override // defpackage.awuq
    public final String toString() {
        return "Dispatchers.Default";
    }
}
