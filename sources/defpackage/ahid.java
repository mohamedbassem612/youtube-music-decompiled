package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahid extends RuntimeException {
    public ahid(Throwable th) {
        super(th);
    }

    public static Object a(ahic ahicVar) {
        try {
            return ahicVar.a();
        } catch (Exception e) {
            throw new ahid(e);
        }
    }
}
