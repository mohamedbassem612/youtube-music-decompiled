package defpackage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarArrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vnc implements avnf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vnc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v26, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v45, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v47, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v49, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v55, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v57, types: [awqk, java.lang.Object] */
    @Override // defpackage.avnf
    public final Object a(Object obj, Object obj2) {
        vqb vqbVar;
        switch (this.$cid) {
            case 0:
                vnd vndVar = (vnd) obj;
                vnd vndVar2 = (vnd) obj2;
                vnf vnfVar = vnf.d;
                boolean zU = vndVar2.u(vnfVar);
                Object obj3 = this.a;
                if (zU && !((vng) obj3).i.l(142, 45700541L, false)) {
                    return vndVar2.t(vqb.g);
                }
                if (vng.c.contains(vndVar2.b)) {
                    vqb vqbVar2 = vndVar.c;
                    vqb vqbVar3 = vqb.d;
                    if (vqbVar2 == vqbVar3) {
                        return vndVar2.t(vqbVar3);
                    }
                }
                if (vndVar2.u(vnf.f)) {
                    return vndVar.t(vqb.d);
                }
                vqb vqbVar4 = vndVar.c;
                vng vngVar = (vng) obj3;
                RecyclerView recyclerView = vngVar.g;
                avju avjuVar = vngVar.j;
                int i = vndVar2.a;
                boolean z = vndVar2.u(vnfVar) || vndVar2.u(vnf.c);
                np npVar = recyclerView.n;
                if (npVar instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) npVar;
                    int i2 = -avjuVar.b;
                    int iA = vng.a(recyclerView, i) + i2;
                    if (true != z) {
                        i2 = iA;
                    }
                    int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    if (i == -1 || iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1) {
                        vqbVar = vqb.a;
                    } else if (i < iFindFirstVisibleItemPosition) {
                        vqbVar = vqb.b;
                    } else if (i > iFindLastVisibleItemPosition) {
                        vqbVar = vqb.f;
                    } else {
                        int iA2 = 0;
                        while (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition && iA2 < i2 && iFindFirstVisibleItemPosition != i) {
                            iA2 += vng.a(recyclerView, iFindFirstVisibleItemPosition);
                            iFindFirstVisibleItemPosition++;
                        }
                        if (iA2 < i2) {
                            vqbVar = vqb.c;
                        } else {
                            vqbVar = iFindFirstVisibleItemPosition == i ? vqb.d : vqb.e;
                        }
                    }
                } else {
                    vqbVar = vqb.a;
                }
                vnf vnfVar2 = vnf.e;
                boolean z2 = vndVar2.u(vnfVar2) || vndVar.u(vnfVar2);
                boolean zU2 = vndVar2.u(vnf.b);
                if (z2) {
                    return vndVar2.t(vng.b(vqbVar4, vqbVar, vng.b, vng.a));
                }
                return zU2 ? vndVar2.t(vng.b(vqbVar4, vqbVar, vng.a, vng.b)) : vndVar2.t(vqbVar);
            case 1:
                vds vdsVar = (vds) obj;
                vdsVar.getClass();
                obj2.getClass();
                return this.a.invoke(vdsVar, obj2);
            case 2:
                Intent intent = (Intent) obj2;
                Object obj4 = this.a;
                agkj agkjVar = aabn.a;
                return ((Boolean) obj).booleanValue() ? aabq.f((Context) obj4, intent) : aabq.g((Context) obj4, intent);
            case 3:
                yvu yvuVar = (yvu) obj;
                aaxd aaxdVar = (aaxd) obj2;
                aihf aihfVarCreateBuilder = asgz.a.createBuilder();
                wgs wgsVar = yvuVar.c;
                if (wgsVar != null) {
                    asgy asgyVarA = aazz.a(new wiw(wgsVar, wgsVar.q(), new agqj(Integer.valueOf(wgsVar.e()))));
                    aihfVarCreateBuilder.copyOnWrite();
                    asgz asgzVar = (asgz) aihfVarCreateBuilder.instance;
                    asgyVarA.getClass();
                    asgzVar.e = asgyVarA;
                    asgzVar.b |= 4;
                } else {
                    asgy asgyVar = asgy.a;
                    aihfVarCreateBuilder.copyOnWrite();
                    asgz asgzVar2 = (asgz) aihfVarCreateBuilder.instance;
                    asgyVar.getClass();
                    asgzVar2.e = asgyVar;
                    asgzVar2.b |= 4;
                }
                Object obj5 = this.a;
                agke agkeVar = (agke) DesugarArrays.stream(yvuVar.g).map(new aalr(11)).collect(aghu.a);
                agkz agkzVar = aaxdVar.e;
                asgy asgyVar2 = !agkzVar.isEmpty() ? (asgy) Collection.EL.stream(agkeVar).filter(new aajl(agkzVar, 12)).findFirst().orElse(null) : null;
                if (asgyVar2 == null) {
                    asgyVar2 = (asgy) Collection.EL.stream(agkeVar).filter(new mob(aaxdVar.a, 7)).findFirst().orElse(null);
                }
                if (asgyVar2 != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    asgz asgzVar3 = (asgz) aihfVarCreateBuilder.instance;
                    asgzVar3.d = asgyVar2;
                    asgzVar3.b |= 2;
                }
                aihfVarCreateBuilder.copyOnWrite();
                asgz asgzVar4 = (asgz) aihfVarCreateBuilder.instance;
                aiie aiieVar = asgzVar4.f;
                if (!aiieVar.c()) {
                    asgzVar4.f = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(agkeVar, asgzVar4.f);
                arfb arfbVar = aaxdVar.c;
                aihfVarCreateBuilder.copyOnWrite();
                asgz asgzVar5 = (asgz) aihfVarCreateBuilder.instance;
                asgzVar5.c = arfbVar.e;
                asgzVar5.b |= 1;
                wjf wjfVarF = ((aazz) obj5).b.f();
                if (wjfVarF != null) {
                    alvl alvlVarT = wjfVarF.t();
                    if ((alvlVarT.b & 65536) != 0) {
                        aomc aomcVar = alvlVarT.q;
                        if (aomcVar == null) {
                            aomcVar = aomc.a;
                        }
                        aihfVarCreateBuilder.copyOnWrite();
                        asgz asgzVar6 = (asgz) aihfVarCreateBuilder.instance;
                        aomcVar.getClass();
                        asgzVar6.g = aomcVar;
                        asgzVar6.b |= 8;
                    }
                }
                return (asgz) aihfVarCreateBuilder.build();
            case 4:
                awml awmlVar = (awml) obj;
                Duration duration = abin.a;
                awmlVar.getClass();
                obj2.getClass();
                return this.a.invoke(awmlVar, obj2);
            case 5:
                obj.getClass();
                obj2.getClass();
                return this.a.invoke(obj, obj2);
            case 6:
                obj.getClass();
                obj2.getClass();
                return this.a.invoke(obj, obj2);
            case 7:
                vtl vtlVar = (vtl) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj6 = this.a;
                if (zBooleanValue) {
                    acng acngVar = (acng) obj6;
                    acngVar.h(vtlVar.a);
                    acngVar.b(0);
                } else {
                    acng acngVar2 = (acng) obj6;
                    acngVar2.i(vtlVar.b);
                    acngVar2.c(0);
                }
                return Boolean.TRUE;
            case 8:
                obj.getClass();
                obj2.getClass();
                return this.a.invoke(obj, obj2);
            default:
                acsd acsdVar = (acsd) obj;
                acsdVar.getClass();
                obj2.getClass();
                return this.a.invoke(acsdVar, obj2);
        }
    }
}
