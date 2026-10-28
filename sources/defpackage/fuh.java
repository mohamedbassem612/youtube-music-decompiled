package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.MovementMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fuh {
    static final Drawable a;
    protected static final ColorStateList b;
    protected static final ColorStateList c;
    static final CharSequence d;
    static final CharSequence e;
    protected static final Drawable f;
    protected static final Typeface g;
    protected static final MovementMethod h;
    public static final /* synthetic */ int i = 0;
    private static final Rect j;
    private static final InputFilter[] k;

    static {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        a = colorDrawable;
        b = ColorStateList.valueOf(-16777216);
        c = ColorStateList.valueOf(-3355444);
        d = "";
        e = "";
        f = colorDrawable;
        g = Typeface.DEFAULT;
        h = ArrowKeyMovementMethod.getInstance();
        j = new Rect();
        k = new InputFilter[0];
    }

    static Drawable a(fhd fhdVar, Drawable drawable) {
        if (drawable != a) {
            return drawable;
        }
        TypedArray typedArrayObtainStyledAttributes = fhdVar.a.obtainStyledAttributes(null, new int[]{R.attr.background}, R.attr.editTextStyle, 0);
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable2;
    }

    static void b(fhd fhdVar, EditText editText, CharSequence charSequence, Drawable drawable, ColorStateList colorStateList, ColorStateList colorStateList2, Integer num, int i2, Typeface typeface, int i3, int i4, boolean z, int i5, int i6, int i7, List list, boolean z2, TextUtils.TruncateAt truncateAt, int i8, MovementMethod movementMethod, CharSequence charSequence2, boolean z3, int i9) {
        int i10;
        if (i2 == -1) {
            editText.setTextSize(2, 14.0f);
        } else {
            editText.setTextSize(0, i2);
        }
        if (z2) {
            i10 = i5 | 131073;
            editText.setMinLines(1);
            editText.setMaxLines(i8);
        } else {
            i10 = i5 & (-131073);
            editText.setLines(1);
        }
        if (true != z) {
            i10 = 0;
        }
        if (i6 != 0) {
            editText.setRawInputType(i6);
        } else if (i10 != editText.getInputType()) {
            editText.setInputType(i10);
        }
        if (list != null) {
            editText.setFilters((InputFilter[]) list.toArray(new InputFilter[list.size()]));
        } else {
            editText.setFilters(k);
        }
        editText.setHint(charSequence);
        editText.setBackground(drawable);
        if (drawable == null || !drawable.getPadding(j)) {
            editText.setPadding(0, 0, 0, 0);
        }
        editText.setShadowLayer(0.0f, 0.0f, 0.0f, -7829368);
        editText.setTypeface(typeface, 0);
        editText.setGravity(i4);
        editText.setFocusable(z);
        editText.setFocusableInTouchMode(z);
        editText.setLongClickable(z);
        editText.setCursorVisible(z);
        editText.setTextColor(colorStateList);
        editText.setHintTextColor(colorStateList2);
        if (num != null) {
            editText.setHighlightColor(num.intValue());
        }
        editText.setMovementMethod(movementMethod);
        int imeOptions = editText.getImeOptions();
        editText.setImeOptions(i7);
        if (imeOptions != i7) {
            ((InputMethodManager) fhdVar.a.getSystemService("input_method")).restartInput(editText);
        }
        editText.setError(null, null);
        editText.setEllipsize(truncateAt);
        editText.setTextAlignment(i3);
        if (charSequence2 != null && !Objects.equals(editText.getText().toString(), charSequence2.toString())) {
            editText.setText(charSequence2);
            if (!z3) {
                editText.setSelection(editText.getText().toString().length());
            }
        }
        if (i9 != 0) {
            rpi.y(editText, i9);
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i9);
            int i11 = bac.a;
            editText.setBackgroundTintList(colorStateListValueOf);
        }
    }
}
