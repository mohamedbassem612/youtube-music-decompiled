package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vmi extends YouTubeAppCompatTextView {
    public vmo a;
    public boolean b;
    public float c;
    public float d;
    public boolean e;
    public int f;

    public vmi(Context context) {
        super(context);
        this.b = false;
        this.e = false;
        this.a = vmo.a("");
    }

    public final void a(Bitmap bitmap) {
        int i;
        if (!this.e || (i = this.f) <= 0 || this.d <= i) {
            setSingleLine(true);
            setMaxLines(1);
            setGravity(0);
            SpannableString spannableString = new SpannableString(this.a.a);
            spannableString.setSpan(new ImageSpan(getContext(), bitmap, 0), 0, spannableString.length(), 33);
            b(bitmap.getWidth());
            setText(spannableString);
            return;
        }
        if (getMaxLines() == 2 && this.a.a.contentEquals(getText())) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        setPadding(0, 0, 0, 0);
        setGravity(17);
        setText(this.a.a);
    }

    protected final void b(float f) {
        setPadding((int) Math.max((this.c - f) / 2.0f, 0.0f), 0, 0, 0);
    }

    public final void c(vmo vmoVar, float f, float f2) {
        this.d = f2;
        this.c = f;
        b(f2);
        this.a = vmoVar;
        setText(vmoVar.a);
    }
}
