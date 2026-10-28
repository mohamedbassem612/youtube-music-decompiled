package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zjh {
    public static final akxc a;
    private final agfr b;
    private final Random c = new Random();

    static {
        aihf aihfVarCreateBuilder = akxc.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar = (akxc) aihfVarCreateBuilder.instance;
        akxcVar.b |= 1;
        akxcVar.c = 1000;
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar2 = (akxc) aihfVarCreateBuilder.instance;
        akxcVar2.b |= 4;
        akxcVar2.e = 5000;
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar3 = (akxc) aihfVarCreateBuilder.instance;
        akxcVar3.b |= 2;
        akxcVar3.d = 2.0f;
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar4 = (akxc) aihfVarCreateBuilder.instance;
        akxcVar4.b |= 8;
        akxcVar4.f = 0.0f;
        a = (akxc) aihfVarCreateBuilder.build();
    }

    public zjh(agfr agfrVar) {
        this.b = new yyp(agfrVar, 6);
    }

    public final int a(int i) {
        akxc akxcVar = (akxc) this.b.io();
        double dMin = Math.min(akxcVar.e, ((double) akxcVar.c) * Math.pow(akxcVar.d, Math.max(0, i - 1)));
        float fNextFloat = akxcVar.f * (this.c.nextFloat() - 0.5f);
        return Math.min(akxcVar.e, (int) (dMin + Math.round(((double) (fNextFloat + fNextFloat)) * dMin)));
    }
}
