package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.mdx.manualpairing.TvCodeEditText;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xqh implements TextWatcher, View.OnKeyListener, View.OnTouchListener {
    private static final agkz a = agkz.n(new HashSet(Arrays.asList(7, 8, 9, 10, 11, 12, 13, 14, 15, 16)));
    private final xqi b;
    private final TvCodeEditText c;
    private final int d;
    private final int e;

    public xqh(xqi xqiVar, TvCodeEditText tvCodeEditText, int i, int i2) {
        this.b = xqiVar;
        this.c = tvCodeEditText;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        TvCodeEditText tvCodeEditText = this.c;
        Editable text = tvCodeEditText.getText();
        if (text == null) {
            return false;
        }
        String string = text.toString();
        int length = string.length();
        int length2 = string.replace(" ", "").length();
        if (i == 67) {
            if (keyEvent.getAction() == 0) {
                int i2 = this.d;
                if (length2 % i2 == 0 && length > i2 && length < this.e) {
                    int i3 = length - 2;
                    tvCodeEditText.setText(text.subSequence(0, i3));
                    tvCodeEditText.setSelection(i3);
                }
            }
            i = 67;
            return a.contains(Integer.valueOf(i)) ? false : false;
        }
        if (a.contains(Integer.valueOf(i)) || keyEvent.getAction() != 1 || length2 % this.d != 0 || length >= this.e) {
            return false;
        }
        String strConcat = String.valueOf(string).concat(" ");
        tvCodeEditText.setText(strConcat);
        tvCodeEditText.setSelection(strConcat.length());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, java.util.concurrent.Executor] */
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
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int length = charSequence.toString().replace(" ", "").length();
        int i4 = this.e;
        xqi xqiVar = this.b;
        if (length != i4) {
            cf cfVar = xqiVar.a;
            int i5 = tzk.i(cfVar, R.attr.ytCallToAction);
            xqiVar.g.j(i5);
            xqiVar.g.u(ColorStateList.valueOf(i5));
            xqiVar.g.n(null);
            if (Build.VERSION.SDK_INT >= 30) {
                xqiVar.h.setStateDescription(null);
            }
            if (xqiVar.o.P()) {
                xqiVar.d(true);
                xqiVar.k.setTag(R.id.device_id_from_button_tag, null);
                return;
            } else {
                xqiVar.j.getBackground().setColorFilter(tzk.i(cfVar, R.attr.ytIconDisabled), PorterDuff.Mode.MULTIPLY);
                xqiVar.j.setTextColor(tzk.i(cfVar, R.attr.ytTextDisabled));
                xqiVar.j.setEnabled(false);
                xqiVar.j.setTag(R.id.device_id_from_button_tag, null);
                return;
            }
        }
        String strReplace = String.valueOf(xqiVar.h.getText()).replace(" ", "");
        if (strReplace.length() == xqiVar.i) {
            TypedValue typedValue = new TypedValue();
            cf cfVar2 = xqiVar.a;
            cfVar2.getTheme().resolveAttribute(android.R.attr.progressBarStyleSmall, typedValue, false);
            TypedArray typedArrayObtainStyledAttributes = cfVar2.obtainStyledAttributes(typedValue.data, new int[]{android.R.attr.indeterminateDrawable});
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != 0) {
                ((Animatable) drawable).start();
                xqiVar.g.n(drawable);
                xqiVar.g.o(tzk.k(cfVar2, R.attr.ytCallToAction));
            }
            xwc xwcVar = new xwc(strReplace);
            sxs sxsVar = new sxs(cfVar2, new ivi(xqiVar, 2));
            yar yarVar = xqiVar.m;
            aesp aespVar = (aesp) yarVar.g.io();
            aajq aajqVar = new aajq(yarVar, sxsVar, 1);
            ListenableFuture listenableFutureA = ((xwm) aespVar.h).a();
            agek agekVarA = afwl.a(new tvm(aespVar, xwcVar, 14, null));
            ?? r12 = aespVar.a;
            taf.i(ahcs.e(listenableFutureA, agekVarA, r12), r12, new xwk(5), new rjy(aespVar, aajqVar, xwcVar, 12, (char[]) null), null);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.onTouchEvent(motionEvent);
        view.performClick();
        TvCodeEditText tvCodeEditText = this.c;
        tvCodeEditText.setSelection(tvCodeEditText.length());
        return true;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
