package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vum {
    public static final xgz a = new xgj(xhb.b(96494));
    public final avlh b;
    public final vtm c;
    public tyy d = new aavp(1);
    public final vwt e;

    public vum(abwk abwkVar, vtm vtmVar, vwt vwtVar) {
        this.c = vtmVar;
        this.b = ((avlh) abwkVar.c).x(new jna(17)).H(new tfk(19));
        this.e = vwtVar;
    }

    public static amdd a(vun vunVar) {
        int i;
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amdb.a.createBuilder();
        int iOrdinal = vunVar.ordinal();
        if (iOrdinal != 0) {
            i = 2;
            if (iOrdinal != 1 && iOrdinal != 2) {
                if (iOrdinal == 3) {
                    i = 4;
                } else {
                    if (iOrdinal != 4) {
                        throw new RuntimeException(null, null);
                    }
                    i = 6;
                }
            }
        } else {
            i = 5;
        }
        aihfVarCreateBuilder2.copyOnWrite();
        amdb amdbVar = (amdb) aihfVarCreateBuilder2.instance;
        amdbVar.c = i - 1;
        amdbVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amdb amdbVar2 = (amdb) aihfVarCreateBuilder2.build();
        amdbVar2.getClass();
        amddVar.t = amdbVar2;
        amddVar.c |= 65536;
        return (amdd) aihfVarCreateBuilder.build();
    }
}
