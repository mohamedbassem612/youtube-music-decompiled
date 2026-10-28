package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hhd {
    public final zwb a;
    public final avmb b;
    public final Set c;
    public final Context d;
    public hgz e;
    public hgz f;
    public final wbz g;
    public avmn h;
    public final tfq i;
    public final vxz j;
    public final axfd k;
    private final tun l;
    private final awmd m;
    private final awmd n;
    private final tbt o;
    private final Executor p;
    private final hhc q;
    private final hhb r;
    private final vxe s;
    private final jlh t;
    private final awkv u;
    private final vxz v;

    public hhd(tun tunVar, tbt tbtVar, awmd awmdVar, abvn abvnVar, awmd awmdVar2, zwb zwbVar, Executor executor, avmb avmbVar, axfd axfdVar, Context context, vxz vxzVar, vxz vxzVar2, tfq tfqVar, vxe vxeVar, wbz wbzVar, jlh jlhVar, awkv awkvVar) {
        hhc hhcVar = new hhc(this);
        this.q = hhcVar;
        hhb hhbVar = new hhb(this);
        this.r = hhbVar;
        this.c = new HashSet();
        this.l = tunVar;
        this.o = tbtVar;
        this.m = awmdVar;
        this.n = awmdVar2;
        this.a = zwbVar;
        this.p = executor;
        this.b = avmbVar;
        this.k = axfdVar;
        this.d = context;
        this.j = vxzVar;
        this.v = vxzVar2;
        this.i = tfqVar;
        this.s = vxeVar;
        this.g = wbzVar;
        this.t = jlhVar;
        this.u = awkvVar;
        int i = 11;
        new avmm().e(abvnVar.P().i(new abwr(1)).al(new gem(hhcVar, 16), new gfh(i)), abvnVar.N().al(new gem(hhcVar, 17), new gfh(i)));
        tbtVar.f(hhbVar);
    }

    public final anaf a(amlg amlgVar, String str) {
        if (str == null) {
            return hgg.a;
        }
        if (!this.a.u()) {
            return hgg.c;
        }
        this.l.c();
        int i = 2;
        if (this.j.m(8, 45661900L)) {
            vxe vxeVar = this.s;
            aihh aihhVar = (aihh) ajwo.a.createBuilder();
            aigj aigjVarV = aigj.v(vzh.b);
            aihhVar.copyOnWrite();
            ajwo ajwoVar = (ajwo) aihhVar.instance;
            aigjVarV.getClass();
            ajwoVar.b |= 1;
            ajwoVar.c = aigjVarV;
            aihl aihlVar = amla.b;
            aihf aihfVarCreateBuilder = amla.a.createBuilder();
            aihf aihfVarCreateBuilder2 = amlh.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            amlh amlhVar = (amlh) aihfVarCreateBuilder2.instance;
            amlhVar.b |= 1;
            amlhVar.c = str;
            amlh amlhVar2 = (amlh) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            amla amlaVar = (amla) aihfVarCreateBuilder.instance;
            amlhVar2.getClass();
            amlaVar.g = amlhVar2;
            amlaVar.c |= 2;
            aihfVarCreateBuilder.copyOnWrite();
            amla amlaVar2 = (amla) aihfVarCreateBuilder.instance;
            amlaVar2.f = amlgVar.e;
            amlaVar2.c |= 1;
            aihhVar.e(aihlVar, (amla) aihfVarCreateBuilder.build());
            vxeVar.a((ajwo) aihhVar.build());
            return hgg.a;
        }
        hgz hgzVar = this.e;
        hfg hfgVar = new hfg(this, str, hgzVar == null ? amlg.INDIFFERENT : hgzVar.a, amlgVar, 5);
        gqd gqdVar = new gqd(6);
        c(str, amlgVar);
        int iOrdinal = amlgVar.ordinal();
        if (iOrdinal == 0) {
            this.t.b();
            awmd awmdVar = this.n;
            wqo wqoVarB = ((wqm) awmdVar.io()).b();
            wqoVarB.m();
            wqoVarB.H(str);
            taf.i(((wqm) awmdVar.io()).g(wqoVarB, MoreExecutors.directExecutor()), this.p, hfgVar, new gpq(i), gqdVar);
        } else if (iOrdinal == 1) {
            awmd awmdVar2 = this.m;
            abvc abvcVar = (abvc) awmdVar2.io();
            abtu abtuVar = abtu.a;
            if (abvcVar.n(abtuVar)) {
                ((abvc) awmdVar2.io()).i(abtuVar);
            }
            awmd awmdVar3 = this.n;
            wqn wqnVarA = ((wqm) awmdVar3.io()).a();
            wqnVarA.m();
            wqnVarA.H(str);
            taf.i(((wqm) awmdVar3.io()).d(wqnVarA, MoreExecutors.directExecutor()), this.p, hfgVar, new gpq(3), gqdVar);
        } else if (iOrdinal == 2) {
            awmd awmdVar4 = this.n;
            wqp wqpVarC = ((wqm) awmdVar4.io()).c();
            wqpVarC.m();
            wqpVarC.H(str);
            taf.i(((wqm) awmdVar4.io()).h(wqpVarC, MoreExecutors.directExecutor()), this.p, hfgVar, new gpq(4), gqdVar);
        }
        return hgg.a;
    }

    public final void b(hha hhaVar) {
        this.c.add(hhaVar);
    }

    public final void c(String str, amlg amlgVar) {
        wbz wbzVar = this.g;
        zwb zwbVar = this.a;
        String strG = wfs.g(62, str);
        wer werVarE = wbzVar.e(zwbVar.e()).e();
        amlb amlbVarE = amld.e(strG);
        amlbVarE.am(amlgVar);
        werVarE.m(amlbVarE);
        werVarE.b().D();
        gsg gsgVar = new gsg(str, amlgVar);
        if (this.v.l(213, 45745584L, false)) {
            this.u.kk(gsgVar);
        } else {
            this.o.e(gsgVar);
            this.u.kk(gsgVar);
        }
    }
}
