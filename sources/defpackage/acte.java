package defpackage;

import com.google.android.libraries.youtube.reel.internal.player.ReelPlayerView;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acte implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acte(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                String str = actj.a;
                this.a.invoke(obj);
                break;
            case 1:
                String str2 = actj.a;
                this.a.invoke(obj);
                break;
            case 2:
                String str3 = actj.a;
                this.a.invoke(obj);
                break;
            case 3:
                String str4 = actj.a;
                this.a.invoke(obj);
                break;
            case 4:
                String str5 = actj.a;
                this.a.invoke(obj);
                break;
            case 5:
                ((actr) this.a).l((acsu) obj);
                break;
            case 6:
                aazj aazjVar = (aazj) obj;
                if (aazjVar.a.ordinal() == 7) {
                    wjf wjfVar = aazjVar.b;
                    String strG = wjfVar != null ? wjfVar.G() : null;
                    acts actsVar = (acts) this.a;
                    actsVar.b = strG;
                    actsVar.a = aazjVar.g;
                    aesp aespVar = actsVar.c;
                    ((AtomicInteger) aespVar.g).incrementAndGet();
                    ((AtomicInteger) aespVar.i).incrementAndGet();
                }
                break;
            case 7:
                abnl abnlVarN = ((aazq) obj).b.n();
                apfp apfpVarA = abnlVarN == null ? null : actt.a(abnlVarN.b);
                actt acttVar = (actt) this.a;
                acttVar.b = apfpVarA;
                acttVar.c = null;
                acttVar.d = false;
                break;
            case 8:
                ((actt) this.a).d = true;
                break;
            case 9:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                actw actwVar = (actw) this.a;
                actwVar.e = zBooleanValue;
                actwVar.a.e = bool.booleanValue();
                break;
            case 10:
                int i = ((aazn) obj).a;
                Object obj2 = this.a;
                if (i == 7) {
                    actw actwVar2 = (actw) obj2;
                    if (!actwVar2.j.U()) {
                        actwVar2.g = true;
                    } else {
                        actwVar2.a.g = true;
                    }
                } else if (i != 4) {
                    actw actwVar3 = (actw) obj2;
                    if (!actwVar3.j.U()) {
                        actwVar3.g = false;
                    } else {
                        actwVar3.a.g = false;
                    }
                }
                break;
            case 11:
                if (((aayw) obj).b.a(abnw.a)) {
                    actw actwVar4 = (actw) this.a;
                    if (!actwVar4.j.U()) {
                        actwVar4.g = false;
                    } else {
                        actx actxVar = actwVar4.a;
                        actxVar.g = false;
                        actxVar.c();
                    }
                }
                break;
            case 12:
                acvn acvnVar = (acvn) obj;
                actw actwVar5 = (actw) this.a;
                boolean z = actwVar5.i;
                actwVar5.i = acvnVar == acvn.b;
                if (z && acvnVar == acvn.c) {
                    actwVar5.a.b();
                    break;
                }
                break;
            case 13:
                int iIntValue = ((Integer) obj).intValue();
                ReelPlayerView reelPlayerView = (ReelPlayerView) this.a;
                reelPlayerView.e = iIntValue;
                if (!reelPlayerView.isInLayout()) {
                    reelPlayerView.requestLayout();
                }
                break;
            case 14:
                int iIntValue2 = ((Integer) obj).intValue();
                ReelPlayerView reelPlayerView2 = (ReelPlayerView) this.a;
                reelPlayerView2.h = iIntValue2;
                if (!reelPlayerView2.isInLayout()) {
                    reelPlayerView2.requestLayout();
                }
                break;
            case 15:
                ReelPlayerView reelPlayerView3 = (ReelPlayerView) this.a;
                reelPlayerView3.j = (acvs) obj;
                if (!reelPlayerView3.isInLayout()) {
                    reelPlayerView3.requestLayout();
                }
                break;
            case 16:
                ((Integer) obj).intValue();
                ReelPlayerView reelPlayerView4 = (ReelPlayerView) this.a;
                if (!reelPlayerView4.isInLayout()) {
                    reelPlayerView4.requestLayout();
                }
                break;
            case 17:
                int iIntValue3 = ((Integer) obj).intValue();
                ReelPlayerView reelPlayerView5 = (ReelPlayerView) this.a;
                reelPlayerView5.i = iIntValue3;
                if (!reelPlayerView5.isInLayout()) {
                    reelPlayerView5.requestLayout();
                }
                break;
            case 18:
                acos acosVar = (acos) obj;
                ReelPlayerView reelPlayerView6 = (ReelPlayerView) this.a;
                acor acorVar = reelPlayerView6.m;
                if (acorVar != null && acorVar.o != null) {
                    acorVar.d(acosVar, false);
                    acou acouVar = reelPlayerView6.m.o;
                    if (acouVar.g != acosVar) {
                        acot acotVar = (acot) acou.e.get(acosVar);
                        acotVar.getClass();
                        if (acouVar.h != acotVar) {
                            acouVar.h = acotVar;
                            acouVar.m(acouVar.f);
                        }
                        acouVar.g = acosVar;
                        acos acosVar2 = acouVar.g;
                        Optional optionalOf = (acosVar2 == acos.e || acosVar2 == acos.f || acosVar2 == acos.d || acosVar2 == acos.g) ? Optional.of(0) : Optional.empty();
                        if (true == optionalOf.isPresent()) {
                            Integer num = (Integer) optionalOf.get();
                            num.intValue();
                            num.intValue();
                        }
                        acouVar.d = optionalOf;
                    }
                    break;
                }
                break;
            case 19:
                ((acui) this.a).l((acsu) obj);
                break;
            default:
                aayt aaytVar = (aayt) obj;
                String str6 = aaytVar.b;
                acva acvaVar = (acva) this.a;
                acvaVar.b = str6;
                wjf wjfVarA = aaytVar.a();
                acvaVar.c = wjfVarA != null ? wjfVarA.G() : null;
                break;
        }
    }
}
