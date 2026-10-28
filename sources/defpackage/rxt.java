package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_MEDIA, b = aixo.SLOT_TYPE_PLAYER_BYTES, c = {sjb.class}, d = {sjy.class, sic.class})
public final class rxt implements rxj, rsq {
    private final rsr a;
    private final saq b;
    private final smr c;
    private final sko d;
    private final vyo e;
    private final slb f;
    private final acfw g;
    private boolean h = false;
    private final rsk i;
    private final sdo j;
    private final abxu k;
    private final rmp l;

    public rxt(rsk rskVar, rsr rsrVar, saq saqVar, smr smrVar, sko skoVar, sdo sdoVar, rmp rmpVar, vyo vyoVar, abxu abxuVar) {
        this.i = rskVar;
        this.a = rsrVar;
        this.b = saqVar;
        this.c = smrVar;
        this.d = skoVar;
        this.j = sdoVar;
        this.l = rmpVar;
        this.e = vyoVar;
        this.k = abxuVar;
        this.f = (slb) skoVar.d(sjb.class);
        this.g = (acfw) smrVar.d(sjy.class);
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        this.i.d(this.c, this.d, i);
    }

    @Override // defpackage.rxj
    public final void S() {
        this.a.h(this);
    }

    @Override // defpackage.rxj
    public final sko a() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0037 A[Catch: sas -> 0x01ab, rso | sas -> 0x01ad, TryCatch #2 {rso | sas -> 0x01ad, blocks: (B:3:0x001b, B:5:0x0026, B:7:0x0030, B:9:0x0043, B:11:0x006f, B:13:0x0077, B:15:0x007d, B:17:0x008f, B:19:0x0095, B:21:0x009b, B:22:0x009f, B:24:0x00a5, B:26:0x00b1, B:27:0x00be, B:28:0x00bf, B:30:0x00c3, B:33:0x00ca, B:35:0x00ce, B:38:0x00d4, B:39:0x00fb, B:41:0x0101, B:43:0x0112, B:44:0x0116, B:45:0x016d, B:47:0x0173, B:51:0x018e, B:52:0x0195, B:53:0x0196, B:54:0x019d, B:49:0x0181, B:50:0x018d, B:55:0x019e, B:56:0x01aa, B:8:0x0037), top: B:62:0x001b }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [acio, acjs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.rxj
    public final void b() {
        long jLongValue;
        acip acipVarM;
        acjb acjbVarX;
        slb slbVar = this.f;
        slbVar.c().k().b("dibs", true);
        this.a.e(this);
        try {
            smr smrVar = this.c;
            agke agkeVar = smrVar.d;
            if (agkeVar.isEmpty()) {
                jLongValue = nrj.p(smrVar, this.d, this.e).longValue();
            } else {
                snk snkVar = (snk) agkeVar.get(0);
                if (snkVar instanceof slk) {
                    jLongValue = ((slk) snkVar).b.b;
                } else {
                    jLongValue = nrj.p(smrVar, this.d, this.e).longValue();
                }
            }
            long j = jLongValue;
            sdo sdoVar = this.j;
            acfw acfwVar = this.g;
            wjf wjfVarC = slbVar.c();
            String str = slbVar.o;
            sdoVar.h(acfwVar, j, false, 0L, sdo.l(wjfVarC, str, acfwVar, abnp.a().a(), true));
            acjt acjtVar = null;
            String str2 = smrVar.e(sic.class) ? (String) smrVar.d(sic.class) : null;
            if (TextUtils.isEmpty(str2)) {
                rmp.m(smrVar, this.d, "Missing or empty content CPN for DIBS playback.");
                throw new sas("Missing or empty content CPN for DIBS playback.", 52);
            }
            abxu abxuVar = this.k;
            agke agkeVarR = agke.r(str2, str);
            ?? r5 = ((abwk) abxuVar.d.io()).d;
            if (r5 != 0 && (acipVarM = r5.m()) != null && (acjbVarX = acipVarM.x()) != null) {
                agqs agqsVarListIterator = agkeVarR.listIterator(0);
                while (agqsVarListIterator.hasNext()) {
                    String str3 = (String) agqsVarListIterator.next();
                    if (acjbVarX.c(str3) == null) {
                        throw new IllegalArgumentException(a.bT(str3, "CPN ", " is not in the current timeline"));
                    }
                }
                acic acicVar = r5 instanceof acic ? (acic) r5 : null;
                if (acicVar == null) {
                    throw new IllegalStateException("Director does not implement Interruptable");
                }
                acij acijVar = r5 instanceof acij ? (acij) r5 : null;
                if (acijVar == null) {
                    throw new IllegalStateException("Director does not implement LoopingDelegate");
                }
                acic acicVar2 = acicVar;
                List listF = acjb.F(acjbVarX, null, 0L, Long.MAX_VALUE, false, (abmt) abxuVar.b, abxuVar.e);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listF) {
                    if (agkeVarR.contains(((aciu) obj).d())) {
                        arrayList.add(obj);
                    }
                }
                ?? r10 = abxuVar.c;
                r10.b(arrayList);
                r10.c(agkeVarR);
                r10.d("");
                r10.i(null);
                r10.j(null);
                r10.m(acipVarM.a());
                r10.e(acicVar2);
                r10.k(acjbVarX);
                r10.f(false);
                r10.h(acijVar);
                r10.g((xir) acipVarM.d().a());
                r10.l(acipVarM.j());
                r10.n((ahhp) acipVarM.e().a());
                acjtVar = (acjt) r10.a();
                acjtVar.bt();
                agqs agqsVarListIterator2 = agkeVarR.listIterator(0);
                while (agqsVarListIterator2.hasNext()) {
                    abxuVar.f.put((String) agqsVarListIterator2.next(), acjtVar);
                }
            }
            if (acjtVar == null) {
                rmp.m(smrVar, this.d, "Failed to initialize VirtualSingleVideoComponent for DIBS playback.");
                throw new sas("Failed to initialize VirtualSingleVideoComponent for DIBS playback.", 115);
            }
        } catch (rso | sas e) {
            this.i.u(this.c, this.d, new sas(ahno.Z(e.getMessage()), ((sar) e).a()), 9);
        }
    }

    @Override // defpackage.rsq
    public final void j(aayt aaytVar) {
        String str = aaytVar.b;
        if (str == null || !TextUtils.equals(str, this.f.o) || this.h || aaytVar.a != abnv.f) {
            return;
        }
        this.h = true;
        this.i.b(this.c, this.d);
    }

    @Override // defpackage.rsq
    public final void o(int i, String str) {
        if (TextUtils.equals(str, this.f.o)) {
            if (i == 7) {
                this.b.ab(this.d, 0);
            } else if (i == 8) {
                this.i.u(this.c, this.d, new sas("Player state error during DIBS playback.", 23), 16);
            }
        }
    }

    @Override // defpackage.rxj
    public final void M() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
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
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
