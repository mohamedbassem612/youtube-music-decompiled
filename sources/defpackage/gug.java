package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gug extends gut {
    private final Optional a;
    private final wbz b;
    private final zwb c;
    private final avmb d;
    private final Executor e;
    private final wqm f;
    private final aczl g;

    public gug(wqm wqmVar, wbz wbzVar, zwb zwbVar, avmb avmbVar, Executor executor, Optional optional, aczl aczlVar) {
        wqmVar.getClass();
        this.f = wqmVar;
        this.a = optional;
        this.g = aczlVar;
        wbzVar.getClass();
        this.b = wbzVar;
        zwbVar.getClass();
        this.c = zwbVar;
        this.d = avmbVar;
        this.e = executor;
    }

    private final void g(final ajwo ajwoVar, final Map map, final ListenableFuture listenableFuture, final amlg amlgVar, final zwa zwaVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amla.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            amlh amlhVar = ((amla) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).g;
            if (amlhVar == null) {
                amlhVar = amlh.a;
            }
            int i = amlhVar.b & 2;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(amla.b);
            ajwoVar.c(aihlVarCheckIsLite3);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
            amlh amlhVar2 = ((amla) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).g;
            if (amlhVar2 == null) {
                amlhVar2 = amlh.a;
            }
            int i2 = 1;
            int i3 = amlhVar2.b & 1;
            if (i != 0) {
                if (i3 == 0) {
                    taf.i(listenableFuture, this.e, new gwc(this, ajwoVar, zwaVar, i2), new xex(this, amlgVar, ajwoVar, map, zwaVar, 1), null);
                    return;
                }
            } else if (i3 == 0) {
                return;
            }
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(amla.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            amlh amlhVar3 = ((amla) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3))).g;
            if (amlhVar3 == null) {
                amlhVar3 = amlh.a;
            }
            final String strG = wfs.g(62, amlhVar3.c);
            final wby wbyVarB = this.b.e(zwaVar);
            avlm avlmVarS = wbyVarB.g(strG).s(this.d);
            final int i4 = 1;
            avnn avnnVar = new avnn(this) { // from class: gue
                public final /* synthetic */ gug a;

                {
                    this.a = this;
                }

                @Override // defpackage.avnn
                public final Object a(Object obj) {
                    if (i4 != 0) {
                        zwa zwaVar2 = zwaVar;
                        amlg amlgVar2 = amlgVar;
                        ListenableFuture listenableFuture2 = listenableFuture;
                        wby wbyVar = wbyVarB;
                        String str = strG;
                        Map map2 = map;
                        ajwo ajwoVar2 = ajwoVar;
                        return this.a.d(ajwoVar2, map2, str, wbyVar, listenableFuture2, amlgVar2, (weh) obj, zwaVar2);
                    }
                    zwa zwaVar3 = zwaVar;
                    amlg amlgVar3 = amlgVar;
                    ListenableFuture listenableFuture3 = listenableFuture;
                    wby wbyVar2 = wbyVarB;
                    String str2 = strG;
                    Map map3 = map;
                    return this.a.d(ajwoVar, map3, str2, wbyVar2, listenableFuture3, amlgVar3, null, zwaVar3);
                }
            };
            final int i5 = 0;
            avyr avyrVar = new avyr(avlmVarS, avnnVar, new avnn(this) { // from class: gue
                public final /* synthetic */ gug a;

                {
                    this.a = this;
                }

                @Override // defpackage.avnn
                public final Object a(Object obj) {
                    if (i5 != 0) {
                        zwa zwaVar2 = zwaVar;
                        amlg amlgVar2 = amlgVar;
                        ListenableFuture listenableFuture2 = listenableFuture;
                        wby wbyVar = wbyVarB;
                        String str = strG;
                        Map map2 = map;
                        ajwo ajwoVar2 = ajwoVar;
                        return this.a.d(ajwoVar2, map2, str, wbyVar, listenableFuture2, amlgVar2, (weh) obj, zwaVar2);
                    }
                    zwa zwaVar3 = zwaVar;
                    amlg amlgVar3 = amlgVar;
                    ListenableFuture listenableFuture3 = listenableFuture;
                    wby wbyVar2 = wbyVarB;
                    String str2 = strG;
                    Map map3 = map;
                    return this.a.d(ajwoVar, map3, str2, wbyVar2, listenableFuture3, amlgVar3, null, zwaVar3);
                }
            }, new Callable() { // from class: guf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.d(ajwoVar, map, strG, wbyVarB, listenableFuture, amlgVar, null, zwaVar);
                }
            });
            avnn avnnVar2 = atqp.n;
            avyrVar.C(new glg(10), new glg(9));
        }
    }

    private final void h(ajwo ajwoVar, Map map, zwa zwaVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        amlg amlgVarA = amlg.a(((amla) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).f);
        if (amlgVarA == null) {
            amlgVarA = amlg.LIKE;
        }
        int iOrdinal = amlgVarA.ordinal();
        if (iOrdinal == 0) {
            wqm wqmVar = this.f;
            wqo wqoVarB = wqmVar.b();
            wqoVarB.e(ajwoVar);
            g(ajwoVar, map, wqmVar.g(wqoVarB, MoreExecutors.directExecutor()), amlg.LIKE, zwaVar);
            this.g.D(ajwoVar, map);
            return;
        }
        if (iOrdinal == 1) {
            wqm wqmVar2 = this.f;
            wqn wqnVarA = wqmVar2.a();
            wqnVarA.e(ajwoVar);
            g(ajwoVar, map, wqmVar2.d(wqnVarA, MoreExecutors.directExecutor()), amlg.DISLIKE, zwaVar);
            this.g.C(ajwoVar, map);
            return;
        }
        if (iOrdinal == 2) {
            wqm wqmVar3 = this.f;
            wqp wqpVarC = wqmVar3.c();
            wqpVarC.e(ajwoVar);
            g(ajwoVar, map, wqmVar3.h(wqpVarC, MoreExecutors.directExecutor()), amlg.INDIFFERENT, zwaVar);
            this.g.E(ajwoVar, map);
        }
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        h(ajwoVar, new HashMap(), this.c.e());
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        if (map == null) {
            map = new HashMap();
        }
        h(ajwoVar, map, this.c.e());
    }

    public final avlm d(ajwo ajwoVar, Map map, String str, wek wekVar, ListenableFuture listenableFuture, amlg amlgVar, weh wehVar, zwa zwaVar) {
        amlb amlbVarE = amld.e(str);
        amlbVarE.am(amlgVar);
        amld amldVarAn = amlbVarE.an();
        wer werVarE = wekVar.e();
        werVarE.e(amldVarAn);
        return werVarE.b().y(tzk.f(listenableFuture).s(this.d).k(new mqh(this, amlgVar, ajwoVar, map, zwaVar, 1)).r(new gnw(5))).j(new vaw(this, wehVar, wekVar, str, ajwoVar, zwaVar, 1));
    }

    public final void e(Throwable th) {
        gfi gfiVar = new gfi(th, 20);
        Optional optional = this.a;
        if (true == optional.isPresent()) {
            ((ahgb) optional.get()).ai((Throwable) gfiVar.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void f(amlg amlgVar, ajwo ajwoVar, Map map, Object obj) {
        if (obj != null) {
            Optional optional = this.a;
            hqe hqeVar = new hqe(amlgVar, obj, ajwoVar, map, 1);
            if (true == optional.isPresent()) {
                Object obj2 = optional.get();
                Object obj3 = hqeVar.c;
                Object obj4 = hqeVar.d;
                Object obj5 = hqeVar.a;
                ?? r0 = hqeVar.b;
                ahgb ahgbVar = (ahgb) obj2;
                int iOrdinal = ((amlg) obj3).ordinal();
                if (iOrdinal == 0) {
                    ahgbVar.aj((alrk) obj4, (ajwo) obj5, r0);
                } else if (iOrdinal == 1) {
                    ahgbVar.ah((alri) obj4, (ajwo) obj5, r0);
                } else if (iOrdinal == 2) {
                    ahgbVar.ak((alrm) obj4, (ajwo) obj5, r0);
                }
            }
        }
    }
}
