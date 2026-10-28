package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvm extends lxt implements lyq {
    public static final lvm DEFAULT_INSTANCE;
    private static volatile lyu PARSER = null;
    public static final int TYPES_FIELD_NUMBER = 1;
    public lye types_ = lyx.a;

    static {
        lvm lvmVar = new lvm();
        DEFAULT_INSTANCE = lvmVar;
        lxt.E(lvm.class, lvmVar);
    }

    private lvm() {
    }

    public static lxq e() {
        return DEFAULT_INSTANCE.s();
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"types_", lvq.class});
        }
        if (i2 == 3) {
            return new lvm();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final int b() {
        return this.types_.size();
    }

    public final lvq c(int i) {
        return (lvq) this.types_.get(i);
    }

    public final void d() {
        lye lyeVar = this.types_;
        if (lyeVar.c()) {
            return;
        }
        this.types_ = lxt.A(lyeVar);
    }
}
