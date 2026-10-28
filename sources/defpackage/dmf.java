package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dmf extends awrb implements awqg {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmf(Object obj, int i) {
        super(1, obj, dmg.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [abun, abvz] */
    /* JADX WARN: Type inference failed for: r10v2, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        aaxd aaxdVar;
        abxy abxyVar;
        boolean zA;
        switch (this.$cid) {
            case 0:
                ((Set) obj).getClass();
                dmg dmgVar = (dmg) this.receiver;
                ReentrantLock reentrantLock = dmgVar.d;
                reentrantLock.lock();
                try {
                    List listAp = atqq.ap(dmgVar.c.values());
                    reentrantLock.unlock();
                    Iterator it = listAp.iterator();
                    if (!it.hasNext()) {
                        return awmy.a;
                    }
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 1:
                return ((awuz) this.receiver).c((awoq) obj);
            case 2:
                aayx aayxVar = (aayx) obj;
                aayxVar.getClass();
                ifj ifjVar = (ifj) this.receiver;
                if (ifjVar.o()) {
                    awro.t(ifjVar.h, null, 0, new ifk(ifjVar, (awoq) null, 1), 3);
                } else {
                    ?? r0 = aayxVar.b;
                    abul abulVar = aayxVar.a;
                    r0.a();
                    if (abulVar != null) {
                        ifjVar.j(abulVar.b, r0);
                    }
                }
                return awmy.a;
            case 3:
                aayx aayxVar2 = (aayx) obj;
                aayxVar2.getClass();
                Object obj2 = this.receiver;
                abun abunVar = aayxVar2.b;
                ify ifyVar = (ify) obj2;
                if (abunVar instanceof igd) {
                    ifyVar.d = hna.z((igd) abunVar);
                }
                return awmy.a;
            case 4:
                ((jnm) this.receiver).a(((Boolean) obj).booleanValue());
                return awmy.a;
            case 5:
                ((awku) this.receiver).kk((abxi) obj);
                return awmy.a;
            case 6:
                ((awku) this.receiver).kk((abxg) obj);
                return awmy.a;
            case 7:
                ((awku) this.receiver).kk((abxk) obj);
                return awmy.a;
            case 8:
                ((awku) this.receiver).kk((abxo) obj);
                return awmy.a;
            case 9:
                abxf abxfVar = (abxf) obj;
                abxfVar.getClass();
                abxv abxvVar = (abxv) this.receiver;
                Objects.toString(abxfVar);
                ArrayList<abxp> arrayList = new ArrayList();
                for (Object obj3 : abxfVar.b) {
                    abxp abxpVar = (abxp) obj3;
                    Object obj4 = abxvVar.b;
                    abxpVar.getClass();
                    isi isiVar = (isi) obj4;
                    ?? r10 = ((abwk) isiVar.a).d;
                    if (r10 == 0) {
                        zA = false;
                    } else {
                        int iH = a.H(abxpVar);
                        if (iH == 0) {
                            abxyVar = abxy.c;
                        } else if (iH == 1) {
                            abxyVar = abxy.d;
                        } else if (iH == 2) {
                            abxyVar = abxy.a;
                        } else {
                            if (iH != 3) {
                                throw new awmj();
                            }
                            abxyVar = abxy.b;
                        }
                        zA = abxyVar.a(new abxw(r10, (ytv) isiVar.b, (vyo) isiVar.c));
                    }
                    if (zA) {
                        arrayList.add(obj3);
                    }
                }
                for (abxp abxpVar2 : arrayList) {
                    int iAy = a.ay(abxpVar2);
                    if (iAy == 0) {
                        abxfVar.a.aY().kk(new aayy(((abxk) abxpVar2).b));
                    } else if (iAy == 1) {
                        abxo abxoVar = (abxo) abxpVar2;
                        abxoVar.getClass();
                        j$.util.Objects.checkIndex(0, 4);
                        if (abxoVar instanceof abxl) {
                            abxl abxlVar = (abxl) abxoVar;
                            aaxdVar = new aaxd(abxlVar.a, aguu.V(abxlVar.b), abxlVar.c);
                        } else if (abxoVar instanceof abxm) {
                            aaxdVar = new aaxd(((abxm) abxoVar).a, true);
                        } else {
                            if (!(abxoVar instanceof abxn)) {
                                throw new awmj();
                            }
                            aaxdVar = null;
                        }
                        if (aaxdVar != null) {
                            abxfVar.a.aF().kk(aaxdVar);
                        }
                    } else if (iAy == 2) {
                        continue;
                    } else {
                        if (iAy != 3) {
                            throw new awmj();
                        }
                        axsp axspVarAR = abxfVar.a.aR();
                        boolean z = ((abxi) abxpVar2).b;
                        axspVarAR.kk(new aayn(false, true));
                    }
                }
                return awmy.a;
            default:
                abxe abxeVar = (abxe) obj;
                abxeVar.getClass();
                abxv abxvVar2 = (abxv) this.receiver;
                Objects.toString(abxeVar);
                agqr it2 = ((agqj) abxeVar.b).iterator();
                while (it2.hasNext()) {
                    abxh abxhVar = (abxh) it2.next();
                    if (abxhVar instanceof abxg) {
                        Object obj5 = abxvVar2.c;
                        acip acipVar = abxeVar.a;
                        abxg abxgVar = (abxg) abxhVar;
                        float f = abxgVar.b;
                        Float f2 = abxgVar.c.c;
                        abfv abfvVar = (abfv) obj5;
                        Object obj6 = abfvVar.a;
                        wjf wjfVarF = acipVar.f();
                        aaxh aaxhVar = new aaxh((wjfVarF == null ? ytv.b : ((ytv) obj6).g(wjfVarF.g(), wjfVarF.f())).a(), acipVar.f(), f, f2);
                        Iterator it3 = abfvVar.b.iterator();
                        while (it3.hasNext()) {
                            ((acii) it3.next()).X(aaxhVar, acipVar.a());
                        }
                        wjf wjfVarF2 = acipVar.f();
                        if (wjfVarF2 != null) {
                            wiu wiuVarF = wjfVarF2.f();
                            acipVar.aJ().kk(new aaxh(wiuVarF != null ? wiuVarF.aG() : false, wjfVarF2, abxgVar.b, abxgVar.c.c));
                        }
                    }
                }
                return awmy.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmf(Object obj, int i, byte[] bArr) {
        super(1, obj, awuz.class, "await", "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmf(Object obj, int i, char[] cArr) {
        super(1, obj, ifj.class, "handleSequencerTransitionedEvent", "handleSequencerTransitionedEvent(Lcom/google/android/libraries/youtube/player/event/SequencerTransitionedEvent;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmf(Object obj, int i, float[] fArr) {
        super(1, obj, awku.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmf(Object obj, int i, int[] iArr) {
        super(1, obj, jnm.class, "setScreenAlwaysOn", "setScreenAlwaysOn(Z)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmf(Object obj, int i, short[] sArr) {
        super(1, obj, ify.class, "onSequencerTransitionedEvent", "onSequencerTransitionedEvent(Lcom/google/android/libraries/youtube/player/event/SequencerTransitionedEvent;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmf(Object obj, int i, int[][] iArr) {
        super(1, obj, abxv.class, "handleActiveSettingChangedEvent", "handleActiveSettingChangedEvent(Lcom/google/android/libraries/youtube/player/settings/control/events/PlayerSettingEvent$ActiveSettingChangedEvent;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmf(Object obj, int i, short[][] sArr) {
        super(1, obj, abxv.class, "handleDynamicSettingChangedEvent", "handleDynamicSettingChangedEvent(Lcom/google/android/libraries/youtube/player/settings/control/events/PlayerSettingEvent$DynamicSettingChangedEvent;)V", 0);
        this.$cid = i;
    }
}
