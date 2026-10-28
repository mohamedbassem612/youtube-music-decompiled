package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class aarf {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final vxu d;

    public aarf(vxu vxuVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        this.d = vxuVar;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
    }

    public final aare a(aaml aamlVar, boolean z) {
        if (!((aanb) this.a.io()).b().s().equals("NO_OP_STORE_TAG")) {
            ajvu ajvuVarC = this.d.c();
            if ((ajvuVarC.b & 65536) != 0) {
                aoej aoejVar = ajvuVarC.l;
                if (aoejVar == null) {
                    aoejVar = aoej.a;
                }
                int i = aoejVar.c;
                if (i == 1) {
                    return ((grj) this.b.io()).x(aamlVar);
                }
                if (i == 2) {
                    return ((aard) this.c.io()).a(aamlVar, z);
                }
                if (i == 3) {
                    aare aareVarX = ((grj) this.b.io()).x(aamlVar);
                    ((aard) this.c.io()).a(aamlVar, z);
                    return new aare(aareVarX.a, aareVarX.b, 4, aareVarX.c);
                }
            }
        }
        return null;
    }
}
