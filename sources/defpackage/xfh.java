package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xfh {
    public akzk a;
    private final int b;
    private final int c;

    public xfh(int i, int i2) {
        this.c = i2;
        this.b = i;
    }

    public final aihf a() {
        aihf aihfVarCreateBuilder = akzj.a.createBuilder();
        aihf aihfVarCreateBuilder2 = akzl.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        akzl akzlVar = (akzl) aihfVarCreateBuilder2.instance;
        akzlVar.b |= 2;
        akzlVar.d = this.b;
        aihfVarCreateBuilder2.copyOnWrite();
        akzl akzlVar2 = (akzl) aihfVarCreateBuilder2.instance;
        akzlVar2.c = this.c - 1;
        akzlVar2.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        akzj akzjVar = (akzj) aihfVarCreateBuilder.instance;
        akzl akzlVar3 = (akzl) aihfVarCreateBuilder2.build();
        akzlVar3.getClass();
        akzjVar.d = akzlVar3;
        akzjVar.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        akzj akzjVar2 = (akzj) aihfVarCreateBuilder.instance;
        akzjVar2.b |= 16;
        akzjVar2.g = 0;
        akzk akzkVar = this.a;
        if (akzkVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            akzj akzjVar3 = (akzj) aihfVarCreateBuilder.instance;
            akzjVar3.e = akzkVar;
            akzjVar3.b |= 4;
        }
        return aihfVarCreateBuilder;
    }
}
