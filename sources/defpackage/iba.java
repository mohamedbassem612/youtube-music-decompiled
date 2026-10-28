package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iba {
    public boolean a;
    public boolean c;
    public boolean d;
    public final tss e;
    protected final tss f;
    protected final tss g;
    private final Context h;
    private CharSequence j;
    private boolean k;
    private StringBuilder l;
    private boolean i = true;
    public boolean b = true;
    private int m = 1;

    public iba(Context context, tss tssVar, tss tssVar2, tss tssVar3) {
        this.h = context;
        this.e = tssVar3;
        this.f = tssVar;
        this.g = tssVar2;
        c(null, null);
    }

    private final String g(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return nsj.b(this.h.getResources(), charSequence.toString().trim()).toString();
    }

    private final void h(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (TextUtils.equals(charSequence, text)) {
            return;
        }
        if (TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) {
            return;
        }
        String strG = g(charSequence);
        int i = bac.a;
        textView.setImportantForAccessibility(2);
        textView.setText(charSequence);
        textView.setContentDescription(strG);
        textView.setImportantForAccessibility(1);
    }

    private final boolean i() {
        return this.c && this.m != 3;
    }

    private static final void j(TextView textView, int i) {
        for (Drawable drawable : textView.getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(tzk.i(textView.getContext(), i), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void a() {
        if (this.c) {
            ((TextView) this.f.a).setText((CharSequence) null);
        }
    }

    public final void b() {
        if (i()) {
            ((TextView) this.g.a).setText((CharSequence) null);
        }
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.equals(this.j, charSequence2) || this.k != this.c) {
            this.j = charSequence2;
            this.k = this.c;
            StringBuilder sb = this.l;
            if (sb == null) {
                sb = new StringBuilder();
                this.l = sb;
            }
            sb.delete(0, sb.length());
            if (this.k) {
                this.l.append('-');
            }
            this.l.append(charSequence2);
            TextView textView = (TextView) this.g.a;
            textView.setText(this.l);
            textView.setContentDescription(g(charSequence2));
            textView.setMinimumWidth(0);
            textView.measure(0, 0);
            int measuredWidth = textView.getMeasuredWidth();
            ((TextView) this.f.a).setMinimumWidth(measuredWidth);
            textView.setMinimumWidth(measuredWidth);
        }
        if (i()) {
            ((TextView) this.f.a).setText((CharSequence) null);
            ((TextView) this.g.a).setText((CharSequence) null);
        } else if (this.c && this.m == 3) {
            ((TextView) this.f.a).setText((CharSequence) null);
            h((TextView) this.g.a, charSequence);
        } else {
            h((TextView) this.f.a, charSequence);
            h((TextView) this.g.a, charSequence2);
        }
    }

    public final void d(boolean z, boolean z2) {
        if (this.i != z) {
            this.i = z;
            f(z2);
        }
    }

    public final void e(boolean z) {
        int i = true != z ? 3 : 2;
        if (this.m != i) {
            this.m = i;
            tss tssVar = this.e;
            if (i == 2) {
                j((TextView) tssVar.a, R.attr.ytStaticBrandRed);
            } else {
                j((TextView) tssVar.a, R.attr.ytTextSecondary);
            }
            a();
            b();
        }
    }

    public final void f(boolean z) {
        boolean z2 = this.a;
        this.f.h(this.i && (z2 && this.b), z);
        this.g.h(this.i && z2, z);
    }
}
