package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acfb implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acfb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        aigj aigjVarP;
        aigj aigjVarP2;
        aigj aigjVarP3;
        switch (this.$cid) {
            case 0:
                ((acfg) this.a).aB((String) obj);
                break;
            case 1:
                ((acfg) this.a).aA((String) obj);
                break;
            case 2:
                acex acexVar = (acex) obj;
                abnl abnlVar = acexVar.a;
                abnp abnpVar = acexVar.b;
                wjf wjfVar = acexVar.c;
                Object obj2 = this.a;
                acfg acfgVar = (acfg) obj2;
                int i = 2;
                if (acfgVar.s.a(abob.a, abob.b, abob.j)) {
                    zvp.a(zvn.b, zvm.k, "Attempting to queue video when video is not loaded and playing");
                }
                if (abnlVar != null && acfgVar.g.g()) {
                    txp txpVar = acfgVar.e;
                    Map map = acfgVar.u;
                    String strQ = abnlVar.q(txpVar);
                    Optional optionalOr = Optional.ofNullable((acfs) map.get(strQ)).or(new uqq(obj2, strQ, 14));
                    if (!optionalOr.isPresent()) {
                        acfs acfsVarV = acfgVar.v(strQ, 0, abnlVar, abnpVar, false);
                        acfsVarV.a.w().j(wjfVar);
                        map.put(acfsVarV.E(), acfsVarV);
                        acfgVar.C(acfsVarV, wjfVar, abnlVar);
                    } else {
                        acfs acfsVar = (acfs) optionalOr.get();
                        Optional optionalOr2 = Optional.ofNullable(abnpVar).or(new abzk(acfsVar, i));
                        abyy abyyVar = new abyy(acfsVar, 6);
                        if (true == optionalOr2.isPresent()) {
                            ((acfs) abyyVar.a).K((abnp) optionalOr2.get());
                        }
                        acfsVar.a.w().j(wjfVar);
                        acfgVar.C(acfsVar, wjfVar, abnlVar);
                    }
                    break;
                }
                break;
            case 3:
                ((snu) obj).a((String) this.a, 0);
                break;
            case 4:
                ((snu) obj).a((String) this.a, 5);
                break;
            case 5:
                avnr.b((AtomicReference) this.a);
                break;
            case 6:
                axlj axljVar = ((adcw) this.a).j;
                aqhl aqhlVar = (aqhl) obj;
                axljVar.getClass();
                aqhlVar.getClass();
                int i2 = aqhlVar.b;
                String str = (i2 & 8) != 0 ? aqhlVar.h : (i2 & 1) != 0 ? aqhlVar.e : null;
                if (str != null) {
                    apji apjiVarR = acfz.R(aqhlVar);
                    if (apjiVarR != null && (aigjVarP3 = aecm.P(apjiVarR)) != null) {
                        axljVar.C(str, "suspense_content_data_key", aigjVarP3, false);
                        if (awrc.c(axljVar.w(str), "suspense_placeholder_data_key")) {
                            axljVar.z(str, "suspense_content_data_key", false);
                        }
                    }
                    apji apjiVarT = acfz.T(aqhlVar);
                    if (apjiVarT != null && (aigjVarP2 = aecm.P(apjiVarT)) != null) {
                        axljVar.C(str, "suspense_placeholder_data_key", aigjVarP2, false);
                    }
                    apji apjiVarS = acfz.S(aqhlVar);
                    if (apjiVarS != null && (aigjVarP = aecm.P(apjiVarS)) != null) {
                        axljVar.C(str, "suspense_error_data_key", aigjVarP, false);
                    }
                    int i3 = aqhlVar.c;
                    if (i3 == 5) {
                        axljVar.A(str, i3 == 5 ? (aqhn) aqhlVar.d : aqhn.a);
                    }
                    aiie aiieVar = aqhlVar.g;
                    aiieVar.getClass();
                    if (!aiieVar.isEmpty()) {
                        aiie aiieVar2 = aqhlVar.g;
                        aiieVar2.getClass();
                        axljVar.B(str, aguu.T(aiieVar2));
                    }
                }
                break;
            default:
                adcw adcwVar = (adcw) this.a;
                adcwVar.j.D((String) obj, adcwVar);
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
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
