package defpackage;

import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oox implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ oox(hfk hfkVar, wqn wqnVar, amlg amlgVar, amlg amlgVar2, hfd hfdVar, Runnable runnable, int i) {
        this.$cid = i;
        this.a = hfkVar;
        this.e = wqnVar;
        this.f = amlgVar;
        this.d = amlgVar2;
        this.b = hfdVar;
        this.c = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:84:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r10;
        xpc xpcVar;
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                Object obj = this.e;
                hfk hfkVar = (hfk) this.a;
                ListenableFuture listenableFutureD = hfkVar.m.d((wqn) obj, MoreExecutors.directExecutor());
                Object obj2 = this.b;
                taf.i(listenableFutureD, hfkVar.h, new hfg(hfkVar, (amlg) this.f, (amlg) this.d, (hfd) obj2, 3), new gln(obj2, 11), this.c);
                return;
            }
            amyb amybVar = (amyb) this.d;
            boolean z = amybVar.j;
            Object obj3 = this.c;
            Object obj4 = this.b;
            if (z) {
                xpc xpcVar2 = (xpc) obj4;
                xwv xwvVar = xpcVar2.g;
                if (Objects.equals(xwvVar.e(), xyv.a)) {
                    xpcVar = (xpc) obj4;
                    if (!xpcVar.c.a((dii) ((Optional) obj3).get())) {
                        xpcVar.d(amybVar);
                        return;
                    }
                } else if (!xpcVar2.c.S((dii) ((Optional) obj3).get(), xwvVar.e())) {
                    xpcVar2.d(amybVar);
                    return;
                }
            } else {
                xpcVar = (xpc) obj4;
                if (!xpcVar.c.a((dii) ((Optional) obj3).get())) {
                    xpcVar.d(amybVar);
                    return;
                }
            }
            Object obj5 = this.f;
            Object obj6 = this.a;
            ((agrc) ((agrc) xpc.a.b().i(agso.a, "MdxConnectCommandResolver")).k("com/google/android/libraries/youtube/mdx/handoff/MdxConnectCommandResolver", "resolve", 202, "MdxConnectCommandResolver.java")).t("mdxSessionManager.addListener.");
            xpc xpcVar3 = (xpc) obj4;
            ycp ycpVar = xpcVar3.i;
            aihf aihfVar = (aihf) obj5;
            ycpVar.a(new xpa((xvr) obj6, ycpVar, xpcVar3.d, (amyb) aihfVar.build()));
            amyb amybVar2 = (amyb) aihfVar.build();
            if ((amybVar2.c & 32) != 0) {
                avpi avpiVar = new avpi(new avle[]{avlb.g(new rkq(obj4, obj6, this.e, 3)), xpcVar3.m.y()});
                avnn avnnVar = atqp.p;
                avpiVar.F(new hrj(10), new mnt(obj4, amybVar2, 15));
                return;
            }
            return;
        }
        Object obj7 = this.f;
        ?? r0 = this.c;
        Object obj8 = this.b;
        Object obj9 = this.a;
        if (obj8 != null) {
            try {
                opo opoVarK = ((ElementsServices) obj8).K();
                if (opoVarK != null) {
                    Iterator it = r0.iterator();
                    while (it.hasNext()) {
                        opoVarK.b((NodeViewInterface) it.next());
                    }
                }
            } catch (Throwable th) {
                if (obj7 == null) {
                    throw th;
                }
                try {
                    ((opl) obj7).close();
                    throw th;
                } catch (Exception e) {
                    ((ooy) obj9).r("Failed to close processor", e);
                    throw th;
                }
            }
        }
        Object obj10 = this.d;
        if (obj10 != null && (r10 = this.e) != 0 && r10.C()) {
            for (PaintUnit paintUnit : (ArrayList) obj10) {
                if (Memory.peekByte(FlagServices.b().c + 45) != 0) {
                    if (r10.n(paintUnit.p()) != paintUnit) {
                        if (paintUnit.i()) {
                            r10.x(paintUnit);
                            try {
                                paintUnit.close();
                            } catch (IOException e2) {
                                ElementsServices elementsServices = ((ooy) obj9).a;
                                if (elementsServices != null) {
                                    elementsServices.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "ElementsView.removeAllChildren() paintUnit threw IOException", e2);
                                }
                            }
                        }
                    }
                } else if (r10.n(paintUnit.p()) != paintUnit) {
                    if (paintUnit.i()) {
                        r10.x(paintUnit);
                        paintUnit.close();
                    }
                }
            }
        }
        if (obj7 != null) {
            try {
                ((opl) obj7).close();
            } catch (Exception e3) {
                ((ooy) obj9).r("Failed to close processor", e3);
            }
        }
    }

    public /* synthetic */ oox(ooy ooyVar, ElementsServices elementsServices, List list, ArrayList arrayList, NodeTreeProcessor nodeTreeProcessor, opl oplVar, int i) {
        this.$cid = i;
        this.a = ooyVar;
        this.b = elementsServices;
        this.c = list;
        this.d = arrayList;
        this.e = nodeTreeProcessor;
        this.f = oplVar;
    }

    public /* synthetic */ oox(xpc xpcVar, amyb amybVar, Optional optional, xvr xvrVar, aihf aihfVar, xzc xzcVar, int i) {
        this.$cid = i;
        this.b = xpcVar;
        this.d = amybVar;
        this.c = optional;
        this.a = xvrVar;
        this.f = aihfVar;
        this.e = xzcVar;
    }
}
