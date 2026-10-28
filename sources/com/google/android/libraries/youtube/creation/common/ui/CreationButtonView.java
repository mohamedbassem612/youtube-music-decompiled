package com.google.android.libraries.youtube.creation.common.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.MoreExecutors;
import defpackage.dl;
import defpackage.jip;
import defpackage.tzk;
import defpackage.uhx;
import defpackage.ujl;
import defpackage.xgj;
import defpackage.xgz;
import defpackage.xhb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class CreationButtonView extends FrameLayout {
    public TextView a;
    public ImageView b;
    public xgz c;
    public String d;
    int e;
    public final ujl f;
    private final Context g;
    private ImageView h;
    private boolean i;
    private int j;
    private int k;
    private boolean l;

    public CreationButtonView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet);
        this.g = context;
        this.e = i;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, uhx.a, 0, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(2, this.e);
        this.e = i3;
        if (i3 != 1) {
            i2 = i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? R.layout.reel_editor_tool_button : R.layout.shorts_camera_tool_corner_button : R.layout.shorts_camera_tool_bottom_button : R.layout.shorts_camera_tool_transparent_button : R.layout.shorts_camera_tool_button;
        } else {
            this.i = true;
            i2 = R.layout.shorts_camera_toolbar_button;
        }
        LayoutInflater.from(context).inflate(i2, this);
        this.a = (TextView) findViewById(R.id.editor_tool_button_label);
        this.b = (ImageView) findViewById(R.id.editor_tool_button_icon);
        this.h = this.e == 1 ? (ImageView) findViewById(R.id.new_feature_indicator) : null;
        f();
        if (attributeSet != null) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, -1);
            if (resourceId != -1) {
                this.b.setImageDrawable(dl.d(context, resourceId));
                f();
            }
            if (typedArrayObtainStyledAttributes.hasValue(5)) {
                this.b.setImageTintList(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(5, -1)));
            }
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(3, -1);
            if (resourceId2 != -1) {
                this.b.setBackground(dl.d(context, resourceId2));
                f();
            }
            String string = typedArrayObtainStyledAttributes.getString(1);
            TextView textView = this.a;
            if (string != null) {
                textView.setText(string);
            } else {
                textView.setVisibility(8);
            }
            setContentDescription(typedArrayObtainStyledAttributes.getString(0));
            int integer = typedArrayObtainStyledAttributes.getInteger(7, 0);
            if (integer != 0) {
                this.c = new xgj(xhb.b(integer));
            }
            this.d = typedArrayObtainStyledAttributes.getString(6);
            if (this.e == 1) {
                this.a.setVisibility(8);
            }
        }
        this.f = new ujl(MoreExecutors.directExecutor());
        setOnClickListener(null);
    }

    private final void f() {
        if (this.l) {
            return;
        }
        this.j = this.b.getLayoutParams().width;
        this.k = this.b.getLayoutParams().height;
    }

    public final void a(int i) {
        b(dl.d(this.g, i));
    }

    public final void b(Drawable drawable) {
        this.b.setImageDrawable(drawable);
        f();
    }

    public final void c(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(true != z ? 8 : 0);
        }
    }

    public final void d(boolean z) {
        super.setEnabled(z);
        this.a.setEnabled(z);
        Context context = getContext();
        ImageView imageView = this.b;
        if (imageView == null || context == null) {
            return;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(z ? tzk.n(context, R.attr.ytStaticWhite).orElse(context.getResources().getColor(R.color.yt_white1)) : tzk.n(context, R.attr.ytOverlayButtonPrimary).orElse(context.getResources().getColor(R.color.yt_white1_opacity30)), PorterDuff.Mode.SRC_IN));
    }

    public final void e(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
            drawable.setTint(-1);
            drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
        }
        this.b.setImageDrawable(drawable);
        if (drawable != null) {
            this.b.setImageTintList(ColorStateList.valueOf(-1));
        }
        f();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view.equals(this)) {
            this.f.a(this);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        d(z);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new jip(this, onClickListener, 15, (char[]) null));
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        int i;
        int i2;
        int i3;
        super.setPressed(z);
        this.l = z;
        int i4 = this.j;
        int i5 = this.k;
        int i6 = 0;
        if (this.i && z) {
            int iMax = Math.max(9, (int) (((double) Math.max(i4, i5)) * 0.06d));
            int i7 = this.k;
            i5 = i7 - iMax;
            int i8 = this.j;
            int i9 = i8 - iMax;
            i = iMax / 2;
            i2 = (i8 - i9) - i;
            i3 = (i7 - i5) - i;
            i4 = i9;
            i6 = i;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.setMargins(i6, i, i2, i3);
        layoutParams.height = i5;
        layoutParams.width = i4;
        this.b.setLayoutParams(layoutParams);
        this.b.requestLayout();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        this.f.b(this, i != visibility);
    }

    public CreationButtonView(Context context, int i) {
        this(context, null, i);
    }

    public CreationButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CreationButtonView(Context context) {
        this(context, (AttributeSet) null);
    }
}
