package defpackage;

import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class loc {
    public static final khn a;
    public static final kro b;
    static final kro c;
    public static final kro d;
    public static final kro e;

    static {
        kro kroVar = new kro();
        d = kroVar;
        kro kroVar2 = new kro();
        e = kroVar2;
        lnz lnzVar = new lnz();
        b = lnzVar;
        loa loaVar = new loa();
        c = loaVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        a = new khn("SignIn.API", lnzVar, kroVar);
        new khn("SignIn.INTERNAL_API", loaVar, kroVar2);
    }
}
