package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xgx implements xgz {
    public final argn a;

    public xgx(xgt xgtVar, int i, int i2, boolean z, xgz xgzVar, ajva ajvaVar) {
        int iA = xgtVar.a(i);
        aihf aihfVarCreateBuilder = argn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar = (argn) aihfVarCreateBuilder.instance;
        argnVar.b |= 2;
        argnVar.d = i;
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar2 = (argn) aihfVarCreateBuilder.instance;
        argnVar2.b |= 8;
        argnVar2.f = iA;
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar3 = (argn) aihfVarCreateBuilder.instance;
        argnVar3.b |= 4;
        argnVar3.e = i2;
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar4 = (argn) aihfVarCreateBuilder.instance;
        argnVar4.b |= 32;
        argnVar4.h = z;
        if (xgzVar != null) {
            argn argnVar5 = ((xgj) xgzVar).a;
            aihfVarCreateBuilder.copyOnWrite();
            argn argnVar6 = (argn) aihfVarCreateBuilder.instance;
            argnVar5.getClass();
            argnVar6.g = argnVar5;
            argnVar6.b |= 16;
        }
        if (ajvaVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            argn argnVar7 = (argn) aihfVarCreateBuilder.instance;
            argnVar7.i = ajvaVar;
            argnVar7.b |= 64;
        }
        this.a = (argn) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.xgz
    public final amud b() {
        return null;
    }

    @Override // defpackage.xgz
    public final argn c() {
        return this.a;
    }

    public xgx(xgt xgtVar, int i) {
        xgtVar.getClass();
        int iA = xgtVar.a(i);
        aihf aihfVarCreateBuilder = argn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar = (argn) aihfVarCreateBuilder.instance;
        argnVar.b |= 2;
        argnVar.d = i;
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar2 = (argn) aihfVarCreateBuilder.instance;
        argnVar2.b |= 8;
        argnVar2.f = iA;
        this.a = (argn) aihfVarCreateBuilder.build();
    }

    public xgx(argn argnVar) {
        this.a = argnVar;
    }

    public xgx(xgt xgtVar, xhc xhcVar) {
        this(xgtVar, xhcVar.a);
    }

    public xgx(xgt xgtVar, xhc xhcVar, int i, boolean z, xgz xgzVar, ajva ajvaVar) {
        this(xgtVar, xhcVar.a, i, z, xgzVar, ajvaVar);
    }
}
