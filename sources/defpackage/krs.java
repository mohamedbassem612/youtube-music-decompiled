package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class krs {
    private static krs b;
    private static final krt c = new krt(0, false, false, 0, 0);
    public krt a;

    public static synchronized krs a() {
        krs krsVar;
        krsVar = b;
        if (krsVar == null) {
            krsVar = new krs();
            b = krsVar;
        }
        return krsVar;
    }

    public final synchronized void b(krt krtVar) {
        try {
            if (krtVar == null) {
                krtVar = c;
            } else {
                krt krtVar2 = this.a;
                if (krtVar2 != null) {
                    if (krtVar2.a < krtVar.a) {
                    }
                }
            }
            this.a = krtVar;
        } catch (Throwable th) {
            throw th;
        }
    }
}
