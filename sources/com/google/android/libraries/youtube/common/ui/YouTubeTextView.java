package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.ackd;
import defpackage.acke;
import defpackage.ackm;
import defpackage.agrf;
import defpackage.ttv;
import defpackage.tuz;
import defpackage.tva;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class YouTubeTextView extends TextView {
    public boolean c;
    public boolean d;
    public int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private int l;
    private boolean m;
    private int n;
    public static final agrf b = agrf.h("com/google/android/libraries/youtube/common/ui/YouTubeTextView");
    private static final ThreadLocal a = new tuz();

    public YouTubeTextView(Context context) {
        super(context);
        this.g = false;
        this.h = true;
        this.d = false;
        this.i = false;
        this.k = false;
        this.m = false;
        b(context, null, 0, 0);
    }

    private final void a(TypedArray typedArray) {
        ackm ackmVarD;
        if (isInEditMode()) {
            return;
        }
        int indexCount = typedArray.getIndexCount();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArray.getIndex(i6);
            int[] iArr = ttv.a;
            if (index == 5) {
                this.f = typedArray.getBoolean(5, false);
            } else if (index == 1) {
                i5 = typedArray.getInt(1, i5);
            } else if (index == 6) {
                i2 = typedArray.getInt(6, i2);
            } else if (index == 13) {
                i3 = typedArray.getInt(13, i3);
            } else if (index == 12) {
                i4 = typedArray.getInt(12, i4);
            } else if (index == 4) {
                this.e = typedArray.getColor(4, 0);
                this.d = true;
            } else if (index == 8) {
                this.j = typedArray.getColor(8, 0);
                this.i = true;
            } else if (index == 10) {
                this.l = typedArray.getColor(10, 0);
                this.k = true;
            } else if (index == 11) {
                this.n = typedArray.getDimensionPixelSize(11, 0);
                this.m = true;
            } else if (index == 7) {
                this.h = typedArray.getBoolean(7, true);
            }
        }
        Context context = getContext();
        if (i2 == -1) {
            ackmVarD = null;
            if (i3 != -1) {
                ackm[] ackmVarArrValues = ackm.values();
                int length = ackmVarArrValues.length;
                while (i < length) {
                    ackm ackmVar = ackmVarArrValues[i];
                    if (i3 != -1 && ackmVar.u == i3) {
                        ackmVarD = ackmVar;
                        break;
                    }
                    i++;
                }
            } else if (i4 != -1) {
                ackm[] ackmVarArrValues2 = ackm.values();
                int length2 = ackmVarArrValues2.length;
                while (i < length2) {
                    ackm ackmVar2 = ackmVarArrValues2[i];
                    if (i4 != -1 && ackmVar2.v == i4) {
                        ackmVarD = ackmVar2;
                        break;
                    }
                    i++;
                }
            }
        } else {
            ackmVarD = ackm.d(i2);
        }
        if (ackmVarD != null) {
            setTypeface(ackmVarD.c(context, i5), i5);
        }
    }

    private final void b(Context context, AttributeSet attributeSet, int i, int i2) {
        if (isInEditMode()) {
            return;
        }
        Resources.Theme theme = context.getTheme();
        int[] iArr = ttv.h;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, i, i2);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, iArr);
            a(typedArrayObtainStyledAttributes3);
            typedArrayObtainStyledAttributes3.recycle();
        }
        a(typedArrayObtainStyledAttributes2);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(9, 0);
        if (resourceId2 != 0) {
            TypedValue typedValue = (TypedValue) a.get();
            if (theme.resolveAttribute(R.attr.ytTypographyTokensEnabled, typedValue, true) && typedValue.data != 0) {
                super.setTextAppearance(context, resourceId2);
            }
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    private final void f() {
        if (this.f) {
            CharSequence text = getText();
            if (!(text instanceof Spanned) || ((ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class)).length <= 0) {
                c();
            } else {
                d();
            }
        }
    }

    public final void c() {
        this.g = false;
        setMovementMethod(getDefaultMovementMethod());
    }

    public final void d() {
        this.g = true;
        boolean zIsLongClickable = isLongClickable();
        setMovementMethod(tva.a());
        setLongClickable(zIsLongClickable);
    }

    public final void e(boolean z) {
        this.f = z;
        if (z) {
            f();
        } else {
            c();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.g) {
            return super.onTouchEvent(motionEvent);
        }
        this.c = false;
        super.onTouchEvent(motionEvent);
        return this.c;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (this.h) {
            super.scrollTo(i, i2);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence instanceof Spanned) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.strike_through_line_width);
            Spanned spanned = (Spanned) charSequence;
            for (ackd ackdVar : (ackd[]) spanned.getSpans(0, charSequence.length(), ackd.class)) {
                if (this.i) {
                    ackdVar.a.setColor(this.j);
                    ackdVar.b = true;
                }
                ackdVar.a.setStrokeWidth(dimensionPixelSize);
            }
            int dimensionPixelSize2 = this.m ? this.n : getContext().getResources().getDimensionPixelSize(R.dimen.underline_line_width);
            for (acke ackeVar : (acke[]) spanned.getSpans(0, charSequence.length(), acke.class)) {
                if (this.k) {
                    ackeVar.a.setColor(this.l);
                    ackeVar.b = true;
                }
                ackeVar.a.setStrokeWidth(dimensionPixelSize2);
            }
        }
        super.setText(charSequence, bufferType);
        f();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        ackm ackmVarD = ackm.d(-1);
        if (ackmVarD != null) {
            setTypeface(ackmVarD.c(getContext(), 0), 0);
        } else {
            setTypeface(null);
        }
        this.e = 0;
        this.j = 0;
        this.l = 0;
        this.n = 0;
        this.d = false;
        this.i = false;
        this.k = false;
        this.m = false;
        super.setTextAppearance(context, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(i, ttv.h);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public YouTubeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = false;
        this.h = true;
        this.d = false;
        this.i = false;
        this.k = false;
        this.m = false;
        b(context, attributeSet, 0, 0);
    }

    public YouTubeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = false;
        this.h = true;
        this.d = false;
        this.i = false;
        this.k = false;
        this.m = false;
        b(context, attributeSet, i, 0);
    }

    public YouTubeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.g = false;
        this.h = true;
        this.d = false;
        this.i = false;
        this.k = false;
        this.m = false;
        b(context, attributeSet, i, i2);
    }
}
