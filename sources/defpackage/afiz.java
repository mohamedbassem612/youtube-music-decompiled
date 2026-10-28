package defpackage;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afiz {
    public static final afqw a = new afqw(1);
    public static final afqw b = new afqw(2);
    private final affd c;
    private final ahex d;
    private final auor e;

    public afiz(auor auorVar, affd affdVar, ahex ahexVar) {
        this.e = auorVar;
        this.c = affdVar;
        this.d = ahexVar;
        ahno.P(affdVar.a != -1, "Account Id is invalid");
    }

    public static String a(affd affdVar) {
        return "accounts" + File.separator + affdVar.a;
    }

    public final abhh b(afqw afqwVar, String str) {
        return new abhh(new jij(afqwVar, this.e, a(this.c) + File.separator + str, (byte[]) null), this.d, (char[]) null);
    }
}
