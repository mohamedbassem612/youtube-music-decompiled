package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.OverScroller;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatSwipeableContainerLayout;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wvr implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ wvr(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0145  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, wxp] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, wxk] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, wxk] */
    /* JADX WARN: Type inference failed for: r11v34, types: [android.view.animation.Animation$AnimationListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.List] */
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
        ahey aheyVar;
        axmq axmqVar;
        float f;
        switch (this.$cid) {
            case 0:
                this.a.a();
                break;
            case 1:
                wkn wknVar = (wkn) this.a;
                wknVar.a.listen(new wkm(wknVar), 1);
                break;
            case 2:
                ((wwn) ((wvu) this.a).a).r.p();
                break;
            case 3:
                wvv wvvVar = (wvv) this.a;
                Queue queue = wvvVar.d;
                if (!queue.isEmpty()) {
                    zs zsVar = (zs) queue.remove();
                    for (int i = 1; i < wvvVar.f && !queue.isEmpty(); i++) {
                        ((ArrayList) zsVar.a).addAll(((zs) queue.remove()).a);
                    }
                    wvvVar.i(zsVar);
                    queue.size();
                    wvvVar.c.postDelayed(this, wvvVar.e);
                }
                break;
            case 4:
                wvw wvwVar = (wvw) this.a;
                Queue queue2 = wvwVar.f;
                if (!queue2.isEmpty() && (aheyVar = wvwVar.c) != null) {
                    axmq axmqVar2 = (axmq) queue2.poll();
                    if (axmqVar2 != null) {
                        wvwVar.b.k(axmqVar2.b, wvwVar.a, true);
                    }
                    if (!queue2.isEmpty() && (axmqVar = (axmq) queue2.peek()) != null) {
                        wvwVar.d = aheyVar.schedule(this, axmqVar.a, TimeUnit.MILLISECONDS);
                        break;
                    }
                }
                break;
            case 5:
                ((wwi) this.a).n();
                break;
            case 6:
                this.a.c();
                break;
            case 7:
                this.a.e();
                break;
            case 8:
                wwn wwnVar = (wwn) this.a;
                amqm amqmVar = wwnVar.p;
                if (amqmVar != null) {
                    wwnVar.n(true);
                    wwnVar.u(amqmVar);
                }
                break;
            case 9:
                wyq wyqVar = (wyq) this.a;
                wyqVar.s(wyp.a);
                wyqVar.t();
                break;
            case 10:
                ((wyq) this.a).s(wyp.b);
                break;
            case 11:
                xad xadVar = (xad) this.a;
                if (xadVar.h) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = xadVar.i;
                    if (j != 0) {
                        long j2 = xadVar.j;
                        if (j2 > jCurrentTimeMillis) {
                            f = (j2 - jCurrentTimeMillis) / j;
                        } else {
                            f = 0.0f;
                        }
                    } else {
                        f = 0.0f;
                    }
                    xadVar.f.setLevel((int) (10000.0f * f));
                    if (f > 0.0f) {
                        xadVar.b.postDelayed(this, 300L);
                    }
                }
                break;
            case 12:
                ((xbi) this.a).v(true);
                break;
            case 13:
                ((xbn) this.a).f();
                break;
            case 14:
                Object obj = this.a;
                Property property = View.TRANSLATION_Y;
                xbw xbwVar = (xbw) obj;
                LiveChatSwipeableContainerLayout liveChatSwipeableContainerLayout = xbwVar.j;
                xbwVar.s = ObjectAnimator.ofFloat(liveChatSwipeableContainerLayout, (Property<LiveChatSwipeableContainerLayout, Float>) property, liveChatSwipeableContainerLayout.getHeight(), 0.0f);
                xbwVar.s.setDuration(300L);
                xbwVar.s.setInterpolator(aedd.a);
                xbwVar.s.addListener(new xbv(xbwVar));
                xbwVar.o.getHeight();
                liveChatSwipeableContainerLayout.getHeight();
                liveChatSwipeableContainerLayout.d = 0;
                liveChatSwipeableContainerLayout.d(0);
                xbwVar.s.start();
                break;
            case 15:
                for (xcp xcpVar : ((xbw) this.a).g) {
                    xcpVar.e.setVisibility(8);
                    xcpVar.f.setVisibility(0);
                }
                break;
            case 16:
                ((xby) this.a).d();
                break;
            case 17:
                ?? r11 = this.a;
                xcg xcgVar = (xcg) r11;
                if (xcgVar.f) {
                    xcgVar.f = false;
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setInterpolator(aedd.a);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setAnimationListener(r11);
                    xcgVar.a.startAnimation(alphaAnimation);
                }
                break;
            case 18:
                xck xckVar = (xck) this.a;
                wwt wwtVar = xckVar.a;
                if (wwtVar != null) {
                    wwtVar.a(xckVar);
                }
                break;
            case 19:
                LiveChatSwipeableContainerLayout liveChatSwipeableContainerLayout2 = (LiveChatSwipeableContainerLayout) this.a;
                if (liveChatSwipeableContainerLayout2.getChildCount() > 0) {
                    OverScroller overScroller = liveChatSwipeableContainerLayout2.a;
                    overScroller.computeScrollOffset();
                    int i2 = liveChatSwipeableContainerLayout2.e;
                    liveChatSwipeableContainerLayout2.e = liveChatSwipeableContainerLayout2.b ? overScroller.getCurrY() : overScroller.getCurrX();
                    int iMin = liveChatSwipeableContainerLayout2.c ? Math.min(liveChatSwipeableContainerLayout2.a() - liveChatSwipeableContainerLayout2.b(), liveChatSwipeableContainerLayout2.c() + (liveChatSwipeableContainerLayout2.e - i2)) : 0;
                    if (liveChatSwipeableContainerLayout2.b) {
                        liveChatSwipeableContainerLayout2.scrollTo(0, iMin);
                    } else {
                        liveChatSwipeableContainerLayout2.scrollTo(iMin, 0);
                    }
                    if (!overScroller.isFinished()) {
                        liveChatSwipeableContainerLayout2.post(this);
                    }
                }
                break;
            default:
                aihf aihfVar = ((zui) this.a).f;
                long j3 = ((akkq) aihfVar.instance).W + 1;
                aihfVar.copyOnWrite();
                akkq akkqVar = (akkq) aihfVar.instance;
                akkqVar.d |= SemanticState.Hidden;
                akkqVar.W = j3;
                break;
        }
    }

    public wvr(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
