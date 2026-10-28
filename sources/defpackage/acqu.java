package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.libraries.elements.interfaces.JSController;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.youtube.client.mobile.executor.JsExecutor;
import com.google.android.libraries.youtube.client.mobile.executor.JsMemoryPressureLevel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acqu implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public acqu(aeam aeamVar, int i) {
        this.$cid = i;
        this.a = aeamVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, nqu] */
    /* JADX WARN: Type inference failed for: r5v50, types: [android.view.ViewTreeObserver$OnDrawListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        JsExecutor jsExecutor;
        JsExecutor jsExecutor2;
        switch (this.$cid) {
            case 0:
                acqz acqzVar = ((acqx) this.a).b;
                int i = acqzVar.Q;
                if (i >= 0) {
                    acqzVar.y.ab(i);
                }
                break;
            case 1:
                acqb acqbVar = (acqb) this.a;
                np npVar = (np) acqbVar.b;
                View viewB = ((nf) acqbVar.c).b(npVar);
                if (viewB != null) {
                    ((RecyclerView) acqbVar.a).aj(npVar.getPosition(viewB));
                }
                break;
            case 2:
                acqz acqzVar2 = ((acqx) this.a).b;
                int andSet = acqzVar2.m.getAndSet(-1);
                if (andSet >= 0) {
                    acqzVar2.y.aj(andSet);
                }
                break;
            case 3:
                acwm acwmVar = ((acxb) this.a).e;
                if (acwmVar != null) {
                    acwmVar.a();
                }
                break;
            case 4:
                acxb acxbVar = (acxb) this.a;
                acxbVar.h = true;
                acwm acwmVar2 = acxbVar.e;
                if (acwmVar2 != null) {
                    acwmVar2.b();
                }
                break;
            case 5:
                this.a.a();
                break;
            case 6:
                JSController controller = ((JSEnvironment) ((acyh) this.a).a.io()).getController();
                if (controller != null && (jsExecutor = controller.getJsExecutor()) != null) {
                    jsExecutor.memoryPressureNotification(JsMemoryPressureLevel.CRITICAL);
                    break;
                }
                break;
            case 7:
                JSController controller2 = ((JSEnvironment) ((acyh) this.a).a.io()).getController();
                if (controller2 != null && (jsExecutor2 = controller2.getJsExecutor()) != null) {
                    jsExecutor2.lowMemoryNotification();
                    break;
                }
                break;
            case 8:
                ((adfc) this.a).d();
                break;
            case 9:
                ((adne) this.a).d();
                break;
            case 10:
                ((adpa) this.a).b.k(new aoh(16));
                break;
            case 11:
                ((adsp) this.a).f.aq();
                break;
            case 12:
                ((adsr) this.a).X();
                break;
            case 13:
                ((bp) this.a).iN();
                break;
            case 14:
                aeam aeamVar = (aeam) this.a;
                aeamVar.e.dispatchKeyEvent(new KeyEvent(0, 67));
                aeamVar.a.postDelayed(this, 100L);
                break;
            case 15:
                ((RecyclerView) this.a).requestLayout();
                break;
            case 16:
                ?? r5 = this.a;
                ((aebf) r5).b.getViewTreeObserver().removeOnDrawListener(r5);
                break;
            case 17:
                ((aeei) this.a).f();
                break;
            case 18:
                ((aeei) this.a).h();
                break;
            case 19:
                ((aefr) this.a).n.setVisibility(0);
                break;
            default:
                ((aeic) this.a).w(0.2f);
                break;
        }
    }

    public /* synthetic */ acqu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
