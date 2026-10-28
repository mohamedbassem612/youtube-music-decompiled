package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mnx implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public mnx(dge dgeVar, Map map, Map map2, int i) {
        this.$cid = i;
        this.b = dgeVar;
        this.a = map;
        this.c = map2;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ?? r7;
        ?? r8;
        dgi dgiVar;
        if (this.$cid == 0) {
            if (((mny) this.c).f()) {
                FutureTask futureTask = (FutureTask) this.a;
                if (!futureTask.isCancelled() && !futureTask.isDone()) {
                    futureTask.run();
                }
                ((RecyclerView) this.b).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            return;
        }
        Object obj = this.b;
        dge dgeVar = (dge) obj;
        dgeVar.n.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        Set set = dgeVar.q;
        if (set == null || dgeVar.r == null) {
            return;
        }
        int size = set.size() - dgeVar.r.size();
        int i = 0;
        dfy dfyVar = new dfy(obj, 0);
        int firstVisiblePosition = dgeVar.n.getFirstVisiblePosition();
        boolean z = false;
        while (true) {
            r7 = this.c;
            r8 = this.a;
            if (i >= dgeVar.n.getChildCount()) {
                break;
            }
            View childAt = dgeVar.n.getChildAt(i);
            dii diiVar = (dii) dgeVar.o.getItem(firstVisiblePosition + i);
            Rect rect = (Rect) r8.get(diiVar);
            int top = childAt.getTop();
            int i2 = rect != null ? rect.top : (dgeVar.x * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            Set set2 = dgeVar.q;
            if (set2 != null && set2.contains(diiVar)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(dgeVar.Q);
                animationSet.addAnimation(alphaAnimation);
                i2 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i2 - top, 0.0f);
            translateAnimation.setDuration(dgeVar.P);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(dgeVar.S);
            if (!z) {
                animationSet.setAnimationListener(dfyVar);
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            r8.remove(diiVar);
            r7.remove(diiVar);
            i++;
            z = true;
        }
        for (Map.Entry entry : r7.entrySet()) {
            dii diiVar2 = (dii) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) r8.get(diiVar2);
            if (dgeVar.r.contains(diiVar2)) {
                dgiVar = new dgi(bitmapDrawable, rect2);
                dgiVar.h = 1.0f;
                dgiVar.i = 0.0f;
                dgiVar.e = dgeVar.R;
                dgiVar.d = dgeVar.S;
            } else {
                int i3 = dgeVar.x * size;
                dgi dgiVar2 = new dgi(bitmapDrawable, rect2);
                dgiVar2.g = i3;
                dgiVar2.e = dgeVar.P;
                dgiVar2.d = dgeVar.S;
                dgiVar2.m = new mqd(dgeVar, diiVar2);
                dgeVar.s.add(diiVar2);
                dgiVar = dgiVar2;
            }
            dgeVar.n.a.add(dgiVar);
        }
    }

    public mnx(mny mnyVar, FutureTask futureTask, RecyclerView recyclerView, int i) {
        this.$cid = i;
        this.a = futureTask;
        this.b = recyclerView;
        this.c = mnyVar;
    }
}
