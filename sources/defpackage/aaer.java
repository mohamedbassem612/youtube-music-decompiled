package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aaer implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aaer(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r11v40, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r11v41, types: [java.lang.Object, tyy] */
    /* JADX WARN: Type inference failed for: r11v48, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v49, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) throws Throwable {
        acfs acfsVar;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                this.a.a((String) obj);
                break;
            case 1:
                awka.f((AtomicReference) this.a);
                break;
            case 2:
                ListenableFuture listenableFuture = (ListenableFuture) obj;
                Object obj2 = this.a;
                try {
                    ((agjz) obj2).h((Optional) ahng.v(listenableFuture));
                } catch (ExecutionException unused) {
                    ((agjz) obj2).h(Optional.empty());
                    return;
                }
                break;
            case 3:
                amtc amtcVar = (amtc) obj;
                this.a.put(amtcVar.getRemoteImageUrl(), amtcVar.getLocalImageUrl());
                break;
            case 4:
                try {
                    ((agjz) this.a).h((Optional) ahng.v((ListenableFuture) obj));
                } catch (ExecutionException unused2) {
                    return;
                }
                break;
            case 5:
                ((agjz) this.a).h((aihf) obj);
                break;
            case 6:
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                aoec aoecVar = (aoec) aihfVar.instance;
                aoei aoeiVar = (aoei) ((aihf) obj).build();
                aoec aoecVar2 = aoec.a;
                aoeiVar.getClass();
                aoecVar.b();
                aoecVar.c.add(aoeiVar);
                break;
            case 7:
                ((agjz) this.a).h((aihf) obj);
                break;
            case 8:
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                aoec aoecVar3 = (aoec) aihfVar2.instance;
                aoeg aoegVar = (aoeg) ((aihf) obj).build();
                aoec aoecVar4 = aoec.a;
                aoegVar.getClass();
                aoecVar3.a();
                aoecVar3.d.add(aoegVar);
                break;
            case 9:
                ((ArrayList) this.a).add((aaro) obj);
                break;
            case 10:
                ajoj ajojVar = (ajoj) obj;
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                asgp asgpVar = (asgp) aihfVar3.instance;
                asgp asgpVar2 = asgp.a;
                ajojVar.getClass();
                aiie aiieVar = asgpVar.c;
                if (!aiieVar.c()) {
                    asgpVar.c = aihn.mutableCopy(aiieVar);
                }
                asgpVar.c.add(ajojVar);
                break;
            case 11:
                ajoj ajojVar2 = (ajoj) obj;
                aihf aihfVar4 = (aihf) this.a;
                aihfVar4.copyOnWrite();
                asgp asgpVar3 = (asgp) aihfVar4.instance;
                asgp asgpVar4 = asgp.a;
                ajojVar2.getClass();
                aiie aiieVar2 = asgpVar3.d;
                if (!aiieVar2.c()) {
                    asgpVar3.d = aihn.mutableCopy(aiieVar2);
                }
                asgpVar3.d.add(ajojVar2);
                break;
            case 12:
                ajoj ajojVar3 = (ajoj) obj;
                aihf aihfVar5 = (aihf) this.a;
                aihfVar5.copyOnWrite();
                asgp asgpVar5 = (asgp) aihfVar5.instance;
                asgp asgpVar6 = asgp.a;
                ajojVar3.getClass();
                aiie aiieVar3 = asgpVar5.e;
                if (!aiieVar3.c()) {
                    asgpVar5.e = aihn.mutableCopy(aiieVar3);
                }
                asgpVar5.e.add(ajojVar3);
                break;
            case 13:
                this.a.e((aret) obj);
                break;
            case 14:
                yhz yhzVar = (yhz) obj;
                ahhp ahhpVar = (ahhp) this.a.a();
                if (ahhpVar != null) {
                    ahhpVar.b(yhzVar.a, yhzVar.b, false);
                }
                break;
            case 15:
                ((abqh) obj).k((alyg) this.a);
                break;
            case 16:
                ((abqh) obj).g((aihf) this.a);
                break;
            case 17:
                Iterable$EL.forEach(this.a, new aaer((alyg) obj, 15));
                break;
            case 18:
                Iterable$EL.forEach(this.a, new aaer((aihf) obj, 16));
                break;
            case 19:
                acfg acfgVar = (acfg) this.a;
                abmt abmtVar = acfgVar.k;
                acjh acjhVar = (acjh) obj;
                if (abmtVar.bR()) {
                    Iterator it = acjhVar.a().b.iterator();
                    while (it.hasNext()) {
                        acfgVar.aA(((aciw) it.next()).h);
                    }
                }
                if (abmtVar.ar()) {
                    for (aciw aciwVar : acjhVar.a().c) {
                        if (aciwVar.n) {
                            aciwVar.a();
                            long j = aciwVar.a().b;
                            if (acfgVar.r.a.w().f > j) {
                                long j2 = acfgVar.t;
                                if (j2 == -1 || j < j2) {
                                    acfgVar.t = j;
                                }
                            }
                        }
                    }
                }
                if (acjhVar instanceof acjf) {
                    acfgVar.aG((acjf) acjhVar);
                } else if (acjhVar instanceof acjg) {
                    acjg acjgVar = (acjg) acjhVar;
                    if (acfgVar.g.c(acfgVar.r.E()) != null) {
                        acfgVar.aW(acfgVar.r.a, acjgVar.a, acjgVar.b, acjgVar.c, acjgVar.d);
                    } else {
                        acfgVar.aW(acfgVar.o.a, acjgVar.a, acjgVar.b, acjgVar.c, acjgVar.d);
                    }
                } else if (acjhVar instanceof acje) {
                    acje acjeVar = (acje) acjhVar;
                    Map map = acfgVar.u;
                    String str = acjeVar.a;
                    acfs acfsVar2 = (acfs) map.get(str);
                    if (acfsVar2 == null && (acfsVar = acfgVar.o) != null && TextUtils.equals(str, acfsVar.E())) {
                        acfsVar2 = acfgVar.o;
                    }
                    if (acfsVar2 != null) {
                        acip acipVar = acfsVar2.a;
                        acfgVar.aW(acipVar, acipVar.w().f, acjeVar.b, acjeVar.c, acjeVar.d);
                    } else {
                        if (abmtVar.I() && !acfgVar.aM()) {
                            z = true;
                        }
                        List listV = acjb.V(acfgVar.g, str, 0L, z, abmtVar, acfgVar.w);
                        acfgVar.G(0L);
                        acfgVar.aC(listV, acjeVar.b, false, acjeVar.c, acjeVar.d);
                    }
                }
                break;
            default:
                ((acfg) this.a).o.a.aQ().kk(new aaxm((aciz) obj));
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
