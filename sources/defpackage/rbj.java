package defpackage;

import android.content.res.ColorStateList;
import android.util.Size;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.AbstractMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rbj implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rbj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        atwa atwaVar;
        switch (this.$cid) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                auej auejVar = (auej) aihfVar.instance;
                auej auejVar2 = auej.a;
                auejVar.b |= 16;
                auejVar.g = iIntValue;
                break;
            case 1:
                int i = rbk.a;
                aigu aiguVarAu = ahng.au((Duration) obj);
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                auej auejVar3 = (auej) aihfVar2.instance;
                auej auejVar4 = auej.a;
                aiguVarAu.getClass();
                auejVar3.d = aiguVarAu;
                auejVar3.b |= 2;
                break;
            case 2:
                int iIntValue2 = ((Integer) obj).intValue();
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                auej auejVar5 = (auej) aihfVar3.instance;
                auej auejVar6 = auej.a;
                auejVar5.b |= 32;
                auejVar5.h = iIntValue2;
                break;
            case 3:
                int iIntValue3 = ((Integer) obj).intValue();
                aihf aihfVar4 = (aihf) this.a;
                aihfVar4.copyOnWrite();
                auej auejVar7 = (auej) aihfVar4.instance;
                auej auejVar8 = auej.a;
                auejVar7.b |= 64;
                auejVar7.i = iIntValue3;
                break;
            case 4:
                int iIntValue4 = ((Integer) obj).intValue();
                aihf aihfVar5 = (aihf) this.a;
                aihfVar5.copyOnWrite();
                auej auejVar9 = (auej) aihfVar5.instance;
                auej auejVar10 = auej.a;
                auejVar9.b |= SemanticState.Focused;
                auejVar9.j = iIntValue4;
                break;
            case 5:
                int iIntValue5 = ((Integer) obj).intValue();
                aihf aihfVar6 = (aihf) this.a;
                aihfVar6.copyOnWrite();
                auej auejVar11 = (auej) aihfVar6.instance;
                auej auejVar12 = auej.a;
                auejVar11.b |= SemanticState.Hidden;
                auejVar11.k = iIntValue5;
                break;
            case 6:
                Duration duration = rdr.a;
                ((rbs) obj).h((quk) this.a);
                break;
            case 7:
                ((rdr) this.a).g.c((Duration) obj);
                break;
            case 8:
                ((AtomicReference) this.a).set((Duration) obj);
                break;
            case 9:
                ((rfs) this.a).u((Size) obj);
                break;
            case 10:
                rbm rbmVar = rhg.p;
                nqy.i(agyz.c(Stream.CC.of(new AbstractMap.SimpleImmutableEntry(this.a, (qvk) obj))));
                break;
            case 11:
                rhf rhfVar = (rhf) obj;
                rhg rhgVar = (rhg) this.a;
                boolean z = false;
                if (rhgVar.j != null && rhgVar.n != null) {
                    z = true;
                }
                ahno.F(z);
                rht rhtVar = rhgVar.e;
                rhtVar.q(rhgVar.j, rhfVar.c);
                rhtVar.q(rhgVar.n, rhfVar.d);
                String str = rhgVar.o;
                if (str != null && (atwaVar = rhfVar.e) != null) {
                    rhtVar.r(str, atwaVar);
                    break;
                }
                break;
            case 12:
                attk attkVar = rht.c;
                ((rhr) obj).h((String) this.a);
                break;
            case 13:
                aesp aespVar = (aesp) obj;
                aiqi aiqiVar = ((apzh) this.a).i;
                if (aiqiVar == null) {
                    aiqiVar = aiqi.a;
                }
                aespVar.e(aiqiVar);
                break;
            case 14:
                aihf aihfVar7 = ((akic) this.a).a;
                aihfVar7.copyOnWrite();
                akif akifVar = (akif) aihfVar7.instance;
                akif akifVar2 = akif.a;
                akifVar.i = ((aonc) obj).d;
                akifVar.b |= 64;
                break;
            case 15:
                ((TextView) this.a).setTextColor((ColorStateList) obj);
                break;
            case 16:
                ((TextView) this.a).setTextColor((ColorStateList) obj);
                break;
            case 17:
                ((TextView) this.a).setTextColor((ColorStateList) obj);
                break;
            case 18:
                aizs aizsVar = (aizs) obj;
                scr scrVar = (scr) ((rsl) this.a).h.remove(aizsVar.d);
                if (scrVar != null) {
                    scrVar.u(aizsVar);
                }
                break;
            case 19:
                ((zzj) ((ruq) this.a).a.io()).e((zzi) obj);
                break;
            default:
                ((zzj) ((ruq) this.a).a.io()).e((zzi) obj);
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
