package defpackage;

import android.content.Context;
import android.os.Process;
import android.support.v7.widget.RecyclerView;
import com.facebook.litho.ComponentTree;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class px implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ px(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v26, types: [awwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v38, types: [fcz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Semaphore semaphore;
        switch (this.$cid) {
            case 0:
                qe.onBackPressedDispatcher_delegate$lambda$0$0((qe) this.a);
                return;
            case 1:
                ((qe) this.a).invalidateMenu();
                return;
            case 2:
                ((bdr) this.a).f(0);
                return;
            case 3:
                Object obj2 = this.a;
                synchronized (((boo) obj2).b) {
                    obj = ((boo) obj2).f;
                    ((boo) obj2).f = boo.a;
                    break;
                }
                ((boo) this.a).h(obj);
                return;
            case 4:
                evu evuVar = (evu) this.a;
                hhb hhbVar = (hhb) ((WeakReference) evuVar.a).get();
                if (hhbVar != null) {
                    ((crg) hhbVar.a).j(((afjq) evuVar.b).b());
                    return;
                }
                return;
            case 5:
                ccm ccmVar = (ccm) this.a;
                Context context = ccmVar.c;
                int i = bwp.a;
                int iGenerateAudioSessionId = ast.o(context).generateAudioSessionId();
                int i2 = iGenerateAudioSessionId != -1 ? iGenerateAudioSessionId : 0;
                bvc bvcVar = ccmVar.m;
                if (((Integer) bvcVar.a()).intValue() != i2) {
                    bvcVar.d(Integer.valueOf(i2));
                    ccmVar.f.e(i2, true);
                    return;
                }
                return;
            case 6:
                ((dgr) this.a).o();
                return;
            case 7:
                ((dje) this.a).b();
                return;
            case 8:
                duc ducVar = (duc) this.a;
                ducVar.o(0);
                ducVar.h();
                return;
            case 9:
                ((AtomicBoolean) this.a).set(true);
                return;
            case 10:
                ?? r4 = this.a;
                if (r4 != 0) {
                    r4.p(null);
                    return;
                }
                return;
            case 11:
                Map map = ehd.a;
                ?? r5 = this.a;
                ThreadLocal threadLocal = enm.a;
                hmy.f(r5);
                return;
            case 12:
                Object obj3 = this.a;
                ehm ehmVar = (ehm) obj3;
                elf elfVar = ehmVar.k;
                if (elfVar != null) {
                    try {
                        ((ehm) obj3).n.acquire();
                        elfVar.m(((ehm) obj3).b.c());
                        semaphore = ehmVar.n;
                    } catch (InterruptedException unused) {
                        semaphore = ehmVar.n;
                    } catch (Throwable th) {
                        ehmVar.n.release();
                        throw th;
                    }
                    semaphore.release();
                    return;
                }
                return;
            case 13:
                ((ehu) this.a).a();
                return;
            case 14:
                ?? r6 = this.a;
                ((esq) r6).c.a(r6);
                return;
            case 15:
                Process.setThreadPriority(10);
                this.a.run();
                return;
            case 16:
                break;
            case 17:
                ((ComponentTree) this.a).k();
                return;
            case 18:
                ((fsy) this.a).z();
                return;
            case 19:
                fsy fsyVar = (fsy) this.a;
                RecyclerView recyclerView = fsyVar.C;
                if (recyclerView == null || !recyclerView.as()) {
                    fuz fuzVar = fsyVar.N;
                    if (fuzVar.d()) {
                        fuzVar.b(1);
                    }
                } else {
                    RecyclerView recyclerView2 = fsyVar.C;
                    if (recyclerView2.q && recyclerView2.getVisibility() != 8) {
                        int i3 = fsyVar.P;
                        if (i3 >= 3) {
                            fsyVar.P = 0;
                            fuz fuzVar2 = fsyVar.N;
                            if (fuzVar2.d()) {
                                fuzVar2.b(1);
                                return;
                            }
                            return;
                        }
                        fsyVar.P = i3 + 1;
                        RecyclerView recyclerView3 = fsyVar.C;
                        Runnable runnable = fsyVar.R;
                        int i4 = bac.a;
                        recyclerView3.postOnAnimation(runnable);
                        return;
                    }
                }
                fsyVar.P = 0;
                return;
            default:
                fip fipVar = ((fsy) this.a).K;
                if (fipVar != null) {
                    fipVar.gK(new fhz());
                    return;
                }
                return;
        }
        while (true) {
            Object obj4 = this.a;
            boolean z = ((eve) obj4).c;
            try {
                ((eve) obj4).c((evd) ((eve) obj4).b.remove());
                evc evcVar = ((eve) obj4).d;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public px(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
