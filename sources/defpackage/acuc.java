package defpackage;

import android.util.LruCache;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acuc implements abor, abon {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackRequester");
    public final acrz b;
    public final abqq c;
    public final actv d;
    public final abom e;
    public final abvn f;
    public final hno g;
    private final abpd h;
    private final actk i;
    private final acsy j;
    private final acsv k;
    private final abpf l;
    private final Executor m;
    private final txp n;
    private final acul o;
    private final adyc p;
    private final qcb q;

    public acuc(acrz acrzVar, abpd abpdVar, adyc adycVar, hno hnoVar, actk actkVar, acsy acsyVar, acsv acsvVar, abqq abqqVar, abpf abpfVar, qcb qcbVar, actv actvVar, Executor executor, txp txpVar, abom abomVar, abvn abvnVar, acul aculVar) {
        this.b = acrzVar;
        this.h = abpdVar;
        this.p = adycVar;
        this.i = actkVar;
        this.g = hnoVar;
        this.j = acsyVar;
        this.k = acsvVar;
        this.c = abqqVar;
        this.l = abpfVar;
        this.q = qcbVar;
        this.d = actvVar;
        this.m = executor;
        this.n = txpVar;
        this.e = abomVar;
        this.f = abvnVar;
        this.o = aculVar;
    }

    private final ListenableFuture m(abnl abnlVar, abnp abnpVar, String str, boolean z, int i) {
        return z ? ahno.as(aher.a, new acty(this, abnlVar, abnpVar, str, i, 0), this.m) : i(abnlVar, abnpVar, str, false, i);
    }

    public final void a(ajwo ajwoVar, ListenableFuture listenableFuture, boolean z, boolean z2) {
        ahng.x(listenableFuture, afwl.g(new acub(this, z2, ajwoVar, z)), this.m);
    }

    @Override // defpackage.abor
    public final Pair b(abnl abnlVar, String str, abnp abnpVar, boolean z) {
        ajwo ajwoVar = abnlVar.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        abnlVar.w();
        return new Pair(h(str, abnlVar, abnpVar, null, z), e(abnlVar, abnpVar));
    }

    @Override // defpackage.abor
    public final abrj c(abnl abnlVar, String str, abnp abnpVar, boolean z) {
        ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackRequester", "fetchWatch", 137, "ReelPlaybackRequester.java")).t("FetchWatch should not be called on the ReelPlaybackRequester, since fetchWatch is used for WatchNext fetches.");
        Pair pairB = b(abnlVar, str, abnpVar, z);
        return acqf.g((ListenableFuture) pairB.first, (ListenableFuture) pairB.second);
    }

    @Override // defpackage.abor
    public final ListenableFuture d(abnl abnlVar, String str, int i, aphs aphsVar, abnp abnpVar) {
        ajwo ajwoVar = abnlVar.b;
        if (ajwoVar != null) {
            if (this.g.aO()) {
                return m(abnlVar, abnpVar, str, false, 2);
            }
            this.h.m(abnlVar, i);
            acrz acrzVar = this.b;
            acuv acuvVarD = acrzVar.d(ajwoVar);
            if (acuvVarD != null) {
                acsy acsyVar = this.j;
                actp actpVar = new actp(acsyVar.a, acsyVar.b, acsyVar.c, null, acrzVar, acsyVar.d, new HashSet(), acsyVar.e, ajwoVar, this.k);
                acsyVar.a = "";
                acsyVar.b = 0L;
                acrzVar.h(acuvVarD.Y());
                acrzVar.j(ajwoVar, str, actpVar, zzd.a);
                abnlVar.w();
                return h(str, abnlVar, abnpVar, aphsVar, true);
            }
        }
        return null;
    }

    @Override // defpackage.abor
    public final ListenableFuture e(abnl abnlVar, abnp abnpVar) {
        zyz zyzVar = new zyz();
        zyzVar.set(null);
        return zyzVar;
    }

    @Override // defpackage.abor
    public final ListenableFuture f(abnl abnlVar, abnt abntVar, xir xirVar, abnp abnpVar) {
        hno hnoVar = this.g;
        if (hnoVar.J() && abnlVar.J()) {
            actk actkVar = this.i;
            abnlVar.w();
            return actkVar.a();
        }
        if (hnoVar.aO()) {
            return m(abnlVar, abnpVar, abnlVar.q(this.n), true, 3);
        }
        adyc adycVar = this.p;
        abnlVar.e = true;
        return ((abpd) adycVar.b).k(abnlVar, abntVar.b.a(), xirVar, abnpVar, abntVar);
    }

    @Override // defpackage.abor
    public final ListenableFuture g(abnl abnlVar, aooj aoojVar, xir xirVar, abnp abnpVar) {
        hno hnoVar = this.g;
        if (hnoVar.J() && abnlVar.J()) {
            actk actkVar = this.i;
            abnlVar.w();
            return actkVar.a();
        }
        if (hnoVar.aO()) {
            return m(abnlVar, abnpVar, abnlVar.q(this.n), true, 3);
        }
        adyc adycVar = this.p;
        abnlVar.e = true;
        return ((abpd) adycVar.b).l(abnlVar, aoojVar, xirVar, abnpVar);
    }

    @Override // defpackage.abor
    public final ListenableFuture h(String str, abnl abnlVar, abnp abnpVar, aphs aphsVar, boolean z) {
        ListenableFuture listenableFutureA;
        ajwo ajwoVar = abnlVar.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        if (abnlVar.J()) {
            hno hnoVar = this.g;
            if (hnoVar.aE()) {
                if (hnoVar.aO()) {
                    this.d.A(ajwoVar, alqc.a, true);
                }
                actk actkVar = this.i;
                abnlVar.w();
                return actkVar.a();
            }
        }
        hno hnoVar2 = this.g;
        if (hnoVar2.aJ() && aecm.as(ajwoVar) && (listenableFutureA = this.o.a()) != null) {
            return ahng.o(listenableFutureA);
        }
        if (hnoVar2.aO()) {
            return m(abnlVar, abnpVar, str, false, 3);
        }
        zyz zyzVar = new zyz();
        if (!aawr.x(ajwoVar)) {
            this.b.j(ajwoVar, str, zzd.a, zyzVar);
            return zyzVar;
        }
        adyc adycVar = this.p;
        abnlVar.e = true;
        return ((abpd) adycVar.b).v(abnlVar, str, aphsVar, true, abnpVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:106:0x0201 A[Catch: all -> 0x0331, TryCatch #1 {, blocks: (B:104:0x01fb, B:106:0x0201, B:107:0x0205, B:109:0x0207, B:111:0x0213, B:113:0x021f, B:115:0x0223, B:116:0x0227, B:118:0x0229), top: B:159:0x01fb }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0207 A[Catch: all -> 0x0331, TryCatch #1 {, blocks: (B:104:0x01fb, B:106:0x0201, B:107:0x0205, B:109:0x0207, B:111:0x0213, B:113:0x021f, B:115:0x0223, B:116:0x0227, B:118:0x0229), top: B:159:0x01fb }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0229 A[Catch: all -> 0x0331, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {, blocks: (B:104:0x01fb, B:106:0x0201, B:107:0x0205, B:109:0x0207, B:111:0x0213, B:113:0x021f, B:115:0x0223, B:116:0x0227, B:118:0x0229), top: B:159:0x01fb }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0258  */
    /* JADX WARN: Code duplicated, block: B:123:0x025a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0275  */
    /* JADX WARN: Code duplicated, block: B:127:0x028e  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:134:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:144:0x0305  */
    /* JADX WARN: Code duplicated, block: B:145:0x031e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x0125  */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:58:0x013c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0142  */
    /* JADX WARN: Code duplicated, block: B:61:0x0146  */
    /* JADX WARN: Code duplicated, block: B:63:0x014a  */
    /* JADX WARN: Code duplicated, block: B:64:0x014f  */
    /* JADX WARN: Code duplicated, block: B:69:0x015b A[Catch: IllegalArgumentException -> 0x0172, TryCatch #0 {IllegalArgumentException -> 0x0172, blocks: (B:67:0x0157, B:69:0x015b, B:71:0x0162, B:70:0x0160), top: B:156:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0160 A[Catch: IllegalArgumentException -> 0x0172, TryCatch #0 {IllegalArgumentException -> 0x0172, blocks: (B:67:0x0157, B:69:0x015b, B:71:0x0162, B:70:0x0160), top: B:156:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0189  */
    /* JADX WARN: Code duplicated, block: B:77:0x018c  */
    public final ListenableFuture i(abnl abnlVar, abnp abnpVar, String str, boolean z, int i) {
        alvt alvtVar;
        aihl aihlVarCheckIsLite;
        alqc alqcVar;
        aihl aihlVarCheckIsLite2;
        Object objK;
        Object objC;
        apfp apfpVar;
        zwa zwaVarB;
        apfq apfqVar;
        apfq apfqVar2;
        Optional optionalEmpty;
        Optional optionalOfNullable;
        Optional optional;
        aihl aihlVarCheckIsLite3;
        LruCache lruCache;
        acuv acuvVarD;
        Optional optionalEmpty2;
        wjf wjfVar;
        Optional optionalOfNullable2;
        hly hlyVar;
        Object objB;
        ListenableFuture listenableFuture;
        boolean zIsPresent;
        aihl aihlVarCheckIsLite4;
        Object objK2;
        Object objC2;
        Optional optionalOfNullable3;
        hly hlyVar2;
        Object objB2;
        abnp abnpVar2 = abnpVar == null ? abnp.a : abnpVar;
        ajwo ajwoVar = abnlVar.b;
        if (ajwoVar == null) {
            return ahng.m(new IllegalStateException("Cannot fetch streaming watch with null command."));
        }
        if (i == 2) {
            acrz acrzVar = this.b;
            acuv acuvVarD2 = acrzVar.d(ajwoVar);
            if (acuvVarD2 != null) {
                acrzVar.h(acuvVarD2.Y());
            }
        } else {
            acsv acsvVar = this.k;
            Pair pairA = acsvVar.a(ajwoVar);
            if (pairA != null) {
                ajwo ajwoVar2 = (ajwo) pairA.second;
                long jLongValue = ((Long) pairA.first).longValue();
                if (ajwoVar2 != null) {
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apfp.b);
                    ajwoVar2.c(aihlVarCheckIsLite5);
                    if (ajwoVar2.j.n(aihlVarCheckIsLite5.d)) {
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(apfp.b);
                        ajwoVar2.c(aihlVarCheckIsLite6);
                        Object objK3 = ajwoVar2.j.k(aihlVarCheckIsLite6.d);
                        apfp apfpVar2 = (apfp) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
                        alvtVar = (alvt) acsv.i(apfpVar2, alvu.b);
                        zwa zwaVarB2 = acsvVar.b();
                        if (alvtVar == null) {
                            if (((apfpVar2.i == 44 ? (apfq) apfpVar2.k : apfq.a).b & 1) != 0) {
                                try {
                                    alvtVar = (alvt) acsvVar.d((apfpVar2.i == 44 ? (apfq) apfpVar2.k : apfq.a).c.G(), alvt.a, zwaVarB2);
                                } catch (IllegalArgumentException e) {
                                    ((agrc) ((agrc) ((agrc) acsv.a.b()).j(e)).k("com/google/android/libraries/youtube/reel/internal/player/ReelInlineResponseExtractor", "parseInlinedPlayerResponse", (char) 401, "ReelInlineResponseExtractor.java")).t("Failed to parse inlined PlayerResponse.");
                                }
                            }
                        } else if ((alvtVar.c & SemanticState.LiveRegion) != 0) {
                            acsvVar.h(alvtVar, zwaVarB2);
                        }
                        if (alvtVar != null) {
                            wjg wjgVar = new wjg();
                            wjgVar.b = alvtVar;
                            wjgVar.b(jLongValue);
                            wjgVar.h = acsvVar.c;
                            wji wjiVarA = wjgVar.a();
                            wjiVarA.i.c("PLAYER_RESPONSE_SOURCE_KEY", 3L);
                            acsvVar.b.e(ajwoVar, wjiVarA, jLongValue);
                        }
                        aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                        ajwoVar2.c(aihlVarCheckIsLite);
                        if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                            aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                            ajwoVar2.c(aihlVarCheckIsLite2);
                            objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                            if (objK == null) {
                                objC = aihlVarCheckIsLite2.b;
                            } else {
                                objC = aihlVarCheckIsLite2.c(objK);
                            }
                            apfpVar = (apfp) objC;
                            alqcVar = (alqc) acsv.i(apfpVar, alqe.b);
                            zwaVarB = acsvVar.b();
                            if (alqcVar != null) {
                                if (apfpVar.i == 44) {
                                    apfqVar = (apfq) apfpVar.k;
                                } else {
                                    apfqVar = apfq.a;
                                }
                                if ((apfqVar.b & 2) != 0) {
                                    try {
                                        if (apfpVar.i == 44) {
                                            apfqVar2 = (apfq) apfpVar.k;
                                        } else {
                                            apfqVar2 = apfq.a;
                                        }
                                        alqcVar = (alqc) acsvVar.d(apfqVar2.d.G(), alqc.a, zwaVarB);
                                    } catch (IllegalArgumentException e2) {
                                        ((agrc) ((agrc) ((agrc) acsv.a.b()).j(e2)).k("com/google/android/libraries/youtube/reel/internal/player/ReelInlineResponseExtractor", "parseInlinedReelItemWatchResponse", (char) 434, "ReelInlineResponseExtractor.java")).t("Failed to parse inlined ReelItemWatchResponse.");
                                    }
                                } else {
                                    alqcVar = null;
                                }
                            } else if ((alqcVar.b & SemanticState.LiveRegion) != 0) {
                                acsvVar.g(alqcVar, zwaVarB);
                            }
                        } else {
                            alqcVar = null;
                        }
                        if (alqcVar != null) {
                            acsvVar.b.f(ajwoVar, alqcVar, jLongValue);
                        }
                        acsvVar.f(ajwoVar2, true, true);
                    }
                    alvtVar = null;
                    if (alvtVar != null) {
                        wjg wjgVar2 = new wjg();
                        wjgVar2.b = alvtVar;
                        wjgVar2.b(jLongValue);
                        wjgVar2.h = acsvVar.c;
                        wji wjiVarA2 = wjgVar2.a();
                        wjiVarA2.i.c("PLAYER_RESPONSE_SOURCE_KEY", 3L);
                        acsvVar.b.e(ajwoVar, wjiVarA2, jLongValue);
                    }
                    aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                    ajwoVar2.c(aihlVarCheckIsLite);
                    if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                        aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                        ajwoVar2.c(aihlVarCheckIsLite2);
                        objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                        if (objK == null) {
                            objC = aihlVarCheckIsLite2.b;
                        } else {
                            objC = aihlVarCheckIsLite2.c(objK);
                        }
                        apfpVar = (apfp) objC;
                        alqcVar = (alqc) acsv.i(apfpVar, alqe.b);
                        zwaVarB = acsvVar.b();
                        if (alqcVar != null) {
                            if (apfpVar.i == 44) {
                                apfqVar = (apfq) apfpVar.k;
                            } else {
                                apfqVar = apfq.a;
                            }
                            if ((apfqVar.b & 2) != 0) {
                                if (apfpVar.i == 44) {
                                    apfqVar2 = (apfq) apfpVar.k;
                                } else {
                                    apfqVar2 = apfq.a;
                                }
                                alqcVar = (alqc) acsvVar.d(apfqVar2.d.G(), alqc.a, zwaVarB);
                            } else {
                                alqcVar = null;
                            }
                        } else if ((alqcVar.b & SemanticState.LiveRegion) != 0) {
                            acsvVar.g(alqcVar, zwaVarB);
                        }
                    } else {
                        alqcVar = null;
                    }
                    if (alqcVar != null) {
                        acsvVar.b.f(ajwoVar, alqcVar, jLongValue);
                    }
                    acsvVar.f(ajwoVar2, true, true);
                }
            }
        }
        acrz acrzVar2 = this.b;
        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite7);
        if (ajwoVar.j.n(aihlVarCheckIsLite7.d)) {
            LruCache lruCache2 = acrzVar2.c;
            synchronized (lruCache2) {
                acuv acuvVarD3 = acrzVar2.d(ajwoVar);
                if (acuvVarD3 == null) {
                    optionalOfNullable = Optional.empty();
                } else {
                    acry acryVar = (acry) lruCache2.get(acuvVarD3.Y());
                    if (acryVar == null || !acrzVar2.l(acryVar)) {
                        optionalEmpty = Optional.empty();
                    } else {
                        optionalOfNullable = Optional.ofNullable(acryVar.b);
                    }
                }
                optional = optionalOfNullable;
            }
            aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite3);
            if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                lruCache = acrzVar2.d;
                synchronized (lruCache) {
                    acuvVarD = acrzVar2.d(ajwoVar);
                    if (acuvVarD == null) {
                        optionalEmpty2 = Optional.empty();
                    } else {
                        acry acryVar2 = (acry) lruCache.get(acuvVarD.Y());
                        optionalEmpty2 = (acryVar2 != null || acrzVar2.b.b() > acryVar2.d || (wjfVar = acryVar2.c) == null) ? Optional.empty() : Optional.ofNullable(wjfVar);
                    }
                }
            } else {
                optionalEmpty2 = Optional.empty();
            }
            abrj abrjVar = (abrj) this.e.a(str, l(k(optionalEmpty2.isEmpty(), optional.isEmpty(), abnlVar, abnpVar2, str), abnlVar, str, abnpVar2, i), abnpVar2.b);
            if (true != optionalEmpty2.isPresent()) {
                optionalOfNullable2 = optionalEmpty2;
            } else {
                optionalOfNullable2 = Optional.ofNullable(ahng.n((wjf) optionalEmpty2.get()));
            }
            hlyVar = new hly(abrjVar, 17);
            if (true != optionalOfNullable2.isPresent()) {
                objB = tzk.b(((abrj) hlyVar.a).a(abpg.class).h(wjf.class).ao());
            } else {
                objB = optionalOfNullable2.get();
            }
            listenableFuture = (ListenableFuture) objB;
            zIsPresent = optionalEmpty2.isPresent();
            aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            if (objK2 == null) {
                objC2 = aihlVarCheckIsLite4.b;
            } else {
                objC2 = aihlVarCheckIsLite4.c(objK2);
            }
            if (((apfp) objC2).o.isEmpty()) {
                ahng.x(listenableFuture, afwl.g(new acua(this, zIsPresent, ajwoVar, 0)), this.m);
            }
            if (true != optional.isPresent()) {
                optionalOfNullable3 = optional;
            } else {
                optionalOfNullable3 = Optional.ofNullable(new acrx((alqc) optional.get(), (wja) null, true));
            }
            if (true == optionalOfNullable3.isPresent()) {
                optionalOfNullable3 = Optional.ofNullable(ahng.n((acrx) optionalOfNullable3.get()));
            }
            hlyVar2 = new hly(abrjVar, 18);
            if (true != optionalOfNullable3.isPresent()) {
                objB2 = tzk.b(((abrj) hlyVar2.a).a(acsx.class).h(acrx.class).ao());
            } else {
                objB2 = optionalOfNullable3.get();
            }
            a(ajwoVar, (ListenableFuture) objB2, z, optional.isPresent());
            return listenableFuture;
        }
        optionalEmpty = Optional.empty();
        optional = optionalEmpty;
        aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            optionalEmpty2 = Optional.empty();
        } else {
            lruCache = acrzVar2.d;
            synchronized (lruCache) {
                acuvVarD = acrzVar2.d(ajwoVar);
                if (acuvVarD == null) {
                    optionalEmpty2 = Optional.empty();
                } else {
                    acry acryVar3 = (acry) lruCache.get(acuvVarD.Y());
                    if (acryVar3 != null) {
                    }
                }
            }
        }
        abrj abrjVar2 = (abrj) this.e.a(str, l(k(optionalEmpty2.isEmpty(), optional.isEmpty(), abnlVar, abnpVar2, str), abnlVar, str, abnpVar2, i), abnpVar2.b);
        if (true != optionalEmpty2.isPresent()) {
            optionalOfNullable2 = optionalEmpty2;
        } else {
            optionalOfNullable2 = Optional.ofNullable(ahng.n((wjf) optionalEmpty2.get()));
        }
        hlyVar = new hly(abrjVar2, 17);
        if (true != optionalOfNullable2.isPresent()) {
            objB = tzk.b(((abrj) hlyVar.a).a(abpg.class).h(wjf.class).ao());
        } else {
            objB = optionalOfNullable2.get();
        }
        listenableFuture = (ListenableFuture) objB;
        zIsPresent = optionalEmpty2.isPresent();
        aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite4);
        objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
        if (objK2 == null) {
            objC2 = aihlVarCheckIsLite4.b;
        } else {
            objC2 = aihlVarCheckIsLite4.c(objK2);
        }
        if (((apfp) objC2).o.isEmpty()) {
            ahng.x(listenableFuture, afwl.g(new acua(this, zIsPresent, ajwoVar, 0)), this.m);
        }
        if (true != optional.isPresent()) {
            optionalOfNullable3 = optional;
        } else {
            optionalOfNullable3 = Optional.ofNullable(new acrx((alqc) optional.get(), (wja) null, true));
        }
        if (true == optionalOfNullable3.isPresent()) {
            optionalOfNullable3 = Optional.ofNullable(ahng.n((acrx) optionalOfNullable3.get()));
        }
        hlyVar2 = new hly(abrjVar2, 18);
        if (true != optionalOfNullable3.isPresent()) {
            objB2 = tzk.b(((abrj) hlyVar2.a).a(acsx.class).h(acrx.class).ao());
        } else {
            objB2 = optionalOfNullable3.get();
        }
        a(ajwoVar, (ListenableFuture) objB2, z, optional.isPresent());
        return listenableFuture;
    }

    @Override // defpackage.abon
    public final void j(abnl abnlVar, String str, Executor executor, abnp abnpVar) {
        if (this.g.aO()) {
            String strQ = abnlVar.q(this.n);
            this.e.b(strQ, l(k(true, true, abnlVar, abnpVar, strQ), abnlVar, strQ, abnpVar, 3), abnpVar.b, executor);
        }
    }

    public final agke k(boolean z, boolean z2, abnl abnlVar, abnp abnpVar, String str) {
        ArrayList arrayList = new ArrayList(2);
        if (z) {
            arrayList.add(this.l.a(abnlVar, abnpVar, str));
        }
        if (z2) {
            ght ghtVar = ((giq) this.q.a).a;
            arrayList.add(new acsx((acuw) ghtVar.Gj.io(), (hno) ghtVar.jZ.io(), ghtVar.Gm, ghtVar.Gn, aupm.b(ghtVar.hO), abnlVar, abnpVar));
        }
        return agke.n(arrayList);
    }

    public final agfr l(final agke agkeVar, final abnl abnlVar, final String str, final abnp abnpVar, final int i) {
        return afwl.b(new agfr() { // from class: actz
            @Override // defpackage.agfr
            public final Object io() {
                return this.a.c.c(agkeVar, abnlVar, abnpVar, str, i);
            }
        });
    }
}
