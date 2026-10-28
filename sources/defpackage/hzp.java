package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzp {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/notification/DefaultNotificationLikeButtonController");
    public final Set b;
    public final zwb c;
    public final wbz d;
    public Optional e;
    public gsg f;
    public aihh g;
    private final abvc h;
    private final abvn i;
    private final tbt j;
    private final Executor k;
    private final avmb l;
    private final avmb m;
    private final hzi n;
    private final vxe o;
    private final jlh p;
    private final avmm q;
    private final hzo r;
    private final awkv s;
    private final wqm t;
    private final vxz u;
    private final vxz v;
    private final hzo w;

    public hzp(tbt tbtVar, wqm wqmVar, abvc abvcVar, abvn abvnVar, Executor executor, avmb avmbVar, avmb avmbVar2, hzi hziVar, zwb zwbVar, wbz wbzVar, vxe vxeVar, jlh jlhVar, vxz vxzVar, vxz vxzVar2, awkv awkvVar) {
        avmm avmmVar = new avmm();
        this.q = avmmVar;
        hzo hzoVar = new hzo(this);
        this.w = hzoVar;
        hzo hzoVar2 = new hzo(this);
        this.r = hzoVar2;
        this.e = Optional.empty();
        this.t = wqmVar;
        this.h = abvcVar;
        this.i = abvnVar;
        this.k = executor;
        this.l = avmbVar;
        this.m = avmbVar2;
        this.b = new CopyOnWriteArraySet();
        tbtVar.getClass();
        this.j = tbtVar;
        this.n = hziVar;
        this.c = zwbVar;
        this.d = wbzVar;
        this.o = vxeVar;
        this.p = jlhVar;
        this.u = vxzVar;
        this.v = vxzVar2;
        this.s = awkvVar;
        int i = 19;
        int i2 = 3;
        int i3 = 8;
        int i4 = 1;
        if (vxzVar.l(19, 45693654L, false)) {
            avmmVar.e(abvnVar.P().x(new hxe(i2)).L(avmbVar2).ak(new hva(this, i)), abvnVar.H().x(new hxe(4)).p().W(new vvb(new hrk(this, i), i3)).H(new ibj(this, i4)).L(avmbVar).al(new hva(this, 20), new hmd(i)));
        } else {
            avmmVar.e(abvnVar.P().i(new abwr(i4)).al(new hxi(hzoVar, i3), new hyx(i2)));
            tbtVar.f(hzoVar2);
        }
    }

    private final void f(amlg amlgVar) {
        aihh aihhVar = this.g;
        if (aihhVar != null) {
            Optional optionalEb = yno.eb(amlgVar, aihhVar);
            int i = 8;
            if (this.u.m(8, 45661900L)) {
                vxe vxeVar = this.o;
                aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
                aigj aigjVar = ((amks) aihhVar.instance).e;
                aihhVar2.copyOnWrite();
                ajwo ajwoVar = (ajwo) aihhVar2.instance;
                aigjVar.getClass();
                ajwoVar.b |= 1;
                ajwoVar.c = aigjVar;
                aihl aihlVar = amla.b;
                aihf aihfVarCreateBuilder = amla.a.createBuilder();
                amlh amlhVar = ((amks) aihhVar.instance).c;
                if (amlhVar == null) {
                    amlhVar = amlh.a;
                }
                aihfVarCreateBuilder.copyOnWrite();
                amla amlaVar = (amla) aihfVarCreateBuilder.instance;
                amlhVar.getClass();
                amlaVar.g = amlhVar;
                amlaVar.c |= 2;
                aihfVarCreateBuilder.copyOnWrite();
                amla amlaVar2 = (amla) aihfVarCreateBuilder.instance;
                amlaVar2.f = amlgVar.e;
                amlaVar2.c |= 1;
                aihhVar2.e(aihlVar, (amla) aihfVarCreateBuilder.build());
                vxeVar.a((ajwo) optionalEb.orElse((ajwo) aihhVar2.build()));
                return;
            }
            amlg amlgVarA = amlg.a(((amks) aihhVar.instance).d);
            if (amlgVarA == null) {
                amlgVarA = amlg.LIKE;
            }
            hfg hfgVar = new hfg(this, aihhVar, amlgVarA, amlgVar, 6);
            e(aihhVar, amlgVar);
            int iOrdinal = amlgVar.ordinal();
            if (iOrdinal == 0) {
                this.p.b();
                wqm wqmVar = this.t;
                wqo wqoVarB = wqmVar.b();
                if (optionalEb.isPresent()) {
                    wqoVarB.e((ajwo) optionalEb.get());
                } else {
                    wqoVarB.o(((amks) aihhVar.instance).e.G());
                    amlh amlhVar2 = ((amks) aihhVar.instance).c;
                    if (amlhVar2 == null) {
                        amlhVar2 = amlh.a;
                    }
                    wqoVarB.F(amlhVar2);
                }
                taf.i(wqmVar.g(wqoVarB, MoreExecutors.directExecutor()), this.k, hfgVar, new gpq(6), null);
                return;
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    wqm wqmVar2 = this.t;
                    wqp wqpVarC = wqmVar2.c();
                    if (optionalEb.isPresent()) {
                        wqpVarC.e((ajwo) optionalEb.get());
                    } else {
                        wqpVarC.o(((amks) aihhVar.instance).e.G());
                        amlh amlhVar3 = ((amks) aihhVar.instance).c;
                        if (amlhVar3 == null) {
                            amlhVar3 = amlh.a;
                        }
                        wqpVarC.F(amlhVar3);
                    }
                    taf.i(wqmVar2.h(wqpVarC, MoreExecutors.directExecutor()), this.k, hfgVar, new gpq(i), null);
                    return;
                }
                return;
            }
            abvc abvcVar = this.h;
            if (abvcVar.n(abtu.a)) {
                abvcVar.i(this.n.c(abtt.NEXT, null, null));
            }
            wqm wqmVar3 = this.t;
            wqn wqnVarA = wqmVar3.a();
            if (optionalEb.isPresent()) {
                wqnVarA.e((ajwo) optionalEb.get());
            } else {
                wqnVarA.o(((amks) aihhVar.instance).e.G());
                amlh amlhVar4 = ((amks) aihhVar.instance).c;
                if (amlhVar4 == null) {
                    amlhVar4 = amlh.a;
                }
                wqnVarA.F(amlhVar4);
            }
            taf.i(wqmVar3.d(wqnVarA, MoreExecutors.directExecutor()), this.k, hfgVar, new gpq(7), null);
        }
    }

    public final void a(hzv hzvVar) {
        this.b.add(hzvVar);
    }

    public final void b() {
        if (this.u.l(19, 45693654L, false)) {
            Optional optionalOfNullable = this.e;
            if (true == optionalOfNullable.isPresent() && ((amld) optionalOfNullable.get()).getLikeStatus() != amlg.DISLIKE) {
                optionalOfNullable = Optional.empty();
            }
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable.get();
                optionalOfNullable = Optional.ofNullable(amlg.INDIFFERENT);
            }
            f((amlg) optionalOfNullable.orElse(amlg.DISLIKE));
            return;
        }
        aihh aihhVar = this.g;
        if (aihhVar != null) {
            amlg amlgVarEa = yno.ea(aihhVar);
            amlg amlgVar = amlg.DISLIKE;
            if (amlgVarEa == amlgVar) {
                amlgVar = amlg.INDIFFERENT;
            }
            f(amlgVar);
        }
    }

    public final void c() {
        if (this.u.l(19, 45693654L, false)) {
            Optional optionalOfNullable = this.e;
            if (true == optionalOfNullable.isPresent() && ((amld) optionalOfNullable.get()).getLikeStatus() != amlg.LIKE) {
                optionalOfNullable = Optional.empty();
            }
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable.get();
                optionalOfNullable = Optional.ofNullable(amlg.INDIFFERENT);
            }
            f((amlg) optionalOfNullable.orElse(amlg.LIKE));
            return;
        }
        aihh aihhVar = this.g;
        if (aihhVar != null) {
            amlg amlgVarEa = yno.ea(aihhVar);
            amlg amlgVar = amlg.LIKE;
            if (amlgVarEa == amlgVar) {
                amlgVar = amlg.INDIFFERENT;
            }
            f(amlgVar);
        }
    }

    public final void d() {
        gsg gsgVar = this.f;
        if (gsgVar != null) {
            if (this.v.l(213, 45745584L, false)) {
                this.s.kk(gsgVar);
            } else {
                this.j.c(gsgVar);
                this.s.kk(gsgVar);
            }
        }
    }

    public final void e(aihh aihhVar, amlg amlgVar) {
        amlh amlhVar = ((amks) aihhVar.instance).c;
        if (amlhVar == null) {
            amlhVar = amlh.a;
        }
        String strG = wfs.g(62, amlhVar.c);
        wer werVarE = this.d.e(this.c.e()).e();
        amlb amlbVarE = amld.e(strG);
        amlbVarE.am(amlgVar);
        werVarE.m(amlbVarE);
        werVarE.b().D();
        amlh amlhVar2 = ((amks) aihhVar.instance).c;
        if (amlhVar2 == null) {
            amlhVar2 = amlh.a;
        }
        gsg gsgVar = new gsg(amlhVar2.c, amlgVar);
        if (this.v.l(213, 45745584L, false)) {
            this.s.kk(gsgVar);
        } else {
            this.j.e(gsgVar);
            this.s.kk(gsgVar);
        }
    }
}
