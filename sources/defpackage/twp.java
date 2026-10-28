package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class twp {
    public final int a;
    public final Object b;
    public final Object c;

    public twp(final int i, final int i2, final View view, aeav aeavVar, int i3) {
        view.getClass();
        this.a = i;
        if (view.getLayoutParams() == null) {
            zvp.a(zvn.b, zvm.z, "FeedFilterBar HeightAnimator instantiated with null target view.");
            throw new IllegalArgumentException("Target view layout params are null.");
        }
        if (view.getVisibility() != 0) {
            zvp.a(zvn.b, zvm.z, "FeedFilterBar HeightAnimator instantiated with non-visible target view.");
            throw new IllegalArgumentException("Target view not visible.");
        }
        this.c = view;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setStartDelay(i3);
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.5f, 0.0f, 0.0f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: aeat
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2.getLayoutParams() != null) {
                    int i4 = i2;
                    int i5 = i;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    tym.h(view2, new tyl(i4 >= i5 ? i5 + ((int) ((i4 - i5) * animatedFraction)) : i5 - ((int) ((i5 - i4) * animatedFraction)), 1), ViewGroup.LayoutParams.class);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new aeau(aeavVar));
    }

    public static twp a(Context context, int i, int i2, Object... objArr) {
        return new twp(context.getString(i2, objArr), b(context, i2, objArr), i);
    }

    public static String b(Context context, int i, Object... objArr) {
        return String.valueOf(context.getResources().getResourceEntryName(i)).concat(objArr.length > 0 ? "_".concat(String.valueOf(TextUtils.join("_", objArr))) : "");
    }

    public final String c() {
        Object obj = this.c;
        String strA = ((atzc) obj).a("X-GUploader-UploadID");
        String strValueOf = String.valueOf(obj);
        String strConcat = strA == null ? "\n No upload id." : "\n Upload id: ".concat(strA);
        return "HttpResponse:\n   " + this.a + "  " + strValueOf + strConcat;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    public final Object d(aigj aigjVar) throws GeneralSecurityException {
        ahfv ahfvVarA = ahhj.a.a(ahgb.a((String) this.c, aigjVar, agvp.r(this.a), agvp.s(5), null), ahgj.a);
        ahtv ahtvVar = (ahtv) ahhi.a.b.get();
        ahhn ahhnVar = new ahhn(ahfvVarA.getClass(), (Class) this.b);
        ?? r4 = ahtvVar.a;
        if (r4.containsKey(ahhnVar)) {
            return ((awgg) r4.get(ahhnVar)).b(ahfvVarA);
        }
        throw new GeneralSecurityException(a.cs(ahhnVar, "No PrimitiveConstructor for ", " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final void e() {
        ((ValueAnimator) this.b).start();
    }

    public twp(int i, xwc xwcVar, yaa yaaVar) {
        this.a = i;
        this.b = xwcVar;
        this.c = yaaVar;
    }

    public twp(ControllerServiceBridge.Callbacks callbacks, aukq aukqVar, int i) {
        this.b = callbacks;
        this.c = aukqVar;
        this.a = i;
    }

    public twp(Object obj, Object obj2, int i) {
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }

    public twp(String str, String str2, int i) {
        this.b = str;
        this.c = str2;
        this.a = i;
    }

    public twp(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
