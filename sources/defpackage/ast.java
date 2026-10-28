package defpackage;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.mediarouter.app.MediaRouteVolumeSlider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ast {
    public static AudioManager a;

    public ast() {
    }

    public static int a(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }

    public static float b(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static int c(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static long d(long j, long j2) {
        if (j < 0) {
            return 0L;
        }
        return j > j2 ? j2 : j;
    }

    public static int e(int i) {
        if (i <= 4) {
            return 8;
        }
        return i << 1;
    }

    public static float g(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Object getTag(View view) {
        return ((asv) view.getLayoutParams()).q;
    }

    public static int h(Context context) {
        int iL = l(context, com.google.android.apps.youtube.music.R.attr.mediaRouteTheme);
        return iL == 0 ? j(context) : iL;
    }

    public static int i(Context context, int i) {
        return avv.a(-1, k(context, i, com.google.android.apps.youtube.music.R.attr.colorPrimary)) < 3.0d ? -570425344 : -1;
    }

    public static int j(Context context) {
        if (yno.C(context)) {
            return i(context, 0) == -570425344 ? com.google.android.apps.youtube.music.R.style.Theme_MediaRouter_Light : com.google.android.apps.youtube.music.R.style.Theme_MediaRouter_Light_DarkControlPanel;
        }
        return i(context, 0) == -570425344 ? com.google.android.apps.youtube.music.R.style.Theme_MediaRouter_LightControlPanel : com.google.android.apps.youtube.music.R.style.Theme_MediaRouter;
    }

    public static int k(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int l(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static Context m(Context context, int i, boolean z) {
        if (i == 0) {
            i = l(context, true != z ? com.google.android.apps.youtube.music.R.attr.dialogTheme : com.google.android.apps.youtube.music.R.attr.alertDialogTheme);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return l(contextThemeWrapper, com.google.android.apps.youtube.music.R.attr.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, j(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static void n(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int i = i(context, 0);
        if (Color.alpha(i) != 255) {
            i = avv.e(i, ((Integer) view.getTag()).intValue());
        }
        if (mediaRouteVolumeSlider.a != i) {
            if (Color.alpha(i) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #".concat(String.valueOf(Integer.toHexString(i))));
            }
            mediaRouteVolumeSlider.a = i;
        }
        if (mediaRouteVolumeSlider.b != i) {
            if (Color.alpha(i) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #".concat(String.valueOf(Integer.toHexString(i))));
            }
            mediaRouteVolumeSlider.b = i;
        }
    }

    public static synchronized AudioManager o(Context context) {
        AudioManager audioManager;
        Context applicationContext = context.getApplicationContext();
        byte[] bArr = null;
        if (applicationContext != null) {
            a = null;
        }
        audioManager = a;
        if (audioManager == null) {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null || looperMyLooper == Looper.getMainLooper()) {
                audioManager = (AudioManager) applicationContext.getSystemService("audio");
                a = audioManager;
                audioManager.getClass();
            } else {
                zhk zhkVar = new zhk(null, null);
                azs.F().execute(new br(applicationContext, zhkVar, 6, bArr));
                zhkVar.c();
                audioManager = a;
                audioManager.getClass();
            }
        }
        return audioManager;
    }

    public static bpi p(bpl bplVar, awsd awsdVar, bpt bptVar) {
        try {
            try {
                return bplVar.c(awsdVar, bptVar);
            } catch (AbstractMethodError unused) {
                return bplVar.a(((awqv) awsdVar).b);
            }
        } catch (AbstractMethodError unused2) {
            return bplVar.b(((awqv) awsdVar).b, bptVar);
        }
    }

    public static void setTag(View view, Object obj) {
        ((asv) view.getLayoutParams()).q = obj;
    }

    public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
        return getScrimOpacity(coordinatorLayout, view) > 0.0f;
    }

    public void f(dhp dhpVar, dhq dhqVar) {
        throw null;
    }

    public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return false;
    }

    public int getScrimColor(CoordinatorLayout coordinatorLayout, View view) {
        return -16777216;
    }

    public float getScrimOpacity(CoordinatorLayout coordinatorLayout, View view) {
        return 0.0f;
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(coordinatorLayout, view, view2, i, i2, iArr);
        }
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        onNestedScroll(coordinatorLayout, view, view2, i, i2, i3, i4, i5);
    }

    public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(coordinatorLayout, view, view2, view3, i);
        }
    }

    public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(coordinatorLayout, view, view2, view3, i);
        }
        return false;
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (i == 0) {
            onStopNestedScroll(coordinatorLayout, view, view2);
        }
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public ast(Context context, AttributeSet attributeSet) {
    }

    public ast(byte[] bArr) {
    }

    @Deprecated
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
    }

    @Deprecated
    public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
    }

    @Deprecated
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    @Deprecated
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        return false;
    }

    @Deprecated
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(coordinatorLayout, view, view2, i, i2, i3, i4);
        }
    }

    @Deprecated
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
    }

    public void onDetachedFromLayoutParams() {
    }

    public void onAttachedToLayoutParams(asv asvVar) {
    }

    public bbn onApplyWindowInsets(CoordinatorLayout coordinatorLayout, View view, bbn bbnVar) {
        return bbnVar;
    }

    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
    }
}
