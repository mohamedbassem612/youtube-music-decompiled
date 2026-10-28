package defpackage;

import android.os.PowerManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class acem implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acem(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x0108 A[LOOP:5: B:47:0x0102->B:49:0x0108, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, tbu] */
    /* JADX WARN: Type inference failed for: r8v24, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.AutoCloseable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        int i = 0;
        switch (this.$cid) {
            case 0:
                aceo aceoVar = (aceo) this.a;
                fg fgVar = aceoVar.a;
                fi fiVar = aceoVar.c;
                if (fgVar != null && fgVar.m() && fiVar != null) {
                    fgVar.k(fiVar.a());
                }
                aceoVar.c = null;
                return;
            case 1:
                aceo aceoVar2 = (aceo) this.a;
                fg fgVar2 = aceoVar2.a;
                ek ekVar = aceoVar2.e;
                if (fgVar2 != null && ekVar != null) {
                    fgVar2.j(ekVar.a());
                }
                aceoVar2.e = null;
                return;
            case 2:
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    ((acxm) it2.next()).d();
                }
                return;
            case 3:
                ((nxv) this.a).a = nxw.o;
                return;
            case 4:
                ((aeoh) this.a).i(false);
                return;
            case 5:
                ((aera) this.a).e();
                return;
            case 6:
                ?? r8 = this.a;
                aerf aerfVar = (aerf) r8;
                if (aerfVar.c()) {
                    ((tbt) aerfVar.b.io()).a(r8, wjs.class, r8);
                    return;
                }
                return;
            case 7:
                ((aesd) this.a).a = false;
                return;
            case 8:
                aevs aevsVar = (aevs) this.a;
                aevsVar.b = false;
                BottomSheetBehavior bottomSheetBehavior = aevsVar.c;
                bdr bdrVar = bottomSheetBehavior.G;
                if (bdrVar != null && bdrVar.l()) {
                    aevsVar.a(aevsVar.a);
                    return;
                } else {
                    if (bottomSheetBehavior.F == 2) {
                        bottomSheetBehavior.J(aevsVar.a);
                        return;
                    }
                    return;
                }
            case 9:
                while (true) {
                    afhi afhiVar = (afhi) this.a;
                    if (i >= afhiVar.b) {
                        return;
                    }
                    ((ListenableFuture) afhiVar.a.get(i)).cancel(true);
                    i++;
                }
                break;
            case 10:
                ((PowerManager.WakeLock) this.a).release();
                return;
            case 11:
                afry.k(this.a);
                return;
            case 12:
                afry.j(this.a);
                return;
            case 13:
                ((aftc) this.a).a = null;
                return;
            case 14:
                while (true) {
                    try {
                        try {
                            Object obj = this.a;
                            if (((afuk) obj).c.isShutdown()) {
                                try {
                                    ((afuk) this.a).c.execute(this);
                                    return;
                                } catch (RejectedExecutionException e) {
                                    Iterator it3 = afuk.a.keySet().iterator();
                                    while (it3.hasNext()) {
                                        ((afuj) it3.next()).a.setException(e);
                                    }
                                    return;
                                }
                            }
                            afui afuiVar = ((afuj) ((afuk) obj).b.remove()).a;
                            int i2 = afui.b;
                            afuiVar.set(null);
                        } catch (RejectedExecutionException e2) {
                            it = afuk.a.keySet().iterator();
                            while (it.hasNext()) {
                                ((afuj) it.next()).a.setException(e2);
                            }
                            return;
                        }
                    } catch (InterruptedException unused) {
                        ((afuk) this.a).c.execute(this);
                        return;
                    } catch (Throwable th) {
                        try {
                            ((afuk) this.a).c.execute(this);
                            throw th;
                        } catch (RejectedExecutionException e3) {
                            Iterator it4 = afuk.a.keySet().iterator();
                            while (it4.hasNext()) {
                                ((afuj) it4.next()).a.setException(e3);
                            }
                            throw th;
                        }
                    }
                    it = afuk.a.keySet().iterator();
                    while (it.hasNext()) {
                        ((afuj) it.next()).a.setException(e2);
                    }
                    return;
                }
            case 15:
                ((Future) ((AtomicReference) this.a).get()).cancel(false);
                return;
            case 16:
                aheu aheuVar = ahdm.a;
                try {
                    this.a.close();
                    return;
                } catch (Exception e4) {
                    ahng.d(e4);
                    ahdm.a.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", "thrown by close()", (Throwable) e4);
                    return;
                }
            case 17:
                Object obj2 = this.a;
                ahdl ahdlVar = ahdl.c;
                ahdl ahdlVar2 = ahdl.d;
                ahdk ahdkVar = (ahdk) obj2;
                ahdkVar.b(ahdlVar, ahdlVar2);
                ahdm.a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture$State", "close", "closing {0}", obj2);
                ahdkVar.b.close();
                ahdkVar.b(ahdlVar2, ahdl.e);
                return;
            case 18:
                ((ahrv) this.a).k();
                return;
            case 19:
                ((ahrv) this.a).k();
                return;
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.a;
                if (firebaseMessaging.i()) {
                    firebaseMessaging.g();
                    return;
                }
                return;
        }
    }

    public acem(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
