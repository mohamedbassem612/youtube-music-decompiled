package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rzi implements rsq {
    public final awmd a;
    public String c;
    public wjf d;
    public acfw e;
    private final awmd f;
    private final awmd g;
    private final awmd h;
    private final awmd i;
    private final awmd j;
    private final awmd k;
    private final awmd l;
    private final abmt o;
    private final abfv q;
    private boolean p = false;
    private final Set m = new HashSet();
    public int b = 0;
    private yvs n = null;

    public rzi(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, abmt abmtVar, abfv abfvVar) {
        this.f = awmdVar;
        this.g = awmdVar2;
        this.a = awmdVar3;
        this.h = awmdVar4;
        this.i = awmdVar5;
        this.j = awmdVar6;
        this.k = awmdVar7;
        this.l = awmdVar8;
        this.o = abmtVar;
        this.q = abfvVar;
    }

    private static String a(wjf wjfVar) {
        for (aisu aisuVar : wjfVar.H()) {
            int iBi = a.bi(aisuVar.f);
            if (iBi == 0) {
                iBi = 1;
            }
            if (iBi == 7) {
                return aisuVar.g;
            }
        }
        return null;
    }

    private final void b(yvs yvsVar, boolean z) {
        if (this.o.ae()) {
            ((ruu) this.i.io()).a("onci", String.format(Locale.US, "cpi.%s;cpe.%d;cps.%d;cbi.%s;soms.%d", yvsVar.a, Integer.valueOf(yvsVar.b), Long.valueOf(yvsVar.a()), Boolean.valueOf(z), Long.valueOf(yvsVar.g)));
        }
    }

    private final boolean c(yvs yvsVar) {
        return yvsVar.b == 0 && taq.ae((vyo) this.h.io());
    }

    private static final boolean s(wjf wjfVar) {
        return wjfVar.f().av() || wjfVar.V();
    }

    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.rsq
    public final void e(aaxa aaxaVar) {
        long j;
        String str;
        wjf wjfVar = this.d;
        final yvs yvsVar = aaxaVar.a;
        if (wjfVar != null && wjfVar.f() != null && this.d.f().aa()) {
            Set set = this.m;
            String str2 = yvsVar.a;
            if (set.contains(str2)) {
                return;
            }
            if (a(this.d) == null) {
                set.add(str2);
                this.q.b(this.c, str2, abad.NOT_FORWARDED);
                return;
            }
            int i = yvsVar.b;
            if (i == 3) {
                if (this.d.f().aA()) {
                    set.add(str2);
                    this.q.b(this.c, str2, abad.NOT_FORWARDED);
                    return;
                }
                i = 3;
            }
            if (i == 4) {
                if (this.d.f().aA()) {
                    set.add(str2);
                    this.q.b(this.c, str2, abad.NOT_FORWARDED);
                    return;
                }
            } else if (i == 0 && !c(yvsVar)) {
                set.add(str2);
                this.q.b(this.c, str2, abad.NOT_FORWARDED);
                return;
            }
        }
        Set set2 = this.m;
        String str3 = yvsVar.a;
        if (set2.contains(str3) || this.d == null) {
            return;
        }
        awmd awmdVar = this.h;
        if (afxw.e((vyo) awmdVar.io()).aE && this.d.f().az() && yvsVar.f) {
            return;
        }
        int i2 = yvsVar.b;
        if (i2 != 2 && i2 != 1) {
            if (i2 == 3) {
                boolean zAA = this.d.f().aA();
                if (!this.d.f().av() || zAA) {
                    i2 = 3;
                    if (!c(yvsVar)) {
                        return;
                    }
                } else {
                    i2 = 3;
                }
            } else if (!c(yvsVar)) {
                return;
            }
        }
        if (yvsVar.a() == -1 || !s(this.d) || a(this.d) == null) {
            return;
        }
        if (afxw.e((vyo) awmdVar.io()).aL && !this.p) {
            if (afxw.e((vyo) awmdVar.io()).aM) {
                ((sdo) this.j.io()).g(this.e, str3);
                return;
            }
            return;
        }
        if (this.o.ae()) {
            ((ruu) this.i.io()).a("cpopp", str3);
        }
        if ((!this.d.f().av() || this.d.f().aA()) && this.n != null) {
            j = -1;
            if (yvsVar.a() + yvsVar.d >= this.n.a() && yvsVar.a() <= this.n.a() + this.n.d) {
                rmp.j(null, "Unexpected overlapping back-to-back cue points.");
                b(yvsVar, false);
                return;
            }
        } else {
            j = -1;
        }
        wjf wjfVar2 = this.d;
        if ((!afxw.e((vyo) awmdVar.io()).bZ || !wjfVar2.T()) && (wjfVar2.f().av() || (afxw.e((vyo) awmdVar.io()).aJ && wjfVar2.f().az()))) {
            set2.add(str3);
        }
        int i3 = this.b + 1;
        this.b = i3;
        this.n = yvsVar;
        if (i2 != 0) {
            if (this.e.g() != null) {
                this.e.g().g(new acfx(yvsVar.a(), yvsVar.d + yvsVar.a(), 2, 4, null));
            }
            if (!taq.ae((vyo) awmdVar.io()) || (str = yvsVar.h) == null) {
                ((roq) this.f.io()).f(5, skh.a(this.c, this.d), new Supplier() { // from class: rzg
                    /* JADX WARN: Code duplicated, block: B:35:0x012c  */
                    /* JADX WARN: Code duplicated, block: B:37:0x0132  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0144  */
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        yvs yvsVar2;
                        snh snhVar;
                        snh snhVar2;
                        sdq sdqVar;
                        aivr aivrVar;
                        vyo vyoVar;
                        aizx aizxVarE;
                        Optional optionalEmpty;
                        boolean z;
                        Object smyVar;
                        String str4;
                        Duration durationOfMillis;
                        rzi rziVar = this.a;
                        awmd awmdVar2 = rziVar.a;
                        acfw acfwVar = rziVar.e;
                        wjf wjfVar3 = rziVar.d;
                        String str5 = rziVar.c;
                        aaok aaokVar = (aaok) awmdVar2.io();
                        int i4 = rziVar.b;
                        Object obj = aaokVar.d;
                        aixo aixoVar = aixo.SLOT_TYPE_AD_BREAK_REQUEST;
                        xsc xscVar = (xsc) obj;
                        String strAa = xscVar.aa();
                        List listAi = aaok.ai(str5, acfwVar, wjfVar3, slm.MID_ROLL);
                        yvs yvsVar3 = yvsVar;
                        listAi.add(new sih(yvsVar3));
                        listAi.add(new shj(i4));
                        long jA = yvsVar3.a();
                        long j2 = yvsVar3.d;
                        long j3 = jA + j2;
                        if (!wjfVar3.f().av() || ((aizxVarE = afxw.e((vyoVar = (vyo) aaokVar.c))) != null && aizxVarE.ax && wjfVar3.f().aA())) {
                            vyo vyoVar2 = (vyo) aaokVar.c;
                            if (afxw.e(vyoVar2).ay && taq.as(vyoVar2) && taq.ba(vyoVar2, wjfVar3.G())) {
                                long jA2 = acfwVar.a();
                                yvsVar2 = yvsVar3;
                                long jRound = Math.round(Math.random() * Duration.ofSeconds(taq.W(vyoVar2)).toMillis());
                                snhVar = new snh(jA2 + jRound, j3 + jRound);
                                vyoVar2 = vyoVar2;
                            } else {
                                yvsVar2 = yvsVar3;
                                long jA3 = yvsVar2.a();
                                long jA4 = acfwVar.a();
                                snhVar = new snh((jA3 <= jA4 ? Duration.ofMillis(Math.max(0L, jA3 - 4000)) : Duration.ofMillis(jA4 + Math.round(Math.random() * Math.max(0L, (jA3 - jA4) - 10000)))).toMillis(), j3);
                            }
                            agjz agjzVar = new agjz(4);
                            if (afxw.e(vyoVar2).az) {
                                aixr aixrVar = aixr.TRIGGER_TYPE_SLOT_ID_SCHEDULED;
                                agjzVar.h(new smy(xscVar.Z(aixrVar), aixrVar, false, strAa));
                            } else {
                                if (taq.as(vyoVar2)) {
                                    long j4 = snhVar.b;
                                    snhVar2 = new snh(j4 - j2, j4);
                                } else {
                                    snhVar2 = new snh(yvsVar2.a(), yvsVar2.a() + j2);
                                }
                                aixr aixrVar2 = aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE;
                                agjzVar.h(slk.c(xscVar.Z(aixrVar2), str5, snhVar, true));
                                agjzVar.h(slk.c(xscVar.Z(aixrVar2), str5, snhVar2, true));
                            }
                            aixr aixrVar3 = aixr.TRIGGER_TYPE_SLOT_ID_FULFILLED_NON_EMPTY;
                            agke agkeVarQ = agke.q(new smx(xscVar.Z(aixrVar3), aixrVar3, strAa));
                            agke agkeVarG = agjzVar.g();
                            aixr aixrVar4 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
                            smv smvVar = new smv(xscVar.Z(aixrVar4), aixrVar4, false, strAa);
                            aixr aixrVar5 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
                            slt sltVar = new slt(xscVar.Z(aixrVar5), aixrVar5, false, str5, true);
                            aixr aixrVar6 = aixr.TRIGGER_TYPE_SLOT_ID_FULFILLED_EMPTY;
                            sdqVar = new sdq(agkeVarQ, agkeVarG, agke.s(smvVar, sltVar, new smw(xscVar.Z(aixrVar6), aixrVar6, strAa)));
                        } else {
                            if (taq.aH(vyoVar, wjfVar3.f().aA())) {
                                Duration durationOfSeconds = Duration.ofSeconds(afxw.e(vyoVar).G);
                                Duration durationOfSeconds2 = Duration.ofSeconds(afxw.e(vyoVar).H);
                                long jA5 = yvsVar3.a();
                                long jA6 = acfwVar.a();
                                long millis = durationOfSeconds.toMillis();
                                long millis2 = durationOfSeconds2.toMillis();
                                if (jA6 == 0) {
                                    durationOfMillis = Duration.ZERO;
                                } else {
                                    durationOfMillis = jA5 <= jA6 + millis ? Duration.ofMillis(Math.max(0L, jA5 - millis)) : Duration.ofMillis(jA6 + Math.round(Math.random() * Math.min((jA5 - jA6) - millis, millis2)));
                                }
                                optionalEmpty = Optional.of(new snh(durationOfMillis.toMillis(), j3));
                            } else {
                                optionalEmpty = Optional.empty();
                            }
                            boolean zAA2 = wjfVar3.f().aA();
                            aixr aixrVar7 = aixr.TRIGGER_TYPE_SLOT_ID_FULFILLED_NON_EMPTY;
                            agke agkeVarQ2 = agke.q(new smx(xscVar.Z(aixrVar7), aixrVar7, strAa));
                            if (taq.ac(vyoVar) && (str4 = yvsVar3.a) != null && yvsVar3.g != -1) {
                                aoqd aoqdVar = wjfVar3.f().d;
                                if ((aoqdVar.c & 131072) != 0) {
                                    akjl akjlVar = aoqdVar.F;
                                    if (akjlVar == null) {
                                        akjlVar = akjl.a;
                                    }
                                    if (akjlVar.i) {
                                        aixr aixrVar8 = aixr.TRIGGER_TYPE_DYNAMIC_DURATION_AFTER_CACHE_MISS;
                                        smyVar = new skg(xscVar.Z(aixrVar8), aixrVar8, str4);
                                        z = false;
                                    } else if (taq.aH(vyoVar, zAA2)) {
                                        z = false;
                                        smyVar = slk.c(xscVar.Z(aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE), str5, (snh) optionalEmpty.get(), false);
                                    } else {
                                        z = false;
                                        aixr aixrVar9 = aixr.TRIGGER_TYPE_SLOT_ID_SCHEDULED;
                                        smyVar = new smy(xscVar.Z(aixrVar9), aixrVar9, false, strAa);
                                    }
                                } else if (taq.aH(vyoVar, zAA2)) {
                                    z = false;
                                    smyVar = slk.c(xscVar.Z(aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE), str5, (snh) optionalEmpty.get(), false);
                                } else {
                                    z = false;
                                    aixr aixrVar10 = aixr.TRIGGER_TYPE_SLOT_ID_SCHEDULED;
                                    smyVar = new smy(xscVar.Z(aixrVar10), aixrVar10, false, strAa);
                                }
                            } else if (taq.aH(vyoVar, zAA2)) {
                                z = false;
                                smyVar = slk.c(xscVar.Z(aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE), str5, (snh) optionalEmpty.get(), false);
                            } else {
                                z = false;
                                aixr aixrVar11 = aixr.TRIGGER_TYPE_SLOT_ID_SCHEDULED;
                                smyVar = new smy(xscVar.Z(aixrVar11), aixrVar11, false, strAa);
                            }
                            agke agkeVarQ3 = agke.q(smyVar);
                            aixr aixrVar12 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
                            smv smvVar2 = new smv(xscVar.Z(aixrVar12), aixrVar12, z, strAa);
                            aixr aixrVar13 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
                            slt sltVar2 = new slt(xscVar.Z(aixrVar13), aixrVar13, false, str5, true);
                            aixr aixrVar14 = aixr.TRIGGER_TYPE_SLOT_ID_FULFILLED_EMPTY;
                            sdqVar = new sdq(agkeVarQ2, agkeVarQ3, agke.s(smvVar2, sltVar2, new smw(xscVar.Z(aixrVar14), aixrVar14, strAa)));
                            i4 = i4;
                        }
                        List listH = wjfVar3.H();
                        int i5 = true != wjfVar3.f().av() ? i4 : 1;
                        List listH2 = nre.h(listH);
                        aisu aisuVar = null;
                        if (!listH2.isEmpty()) {
                            int iBi = a.bi(((aisu) listH2.get(0)).f);
                            if (iBi == 0 || iBi != 2) {
                                if (i5 > listH2.size() || i5 <= 0) {
                                    rmp.j(null, "Attempted to fetch an midroll AdBreakRenderer whose index is out of boundary.Requested index = " + i5 + " but total size = " + listH2.size() + " fromcreateAdBreakRequestSlotFromCuePoint()");
                                } else {
                                    aisuVar = (aisu) listH2.get(i5 - 1);
                                }
                            } else if (i5 >= listH2.size() || i5 <= 0) {
                                rmp.j(null, "Attempted to fetch an midroll AdBreakRenderer whose index is out of boundary. Preroll exists. Requested index = " + i5 + " but total size = " + listH2.size() + " fromcreateAdBreakRequestSlotFromCuePoint()");
                            } else {
                                aisuVar = (aisu) listH2.get(i5);
                            }
                        }
                        if (aisuVar == null || (aivrVar = aisuVar.j) == null) {
                            aivrVar = aivr.a;
                        }
                        return Collections.singletonList(smr.b(strAa, aixoVar, 1, 1, sdqVar.a, sdqVar.b, sdqVar.c, shh.a(listAi), Optional.of(aivrVar)));
                    }
                });
            } else {
                rsn rsnVar = (rsn) this.l.io();
                String str4 = this.c;
                typ.f(str);
                smn smnVarA = rsnVar.a(str4, new smm(str));
                if (smnVarA.a.isEmpty()) {
                    this.q.b(this.c, str3, abad.CACHE_MISS_AND_ON_DEMAND_DISABLED);
                } else {
                    ((roq) this.f.io()).f(30, skh.a(this.c, this.d), new mly(this, smnVarA, yvsVar, 2));
                }
            }
            b(yvsVar, true);
            return;
        }
        String str5 = this.c;
        typ.f(str5);
        typ.f(str3);
        aaxaVar.getClass();
        smd smdVar = new smd(str5, str3, aaxaVar, i3);
        rux ruxVar = (rux) this.k.io();
        aaxa aaxaVar2 = smdVar.c;
        yvs yvsVar2 = aaxaVar2.a;
        long j2 = yvsVar2.g;
        if (j2 == j || j2 < 0) {
            ((ruu) ruxVar.g.io()).a("onci", String.format(Locale.US, "cpi.%s;cpe.%d;cps.%d;soms.%d;fallback.0", yvsVar2.a, Integer.valueOf(yvsVar2.b), Long.valueOf(yvsVar2.a()), Long.valueOf(j2)));
            rmp rmpVar = ruxVar.j;
            rmp.n(null, "Invalid or missing smearingOffsetMs in PREFETCH cuepoint. serviceId: " + smdVar.a + ", adRequestId: " + smdVar.b);
            j2 = 0L;
        }
        ruxVar.b.d(smdVar.a, smdVar.b);
        ruxVar.a.schedule(new mrh((Object) ruxVar, (Object) aaxaVar2.b, (Object) yvsVar2, (Object) smdVar, 11, (byte[]) null), j2, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.rsq
    public final void h(aazs aazsVar) {
        String strA = aazsVar.a();
        if (strA == null || !taq.ae((vyo) this.h.io())) {
            return;
        }
        ((rux) this.k.io()).b.f(strA);
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        int iOrdinal = abobVar.ordinal();
        if (iOrdinal == 0) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.m.clear();
            this.b = 0;
            this.n = null;
            this.p = false;
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 8) {
                this.p = true;
            }
        } else if (s(wjfVar)) {
            this.c = str;
            this.d = wjfVar;
            this.e = acfwVar;
            acga acgaVarG = acfwVar.g();
            if (acgaVarG != null) {
                awmd awmdVar = this.g;
                acgaVarG.w((zdj) awmdVar.io());
                acgaVarG.v((zdj) awmdVar.io());
            }
        }
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
