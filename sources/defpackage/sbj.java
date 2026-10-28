package defpackage;

import android.text.TextUtils;
import j$.util.Map;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sbj extends sbk implements sao, sap, sal, sam, san, saj, sak, sah, sai {
    public final awmd a;
    public final HashMap b;
    public final HashMap c;
    private final sci h;
    private final vyo i;
    private final awmd j;
    private final sbi m;
    private final Set k = new HashSet();
    public final Set e = new HashSet();
    public final Set d = new HashSet();
    private final Set l = new HashSet();
    public final Set f = new HashSet();

    public sbj(awmd awmdVar, sci sciVar, rsr rsrVar, vyo vyoVar, awmd awmdVar2) {
        this.a = awmdVar;
        this.h = sciVar;
        this.j = awmdVar2;
        this.i = vyoVar;
        sbi sbiVar = new sbi(this);
        this.m = sbiVar;
        rsrVar.e(sbiVar);
        this.b = new HashMap();
        this.c = new HashMap();
    }

    @Override // defpackage.sah
    public final void W(smr smrVar, sko skoVar) {
        Set set = this.f;
        String str = skoVar.a;
        set.add(str);
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            snk snkVar = sniVar.b;
            if ((snkVar instanceof skv) && TextUtils.equals(str, ((skv) snkVar).a)) {
                arrayList.add(sniVar);
            }
            if (snkVar instanceof sln) {
                sln slnVar = (sln) snkVar;
                if (smrVar.c() == slnVar.b && skoVar.b == slnVar.c && !TextUtils.equals(str, slnVar.a)) {
                    arrayList.add(sniVar);
                }
            }
            j(arrayList, sniVar, agdf.a, agev.i(str));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.a.io()).q(arrayList);
    }

    @Override // defpackage.sap
    public final void X(smr smrVar) {
        Set set = this.k;
        String str = smrVar.a;
        set.remove(str);
        this.d.remove(str);
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            snk snkVar = sniVar.b;
            if ((snkVar instanceof smz) && TextUtils.equals(((smz) snkVar).e(), str)) {
                arrayList.add(sniVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.a.io()).q(arrayList);
    }

    @Override // defpackage.sbk
    protected final void Z(snk snkVar, smr smrVar) {
        if ((snkVar instanceof smy) && this.k.contains(((smy) snkVar).a)) {
            ((rsk) this.a.io()).q(Arrays.asList(this.g.Y(snkVar.b())));
        }
        if ((snkVar instanceof smu) && this.e.contains(((smu) snkVar).a)) {
            ((rsk) this.a.io()).q(Arrays.asList(this.g.Y(snkVar.b())));
        }
        if ((snkVar instanceof skv) && this.f.contains(((skv) snkVar).a)) {
            ((rsk) this.a.io()).q(Arrays.asList(this.g.Y(snkVar.b())));
        }
    }

    @Override // defpackage.sbk
    protected final void aa(snk snkVar, smr smrVar, sko skoVar) throws sau {
        if (snkVar instanceof skw) {
            Set set = this.l;
            String str = ((skw) snkVar).a;
            if (!set.contains(str) && (skoVar == null || !TextUtils.equals(str, skoVar.a))) {
                throw new sau("LayoutIdExitedTrigger has unrecognized layoutId", 83);
            }
        }
        if (snkVar instanceof skr) {
            skr skrVar = (skr) snkVar;
            if (!this.l.contains(skrVar.f()) && (skoVar == null || !TextUtils.equals(skrVar.f(), skoVar.a))) {
                throw new sau("LayoutExitedForOtherReasonTrigger has unrecognized layoutId", 85);
            }
        }
        if (snkVar instanceof smv) {
            Set set2 = this.k;
            String str2 = ((smv) snkVar).a;
            if (!set2.contains(str2) && !TextUtils.equals(str2, smrVar.a)) {
                throw new sau("SlotIdExitedTrigger has unrecognized slotId", 86);
            }
        }
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return agkz.u(smy.class, smz.class, smt.class, smu.class, smv.class, smw.class, smx.class, sln.class, slu.class, skv.class, skw.class, skt.class, sks.class, skr.class, sku.class, sly.class);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    @Override // defpackage.sai
    public final void b(smr smrVar, sko skoVar, int i) {
        wgk wgkVar;
        Set set = this.f;
        String str = skoVar.a;
        set.remove(str);
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            snk snkVar = sniVar.b;
            if ((snkVar instanceof skw) && TextUtils.equals(str, ((skw) snkVar).a)) {
                arrayList.add(sniVar);
            }
            if (snkVar instanceof skt) {
                skt sktVar = (skt) snkVar;
                if (TextUtils.equals(str, sktVar.a) && sktVar.b.e(i)) {
                    arrayList.add(sniVar);
                }
            }
            if (snkVar instanceof sks) {
                sks sksVar = (sks) snkVar;
                if (TextUtils.equals(str, sksVar.b)) {
                    ahbo ahboVar = sksVar.d;
                    if (ahboVar.e(i) && (!sksVar.a || !this.h.a(sksVar.c))) {
                        smrVar.getClass();
                        skoVar.getClass();
                        sksVar.getClass();
                        if (ahboVar.e(0) && smrVar.e(shl.class) && (wgkVar = (wgk) smrVar.d(shl.class)) != null && nrj.j(wgkVar, this.i)) {
                            String str2 = (skoVar.e(sjb.class) && skoVar.b == aixg.LAYOUT_TYPE_MEDIA) ? ((slb) skoVar.d(sjb.class)).o : "";
                            long jLongValue = ((Long) Map.EL.getOrDefault(this.b, str2, 0L)).longValue();
                            long jLongValue2 = ((Long) Map.EL.getOrDefault(this.c, str2, 0L)).longValue();
                            long j = jLongValue2 - 500;
                            if (jLongValue <= 0 || jLongValue2 <= 0 || jLongValue >= j) {
                                arrayList.add(sniVar);
                            }
                        } else {
                            arrayList.add(sniVar);
                        }
                    }
                }
            }
            if (snkVar instanceof skr) {
                skr skrVar = (skr) snkVar;
                if (TextUtils.equals(str, skrVar.f()) && skrVar.e() != i) {
                    arrayList.add(sniVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.a.io()).q(arrayList);
    }

    @Override // defpackage.saj
    public final void c(sko skoVar) {
        this.l.add(skoVar.a);
    }

    @Override // defpackage.sal
    public final void d(smr smrVar) {
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            snk snkVar = sniVar.b;
            if (snkVar instanceof slu) {
                agke agkeVar = ((slu) snkVar).a;
                int size = agkeVar.size();
                for (int i = 0; i < size; i++) {
                    if (smrVar.c() == ((aixo) agkeVar.get(i))) {
                        arrayList.add(sniVar);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.a.io()).q(arrayList);
    }

    @Override // defpackage.sal
    public final void e(smr smrVar) {
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            snk snkVar = sniVar.b;
            if ((snkVar instanceof smt) && TextUtils.equals(((smt) snkVar).c(), smrVar.a)) {
                arrayList.add(sniVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.a.io()).q(arrayList);
    }

    @Override // defpackage.sam
    public final void f(smr smrVar) {
        agev agevVarI;
        if (smrVar.c() == aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE && afxw.e(this.i).bE) {
            Optional optional = smrVar.i;
            sko skoVar = (sko) optional.orElse(null);
            if (skoVar == null && smrVar.e(sjk.class)) {
                skoVar = (sko) smrVar.d(sjk.class);
            }
            if (skoVar == null) {
                agevVarI = agdf.a;
                break;
            }
            int i = 0;
            while (true) {
                agke agkeVar = skoVar.d;
                if (i >= ((agpi) agkeVar).d) {
                    agevVarI = agdf.a;
                    break;
                }
                snk snkVar = (snk) agkeVar.get(i);
                i++;
                if (snkVar instanceof sln) {
                    agevVarI = agev.i(((sln) snkVar).a);
                    break;
                }
            }
            if (agevVarI.g()) {
                int i2 = this.f.contains(agevVarI.c()) ? 4 : this.l.contains(agevVarI.c()) ? 3 : 2;
                sko skoVar2 = smrVar.e(sjk.class) ? (sko) smrVar.d(sjk.class) : (sko) optional.orElse(null);
                aihf aihfVarCreateBuilder = aizp.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aizp aizpVar = (aizp) aihfVarCreateBuilder.instance;
                aizpVar.c = i2 - 1;
                aizpVar.b |= 1;
                aizp aizpVar2 = (aizp) aihfVarCreateBuilder.build();
                spv spvVar = (spv) this.j.io();
                aihf aihfVarCreateBuilder2 = aizg.a.createBuilder();
                aixn aixnVar = aixn.RENDERING_EVENT_TYPE_WN_EP_MEDIA_AD_PLAYBACK_STATE;
                aihfVarCreateBuilder2.copyOnWrite();
                aizg aizgVar = (aizg) aihfVarCreateBuilder2.instance;
                aizgVar.e = aixnVar.C;
                aizgVar.b |= 1;
                aihfVarCreateBuilder2.copyOnWrite();
                aizg aizgVar2 = (aizg) aihfVarCreateBuilder2.instance;
                aizpVar2.getClass();
                aizgVar2.d = aizpVar2;
                aizgVar2.c = 14;
                spvVar.a((aizg) aihfVarCreateBuilder2.build(), skh.a("", null), smrVar, skoVar2);
            }
        }
        Set set = this.e;
        String str = smrVar.a;
        set.add(str);
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            snk snkVar2 = sniVar.b;
            if ((snkVar2 instanceof smu) && TextUtils.equals(((smu) snkVar2).a, str)) {
                arrayList.add(sniVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.a.io()).q(arrayList);
    }

    @Override // defpackage.san
    public final void g(smr smrVar) {
        Set set = this.e;
        String str = smrVar.a;
        set.remove(str);
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            snk snkVar = sniVar.b;
            if ((snkVar instanceof smv) && TextUtils.equals(((smv) snkVar).a, str)) {
                arrayList.add(sniVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.a.io()).q(arrayList);
    }

    @Override // defpackage.sao
    public final void h(smr smrVar) {
        Set set = this.k;
        String str = smrVar.a;
        set.add(str);
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            snk snkVar = sniVar.b;
            if ((snkVar instanceof smy) && TextUtils.equals(((smy) snkVar).a, str)) {
                arrayList.add(sniVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.a.io()).q(arrayList);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.CharSequence, java.lang.Object] */
    public final void j(List list, sni sniVar, agev agevVar, agev agevVar2) {
        snk snkVar = sniVar.b;
        if (snkVar instanceof sku) {
            sku skuVar = (sku) snkVar;
            if (agevVar.g() || agevVar2.g()) {
                if (!agevVar.g() || TextUtils.equals(agevVar.c(), skuVar.b)) {
                    if ((!agevVar2.g() || TextUtils.equals(agevVar2.c(), skuVar.a)) && this.d.contains(skuVar.b) && this.f.contains(skuVar.a)) {
                        list.add(sniVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.sak
    public final void w(sko skoVar) {
        this.l.remove(skoVar.a);
    }
}
