package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btd {
    public static final /* synthetic */ int b = 0;
    public final bsb a;

    static {
        int i = btc.a;
        btc.a(new aerz(null, null));
        int i2 = bwp.a;
    }

    public btd(bsb bsbVar) {
        this.a = bsbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof btd) {
            return this.a.equals(((btd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
