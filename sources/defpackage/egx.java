package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class egx implements eho {
    private final /* synthetic */ int $cid;
    private final WeakReference a;

    public egx(LottieAnimationView lottieAnimationView, int i, byte[] bArr) {
        this.$cid = i;
        this.a = new WeakReference(lottieAnimationView);
    }

    @Override // defpackage.eho
    public final /* synthetic */ void a(Object obj) {
        if (this.$cid == 0) {
            egy egyVar = (egy) obj;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.a.get();
            if (lottieAnimationView != null) {
                lottieAnimationView.k(egyVar);
                return;
            }
            return;
        }
        Throwable th = (Throwable) obj;
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.a.get();
        if (lottieAnimationView2 != null) {
            int i = lottieAnimationView2.c;
            if (i != 0) {
                lottieAnimationView2.setImageResource(i);
            }
            eho ehoVar = lottieAnimationView2.b;
            if (ehoVar == null) {
                ehoVar = LottieAnimationView.a;
            }
            ehoVar.a(th);
        }
    }

    public egx(LottieAnimationView lottieAnimationView, int i) {
        this.$cid = i;
        this.a = new WeakReference(lottieAnimationView);
    }
}
