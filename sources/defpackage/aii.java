package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aii implements aiq {
    private final /* synthetic */ int $cid;
    public static final aii c = new aii(2);
    public static final aii b = new aii(1);
    public static final aii a = new aii(0);

    private aii(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aiq
    public final boolean a(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return obj == obj2;
        }
        if (i != 1) {
            return awrc.c(obj, obj2);
        }
        return false;
    }

    public final String toString() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? "StructuralEqualityPolicy" : "NeverEqualPolicy";
        }
        return "ReferentialEqualityPolicy";
    }
}
