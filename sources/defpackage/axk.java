package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class axk implements axh {
    private final axj a;

    public axk(axj axjVar) {
        this.a = axjVar;
    }

    @Override // defpackage.axh
    public final boolean a(CharSequence charSequence, int i, int i2) {
        if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
            throw new IllegalArgumentException();
        }
        axj axjVar = this.a;
        if (axjVar == null) {
            return b();
        }
        int iA = axjVar.a(charSequence, 0, i2);
        if (iA == 0) {
            return true;
        }
        if (iA != 1) {
            return b();
        }
        return false;
    }

    protected abstract boolean b();
}
