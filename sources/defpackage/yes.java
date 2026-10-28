package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yes extends zio {
    private final bye a;

    public yes(acht achtVar) {
        bye byeVarC = c(achtVar);
        Object obj = achtVar.e;
        if (obj != null && ((zjr) achtVar.c).D != zrv.ANDROID_EMBEDDED_PLAYER) {
            jsk jskVar = ((zim) achtVar.a).e;
            if (jskVar == null) {
                byeVarC = ((ynu) obj).a(byeVarC, agpi.a);
            } else {
                byeVarC = ((ynu) obj).a(byeVarC, agke.q(jskVar));
            }
        }
        byeVarC = ((zhl) achtVar.c).i.m(84, 45460427L) ? new yge(byeVarC, c(achtVar), (zjr) achtVar.c) : byeVarC;
        Object obj2 = achtVar.i;
        byeVarC = obj2 != null ? ((ygn) obj2).a(byeVarC, agpi.a) : byeVarC;
        b(byeVarC, (bzg[]) achtVar.b);
        this.a = achtVar.k != null ? new ypn(byeVarC, ((zim) achtVar.a).d) : byeVarC;
    }

    private static void b(bye byeVar, bzg[] bzgVarArr) {
        if (bzgVarArr != null) {
            for (bzg bzgVar : bzgVarArr) {
                byeVar.e(bzgVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, tgv] */
    private static byw c(acht achtVar) {
        Object obj;
        ypm ypmVarW;
        Object obj2;
        zim zimVar = (zim) achtVar.a;
        wiu wiuVar = zimVar.c;
        String str = zimVar.a;
        byl bylVar = new byl();
        bylVar.b = (String) achtVar.g;
        bylVar.a = byw.a;
        bylVar.c = wiuVar.m();
        bylVar.d = wiuVar.n();
        bylVar.e = true;
        bylVar.f = ((zhl) achtVar.c).dv();
        byo byoVarA = bylVar.a();
        b(byoVarA, (bzg[]) achtVar.d);
        ypg ypgVar = new ypg(byoVarA, achtVar.h);
        return (achtVar.j == null || (obj = achtVar.f) == null || str == null || (ypmVarW = ((hed) obj).w(str)) == null || (obj2 = achtVar.j) == null) ? ypgVar : ((abxv) obj2).k(ypgVar, ypmVarW);
    }

    @Override // defpackage.zio
    public final bye a() {
        return this.a;
    }
}
