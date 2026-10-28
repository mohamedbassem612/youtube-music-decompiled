package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hoi implements avnd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hoi(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, mfy] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, nxa] */
    /* JADX WARN: Type inference failed for: r7v2, types: [avlw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, mfy] */
    @Override // defpackage.avnd
    public final void a() {
        switch (this.$cid) {
            case 0:
                this.a.b();
                break;
            case 1:
                this.a.kn();
                break;
            case 2:
                avnr.b((AtomicReference) this.a);
                break;
            case 3:
                Object obj = this.a;
                jqo jqoVar = (jqo) obj;
                ValueAnimator valueAnimator = jqoVar.s;
                if (!valueAnimator.isRunning()) {
                    valueAnimator.setIntValues(-2, 2);
                    valueAnimator.setRepeatCount(4);
                    valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimator.addUpdateListener(new pr(obj, 14, null));
                    valueAnimator.addListener(new jqj(jqoVar));
                    valueAnimator.start();
                }
                break;
            case 4:
                ((RuntimeStreamWriter) this.a).close();
                break;
            case 5:
                ((acxx) this.a).e();
                break;
            case 6:
                this.a.a();
                break;
            case 7:
                ((acyj) this.a).a();
                break;
            case 8:
                ((acyj) this.a).a();
                break;
            case 9:
                ((avpr) this.a).a();
                break;
            case 10:
                this.a.a();
                break;
            case 11:
                int i = mqq.e;
                ((CommandRunCompletionCallback) this.a).completion(Status.OK);
                break;
            case 12:
                Object obj2 = ((mgp) this.a).a;
                if (obj2 instanceof cf) {
                    cc ccVarG = ((cf) obj2).getSupportFragmentManager().g("channel_creation_fragment");
                    if (ccVarG instanceof bp) {
                        ((bp) ccVarG).iQ(false, false, true);
                    }
                }
                break;
            case 13:
                ((srd) this.a).j.j(null, true);
                break;
            case 14:
                sru sruVar = (sru) this.a;
                asmv asmvVar = sruVar.c;
                if (asmvVar != null) {
                    sruVar.b(asmvVar, sruVar.d, sruVar.e, sruVar.f, sruVar.g, sruVar.h);
                }
                break;
            case 15:
                suo suoVar = (suo) this.a;
                aonv aonvVar = suoVar.f;
                if (aonvVar != null && (aonvVar.c & 32) != 0) {
                    vxe vxeVar = suoVar.b;
                    ajwo ajwoVar = aonvVar.i;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    vxeVar.a(ajwoVar);
                }
                suoVar.f = null;
                suoVar.d = true;
                break;
            case 16:
                ((suo) this.a).i();
                break;
            case 17:
                ((tqm) this.a).b();
                break;
            case 18:
                ((trh) this.a).g();
                break;
            case 19:
                ((trd) this.a).h();
                break;
            default:
                this.a.a();
                break;
        }
    }
}
