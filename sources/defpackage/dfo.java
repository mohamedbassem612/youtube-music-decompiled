package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRouter2;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dfo extends View {
    static final SparseArray a = new SparseArray(2);
    private static final int[] i = {R.attr.state_checked};
    private static final int[] j = {R.attr.state_checkable};
    public final dij b;
    public final dfm c;
    public did d;
    public dgg e;
    public boolean f;
    boolean g;
    dfn h;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private ColorStateList o;
    private int p;
    private int q;

    public dfo(Context context, AttributeSet attributeSet, int i2) {
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, ast.j(context));
        int iL = ast.l(contextThemeWrapper, com.google.android.apps.youtube.music.R.attr.mediaRouteTheme);
        super(iL != 0 ? new ContextThemeWrapper(contextThemeWrapper, iL) : contextThemeWrapper, attributeSet, i2);
        this.d = did.a;
        this.e = dgg.a;
        Context context2 = getContext();
        int[] iArr = dfl.a;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        bac.o(this, context2, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.k = ok.e().c(context2, typedArrayObtainStyledAttributes.getResourceId(3, 0));
            return;
        }
        this.b = dij.b(context2);
        this.c = new dfm(this);
        dij.c();
        dii diiVarF = dij.a().f();
        int i3 = !diiVarF.l() ? diiVarF.j : 0;
        this.n = i3;
        this.m = i3;
        this.o = typedArrayObtainStyledAttributes.getColorStateList(4);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.l = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i4 = this.l;
        if (i4 != 0 && (constantState = (Drawable.ConstantState) a.get(i4)) != null) {
            b(constantState.newDrawable());
        }
        if (this.k == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) a.get(resourceId);
                if (constantState2 != null) {
                    c(constantState2.newDrawable());
                } else {
                    dfn dfnVar = new dfn(this, resourceId, getContext());
                    this.h = dfnVar;
                    dfnVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                d();
            }
        }
        e();
        setClickable(true);
    }

    private final void d() {
        if (this.l > 0) {
            dfn dfnVar = this.h;
            if (dfnVar != null) {
                dfnVar.cancel(false);
            }
            dfn dfnVar2 = new dfn(this, this.l, getContext());
            this.h = dfnVar2;
            this.l = 0;
            dfnVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    private final void e() {
        int i2;
        int i3 = this.n;
        if (i3 != 1) {
            i2 = i3 != 2 ? com.google.android.apps.youtube.music.R.string.mr_cast_button_disconnected : com.google.android.apps.youtube.music.R.string.mr_cast_button_connected;
        } else {
            i2 = com.google.android.apps.youtube.music.R.string.mr_cast_button_connecting;
        }
        setContentDescription(getContext().getString(i2));
        setTooltipText(null);
    }

    private final boolean f() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        dd supportFragmentManager = activity instanceof cf ? ((cf) activity).getSupportFragmentManager() : null;
        if (supportFragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        if (dij.j().l()) {
            if (supportFragmentManager.g("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            dfv dfvVarA = this.e.a();
            did didVar = this.d;
            if (didVar == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            dfvVarA.i();
            if (!dfvVarA.l.equals(didVar)) {
                dfvVarA.l = didVar;
                Bundle arguments = dfvVarA.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putBundle("selector", didVar.b);
                dfvVarA.setArguments(arguments);
                Dialog dialog = dfvVarA.k;
                if (dialog != null) {
                    ((dfu) dialog).i(didVar);
                }
            }
            av avVar = new av(supportFragmentManager);
            avVar.g(0, dfvVarA, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
            avVar.a(true, true);
        } else {
            if (supportFragmentManager.g("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
                return false;
            }
            dgf dgfVarB = this.e.b();
            did didVar2 = this.d;
            if (didVar2 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            if (dgfVarB.l == null) {
                Bundle arguments2 = dgfVarB.getArguments();
                if (arguments2 != null) {
                    dgfVarB.l = did.a(arguments2.getBundle("selector"));
                }
                if (dgfVarB.l == null) {
                    dgfVarB.l = did.a;
                }
            }
            if (!dgfVarB.l.equals(didVar2)) {
                dgfVarB.l = didVar2;
                Bundle arguments3 = dgfVarB.getArguments();
                if (arguments3 == null) {
                    arguments3 = new Bundle();
                }
                arguments3.putBundle("selector", didVar2.b);
                dgfVarB.setArguments(arguments3);
            }
            av avVar2 = new av(supportFragmentManager);
            avVar2.g(0, dgfVarB, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
            avVar2.a(true, true);
        }
        return true;
    }

    public final void a() {
        dij.c();
        dii diiVarF = dij.a().f();
        int i2 = !diiVarF.l() ? diiVarF.j : 0;
        if (this.n != i2) {
            this.n = i2;
            e();
            refreshDrawableState();
        }
        if (i2 == 1) {
            d();
        }
    }

    public final void b(Drawable drawable) {
        this.l = 0;
        c(drawable);
    }

    final void c(Drawable drawable) {
        dfn dfnVar = this.h;
        if (dfnVar != null) {
            dfnVar.cancel(false);
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.k);
        }
        if (drawable != null) {
            if (this.o != null) {
                drawable = drawable.mutate();
                drawable.setTintList(this.o);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.k = drawable;
        refreshDrawableState();
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.k != null) {
            this.k.setState(getDrawableState());
            if (this.k.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.k.getCurrent();
                int i2 = this.n;
                if (i2 == 1 || this.m != i2) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i2 == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.m = this.n;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.f = true;
        if (!this.d.d()) {
            this.b.p(this.d, this.c, 0);
        }
        a();
    }

    @Override // android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        dij dijVar = this.b;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (dijVar != null && !this.g) {
            int i3 = this.n;
            if (i3 == 1) {
                mergeDrawableStates(iArrOnCreateDrawableState, j);
            } else if (i3 == 2) {
                mergeDrawableStates(iArrOnCreateDrawableState, i);
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f = false;
            if (!this.d.d()) {
                this.b.q(this.c);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.k != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.k.getIntrinsicWidth();
            int intrinsicHeight = this.k.getIntrinsicHeight();
            int i2 = paddingLeft + (((width - paddingLeft) - intrinsicWidth) / 2);
            int i3 = paddingTop + (((height - paddingTop) - intrinsicHeight) / 2);
            this.k.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.k.draw(canvas);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i4 = this.p;
        Drawable drawable = this.k;
        int iMax = Math.max(i4, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i5 = this.q;
        Drawable drawable2 = this.k;
        int iMax2 = Math.max(i5, drawable2 != null ? drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom() : 0);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, iMax);
        } else if (mode != 1073741824) {
            size = iMax;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, iMax2);
        } else if (mode2 != 1073741824) {
            size2 = iMax2;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:80:0x0149 A[DONT_INVERT] */
    @Override // android.view.View
    public boolean performClick() {
        boolean zK;
        boolean z;
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        d();
        if (this.f) {
            dim dimVarH = dij.h();
            if (dimVarH != null && dimVarH.d && dij.e()) {
                Context context = getContext();
                int i2 = Build.VERSION.SDK_INT;
                int i3 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    if (i3 >= 30) {
                        MediaRouter2 mediaRouter2 = MediaRouter2.getInstance(context);
                        if (Build.VERSION.SDK_INT >= 34) {
                            zK = mediaRouter2.showSystemOutputSwitcher();
                        } else {
                            zK = false;
                        }
                    } else {
                        zK = false;
                    }
                    if (!zK) {
                    }
                } else {
                    if (i3 >= 31) {
                        Intent intentPutExtra = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName());
                        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(intentPutExtra, 0).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ActivityInfo activityInfo = it.next().activityInfo;
                                if (activityInfo != null && activityInfo.applicationInfo != null && (activityInfo.applicationInfo.flags & 129) != 0) {
                                    context.sendBroadcast(intentPutExtra);
                                }
                            } else if (!vm.k(context)) {
                                zK = false;
                            }
                            zK = true;
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        zK = vm.k(context);
                    }
                    if (!zK) {
                    }
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    Intent intentPutExtra2 = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra("EXTRA_CONNECTION_ONLY", true).putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
                    AudioDeviceInfo[] devices = ((AudioManager) context.getSystemService(AudioManager.class)).getDevices(2);
                    int length = devices.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            z = false;
                            break;
                        }
                        int type = devices[i4].getType();
                        if (type == 3 || type == 4 || type == 5 || type == 6 || type == 8 || type == 11 || type == 30 || type == 22 || type == 23 || type == 26 || type == 27) {
                            z = true;
                            break;
                        }
                        i4++;
                    }
                    Intent intentPutExtra3 = intentPutExtra2.putExtra("EXTRA_CLOSE_ON_CONNECT", !z);
                    Iterator<ResolveInfo> it2 = context.getPackageManager().queryIntentActivities(intentPutExtra3, 0).iterator();
                    while (it2.hasNext()) {
                        ActivityInfo activityInfo2 = it2.next().activityInfo;
                        if (activityInfo2 != null && activityInfo2.applicationInfo != null) {
                            ApplicationInfo applicationInfo = activityInfo2.applicationInfo;
                            if ((applicationInfo.flags & 129) != 0) {
                                intentPutExtra3.setPackage(applicationInfo.packageName);
                                context.startActivity(intentPutExtra3);
                            }
                        }
                    }
                }
            }
            boolean zF = f();
            if (!zF) {
                if (!zPerformClick) {
                    return false;
                }
            }
        } else if (!zPerformClick) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setVisible(i2 == 0, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.k;
    }

    public dfo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.youtube.music.R.attr.mediaRouteButtonStyle);
    }

    public dfo(Context context) {
        this(context, null);
    }
}
