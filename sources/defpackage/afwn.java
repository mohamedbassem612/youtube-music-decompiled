package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwn {
    public final afvl a;

    public afwn(afvl afvlVar) {
        this.a = afvlVar;
    }

    public static afwn b() {
        return new afwn(afty.c(false));
    }

    public static void c(afwn afwnVar) {
        afty.e((afvh) afty.d.get(), afwnVar.a);
    }

    public static afwn d() {
        return new afwn(((afvh) afty.d.get()).c);
    }

    public final afvn a() {
        afvl afvlVar = this.a;
        afvl afvlVarB = afty.b();
        afty.d(afvlVar);
        return new afta((Object) afvlVarB, 3);
    }

    public final String toString() {
        afvl afvlVar = this.a;
        return afvlVar == null ? "null ref" : afvlVar.toString();
    }
}
