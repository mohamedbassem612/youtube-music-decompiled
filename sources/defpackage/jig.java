package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jig implements View.OnClickListener {
    public final ObjectAnimator a;
    public final TextView b;
    public final int c;
    public boolean d = false;
    public int e;
    private final int f;

    public jig(TextView textView, int i, int i2) {
        this.b = textView;
        this.c = i;
        this.f = i2;
        this.e = textView.getLineCount();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(textView, "maxLines", i, a());
        this.a = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(250L);
        objectAnimatorOfInt.addListener(new vgm(this, 1));
        textView.addOnLayoutChangeListener(new jfx(this, 2));
        d();
    }

    public final int a() {
        int i = this.e;
        int i2 = this.c;
        int i3 = this.f;
        return i > i2 ? Math.min(i, i3) : i3;
    }

    public final void b() {
        if (!e() || this.d) {
            return;
        }
        this.d = true;
        this.a.start();
    }

    public final void c() {
        this.d = false;
        this.b.setMaxLines(this.c);
    }

    public final void d() {
        int i = this.d ? this.f : this.c;
        TextView textView = this.b;
        if (textView.getMaxLines() != i) {
            textView.setMaxLines(i);
        }
    }

    public final boolean e() {
        TextView textView = this.b;
        int lineCount = textView.getLineCount();
        int i = this.c;
        int iMin = Math.min(lineCount, i) - 1;
        if (textView.getVisibility() == 0) {
            return textView.getLineCount() > i || !(textView.getLayout() == null || textView.getLayout().getEllipsisCount(iMin) == 0);
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.d = !this.d;
        if (!e()) {
            d();
            return;
        }
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator.isRunning() || !this.d) {
            objectAnimator.reverse();
        } else {
            objectAnimator.start();
        }
    }
}
