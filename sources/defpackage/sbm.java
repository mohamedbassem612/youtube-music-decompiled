package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sbm implements scg, rsq, rsp, sah, sai {
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final sci f;
    private final vyo g;
    private final tun h;
    private final vwt l = new vwt((byte[]) null, (char[]) null, (byte[]) null);
    final Map a = new HashMap();
    private abnr k = abnr.DEFAULT;
    private String i = "";
    private long j = -1;

    public sbm(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, sci sciVar, vyo vyoVar, tun tunVar) {
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.e = awmdVar4;
        this.f = sciVar;
        this.g = vyoVar;
        this.h = tunVar;
    }

    private final boolean s(smr smrVar) {
        return nrj.i(smrVar, this.g);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00da  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.CharSequence, java.lang.Object] */
    private final void t(long j, String str, int i) {
        int i2;
        slj sljVar;
        vwt vwtVar;
        String str2;
        sni sniVarY;
        ofg ofgVar;
        snk snkVar;
        ofg ofgVarH;
        Optional optionalOfNullable = ((rud) this.e.io()).a;
        int i3 = 0;
        rub rubVar = new rub(str, i3);
        if (true == optionalOfNullable.isPresent()) {
            if (true != TextUtils.equals(rubVar.a, ((sgi) optionalOfNullable.get()).e)) {
                optionalOfNullable = Optional.empty();
            }
        }
        umd umdVar = new umd(j, 1);
        if (true == optionalOfNullable.isPresent()) {
            Object obj = optionalOfNullable.get();
            long j2 = umdVar.a;
            int i4 = 3;
            while (true) {
                if (i4 <= 0) {
                    i2 = i3;
                    i4 = i2;
                    break;
                } else {
                    i2 = i3;
                    if (j2 >= (((sgi) obj).f * ((long) i4)) / 4) {
                        break;
                    }
                    i4--;
                    i3 = i2;
                }
            }
            if (i4 != 0) {
                sgi sgiVar = (sgi) obj;
                if (i4 > sgiVar.c) {
                    sgiVar.c = i4;
                    ofgVarH = sgiVar.h(i4);
                } else {
                    ofgVarH = null;
                }
            } else {
                ofgVarH = null;
            }
            optionalOfNullable = Optional.ofNullable(ofgVarH);
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        Map map = this.a;
        if (map.containsKey(str)) {
            Queue queue = (Queue) map.get(str);
            while (!queue.isEmpty() && j >= ((slj) queue.peek()).d.a) {
                slj sljVar2 = (slj) queue.peek();
                if (sljVar2 != null) {
                    sni sniVarY2 = this.l.Y(sljVar2.a);
                    smr smrVar = sniVarY2 == null ? null : sniVarY2.c;
                    if (smrVar != null) {
                        if (!s(smrVar)) {
                            if (i != 1) {
                                break;
                            }
                            sljVar = (slj) queue.poll();
                            vwtVar = this.l;
                            str2 = sljVar.a;
                            if (!vwtVar.ac(str2)) {
                                rmp.n(null, "Ping migration VideoTimeEventTriggerAdapter: bundle map doesn't contain the activated trigger");
                                break;
                            }
                            if (sljVar.b) {
                            }
                            sniVarY = vwtVar.Y(str2);
                            ofgVar = (ofg) optionalOfNullable.orElse(null);
                            snkVar = sniVarY.b;
                            if (snkVar instanceof slj) {
                                sht[] shtVarArr = new sht[1];
                                shtVarArr[i2] = new shi(ofgVar);
                                sniVarY = new sni(sniVarY, shh.b(shtVarArr));
                            }
                            arrayList.add(sniVarY);
                        } else {
                            if (i != 2) {
                                break;
                            }
                            sljVar = (slj) queue.poll();
                            vwtVar = this.l;
                            str2 = sljVar.a;
                            if (!vwtVar.ac(str2)) {
                                rmp.n(null, "Ping migration VideoTimeEventTriggerAdapter: bundle map doesn't contain the activated trigger");
                                break;
                            }
                            if (sljVar.b) {
                            }
                            sniVarY = vwtVar.Y(str2);
                            ofgVar = (ofg) optionalOfNullable.orElse(null);
                            snkVar = sniVarY.b;
                            if (snkVar instanceof slj) {
                                sht[] shtVarArr2 = new sht[1];
                                shtVarArr2[i2] = new shi(ofgVar);
                                sniVarY = new sni(sniVarY, shh.b(shtVarArr2));
                            }
                            arrayList.add(sniVarY);
                        }
                    } else {
                        if (i != 1) {
                            break;
                        }
                        sljVar = (slj) queue.poll();
                        vwtVar = this.l;
                        str2 = sljVar.a;
                        if (!vwtVar.ac(str2)) {
                            rmp.n(null, "Ping migration VideoTimeEventTriggerAdapter: bundle map doesn't contain the activated trigger");
                            break;
                        }
                        if (sljVar.b) {
                        }
                        sniVarY = vwtVar.Y(str2);
                        ofgVar = (ofg) optionalOfNullable.orElse(null);
                        snkVar = sniVarY.b;
                        if (snkVar instanceof slj) {
                            sht[] shtVarArr3 = new sht[1];
                            shtVarArr3[i2] = new shi(ofgVar);
                            sniVarY = new sni(sniVarY, shh.b(shtVarArr3));
                        }
                        arrayList.add(sniVarY);
                    }
                } else {
                    if (i != 1) {
                        break;
                    }
                    sljVar = (slj) queue.poll();
                    vwtVar = this.l;
                    str2 = sljVar.a;
                    if (!vwtVar.ac(str2)) {
                        rmp.n(null, "Ping migration VideoTimeEventTriggerAdapter: bundle map doesn't contain the activated trigger");
                        break;
                    }
                    if (sljVar.b || !this.f.a(sljVar.c)) {
                        sniVarY = vwtVar.Y(str2);
                        ofgVar = (ofg) optionalOfNullable.orElse(null);
                        snkVar = sniVarY.b;
                        if ((snkVar instanceof slj) && ((slj) snkVar).e && ofgVar != null) {
                            sht[] shtVarArr4 = new sht[1];
                            shtVarArr4[i2] = new shi(ofgVar);
                            sniVarY = new sni(sniVarY, shh.b(shtVarArr4));
                        }
                        arrayList.add(sniVarY);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.b.io()).q(arrayList);
    }

    @Override // defpackage.scg
    public final void A(snk snkVar) {
        sni sniVarZ = this.l.Z(snkVar.b());
        if (sniVarZ != null) {
            ((xsc) this.d.io()).ab((acfw) sniVarZ.c.d(sjy.class), snkVar.b());
            if (snkVar instanceof slj) {
                this.a.remove(((slj) snkVar).c);
            }
        }
    }

    @Override // defpackage.sah
    public final void W(smr smrVar, sko skoVar) {
        if (smrVar.e(sjy.class)) {
            long jA = ((acfw) smrVar.d(sjy.class)).a();
            if (jA < 0) {
                rmp.m(smrVar, skoVar, a.bS(jA, "VideoPlayback.getCurrentVideoPositionMillis() returns a negative value: "));
            }
        }
    }

    @Override // defpackage.rsq
    public final void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
        this.k = abnrVar;
    }

    @Override // defpackage.sai
    public final void b(smr smrVar, sko skoVar, int i) {
        if (i == 6 && smrVar.e(sjy.class)) {
            long jA = ((acfw) smrVar.d(sjy.class)).a();
            if (jA < 0) {
                rmp.m(smrVar, skoVar, a.bS(jA, "VideoPlayback.getCurrentVideoPositionMillis() returns a negative value: "));
            }
        }
    }

    @Override // defpackage.rsp
    public final void c(String str, boolean z, boolean z2, boolean z3) {
        sni sniVarY = this.l.Y(str);
        if (sniVarY != null) {
            snk snkVar = sniVarY.b;
            boolean z4 = snkVar instanceof slk;
            if (z4) {
                if (z3) {
                    return;
                } else {
                    z3 = false;
                }
            }
            smr smrVar = sniVarY.c;
            if (smrVar.c() == aixo.SLOT_TYPE_PLAYER_BYTES && sniVarY.a == 8) {
                if (z || z3) {
                    return;
                }
                if (z4 && ((slk) snkVar).d) {
                    if (z2) {
                        return;
                    } else {
                        z2 = false;
                    }
                }
                if (snkVar instanceof slj) {
                    slj sljVar = (slj) snkVar;
                    if ((sljVar.b && this.f.a(sljVar.c)) || s(smrVar)) {
                        return;
                    }
                }
                ((tbt) this.c.io()).e(new aboj());
            }
            boolean z5 = smrVar.e(sid.class) && ((wjf) smrVar.d(sid.class)).V();
            boolean z6 = smrVar.e(sid.class) && ((wjf) smrVar.d(sid.class)).P();
            aosq aosqVar = null;
            slm slmVar = smrVar.e(shx.class) ? (slm) smrVar.d(shx.class) : null;
            vyo vyoVar = this.g;
            if (taq.at(vyoVar, z5, z6, slmVar == slm.PRE_ROLL, slmVar == slm.MID_ROLL, slmVar == slm.POST_ROLL, false)) {
                sniVarY = new sni(sniVarY, shh.b(new siy(z2)));
            }
            if (taq.aL(vyoVar)) {
                snk snkVar2 = sniVarY.b;
                if (snkVar2 instanceof slk) {
                    slk slkVar = (slk) snkVar2;
                    if (slkVar.h) {
                        int iOrdinal = this.k.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 2) {
                                return;
                            }
                            if (!slkVar.e) {
                                rmp.k(sniVarY.c, "WatchWhile ad dropped due to not allowed in fullscreen");
                                return;
                            }
                        } else if (!slkVar.f) {
                            rmp.k(sniVarY.c, "WatchWhile ad dropped due to not allowed in default");
                            return;
                        }
                        tun tunVar = this.h;
                        long jB = tunVar.c.b();
                        long j = tunVar.a;
                        long j2 = j != -1 ? jB - j : -1L;
                        long j3 = afxw.e(vyoVar).bj;
                        if (j3 > 0 && j2 > j3) {
                            rmp.k(sniVarY.c, a.cr(j3, j2, "WatchWhile ad dropped due to lact: ", " > "));
                            return;
                        }
                    }
                }
            }
            if (taq.aO(vyoVar)) {
                snk snkVar3 = sniVarY.b;
                if (snkVar3 instanceof slk) {
                    aosr aosrVar = ((slk) snkVar3).g;
                    if (aosrVar.c.size() != 0) {
                        int iOrdinal2 = this.k.ordinal();
                        if (iOrdinal2 == 0) {
                            aosqVar = aosq.STANDARD;
                        } else if (iOrdinal2 == 2) {
                            aosqVar = aosq.FULLSCREEN;
                        }
                        if (aosqVar == null || !new aihx(aosrVar.c, aosr.a).contains(aosqVar)) {
                            return;
                        }
                    }
                }
            }
            ((rsk) this.b.io()).q(Arrays.asList(sniVarY));
        }
    }

    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        this.i = str;
        this.j = j;
        t(j, str, 1);
    }

    @Override // defpackage.rsq
    public final void p(String str, long j, int i) {
        if (i == 3) {
            t(j, str, 2);
        }
    }

    @Override // defpackage.scg
    public final void z(int i, snk snkVar, smr smrVar, sko skoVar) throws sau {
        String str;
        snh snhVar;
        boolean z;
        vwt vwtVar = this.l;
        if (vwtVar.ac(snkVar.b())) {
            throw new sau("Tried to register duplicate trigger: ".concat(String.valueOf(String.valueOf(snkVar))), 12);
        }
        if (snkVar instanceof slj) {
            slj sljVar = (slj) snkVar;
            ((Queue) j$.util.Map.EL.computeIfAbsent(this.a, sljVar.c, new rxg(8))).add(sljVar);
            vwtVar.ab(sljVar.a, new sni(i, sljVar, smrVar, skoVar));
            return;
        }
        if (!smrVar.e(sjy.class)) {
            throw new sau("Slot is required to have VideoPlayback in metadata to register trigger: ".concat(String.valueOf(String.valueOf(snkVar))), 21);
        }
        sni sniVar = new sni(i, snkVar, smrVar, skoVar);
        if (snkVar instanceof slk) {
            slk slkVar = (slk) snkVar;
            str = slkVar.a;
            snhVar = slkVar.b;
            if (s(smrVar)) {
                long j = snhVar.a;
                snhVar = new snh(j, j);
            }
            z = slkVar.c;
        } else {
            if (!(snkVar instanceof skb)) {
                throw new sau("Incorrect TriggerType: Tried to register trigger " + snkVar.a().name() + " in CueRangeTriggerAdapter", 4);
            }
            skb skbVar = (skb) snkVar;
            str = skbVar.a;
            snhVar = new snh(9223372036854775806L, 9223372036854775806L);
            z = skbVar.b;
        }
        boolean z2 = z;
        String str2 = str;
        snh snhVar2 = snhVar;
        vwtVar.ab(snkVar.b(), sniVar);
        try {
            ((xsc) this.d.io()).ac(this, (acfw) smrVar.d(sjy.class), snhVar2.a, snhVar2.b, 2, i == 8 ? 3 : 2, snkVar.b());
            if (z2 || !TextUtils.equals(this.i, str2)) {
                return;
            }
            long jA = ((acfw) smrVar.d(sjy.class)).a();
            long j2 = this.j;
            smr smrVar2 = sniVar.c;
            boolean z3 = smrVar2.e(sid.class) && ((wjf) smrVar2.d(sid.class)).V();
            boolean z4 = smrVar2.e(sid.class) && ((wjf) smrVar2.d(sid.class)).P();
            if (!z3 || z4 || !(sniVar.b instanceof slk) || sniVar.a != 8 || smrVar2.c() != aixo.SLOT_TYPE_PLAYER_BYTES) {
                boolean z5 = smrVar2.e(sid.class) && ((wjf) smrVar2.d(sid.class)).P();
                if (!afxw.e(this.g).aA || !z5) {
                    jA = j2;
                }
            }
            if (snhVar2.a(jA)) {
                ((rsk) this.b.io()).q(Arrays.asList(sniVar));
            }
        } catch (rso e) {
            throw new sau(e.toString(), e, e.a);
        }
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
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }
}
