package defpackage;

import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Size;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.libraries.jni.UnsafeMemory;
import com.google.android.libraries.multiplatform.elements.ElementsRetainedState;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import com.google.android.libraries.notifications.platform.executor.impl.GnpExecutorApiService;
import io.grpc.Status;
import j$.time.Duration;
import java.io.File;
import java.util.concurrent.atomic.AtomicLong;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lez implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public /* synthetic */ lez(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.lang.Object, wpl] */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v128 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, nar] */
    /* JADX WARN: Type inference failed for: r0v6, types: [lga] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, oov] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kzm] */
    /* JADX WARN: Type inference failed for: r15v3, types: [kzm] */
    /* JADX WARN: Type inference failed for: r15v66, types: [qji] */
    /* JADX WARN: Type inference failed for: r15v71, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, orq] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, orq] */
    /* JADX WARN: Type inference failed for: r1v3, types: [lga] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, orq] */
    /* JADX WARN: Type inference failed for: r1v49, types: [aunn, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r15;
        ?? L;
        SwipeRefreshLayout swipeRefreshLayout;
        oqz oqzVar;
        oqj oqjVar;
        SwipeRefreshLayout swipeRefreshLayout2;
        long jDecrementAndGet;
        String strB = null;
        try {
            switch (this.$cid) {
                case 0:
                    try {
                        Object obj = this.c;
                        if (((ldz) obj).J().f().o()) {
                            lco lcoVar = ((lff) obj).b;
                            if (lcoVar != null) {
                                strB = lcoVar.b((lbg) this.a);
                                if (strB != null) {
                                    ((lbb) obj).i().V(strB);
                                    ((ldz) obj).J().f.b(strB);
                                }
                                ((lff) obj).A();
                                Object obj2 = this.c;
                                Object obj3 = this.b;
                                L = ((ldz) obj2).L();
                                r15 = obj3;
                                L.Z(r15, strB);
                                return;
                            }
                            ((ldz) obj).aT().c.a("Failed to get app instance id");
                        } else {
                            ((ldz) obj).aT().h.a("Analytics storage consent denied; will not get app instance id");
                            ((lbb) obj).i().V(null);
                            ((ldz) obj).J().f.b(null);
                        }
                        L = ((ldz) obj).L();
                        r15 = this.b;
                    } catch (RemoteException e) {
                        ((ldz) this.c).aT().c.b("Failed to get app instance id", e);
                    }
                    L.Z(r15, strB);
                    return;
                case 1:
                    Object obj4 = this.c;
                    lco lcoVar2 = ((lff) obj4).b;
                    Object obj5 = this.a;
                    Object obj6 = this.b;
                    if (lcoVar2 == null) {
                        ((ldz) obj4).aT().c.a("[sgtm] Discarding data. Failed to update batch upload status.");
                        return;
                    }
                    try {
                        lcoVar2.z((lbg) obj6, (lbp) obj5);
                        ((lff) obj4).A();
                        return;
                    } catch (RemoteException e2) {
                        ((ldz) obj4).aT().c.c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(((lbp) obj5).a), e2);
                        return;
                    }
                case 2:
                    ((lcz) this.a).k.a("AppMeasurementJobService processed last upload request.");
                    ((lfi) ((lqa) this.c).a).c((JobParameters) this.b);
                    return;
                case 3:
                    String str = mkh.a;
                    gzj.aS();
                    ?? r0 = this.a;
                    Object obj7 = this.c;
                    Object obj8 = this.b;
                    if (!r0.u()) {
                        fua.aE((fhd) obj8, (String) obj7);
                        return;
                    }
                    fiq fiqVarP = fua.p((fhd) obj8, 1008096338, (String) obj7);
                    if (fiqVarP != null) {
                        fiqVarP.a(new fhz());
                        return;
                    }
                    return;
                case 4:
                    Object obj9 = this.b;
                    Object obj10 = this.c;
                    nrv nrvVar = (nrv) this.a;
                    ((mqg) obj9).d((aslm) obj10, nrvVar.b(), nrvVar.b);
                    return;
                case 5:
                    nrv nrvVar2 = (nrv) this.a;
                    View viewB = nrvVar2.b();
                    if (viewB != null) {
                        Object obj11 = this.c;
                        View viewF = nrvVar2.b;
                        Context context = viewB.getContext();
                        asoj asojVar = (asoj) obj11;
                        strB = (asojVar.c & 2) != 0 ? asojVar.e : null;
                        Object obj12 = this.b;
                        if (strB != null) {
                            viewF = viewB.findViewWithTag(strB);
                            if (viewF == null) {
                                throw new nud("Cannot find ScrollableContainerType instance via the provided key: ".concat(strB));
                            }
                        } else {
                            if (viewF != null) {
                                while (true) {
                                    if (viewF == null) {
                                        viewF = ((mqm) obj12).f(viewB);
                                    } else if (!(viewF instanceof NestedScrollView) && !(viewF instanceof HorizontalScrollView)) {
                                        viewF = (View) viewF.getParent();
                                    }
                                }
                            } else {
                                viewF = ((mqm) obj12).f(viewB);
                            }
                            if (viewF == null) {
                                throw new nud("Cannot find ScrollableContainerType instance in command's ancestors chain. Please put command at right place or add an Element key to both ScrollableContainerType instance and ScrollableContainer command.");
                            }
                        }
                        View view = viewF;
                        mqm mqmVar = (mqm) obj12;
                        mqmVar.g();
                        view.setOnTouchListener(new mqk(mqmVar, view));
                        view.post(new mrh(mqmVar, asojVar, view, context, 1));
                        return;
                    }
                    return;
                case 6:
                    ((ozc) ((xsc) this.b).c).d((File) this.a, (String) this.c);
                    return;
                case 7:
                    Object obj13 = this.c;
                    aswq aswqVar = (aswq) obj13;
                    if (aswqVar.j == null) {
                        boolean z = aswq.a;
                        mew mewVar = (mew) obj13;
                        long j = mewVar.c + ((long) (true == z ? 40 : 72));
                        long j2 = 1 + j;
                        byte bPeekByte = Memory.peekByte(j);
                        byte bPeekByte2 = Memory.peekByte(j2);
                        boolean z2 = UnsafeMemory.a;
                        byte b = true != z2 ? bPeekByte2 : bPeekByte;
                        if (true == z2) {
                            bPeekByte = bPeekByte2;
                        }
                        if (((short) ((b << 8) | (bPeekByte & 255))) == 11) {
                            aswqVar.j = new mew(mewVar.cp(true == z ? 112 : 76, atcm.a));
                        }
                    }
                    this.a.d(aswqVar.j == null ? atcl.a : aswqVar.j, opy.k(opy.l(((opy) this.b).c)));
                    return;
                case 8:
                    Object obj14 = this.c;
                    aswq aswqVar2 = (aswq) obj14;
                    if (aswqVar2.i == null) {
                        boolean z3 = aswq.a;
                        mew mewVar2 = (mew) obj14;
                        long j3 = mewVar2.c + ((long) (true == z3 ? 40 : 72));
                        long j4 = 1 + j3;
                        byte bPeekByte3 = Memory.peekByte(j3);
                        byte bPeekByte4 = Memory.peekByte(j4);
                        boolean z4 = UnsafeMemory.a;
                        byte b2 = true != z4 ? bPeekByte4 : bPeekByte3;
                        if (true == z4) {
                            bPeekByte3 = bPeekByte4;
                        }
                        if (((short) ((b2 << 8) | (bPeekByte3 & 255))) == 10) {
                            aswqVar2.i = new mew(mewVar2.cp(true == z3 ? 112 : 76, atcm.a));
                        }
                    }
                    this.a.d(aswqVar2.i == null ? atcl.a : aswqVar2.i, opy.k(opy.l(((opy) this.b).c)));
                    return;
                case 9:
                    oqu oquVar = ((oqp) this.b).b;
                    if (this.a == oquVar.n) {
                        oqj oqjVar2 = oquVar.g;
                        if (oqjVar2 != null) {
                            oqjVar2.F();
                        }
                        if (oquVar.p.compareAndSet(true, false) && (swipeRefreshLayout = oquVar.o) != null) {
                            swipeRefreshLayout.l(false, false);
                        }
                        oquVar.h().L().io().c().c(aslh.LOG_TYPE_INTERNAL_ERROR, "Error loading data from CollectionDataSource.", ((Status) this.c).asException());
                        return;
                    }
                    return;
                case 10:
                    oqu oquVar2 = ((oqp) this.b).b;
                    Object obj15 = this.a;
                    if (obj15 != oquVar2.n || (oqzVar = oquVar2.i) == null || (oqjVar = oquVar2.g) == null) {
                        return;
                    }
                    agke agkeVar = (agke) this.c;
                    oqjVar.E(oqzVar, new oqt((orf) obj15, agkeVar), agkeVar);
                    oquVar2.g.F();
                    if (!oquVar2.p.compareAndSet(true, false) || (swipeRefreshLayout2 = oquVar2.o) == null) {
                        return;
                    }
                    swipeRefreshLayout2.l(false, false);
                    return;
                case 11:
                    orn.c((View) this.b, (atbf) this.c, this.a);
                    return;
                case 12:
                    ((otu) this.c).j((Drawable) this.b, (ImageView.ScaleType) this.a);
                    return;
                case 13:
                    Object obj16 = this.a;
                    NodeTreeProcessorImpl nodeTreeProcessorImpl = (NodeTreeProcessorImpl) obj16;
                    AtomicLong atomicLong = nodeTreeProcessorImpl.d;
                    Object obj17 = this.b;
                    Object obj18 = this.c;
                    long j5 = atomicLong.get();
                    while (true) {
                        if ((j5 & 4611686018427387904L) != 0 || j5 <= 0) {
                            return;
                        }
                        if (atomicLong.compareAndSet(j5, j5 + 1)) {
                            int i = 14;
                            try {
                                ElementsRetainedState elementsRetainedState = (ElementsRetainedState) ((NodeTreeProcessorImpl) obj16).g.getAndSet(obj17);
                                if (elementsRetainedState != obj17) {
                                    ((NodeTreeProcessorImpl) obj16).L(elementsRetainedState);
                                }
                                NodeTreeProcessorImpl.jniSetElement(((NodeTreeProcessorImpl) obj16).c, (byte[]) obj18, ((ElementsRetainedState) obj17).a());
                                if (jDecrementAndGet == j) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                if (nodeTreeProcessorImpl.d.decrementAndGet() == 4611686018427387904L) {
                                    nodeTreeProcessorImpl.a.z().execute(new ooz(obj16, i));
                                }
                            }
                        }
                        j5 = atomicLong.get();
                    }
                    break;
                case 14:
                    if (((oya) this.c).a((View) this.b)) {
                        ((owy) this.a).f = true;
                        return;
                    }
                    return;
                case 15:
                    ?? r1 = this.c;
                    Object obj19 = this.b;
                    Object obj20 = this.a;
                    int i2 = 20;
                    try {
                        ((PowerManager.WakeLock) obj19).acquire(300000L);
                        r1.run();
                        try {
                            break;
                        } catch (RuntimeException e3) {
                        }
                        return;
                    } finally {
                        try {
                            ((PowerManager.WakeLock) obj19).release();
                            break;
                        } catch (RuntimeException e4) {
                            ((agsj) ((agsj) ((agsj) GnpExecutorApiService.a.c()).j(e4)).k("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiService", "processNextTask", 101, "GnpExecutorApiService.java")).t("WakeLock releasing failed, probably due to timeout passing.");
                        }
                        qpj.e(new ooz(obj20, i2));
                    }
                case 16:
                    ((qgz) this.c).a((qgt) this.a, (qgs) this.b);
                    return;
                case 17:
                    ((qji) this.a).c(this.c, (ahek) this.b);
                    return;
                case 18:
                    ((ria) this.a).f((Duration) this.c, (Size) this.b);
                    return;
                case 19:
                    ?? r2 = this.a;
                    if (r2 != 0) {
                        r2.c();
                        return;
                    }
                    aihf aihfVar = (aihf) this.c;
                    arrc arrcVar = (arrc) aihfVar.instance;
                    int i3 = arrcVar.b;
                    if (i3 == 1) {
                        if (((i3 == 1 ? (arrd) arrcVar.c : arrd.a).b & 8) != 0) {
                            Object obj21 = this.b;
                            arrc arrcVar2 = (arrc) aihfVar.instance;
                            ajwo ajwoVar = (arrcVar2.b == 1 ? (arrd) arrcVar2.c : arrd.a).d;
                            if (ajwoVar == null) {
                                ajwoVar = ajwo.a;
                            }
                            ((abzi) obj21).f.a(ajwoVar);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    rmc rmcVar = (rmc) this.a;
                    rmcVar.a.getWritableDatabase().update("identity", (ContentValues) this.b, "account = ?", (String[]) this.c);
                    rmcVar.b.open();
                    return;
            }
        } catch (Throwable th) {
            ((ldz) this.c).L().Z(this.b, null);
            throw th;
        }
        ((ldz) this.c).L().Z(this.b, null);
        throw th;
    }

    public /* synthetic */ lez(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ lez(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ lez(Object obj, Object obj2, Object obj3, int i, int[] iArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ lez(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ lez(Object obj, Object obj2, Object obj3, int i, boolean[] zArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public lez(lff lffVar, lbg lbgVar, kzm kzmVar, int i) {
        this.$cid = i;
        this.a = lbgVar;
        this.b = kzmVar;
        this.c = lffVar;
    }
}
