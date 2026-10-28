package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auwb implements agfr {
    public static final auwb a = new auwb();
    private final agfr b = new agfu(new auwd());

    public static boolean c() {
        return a.io().a();
    }

    public static boolean d() {
        return a.io().b();
    }

    @Override // defpackage.agfr
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final auwc io() {
        return (auwc) ((agfu) this.b).a;
    }
}
