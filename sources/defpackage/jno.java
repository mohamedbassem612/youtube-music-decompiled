package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jno {
    public abgg a;
    public View.OnClickListener b;
    public final tss c;
    private int d;
    private final vxz e;

    public jno(Context context, vxz vxzVar, tss tssVar) {
        context.getClass();
        vxzVar.getClass();
        this.e = vxzVar;
        this.c = tssVar;
        this.d = 2;
        d();
    }

    private final void d() {
        int i;
        int i2 = this.d;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            i = R.attr.ytStaticBrandRed;
        } else {
            if (i3 != 1) {
                throw new awmj();
            }
            i = R.attr.ytTextSecondary;
        }
        TextView textView = (TextView) this.c.a;
        int i4 = tzk.i(textView.getContext(), i);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        compoundDrawables.getClass();
        for (Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(i4, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void a() {
        TextView textView = (TextView) this.c.a;
        textView.setOnClickListener(this.b);
        textView.setClickable(this.b != null);
    }

    public final void b(long j, long j2) {
        if (c()) {
            int i = true != aaja.f(j, j2) ? 2 : 1;
            if (this.d != i) {
                this.d = i;
                d();
            }
        }
    }

    public final boolean c() {
        abgg abggVar = this.a;
        if (abggVar == null) {
            return false;
        }
        if (abgg.d(abggVar)) {
            return true;
        }
        if (abgg.b(abggVar)) {
            return this.e.l(76, 45734213L, false);
        }
        return false;
    }
}
