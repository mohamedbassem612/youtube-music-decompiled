package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import com.facebook.litho.ComponentHost;
import internal.org.jni_zero.JniZero;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mqg implements nrw, nrr {
    static final Map a = new HashMap();
    static final Map b = new HashMap();
    static final Map c = new HashMap();
    public static final /* synthetic */ int d = 0;
    private final avmb f;
    private final avmb g;

    public mqg(avmb avmbVar) {
        avmb avmbVar2 = avmh.a;
        JniZero.a(avmbVar2);
        this.f = avmbVar;
        this.g = avmbVar2;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return aslm.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return a.r();
    }

    @Override // defpackage.nrw
    public final /* bridge */ /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        return avlb.o(new lez((Object) this, obj, (Object) nrvVar, 4, (char[]) null)).v(this.g);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064 A[LOOP:0: B:27:0x005b->B:31:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0069 A[EDGE_INSN: B:32:0x0069->B:33:0x006a BREAK  A[LOOP:0: B:27:0x005b->B:31:0x0064]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:69:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public final void d(aslm aslmVar, View view, View view2) {
        Float fValueOf;
        ftl ftlVar;
        ViewParent parent;
        RecyclerView recyclerViewA;
        nrp nrpVar;
        boolean z;
        int i;
        float f;
        int iAU;
        boolean z2;
        boolean z3;
        mqf mqfVar;
        np npVar;
        int i2;
        aslj asljVar;
        aslj asljVar2 = aslmVar.i;
        if (asljVar2 == null) {
            asljVar2 = aslj.a;
        }
        ahgb ahgbVar = null;
        if ((asljVar2.b & 2) != 0) {
            aslj asljVar3 = aslmVar.i;
            if (asljVar3 == null) {
                asljVar3 = aslj.a;
            }
            fValueOf = Float.valueOf(asljVar3.d);
        } else {
            fValueOf = null;
        }
        int i3 = 1;
        int i4 = 0;
        if ((aslmVar.c & 16) != 0) {
            String str = aslmVar.h;
            nrpVar = (nrp) a.get(str);
            if (nrpVar == null) {
                c.put(str, aslmVar);
            } else {
                recyclerViewA = nrpVar.a();
            }
            if (ahgbVar != null) {
                if ((aslmVar.c & 32) == 0) {
                    z = true;
                } else {
                    asljVar = aslmVar.i;
                    if (asljVar == null) {
                        asljVar = aslj.a;
                    }
                    if (asljVar.c) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                i = aslmVar.d;
                f = aslmVar.e;
                iAU = a.aU(aslmVar.g);
                if (iAU == 0 && iAU == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = aslmVar.f;
                ahgbVar.M();
                mqfVar = (mqf) ahgbVar.d;
                if (mqfVar.c()) {
                    mqfVar.c = ahgbVar;
                    if (i >= 0 && i < mqfVar.a()) {
                        i4 = i;
                    }
                    if (f > 0.0f) {
                        Object obj = ahgbVar.a;
                        float f2 = f * 1000.0f;
                        int iA = mqfVar.a();
                        npVar = mqfVar.a.n;
                        if (npVar instanceof GridLayoutManager) {
                            i2 = ((GridLayoutManager) npVar).b;
                        } else {
                            i2 = 1;
                        }
                        long j = (int) f2;
                        AtomicReference atomicReference = (AtomicReference) obj;
                        atomicReference.set(avlr.I(0L, j, TimeUnit.MILLISECONDS, (avmb) ahgbVar.b).O((avmb) ahgbVar.e).af(new abqa(ahgbVar, new avbs(iA, i4, z2, i2), z, i3)));
                    } else {
                        mqfVar.b(i4, z);
                    }
                    ((AtomicBoolean) ahgbVar.c).set(z3);
                }
            }
        }
        if (!(view2 instanceof ComponentHost)) {
            if (view != null) {
                ftlVar = null;
                break;
            }
            parent = view.getParent();
            while (true) {
                if (parent != null) {
                    ftlVar = null;
                    break;
                } else {
                    if (parent instanceof ftl) {
                        ftlVar = (ftl) parent;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            ComponentHost componentHost = (ComponentHost) view2;
            if (componentHost.getChildCount() != 1 || !(componentHost.getChildAt(0) instanceof ftl)) {
                if (view != null) {
                    ftlVar = null;
                    break;
                }
                parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        ftlVar = null;
                        break;
                    } else {
                        if (parent instanceof ftl) {
                            ftlVar = (ftl) parent;
                            break;
                        }
                        parent = parent.getParent();
                    }
                }
            } else {
                ftlVar = (ftl) componentHost.getChildAt(0);
            }
        }
        if (ftlVar == null) {
            throw new nud("Cannot find CollectionType instance in command's ancestors chain. Please put command at right place or add an Element key to both collectionType instance and collection command.");
        }
        recyclerViewA = ftlVar.l;
        nrpVar = null;
        if (recyclerViewA != null) {
            Map map = b;
            ahgb ahgbVar2 = (ahgb) map.get(recyclerViewA);
            if (ahgbVar2 == null) {
                mqf mqfVar2 = new mqf(recyclerViewA, nrpVar, fValueOf);
                ahgb ahgbVar3 = new ahgb(mqfVar2, this.f);
                map.put(recyclerViewA, ahgbVar3);
                mqfVar2.b = new mqd(ahgbVar3, recyclerViewA, null);
                ahgbVar = ahgbVar3;
            } else {
                ahgbVar = ahgbVar2;
            }
        }
        if (ahgbVar != null) {
            if ((aslmVar.c & 32) == 0) {
                z = true;
            } else {
                asljVar = aslmVar.i;
                if (asljVar == null) {
                    asljVar = aslj.a;
                }
                if (asljVar.c) {
                    z = false;
                } else {
                    z = true;
                }
            }
            i = aslmVar.d;
            f = aslmVar.e;
            iAU = a.aU(aslmVar.g);
            if (iAU == 0) {
                z2 = false;
            } else {
                z2 = false;
            }
            z3 = aslmVar.f;
            ahgbVar.M();
            mqfVar = (mqf) ahgbVar.d;
            if (mqfVar.c()) {
                mqfVar.c = ahgbVar;
                if (i >= 0) {
                    i4 = i;
                }
                if (f > 0.0f) {
                    Object obj2 = ahgbVar.a;
                    float f3 = f * 1000.0f;
                    int iA2 = mqfVar.a();
                    npVar = mqfVar.a.n;
                    if (npVar instanceof GridLayoutManager) {
                        i2 = ((GridLayoutManager) npVar).b;
                    } else {
                        i2 = 1;
                    }
                    long j2 = (int) f3;
                    AtomicReference atomicReference2 = (AtomicReference) obj2;
                    atomicReference2.set(avlr.I(0L, j2, TimeUnit.MILLISECONDS, (avmb) ahgbVar.b).O((avmb) ahgbVar.e).af(new abqa(ahgbVar, new avbs(iA2, i4, z2, i2), z, i3)));
                } else {
                    mqfVar.b(i4, z);
                }
                ((AtomicBoolean) ahgbVar.c).set(z3);
            }
        }
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        return nqw.a(this, mewVar, nrvVar);
    }

    @Override // defpackage.nrr
    public final void f(String str, nrp nrpVar) {
        nrp nrpVar2 = (nrp) a.put(str, nrpVar);
        if (nrpVar2 != null) {
            b.remove(nrpVar2.a());
        }
        aslm aslmVar = (aslm) c.remove(str);
        if (aslmVar != null) {
            d(aslmVar, null, null);
        }
    }

    @Override // defpackage.nrr
    public final void g(String str, nrp nrpVar) {
        Map map = a;
        nrp nrpVar2 = (nrp) map.get(str);
        if (nrpVar2 == null || nrpVar2 != nrpVar) {
            return;
        }
        map.remove(str);
        b.remove(nrpVar2.a());
    }
}
