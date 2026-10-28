package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.google.android.apps.youtube.music.ui.components.mealbar.MusicMealbar$MealbarLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iye implements Handler.Callback {
    private final /* synthetic */ int $cid;

    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        bdr bdrVar;
        int i = this.$cid;
        if (i == 0) {
            Interpolator interpolator = iyk.a;
            int i2 = message.what;
            if (i2 == 0) {
                iyk iykVar = (iyk) message.obj;
                MusicMealbar$MealbarLayout musicMealbar$MealbarLayout = iykVar.d;
                if (musicMealbar$MealbarLayout.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = musicMealbar$MealbarLayout.getLayoutParams();
                    if (layoutParams instanceof asv) {
                        iyj iyjVar = new iyj(iykVar);
                        iyjVar.w();
                        iyjVar.v();
                        iyjVar.x();
                        iyjVar.g = new iyg(iykVar);
                        ((asv) layoutParams).b(iyjVar);
                    }
                    iykVar.c.addView(musicMealbar$MealbarLayout);
                }
                int i3 = bac.a;
                if (musicMealbar$MealbarLayout.isLaidOut()) {
                    iykVar.b();
                } else {
                    musicMealbar$MealbarLayout.g = new qcb(iykVar, null);
                }
            } else if (i2 == 1) {
                iyk iykVar2 = (iyk) message.obj;
                MusicMealbar$MealbarLayout musicMealbar$MealbarLayout2 = iykVar2.d;
                if (musicMealbar$MealbarLayout2.getVisibility() == 0) {
                    ViewGroup.LayoutParams layoutParams2 = musicMealbar$MealbarLayout2.getLayoutParams();
                    if (layoutParams2 instanceof asv) {
                        ast astVar = ((asv) layoutParams2).a;
                        if ((astVar instanceof SwipeDismissBehavior) && (bdrVar = ((SwipeDismissBehavior) astVar).f) != null && bdrVar.a != 0) {
                            iykVar2.e();
                        }
                    }
                    ci ciVarX = bac.x(musicMealbar$MealbarLayout2);
                    ciVarX.w(musicMealbar$MealbarLayout2.getHeight());
                    ciVarX.s(iyk.a);
                    ciVarX.r(250L);
                    ciVarX.t(new iyi(iykVar2));
                    ciVarX.p();
                } else {
                    iykVar2.e();
                }
            } else {
                if (i2 != 2) {
                    return false;
                }
                ixt ixtVar = ((iyk) message.obj).e;
                if (ixtVar != null) {
                    ixtVar.f();
                }
            }
        } else if (i != 1) {
            if (message.what != 0) {
                return false;
            }
            jit jitVarA = jit.a();
            rik rikVar = (rik) message.obj;
            synchronized (jitVarA.a) {
                if (jitVarA.b == rikVar || jitVarA.c == rikVar) {
                    jit.d(rikVar);
                }
            }
        } else {
            if (message.what != 1) {
                return false;
            }
            fel felVar = (fel) message.obj;
            felVar.a.j(felVar);
        }
        return true;
    }
}
