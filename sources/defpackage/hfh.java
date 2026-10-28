package defpackage;

import android.view.View;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class hfh implements View.OnClickListener {
    final /* synthetic */ hfk a;
    private final amlg b;
    private final aihh c;

    public hfh(hfk hfkVar, aihh aihhVar, amlg amlgVar) {
        this.a = hfkVar;
        this.c = aihhVar;
        this.b = amlgVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aduw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v37, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v41, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v43, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v47, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v49, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v51, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v53, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v55, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v57, types: [awmd, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        amlg amlgVar;
        xhc xhcVarB;
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amcx.a.createBuilder();
        int i = true != view.isSelected() ? 2 : 3;
        aihfVarCreateBuilder2.copyOnWrite();
        amcx amcxVar = (amcx) aihfVarCreateBuilder2.instance;
        amcxVar.c = i - 1;
        amcxVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amcx amcxVar2 = (amcx) aihfVarCreateBuilder2.build();
        amcxVar2.getClass();
        amddVar.l = amcxVar2;
        amddVar.b |= 32768;
        amdd amddVar2 = (amdd) aihfVarCreateBuilder.build();
        amlg amlgVar2 = this.b;
        amlg amlgVar3 = amlg.LIKE;
        if (amlgVar2 == amlgVar3) {
            amlgVar = view.isSelected() ? amlg.INDIFFERENT : amlgVar3;
            xhcVarB = xhb.b(98171);
        } else {
            amlgVar = view.isSelected() ? amlg.INDIFFERENT : amlg.DISLIKE;
            xhcVarB = xhb.b(98173);
        }
        amlg amlgVar4 = amlgVar;
        hfk hfkVar = this.a;
        hfkVar.j.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhcVarB), amddVar2);
        aihh aihhVar = this.c;
        if (hfkVar.b.u()) {
            vxz vxzVar = hfkVar.n;
            if (!vxzVar.m(8, 45661900L) && amlgVar4 == amlgVar3) {
                hfkVar.i.b();
            }
            amks amksVar = (amks) aihhVar.build();
            Optional optionalEb = yno.eb(amlgVar4, (aihh) amksVar.toBuilder());
            hfkVar.a(amlgVar4);
            if (optionalEb.isPresent()) {
                hfkVar.a.c((ajwo) optionalEb.get(), hfkVar.l);
            } else if (vxzVar.m(8, 45661900L)) {
                vxe vxeVar = hfkVar.a;
                aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
                aihl aihlVar = amla.b;
                aihf aihfVarCreateBuilder3 = amla.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                amla amlaVar = (amla) aihfVarCreateBuilder3.instance;
                amlaVar.f = amlgVar4.e;
                amlaVar.c |= 1;
                amlh amlhVar = amksVar.c;
                if (amlhVar == null) {
                    amlhVar = amlh.a;
                }
                aihfVarCreateBuilder3.copyOnWrite();
                amla amlaVar2 = (amla) aihfVarCreateBuilder3.instance;
                amlhVar.getClass();
                amlaVar2.g = amlhVar;
                amlaVar2.c |= 2;
                aihhVar2.e(aihlVar, (amla) aihfVarCreateBuilder3.build());
                aigj aigjVar = amksVar.e;
                aihhVar2.copyOnWrite();
                ajwo ajwoVar = (ajwo) aihhVar2.instance;
                aigjVar.getClass();
                ajwoVar.b |= 1;
                ajwoVar.c = aigjVar;
                vxeVar.c((ajwo) aihhVar2.build(), hfkVar.l);
            } else {
                gqd gqdVar = new gqd(4);
                amlg amlgVarA = amlg.a(amksVar.d);
                amlg amlgVar5 = amlgVarA == null ? amlgVar3 : amlgVarA;
                int iOrdinal = amlgVar4.ordinal();
                if (iOrdinal == 0) {
                    wqm wqmVar = hfkVar.m;
                    wqo wqoVarB = wqmVar.b();
                    if (optionalEb.isPresent()) {
                        wqoVarB.e((ajwo) optionalEb.get());
                    } else {
                        wqoVarB.o(amksVar.e.G());
                        amlh amlhVar2 = amksVar.c;
                        if (amlhVar2 == null) {
                            amlhVar2 = amlh.a;
                        }
                        wqoVarB.F(amlhVar2);
                    }
                    jan janVar = hfkVar.q;
                    qcb qcbVar = new qcb(hfkVar, null);
                    vxe vxeVar2 = (vxe) janVar.d.io();
                    vxeVar2.getClass();
                    ttm ttmVar = (ttm) janVar.e.io();
                    ttmVar.getClass();
                    jin jinVar = (jin) janVar.h.io();
                    jinVar.getClass();
                    huf hufVar = (huf) janVar.a.io();
                    hufVar.getClass();
                    hpy hpyVar = (hpy) janVar.b.io();
                    hpyVar.getClass();
                    hpb hpbVar = (hpb) janVar.c.io();
                    hpbVar.getClass();
                    Executor executor = (Executor) janVar.f.io();
                    executor.getClass();
                    vxz vxzVar2 = (vxz) janVar.g.io();
                    vxzVar2.getClass();
                    amksVar.getClass();
                    hfl hflVar = new hfl(vxeVar2, ttmVar, jinVar, hufVar, hpyVar, hpbVar, executor, vxzVar2, amksVar, qcbVar);
                    taf.i(wqmVar.g(wqoVarB, MoreExecutors.directExecutor()), hfkVar.h, new hfg(hfkVar, amlgVar5, amlgVar4, hflVar, 0), new gln(hflVar, 9), gqdVar);
                } else if (iOrdinal == 1) {
                    amlh amlhVar3 = amksVar.c;
                    if (amlhVar3 == null) {
                        amlhVar3 = amlh.a;
                    }
                    if (amlhVar3.c.equals(hfkVar.d.n())) {
                        abvc abvcVar = hfkVar.e;
                        if (abvcVar.n(abtu.a)) {
                            abvcVar.i(hfkVar.f.c(abtt.NEXT, null, null));
                        } else if ((amksVar.b & 32768) != 0) {
                            vxe vxeVar3 = hfkVar.a;
                            ajwo ajwoVar2 = amksVar.h;
                            if (ajwoVar2 == null) {
                                ajwoVar2 = ajwo.a;
                            }
                            vxeVar3.c(ajwoVar2, null);
                        }
                    }
                    wqn wqnVarA = hfkVar.m.a();
                    if (optionalEb.isPresent()) {
                        wqnVarA.e((ajwo) optionalEb.get());
                    } else {
                        wqnVarA.o(amksVar.e.G());
                        amlh amlhVar4 = amksVar.c;
                        if (amlhVar4 == null) {
                            amlhVar4 = amlh.a;
                        }
                        wqnVarA.F(amlhVar4);
                    }
                    jan janVar2 = hfkVar.r;
                    qcb qcbVar2 = new qcb(hfkVar, null);
                    vxe vxeVar4 = (vxe) janVar2.d.io();
                    vxeVar4.getClass();
                    ttm ttmVar2 = (ttm) janVar2.e.io();
                    ttmVar2.getClass();
                    jin jinVar2 = (jin) janVar2.h.io();
                    jinVar2.getClass();
                    huf hufVar2 = (huf) janVar2.a.io();
                    hufVar2.getClass();
                    hpy hpyVar2 = (hpy) janVar2.b.io();
                    hpyVar2.getClass();
                    hpb hpbVar2 = (hpb) janVar2.c.io();
                    hpbVar2.getClass();
                    Executor executor2 = (Executor) janVar2.f.io();
                    executor2.getClass();
                    vxz vxzVar3 = (vxz) janVar2.g.io();
                    vxzVar3.getClass();
                    amksVar.getClass();
                    hfkVar.g.b(new oox(hfkVar, wqnVarA, amlgVar5, amlgVar4, new hfd(vxeVar4, ttmVar2, jinVar2, hufVar2, hpyVar2, hpbVar2, executor2, vxzVar3, amksVar, qcbVar2), gqdVar, 1), true);
                } else if (iOrdinal == 2) {
                    wqm wqmVar2 = hfkVar.m;
                    wqp wqpVarC = wqmVar2.c();
                    if (optionalEb.isPresent()) {
                        wqpVarC.e((ajwo) optionalEb.get());
                    } else {
                        wqpVarC.o(amksVar.e.G());
                        amlh amlhVar5 = amksVar.c;
                        if (amlhVar5 == null) {
                            amlhVar5 = amlh.a;
                        }
                        wqpVarC.F(amlhVar5);
                    }
                    jan janVar3 = hfkVar.p;
                    qcb qcbVar3 = new qcb(hfkVar, null);
                    vxe vxeVar5 = (vxe) janVar3.d.io();
                    vxeVar5.getClass();
                    ttm ttmVar3 = (ttm) janVar3.e.io();
                    ttmVar3.getClass();
                    jin jinVar3 = (jin) janVar3.h.io();
                    jinVar3.getClass();
                    huf hufVar3 = (huf) janVar3.a.io();
                    hufVar3.getClass();
                    hpy hpyVar3 = (hpy) janVar3.b.io();
                    hpyVar3.getClass();
                    hpb hpbVar3 = (hpb) janVar3.c.io();
                    hpbVar3.getClass();
                    Executor executor3 = (Executor) janVar3.f.io();
                    executor3.getClass();
                    vxz vxzVar4 = (vxz) janVar3.g.io();
                    vxzVar4.getClass();
                    amksVar.getClass();
                    hfq hfqVar = new hfq(vxeVar5, ttmVar3, jinVar3, hufVar3, hpyVar3, hpbVar3, executor3, vxzVar4, amksVar, qcbVar3);
                    taf.i(wqmVar2.h(wqpVarC, MoreExecutors.directExecutor()), hfkVar.h, new hfg(hfkVar, amlgVar5, amlgVar4, hfqVar, 2), new gln(hfqVar, 10), gqdVar);
                }
                if (optionalEb.isPresent()) {
                    Object obj = optionalEb.get();
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
                    aihi aihiVar = (aihi) obj;
                    aihiVar.c(aihlVarCheckIsLite);
                    if (aihiVar.j.n(aihlVarCheckIsLite.d)) {
                        Object obj2 = optionalEb.get();
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amla.b);
                        aihi aihiVar2 = (aihi) obj2;
                        aihiVar2.c(aihlVarCheckIsLite2);
                        Object objK = aihiVar2.j.k(aihlVarCheckIsLite2.d);
                        amla amlaVar3 = (amla) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                        if (amlaVar3.h.size() > 0) {
                            hfkVar.a.d(amlaVar3.h, hfkVar.l);
                        }
                    }
                }
            }
        }
        qcb qcbVar4 = hfkVar.s;
        if (qcbVar4 != null) {
            qcbVar4.a.i();
        }
    }
}
