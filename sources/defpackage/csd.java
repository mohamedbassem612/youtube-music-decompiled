package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.TransitionDrawable;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.webkit.WebView;
import com.google.android.apps.youtube.music.watchpage.MusicPlaybackControls;
import com.google.android.libraries.youtube.creation.effects.deprecated.picker.ChooseFilterView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.impl.CronetBidirectionalStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class csd implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;

    public /* synthetic */ csd(Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [cfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [axo, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                qcb qcbVar = ((csf) ((cse) this.b).a).h;
                qcbVar.getClass();
                crw crwVar = (crw) qcbVar.a;
                ahno.O(crwVar.c);
                if (this.a && crwVar.b == null) {
                    crwVar.a();
                    return;
                }
                return;
            case 1:
                int i = bwp.a;
                ((boy) this.b).a.k(this.a);
                return;
            case 2:
                this.b.accept(Boolean.valueOf(this.a));
                return;
            case 3:
                boolean z2 = this.a;
                Object obj = this.b;
                if (z2 && ((MusicPlaybackControls) obj).d.A()) {
                    z = true;
                }
                MusicPlaybackControls musicPlaybackControls = (MusicPlaybackControls) obj;
                musicPlaybackControls.k = z;
                musicPlaybackControls.i.k = z;
                musicPlaybackControls.e();
                return;
            case 4:
                boolean z3 = this.a;
                ler lerVar = (ler) this.b;
                ldr ldrVar = lerVar.t;
                boolean zW = ldrVar.w();
                boolean zV = ldrVar.v();
                ldrVar.u(z3);
                if (zV == z3) {
                    ldrVar.aT().k.b("Default data collection state already set to", Boolean.valueOf(z3));
                }
                if (ldrVar.w() == zW || ldrVar.w() != ldrVar.v()) {
                    ldrVar.aT().h.c("Default data collection is different than actual status", Boolean.valueOf(z3), Boolean.valueOf(zW));
                }
                lerVar.af();
                return;
            case 5:
                xhc xhcVar = uiv.a;
                if (this.a) {
                    return;
                }
                View view = (View) this.b;
                view.setVisibility(8);
                view.setAlpha(1.0f);
                return;
            case 6:
                boolean z4 = this.a;
                Object obj2 = this.b;
                if (!z4) {
                    ((ukd) obj2).c();
                    return;
                }
                ukd ukdVar = (ukd) obj2;
                ukdVar.a();
                ((uwf) ukdVar.a.io()).a();
                return;
            case 7:
                boolean z5 = this.a;
                uvy uvyVar = (uvy) this.b;
                if (uvyVar.c != z5) {
                    uvyVar.c = z5;
                    ugo ugoVar = uvyVar.f;
                    ugoVar.h(z5);
                    ugoVar.g();
                    AnimatorSet animatorSet = (AnimatorSet) uvyVar.e.orElse(null);
                    zf zfVar = uvyVar.g;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(zfVar);
                    if (animatorSet != null && (animatorSet.isStarted() || animatorSet.isRunning())) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object obj3 = ((zf) it.next()).a;
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj3, (Property<Object, Float>) View.ALPHA, true != z5 ? 0.0f : 1.0f);
                        objectAnimatorOfFloat.setDuration(250L);
                        objectAnimatorOfFloat.addListener(new ujf((View) obj3, z5));
                        arrayList2.add(objectAnimatorOfFloat);
                    }
                    animatorSet2.playTogether(arrayList2);
                    animatorSet2.start();
                    uvyVar.e = Optional.of(animatorSet2);
                    return;
                }
                return;
            case 8:
                boolean z6 = this.a;
                Object obj4 = this.b;
                if (z6) {
                    ((uvy) obj4).a.performHapticFeedback(1);
                }
                uvy uvyVar2 = (uvy) obj4;
                View view2 = uvyVar2.b;
                if (view2.getAnimation() != null && view2.getAnimation().hasStarted() && !view2.getAnimation().hasEnded()) {
                    view2.getAnimation().reset();
                }
                float f = true == z6 ? 1.1667f : 1.0f;
                view2.animate().scaleX(f).scaleY(f).setDuration(75L).start();
                TransitionDrawable transitionDrawable = (TransitionDrawable) view2.getBackground();
                if (!z6) {
                    transitionDrawable.reverseTransition(75);
                    return;
                } else {
                    transitionDrawable.startTransition(75);
                    uvyVar2.f.d();
                    return;
                }
            case 9:
                ChooseFilterView chooseFilterView = (ChooseFilterView) this.b;
                ValueAnimator valueAnimator = chooseFilterView.b;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    chooseFilterView.b.end();
                }
                if (chooseFilterView.a.b()) {
                    boolean z7 = this.a;
                    int iMax = Math.max(chooseFilterView.getHeight(), 1);
                    if (z7) {
                        chooseFilterView.setY(0.0f);
                        chooseFilterView.setAlpha(1.0f);
                        chooseFilterView.b = chooseFilterView.a(iMax, 0);
                    } else {
                        chooseFilterView.b = chooseFilterView.a(iMax, 1);
                    }
                    chooseFilterView.b.end();
                    zf zfVar2 = chooseFilterView.c;
                    zfVar2.getClass();
                    tpo tpoVar = new tpo(5);
                    if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                        ((ChooseFilterView) zfVar2.a).post(tpoVar);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((yae) this.b).b.d(this.a);
                return;
            case 11:
                yhj yhjVar = (yhj) this.b;
                boolean z8 = this.a;
                for (yfi yfiVar : yhjVar.a.values()) {
                    try {
                        if (yfiVar.m == 2) {
                            yfiVar.b(z8);
                        }
                    } catch (Exception e) {
                        ywn ywnVar = yhjVar.b;
                        zhv zhvVarA = ygs.a();
                        zhvVarA.d = e;
                        ywnVar.k(zhvVarA.a());
                    }
                }
                return;
            case 12:
                ((ytv) this.b).s(this.a);
                return;
            case 13:
                yyv yyvVar = ((yyt) this.b).a;
                zcf zcfVar = yyvVar.h.m;
                if (zcfVar != null) {
                    boolean z9 = this.a;
                    int i2 = zic.a;
                    long jE = yyvVar.e();
                    StringBuilder sb = new StringBuilder("sfo.");
                    sb.append(true != z9 ? "0" : "1");
                    sb.append(";pos.");
                    sb.append(jE);
                    zcfVar.Z.l("esfo", sb.toString());
                    return;
                }
                return;
            case 14:
                yyv yyvVar2 = ((yyt) this.b).a;
                yye yyeVar = yyvVar2.h;
                boolean z10 = this.a;
                yyeVar.q = z10;
                yyeVar.p = true;
                zcf zcfVar2 = yyeVar.m;
                if (zcfVar2 != null) {
                    int i3 = zic.a;
                    String str = true != z10 ? "0" : "1";
                    zcfVar2.Z.l("eao", "offload." + str + ";pos." + yyvVar2.e());
                    return;
                }
                return;
            case 15:
                ((abvs) this.b).d(this.a);
                return;
            case 16:
                WebView webView = ((aehd) this.b).i;
                if (webView != null) {
                    aedi.g(webView, this.a);
                    return;
                }
                return;
            case 17:
                if (this.a) {
                    avey aveyVar = ((avev) this.b).a;
                    aveyVar.p = true;
                    if (aveyVar.l > 0) {
                        agfp agfpVar = aveyVar.o;
                        agfpVar.d();
                        agfpVar.e();
                    }
                }
                ((avev) this.b).a.q = false;
                return;
            default:
                Object obj5 = this.b;
                synchronized (((CronetBidirectionalStream) obj5).n) {
                    if (((CronetBidirectionalStream) obj5).g()) {
                        return;
                    }
                    ((CronetBidirectionalStream) obj5).o = this.a;
                    ((CronetBidirectionalStream) obj5).s = 2;
                    if (CronetBidirectionalStream.f(((CronetBidirectionalStream) obj5).d) || !((CronetBidirectionalStream) obj5).o) {
                        ((CronetBidirectionalStream) obj5).t = 8;
                    } else {
                        ((CronetBidirectionalStream) obj5).t = 10;
                    }
                    try {
                        ((CronetBidirectionalStream) obj5).c.onStreamReady((BidirectionalStream) obj5);
                        return;
                    } catch (Exception e2) {
                        ((CronetBidirectionalStream) this.b).e(e2);
                        return;
                    }
                }
        }
    }

    public csd(Object obj, boolean z, int i, byte[] bArr) {
        this.$cid = i;
        this.a = z;
        this.b = obj;
    }

    public /* synthetic */ csd(boolean z, View view, int i) {
        this.$cid = i;
        this.a = z;
        this.b = view;
    }
}
