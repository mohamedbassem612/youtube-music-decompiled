package defpackage;

import android.util.Size;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.libraries.elements.interfaces.Subscription;
import com.google.android.libraries.multiplatform.elements.runtime.ElementsRuntimeImpl;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import j$.util.function.Consumer$CC;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kjk implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ kjk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) throws Throwable {
        long jDecrementAndGet;
        long jDecrementAndGet2;
        ateu ateuVar;
        int i = 14;
        switch (this.$cid) {
            case 0:
                ((kny) this.a).i((Status) obj);
                return;
            case 1:
                ((BasePendingResult) this.a).l((Status) obj);
                return;
            case 2:
                awka.f((AtomicReference) this.a);
                return;
            case 3:
                ((Subscription) this.a).cancel();
                return;
            case 4:
                nyz nyzVar = (nyz) this.a;
                nyzVar.c.g(nyzVar.b, (nzt) obj);
                return;
            case 5:
                agp agpVar = ((ElementsRuntimeImpl) ((qcb) obj).a).d;
                final boolean z = ((opq) this.a).a;
                agpVar.b(new awqg() { // from class: ovm
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj2) {
                        ooy ooyVar = (ooy) obj2;
                        int i2 = ElementsRuntimeImpl.m;
                        if (ooyVar != null) {
                            if (z) {
                                ooyVar.m(false);
                            } else {
                                opa opaVar = ooyVar.j;
                                if (opaVar != null) {
                                    opaVar.a();
                                }
                            }
                        }
                        return awmy.a;
                    }
                });
                return;
            case 6:
                NodeTreeProcessorImpl nodeTreeProcessorImpl = (NodeTreeProcessorImpl) obj;
                Boolean boolE = ((osj) this.a).e.e();
                if (boolE != null) {
                    AtomicLong atomicLong = nodeTreeProcessorImpl.d;
                    boolean zBooleanValue = boolE.booleanValue();
                    for (long j = atomicLong.get(); (j & 4611686018427387904L) == 0 && j > 0; j = atomicLong.get()) {
                        if (atomicLong.compareAndSet(j, j + 1)) {
                            try {
                                NodeTreeProcessorImpl.jniSetIsScreenReaderActive(nodeTreeProcessorImpl.c, zBooleanValue);
                                if (jDecrementAndGet == j) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                if (nodeTreeProcessorImpl.d.decrementAndGet() == 4611686018427387904L) {
                                    nodeTreeProcessorImpl.a.z().execute(new ooz(nodeTreeProcessorImpl, i));
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            case 7:
                NodeTreeProcessorImpl nodeTreeProcessorImpl2 = (NodeTreeProcessorImpl) obj;
                AtomicLong atomicLong2 = nodeTreeProcessorImpl2.d;
                osj osjVar = (osj) this.a;
                Size size = osjVar.a;
                avw avwVar = osjVar.b;
                int i2 = osjVar.d;
                int width = size.getWidth();
                int height = size.getHeight();
                for (long j2 = atomicLong2.get(); (j2 & 4611686018427387904L) == 0 && j2 > 0; j2 = atomicLong2.get()) {
                    if (atomicLong2.compareAndSet(j2, j2 + 1)) {
                        try {
                            NodeTreeProcessorImpl.jniSetWindowInsets(nodeTreeProcessorImpl2.c, i2 - 1, width, height, avwVar.b, avwVar.c, avwVar.d, avwVar.e);
                            if (jDecrementAndGet2 == j) {
                                return;
                            } else {
                                return;
                            }
                        } finally {
                            if (nodeTreeProcessorImpl2.d.decrementAndGet() == 4611686018427387904L) {
                                nodeTreeProcessorImpl2.a.z().execute(new ooz(nodeTreeProcessorImpl2, i));
                            }
                        }
                    }
                }
                return;
            case 8:
                NodeTreeProcessorImpl nodeTreeProcessorImpl3 = (NodeTreeProcessorImpl) obj;
                Object obj2 = this.a;
                athg athgVar = (athg) obj2;
                long j3 = athgVar.c;
                byte bPeekByte = Memory.peekByte(9 + j3);
                int iAS = a.aS(Memory.peekInt(12 + j3, false));
                if (iAS == 0) {
                    iAS = 1;
                }
                int iAV = a.aV(Memory.peekInt(j3 + 16, false));
                if (iAV == 0) {
                    iAV = 1;
                }
                if (athgVar.f == null && (Memory.peekByte(((mew) obj2).c + 8) & 8) == 0) {
                    ateuVar = null;
                } else {
                    if (athgVar.f == null) {
                        mew mewVar = (mew) obj2;
                        if ((Memory.peekByte(mewVar.c + 8) & 8) != 0) {
                            athgVar.f = new ateu(mewVar.cp(true != athg.a ? 20 : 24, atet.a));
                        }
                    }
                    ateuVar = athgVar.f == null ? ates.a : athgVar.f;
                }
                nodeTreeProcessorImpl3.S(bPeekByte != 0, iAS, iAV, ateuVar);
                return;
            case 9:
                nay nayVar = (nay) obj;
                osl oslVar = (osl) this.a;
                oslVar.a.set(nayVar);
                oslVar.b.r(nayVar);
                return;
            case 10:
                this.a.add((qvu) obj);
                return;
            case 11:
                this.a.add((qxj) obj);
                return;
            case 12:
                ((qus) this.a).f.add(((qvc) obj).clone());
                return;
            case 13:
                ((qvu) this.a).n.add(((qvc) obj).clone());
                return;
            case 14:
                int i3 = rbk.a;
                aihf aihfVarCreateBuilder = aues.a.createBuilder();
                String strC = ((qvc) obj).c();
                aihfVarCreateBuilder.copyOnWrite();
                aues auesVar = (aues) aihfVarCreateBuilder.instance;
                strC.getClass();
                auesVar.b |= 1;
                auesVar.c = strC;
                aues auesVar2 = (aues) aihfVarCreateBuilder.build();
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                auen auenVar = (auen) aihfVar.instance;
                auen auenVar2 = auen.a;
                auesVar2.getClass();
                aiie aiieVar = auenVar.e;
                if (!aiieVar.c()) {
                    auenVar.e = aihn.mutableCopy(aiieVar);
                }
                auenVar.e.add(auesVar2);
                return;
            case 15:
                ((HashSet) this.a).remove((qvs) obj);
                return;
            case 16:
                ((agjz) this.a).h((qvs) obj);
                return;
            case 17:
                qvu qvuVar = (qvu) obj;
                ((agqq) this.a).u(qvuVar.p, qvuVar);
                return;
            case 18:
                ((quc) this.a).h((qvs) obj);
                return;
            case 19:
                ((quc) this.a).g((qvs) obj);
                return;
            default:
                ((quc) this.a).h((qwm) obj);
                return;
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
