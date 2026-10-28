package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mrs implements View.OnLayoutChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ CharSequence b;
    final /* synthetic */ CharSequence c;
    final /* synthetic */ mry d;

    public mrs(mry mryVar, int i, CharSequence charSequence, CharSequence charSequence2) {
        this.a = i;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = mryVar;
    }

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
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        mry mryVar = this.d;
        Layout layout = mryVar.getLayout();
        if (layout != null) {
            int i9 = this.a;
            CharSequence charSequence = this.b;
            CharSequence charSequence2 = this.c;
            SpannableString spannableString = null;
            if (i9 > 0 && layout.getLineCount() > i9 && charSequence2.length() > 0 && charSequence.length() > 0) {
                SpannableString spannableString2 = new SpannableString(charSequence2);
                if (spannableString2.length() > 0) {
                    spannableString2.setSpan(new fur(), 0, spannableString2.length(), 18);
                }
                int i10 = i9 - 1;
                int lineEnd = layout.getLineEnd(i10);
                if (lineEnd < charSequence.length()) {
                    CharSequence charSequenceSubSequence = charSequence.subSequence(0, lineEnd);
                    Layout layoutA = mryVar.a(TextUtils.concat(charSequenceSubSequence, spannableString2));
                    while (layoutA.getLineCount() > i9 && charSequenceSubSequence.length() > 0) {
                        charSequenceSubSequence = charSequenceSubSequence.subSequence(0, charSequenceSubSequence.length() - 1);
                        layoutA = mryVar.a(TextUtils.concat(charSequenceSubSequence, spannableString2));
                    }
                    int lineStart = layoutA.getLineStart(Math.min(layoutA.getLineCount(), i10));
                    while (charSequenceSubSequence.length() > 0 && Character.isWhitespace(charSequenceSubSequence.charAt(charSequenceSubSequence.length() - 1)) && charSequenceSubSequence.length() - 1 > lineStart) {
                        charSequenceSubSequence = charSequenceSubSequence.subSequence(0, charSequenceSubSequence.length() - 1);
                    }
                    SpannableString spannableString3 = new SpannableString(TextUtils.concat(charSequenceSubSequence, spannableString2));
                    msf.b(spannableString3, spannableString2, ClickableSpan.class);
                    msf.b(spannableString3, spannableString2, ForegroundColorSpan.class);
                    msf.b(spannableString3, spannableString2, UnderlineSpan.class);
                    spannableString = spannableString3;
                }
            }
            if (spannableString != null) {
                mryVar.setText(spannableString);
                charSequence = spannableString;
            }
            mryVar.f = new heg();
            mryVar.f.v(layout, charSequence);
        }
    }
}
