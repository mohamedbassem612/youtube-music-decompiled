package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aesc {
    public final aess a;
    public final tqj b;
    public final awmd c;
    public final awmd f;
    public final awmd g;
    public int h;
    public aihf j;
    private int k;
    public long e = 0;
    public long i = -1;
    public final Queue d = new ArrayDeque();

    public aesc(aess aessVar, awmd awmdVar, tqj tqjVar, awmd awmdVar2, awmd awmdVar3) {
        this.a = aessVar;
        this.b = tqjVar;
        this.c = awmdVar;
        this.k = Math.min(10, ((trl) aessVar.e).c(330, 0, 5));
        this.f = awmdVar2;
        this.g = awmdVar3;
    }

    final void a(long j) {
        aihf aihfVar = this.j;
        if (aihfVar != null) {
            ajef ajefVar = ((ajeb) aihfVar.instance).r;
            if (ajefVar == null) {
                ajefVar = ajef.a;
            }
            aihf builder = ajefVar.toBuilder();
            aihf aihfVarCreateBuilder = ajee.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ajee ajeeVar = (ajee) aihfVarCreateBuilder.instance;
            ajeeVar.b |= 1;
            ajeeVar.c = j;
            ajee ajeeVar2 = (ajee) aihfVarCreateBuilder.build();
            builder.copyOnWrite();
            ajef ajefVar2 = (ajef) builder.instance;
            ajeeVar2.getClass();
            aiie aiieVar = ajefVar2.d;
            if (!aiieVar.c()) {
                ajefVar2.d = aihn.mutableCopy(aiieVar);
            }
            ajefVar2.d.add(ajeeVar2);
            ajef ajefVar3 = (ajef) builder.build();
            aihfVar.copyOnWrite();
            ajeb ajebVar = (ajeb) aihfVar.instance;
            ajefVar3.getClass();
            ajebVar.r = ajefVar3;
            ajebVar.b |= 32768;
        }
    }

    final void b() {
        aihf aihfVar = this.j;
        if (aihfVar != null) {
            e(aihfVar, ((ajeb) aihfVar.instance).l);
        }
    }

    final void c(long j, int i) {
        aihf aihfVar = this.j;
        if (aihfVar != null) {
            f(aihfVar, j, i == 2, false, i == 1);
        }
    }

    final void d(aihf aihfVar) {
        if (this.k > 0) {
            aihfVar.copyOnWrite();
            ajeb ajebVar = (ajeb) aihfVar.instance;
            ajeb ajebVar2 = ajeb.a;
            ajebVar.b |= 1;
            ajebVar.c = true;
            this.k--;
            int i = aerx.a;
            xeu xeuVar = (xeu) this.c.io();
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVar.build(), alot.ANR_DETECTION);
                xffVarA.h = ((ajeb) aihfVar.instance).l;
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else if (((ztn) this.g.io()).a()) {
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                ajeb ajebVar3 = (ajeb) aihfVar.build();
                ajebVar3.getClass();
                alouVar.d = ajebVar3;
                alouVar.c = 161;
                long j = ((ajeb) aihfVar.instance).l;
                alosVar.copyOnWrite();
                alou alouVar2 = (alou) alosVar.instance;
                alouVar2.b |= 1;
                alouVar2.e = j;
                xeuVar.b((alou) alosVar.build());
            } else {
                alos alosVar2 = (alos) alou.a.createBuilder();
                alosVar2.copyOnWrite();
                alou alouVar3 = (alou) alosVar2.instance;
                ajeb ajebVar4 = (ajeb) aihfVar.build();
                ajebVar4.getClass();
                alouVar3.d = ajebVar4;
                alouVar3.c = 161;
                xeuVar.c((alou) alosVar2.build(), ((ajeb) aihfVar.instance).l);
            }
        }
        afba.S(aewo.k(this.a, ((ajeb) aihfVar.instance).l));
    }

    final void e(aihf aihfVar, long j) {
        ajeb ajebVar = (ajeb) aihfVar.build();
        String.valueOf(ajebVar);
        int i = aerx.a;
        File fileK = aewo.k(this.a, j);
        aesv aesvVar = aesv.ANR;
        afba.V(ajebVar, fileK);
    }

    public final void f(aihf aihfVar, long j, boolean z, boolean z2, boolean z3) {
        int iMin = (int) Math.min(j, 2147483647L);
        aihfVar.copyOnWrite();
        ajeb ajebVar = (ajeb) aihfVar.instance;
        ajeb ajebVar2 = ajeb.a;
        ajebVar.b |= 2;
        ajebVar.d = iMin;
        if (z) {
            int i = aerx.a;
            int iMin2 = (int) Math.min(j, 2147483647L);
            aihfVar.copyOnWrite();
            ajeb ajebVar3 = (ajeb) aihfVar.instance;
            ajebVar3.b |= 16;
            ajebVar3.g = iMin2;
        }
        tqj tqjVar = this.b;
        int i2 = tqr.a;
        if (tqjVar.k(1073808300) && z2) {
            arbk arbkVar = ((ajeb) aihfVar.instance).u;
            if (arbkVar == null) {
                arbkVar = arbk.a;
            }
            aihf builder = arbkVar.toBuilder();
            builder.copyOnWrite();
            arbk arbkVar2 = (arbk) builder.instance;
            arbkVar2.b |= 2;
            arbkVar2.c = true;
            aihfVar.copyOnWrite();
            ajeb ajebVar4 = (ajeb) aihfVar.instance;
            arbk arbkVar3 = (arbk) builder.build();
            arbkVar3.getClass();
            ajebVar4.u = arbkVar3;
            ajebVar4.b |= 131072;
        }
        aihfVar.copyOnWrite();
        ajeb ajebVar5 = (ajeb) aihfVar.instance;
        ajebVar5.b |= 65536;
        ajebVar5.t = z3;
    }
}
