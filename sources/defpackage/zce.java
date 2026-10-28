package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zce {
    public final zcf a;
    public final twp b;

    public zce(twp twpVar, zcf zcfVar) {
        this.b = twpVar;
        this.a = zcfVar;
    }

    public static zce a(bss bssVar) {
        bsp bspVar = bssVar.c;
        if (bspVar == null) {
            return null;
        }
        Object obj = bspVar.h;
        if (obj instanceof zce) {
            return (zce) obj;
        }
        return null;
    }

    public static zcf b(bss bssVar) {
        zce zceVarA = a(bssVar);
        if (zceVarA == null) {
            return null;
        }
        return zceVarA.a;
    }

    public static zcf c(btm btmVar) {
        return b(btmVar.d);
    }

    public static twp d(btm btmVar) {
        zce zceVarA = a(btmVar.d);
        if (zceVarA == null) {
            return null;
        }
        return zceVarA.b;
    }
}
