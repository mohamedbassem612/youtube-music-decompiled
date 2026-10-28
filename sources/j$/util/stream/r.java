package j$.util.stream;

import j$.util.Optional;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class r extends s {
    public static final p c;
    public static final p d;

    static {
        a4 a4Var = a4.REFERENCE;
        c = new p(true, a4Var, Optional.empty(), new n((byte) 4), new n((byte) 5));
        d = new p(false, a4Var, Optional.empty(), new n((byte) 4), new n((byte) 5));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }
}
