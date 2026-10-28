package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.android.libraries.elements.interfaces.ClientDataObserver;
import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.protobuf.MessageLite;
import io.grpc.Status;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jgq implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jgq(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v34, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r11v35, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r11v38, types: [java.lang.Object, nxa] */
    /* JADX WARN: Type inference failed for: r11v39, types: [java.lang.Object, nxa] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                aazn aaznVar = (aazn) obj;
                jgs jgsVar = (jgs) ((qcb) this.a).a;
                jgsVar.r(jgsVar.k && jgsVar.d.Z() && aaznVar.a == 2);
                break;
            case 1:
                iwl iwlVar = (iwl) obj;
                jgs jgsVar2 = (jgs) this.a;
                jgsVar2.e = iwlVar;
                jgsVar2.s(iwlVar);
                Drawable colorDrawable = jgsVar2.k ? new ColorDrawable(jgsVar2.m(iwlVar)) : jgsVar2.a().getBackground();
                SwipeLayout swipeLayout = jgsVar2.l;
                swipeLayout.t = colorDrawable;
                swipeLayout.s = new ColorDrawable(jgsVar2.n(iwlVar));
                break;
            case 2:
                if (aawb.B(((aboe) obj).j)) {
                    ((jgs) ((qcb) this.a).a).r(false);
                }
                break;
            case 3:
                ((jgu) this.a).a = (iwl) obj;
                break;
            case 4:
                ((jkr) this.a).c();
                break;
            case 5:
                hww hwwVar = (hww) obj;
                jmu jmuVar = (jmu) this.a;
                if (jmuVar.b != hwwVar && hwwVar == hww.a) {
                    jmuVar.c.run();
                }
                jmuVar.b = hwwVar;
                break;
            case 6:
                ((jny) this.a).b(((Integer) obj).intValue());
                break;
            case 7:
                jod jodVar = (jod) this.a;
                jodVar.b = null;
                jodVar.c = false;
                jodVar.a.kk(Optional.empty());
                break;
            case 8:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                jol jolVar = (jol) this.a;
                if (jolVar.B != null && jolVar.C != zBooleanValue) {
                    jolVar.C = zBooleanValue;
                    Handler handler = jolVar.F;
                    Runnable runnable = jolVar.w;
                    handler.removeCallbacks(runnable);
                    if (!zBooleanValue) {
                        handler.postDelayed(runnable, jolVar.v);
                    } else {
                        jolVar.B.setSelected(false);
                    }
                    break;
                }
                break;
            case 9:
                Optional optional = (Optional) obj;
                jol jolVar2 = (jol) this.a;
                jolVar2.p(optional, jolVar2.K);
                jolVar2.g(new adly(), optional);
                break;
            case 10:
                float f = ((ibt) obj).c;
                WatchWhileLayout watchWhileLayout = (WatchWhileLayout) this.a;
                float fJ = ((kwq) watchWhileLayout.n.io()).j();
                if (fJ != f) {
                    ValueAnimator valueAnimator = watchWhileLayout.bP;
                    if (valueAnimator.isRunning()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(fJ, f);
                    valueAnimator.start();
                }
                break;
            case 11:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                jqv jqvVar = (jqv) obj2;
                if (jqvVar.m != zBooleanValue2) {
                    jqvVar.m = zBooleanValue2;
                    ((nh) obj2).jZ(0, jqvVar.a(), new jqu(((hfn) jqvVar.g.io()).x(), zBooleanValue2));
                }
                break;
            case 12:
                this.a.d((MessageLite) obj);
                break;
            case 13:
                this.a.c((Throwable) obj);
                break;
            case 14:
                ((avpr) this.a).b((Throwable) obj);
                break;
            case 15:
                this.a.g();
                break;
            case 16:
                this.a.b();
                break;
            case 17:
                Throwable th = (Throwable) obj;
                boolean z = th instanceof nrs;
                Object obj3 = this.a;
                int i = z ? ((nrs) th).a : ((mpe) obj3).c;
                mpe mpeVar = (mpe) obj3;
                nuc nucVar = mpeVar.a;
                nsl nslVar = mpeVar.b;
                aslh aslhVar = aslh.LOG_TYPE_COMMAND_EXECUTION_ERROR;
                aihf aihfVarCreateBuilder = asmw.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                asmw asmwVar = (asmw) aihfVarCreateBuilder.instance;
                asmwVar.b = 1;
                Integer numValueOf = Integer.valueOf(i);
                asmwVar.c = numValueOf;
                nucVar.h(aslhVar, nslVar, th, (asmw) aihfVarCreateBuilder.build(), "Command error, extensionContext: %d", numValueOf);
                break;
            case 18:
                int i2 = mqq.e;
                ((CommandRunCompletionCallback) this.a).completion(Status.b((Throwable) obj));
                break;
            case 19:
                ((nxt) this.a).a = (byte[]) obj;
                break;
            default:
                ((ClientDataObserver) this.a).clientDataUpdated();
                break;
        }
    }
}
