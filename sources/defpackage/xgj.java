package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xgj implements xgz {
    public final argn a;
    private final amud b;

    public xgj(aigj aigjVar, amud amudVar) {
        aihf aihfVarCreateBuilder = argn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar = (argn) aihfVarCreateBuilder.instance;
        aigjVar.getClass();
        argnVar.b |= 1;
        argnVar.c = aigjVar;
        this.a = (argn) aihfVarCreateBuilder.build();
        this.b = amudVar;
    }

    public static xgj a(amud amudVar, int i, boolean z) {
        amud amudVar2;
        if (z) {
            aihh aihhVar = (aihh) amudVar.toBuilder();
            aihf aihfVarCreateBuilder = argh.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            argh arghVar = (argh) aihfVarCreateBuilder.instance;
            arghVar.b |= 1;
            arghVar.c = 12L;
            aihhVar.copyOnWrite();
            amud amudVar3 = (amud) aihhVar.instance;
            argh arghVar2 = (argh) aihfVarCreateBuilder.build();
            arghVar2.getClass();
            amudVar3.e = arghVar2;
            amudVar3.c |= 2;
            amudVar2 = (amud) aihhVar.build();
        } else {
            amudVar2 = amudVar;
        }
        aihf aihfVarD = d(amudVar);
        int iAbs = Math.abs(i);
        aihfVarD.copyOnWrite();
        argn argnVar = (argn) aihfVarD.instance;
        argn argnVar2 = argn.a;
        argnVar.b |= 8;
        argnVar.f = iAbs;
        return new xgj((argn) aihfVarD.build(), amudVar2);
    }

    private static aihf d(amud amudVar) {
        argn argnVar = argn.a;
        aihf aihfVarCreateBuilder = argnVar.createBuilder();
        ajuz ajuzVar = amudVar.h;
        if (ajuzVar == null) {
            ajuzVar = ajuz.a;
        }
        if ((ajuzVar.b & 1) != 0) {
            ajuz ajuzVar2 = amudVar.h;
            if (ajuzVar2 == null) {
                ajuzVar2 = ajuz.a;
            }
            int i = ajuzVar2.c;
            aihfVarCreateBuilder.copyOnWrite();
            argn argnVar2 = (argn) aihfVarCreateBuilder.instance;
            argnVar2.b |= 2;
            argnVar2.d = i;
            aihf aihfVarCreateBuilder2 = argnVar.createBuilder();
            aigj aigjVar = amudVar.d;
            aihfVarCreateBuilder2.copyOnWrite();
            argn argnVar3 = (argn) aihfVarCreateBuilder2.instance;
            aigjVar.getClass();
            argnVar3.b |= 1;
            argnVar3.c = aigjVar;
            aihfVarCreateBuilder.copyOnWrite();
            argn argnVar4 = (argn) aihfVarCreateBuilder.instance;
            argn argnVar5 = (argn) aihfVarCreateBuilder2.build();
            argnVar5.getClass();
            argnVar4.g = argnVar5;
            argnVar4.b |= 16;
            if ((ajuzVar2.b & 2) != 0) {
                int i2 = ajuzVar2.d;
                aihfVarCreateBuilder.copyOnWrite();
                argn argnVar6 = (argn) aihfVarCreateBuilder.instance;
                argnVar6.b |= 8;
                argnVar6.f = i2;
            }
            if ((ajuzVar2.b & 4) != 0) {
                int i3 = ajuzVar2.e;
                aihfVarCreateBuilder.copyOnWrite();
                argn argnVar7 = (argn) aihfVarCreateBuilder.instance;
                argnVar7.b |= 4;
                argnVar7.e = i3;
            }
            if ((ajuzVar2.b & 8) != 0) {
                ajva ajvaVar = ajuzVar2.f;
                if (ajvaVar == null) {
                    ajvaVar = ajva.a;
                }
                aihfVarCreateBuilder.copyOnWrite();
                argn argnVar8 = (argn) aihfVarCreateBuilder.instance;
                ajvaVar.getClass();
                argnVar8.i = ajvaVar;
                argnVar8.b |= 64;
            }
        } else {
            aigj aigjVar2 = amudVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            argn argnVar9 = (argn) aihfVarCreateBuilder.instance;
            aigjVar2.getClass();
            argnVar9.b |= 1;
            argnVar9.c = aigjVar2;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.xgz
    public final amud b() {
        return this.b;
    }

    @Override // defpackage.xgz
    public final argn c() {
        return this.a;
    }

    public final String toString() {
        argn argnVar = this.a;
        return getClass().getSimpleName() + ": " + String.valueOf(argnVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xgj(xhc xhcVar) {
        aihf aihfVarCreateBuilder = argn.a.createBuilder();
        int i = xhcVar.a;
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar = (argn) aihfVarCreateBuilder.instance;
        argnVar.b |= 2;
        argnVar.d = i;
        this((argn) aihfVarCreateBuilder.build(), (amud) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xgj(byte[] bArr) {
        this(aigj.H(bArr, 0, bArr.length), (amud) null);
        aigj aigjVar = aigj.d;
        try {
        } catch (aiik e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public xgj(argn argnVar, amud amudVar) {
        this.a = argnVar;
        this.b = amudVar;
    }

    public xgj(amud amudVar) {
        if (amudVar == null) {
            this.a = argn.a;
            this.b = null;
        } else {
            this.a = (argn) d(amudVar).build();
            this.b = amudVar;
        }
    }
}
