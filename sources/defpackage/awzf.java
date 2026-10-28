package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class awzf {
    public static final awqg a = new xzn(18);
    private static final awqk b = new jnk(7);

    public static final awzc a(awzc awzcVar) {
        if (awzcVar instanceof axat) {
            return awzcVar;
        }
        boolean z = awzcVar instanceof awza;
        awqg awqgVar = a;
        awqk awqkVar = b;
        if (z) {
            awza awzaVar = (awza) awzcVar;
            if (awzaVar.a == awqgVar && awzaVar.b == awqkVar) {
                return awzcVar;
            }
        }
        return new awza(awzcVar, awqgVar, awqkVar);
    }
}
