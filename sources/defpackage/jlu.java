package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.widget.EditText;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jlu implements jls {
    private ImageView a;
    private LottieAnimationView b;
    private ImageView c;
    private EditText d;
    private final int e;
    private final int f;
    private final boolean g;
    private CharSequence h;
    private final ColorStateList i;
    private final ColorStateList j;
    private final ColorStateList k;
    private int l = 1;

    public jlu(Context context, ImageView imageView, LottieAnimationView lottieAnimationView, ImageView imageView2, EditText editText, int i, int i2, boolean z) {
        this.a = imageView;
        this.b = lottieAnimationView;
        this.c = imageView2;
        this.d = editText;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.i = ColorStateList.valueOf(tzk.i(context, R.attr.ytTextPrimaryInverse));
        this.j = ColorStateList.valueOf(tzk.i(context, R.attr.ytInvertedBackground));
        this.k = ColorStateList.valueOf(tzk.i(context, R.attr.ytOverlayTextPrimary));
    }

    private final void b() {
        int i;
        CharSequence hint;
        if (this.g) {
            EditText editText = this.d;
            if (editText != null) {
                if (this.h == null && (hint = editText.getHint()) != null && hint.length() > 0) {
                    this.h = hint;
                }
                this.d.setHint("");
            }
            ImageView imageView = this.a;
            if (imageView != null && (i = this.e) != 0) {
                imageView.setImageResource(i);
                this.a.setImageTintList(this.i);
            }
            ImageView imageView2 = this.c;
            if (imageView2 != null) {
                imageView2.setImageTintList(this.j);
            }
        }
    }

    private final void m() {
        int i;
        CharSequence charSequence;
        if (this.g) {
            EditText editText = this.d;
            if (editText != null && (charSequence = this.h) != null) {
                editText.setHint(charSequence);
            }
            ImageView imageView = this.a;
            if (imageView != null && (i = this.f) != 0) {
                imageView.setImageResource(i);
                this.a.setImageTintList(this.k);
            }
            ImageView imageView2 = this.c;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                this.c.setImageTintList(null);
            }
        }
    }

    @Override // defpackage.jls
    public final void a() {
        LottieAnimationView lottieAnimationView = this.b;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        }
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.h = null;
    }

    @Override // defpackage.jls
    public final void c(int i) {
        EditText editText = this.d;
        if (editText != null) {
            d(editText.getContext().getString(i));
        }
    }

    @Override // defpackage.jls
    public final void d(CharSequence charSequence) {
        EditText editText;
        this.h = charSequence;
        int i = this.l;
        if ((i == 1 || (this.g && i == 4)) && (editText = this.d) != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            editText.setHint(charSequence);
        }
    }

    @Override // defpackage.jls
    public final void g() {
        this.l = 2;
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setEnabled(true);
        }
        ImageView imageView2 = this.c;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView = this.b;
        if (lottieAnimationView != null) {
            lottieAnimationView.s(1.0f);
            this.b.setVisibility(0);
            this.b.f();
        }
        b();
    }

    @Override // defpackage.jls
    public final void h() {
        this.l = 1;
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setEnabled(true);
        }
        LottieAnimationView lottieAnimationView = this.b;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
            this.b.setVisibility(8);
        }
        ImageView imageView2 = this.c;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        m();
    }

    @Override // defpackage.jls
    public final void i() {
        h();
    }

    @Override // defpackage.jls
    public final void j() {
        this.l = 4;
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setEnabled(false);
        }
        if (this.g) {
            LottieAnimationView lottieAnimationView = this.b;
            if (lottieAnimationView != null) {
                lottieAnimationView.d();
                this.b.setVisibility(8);
            }
            ImageView imageView2 = this.c;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            m();
            return;
        }
        ImageView imageView3 = this.c;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView2 = this.b;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.s(5.0f);
            this.b.setVisibility(0);
            this.b.f();
        }
        b();
    }

    @Override // defpackage.jls
    public final void k() {
        this.l = 3;
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setEnabled(true);
        }
        ImageView imageView2 = this.c;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView = this.b;
        if (lottieAnimationView != null) {
            lottieAnimationView.s(1.0f);
            this.b.setVisibility(0);
            this.b.f();
        }
        b();
    }

    @Override // defpackage.jls
    public final void l() {
        this.l = 1;
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setEnabled(true);
        }
        LottieAnimationView lottieAnimationView = this.b;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
            this.b.setVisibility(8);
        }
        ImageView imageView2 = this.c;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        m();
    }

    @Override // defpackage.jls
    public final int n() {
        return this.l;
    }

    @Override // defpackage.jls
    public final void e(Configuration configuration) {
    }

    @Override // defpackage.jls
    public final void f(int i) {
    }
}
