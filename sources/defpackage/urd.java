package defpackage;

import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class urd {
    public static final auai a;
    public static final auai b;
    public static final auai c;
    public static final auai d;
    public final int e;
    public final int f;
    public final int g;
    public final uqp h;
    public final Size i;

    static {
        aihf aihfVarCreateBuilder = auai.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        auai auaiVar = (auai) aihfVarCreateBuilder.instance;
        auaiVar.c = 4;
        auaiVar.b |= 1;
        a = (auai) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = auai.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        auai auaiVar2 = (auai) aihfVarCreateBuilder2.instance;
        auaiVar2.c = 5;
        auaiVar2.b |= 1;
        b = (auai) aihfVarCreateBuilder2.build();
        aihf aihfVarCreateBuilder3 = auai.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        auai auaiVar3 = (auai) aihfVarCreateBuilder3.instance;
        auaiVar3.c = 2;
        auaiVar3.b |= 1;
        c = (auai) aihfVarCreateBuilder3.build();
        aihf aihfVarCreateBuilder4 = auai.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        auai auaiVar4 = (auai) aihfVarCreateBuilder4.instance;
        auaiVar4.c = 3;
        auaiVar4.b |= 1;
        d = (auai) aihfVarCreateBuilder4.build();
    }

    public urd(uqp uqpVar, uqm uqmVar, Size size) {
        this.h = uqo.a(uqpVar, size);
        this.i = size;
        int i = uqpVar.b;
        this.g = i;
        this.f = uqpVar.c;
        this.e = Math.max(uqmVar.a, i);
    }
}
