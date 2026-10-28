package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class fu {
    public final fq a;
    private final int b;

    public fu(Context context, int i) {
        this.a = new fq(new ContextThemeWrapper(context, fv.a(context, i)));
        this.b = i;
    }

    public final void a(boolean z) {
        this.a.k = z;
    }

    public final void b(View view) {
        this.a.e = view;
    }

    public final void c(Drawable drawable) {
        this.a.c = drawable;
    }

    public fv create() {
        ListAdapter fnVar;
        fq fqVar = this.a;
        Context context = fqVar.a;
        fv fvVar = new fv(context, this.b);
        ft ftVar = fvVar.a;
        View view = fqVar.e;
        if (view != null) {
            ftVar.x = view;
        } else {
            CharSequence charSequence = fqVar.d;
            if (charSequence != null) {
                ftVar.a(charSequence);
            }
            Drawable drawable = fqVar.c;
            if (drawable != null) {
                ftVar.t = drawable;
                ftVar.s = 0;
                ImageView imageView = ftVar.u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    ftVar.u.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = fqVar.f;
        if (charSequence2 != null) {
            ftVar.e = charSequence2;
            TextView textView = ftVar.w;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = fqVar.g;
        if (charSequence3 != null) {
            ftVar.e(-1, charSequence3, fqVar.h);
        }
        CharSequence charSequence4 = fqVar.i;
        if (charSequence4 != null) {
            ftVar.e(-2, charSequence4, fqVar.j);
        }
        if (fqVar.n != null || fqVar.o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) fqVar.b.inflate(ftVar.C, (ViewGroup) null);
            if (fqVar.t) {
                fnVar = new fn(fqVar, context, ftVar.D, fqVar.n, alertController$RecycleListView);
            } else {
                int i = fqVar.u ? ftVar.E : ftVar.F;
                ListAdapter fsVar = fqVar.o;
                if (fsVar == null) {
                    fsVar = new fs(context, i, fqVar.n);
                }
                fnVar = fsVar;
            }
            ftVar.y = fnVar;
            ftVar.z = fqVar.v;
            if (fqVar.p != null) {
                alertController$RecycleListView.setOnItemClickListener(new fo(fqVar, ftVar));
            } else if (fqVar.w != null) {
                alertController$RecycleListView.setOnItemClickListener(new fp(fqVar, alertController$RecycleListView, ftVar));
            }
            if (fqVar.u) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (fqVar.t) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            ftVar.f = alertController$RecycleListView;
        }
        View view2 = fqVar.r;
        if (view2 != null) {
            ftVar.g = view2;
            ftVar.h = 0;
            ftVar.i = false;
        } else {
            int i2 = fqVar.q;
            if (i2 != 0) {
                ftVar.g = null;
                ftVar.h = i2;
                ftVar.i = false;
            }
        }
        fvVar.setCancelable(fqVar.k);
        if (fqVar.k) {
            fvVar.setCanceledOnTouchOutside(true);
        }
        fvVar.setOnCancelListener(fqVar.l);
        fvVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = fqVar.m;
        if (onKeyListener != null) {
            fvVar.setOnKeyListener(onKeyListener);
        }
        return fvVar;
    }

    public final void d(int i) {
        fq fqVar = this.a;
        fqVar.f = fqVar.a.getText(i);
    }

    public final void e(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public final void f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        fq fqVar = this.a;
        fqVar.i = charSequence;
        fqVar.j = onClickListener;
    }

    public final void g(DialogInterface.OnCancelListener onCancelListener) {
        this.a.l = onCancelListener;
    }

    public Context getContext() {
        return this.a.a;
    }

    public final void h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        fq fqVar = this.a;
        fqVar.g = charSequence;
        fqVar.h = onClickListener;
    }

    public final void i(int i) {
        fq fqVar = this.a;
        fqVar.d = fqVar.a.getText(i);
    }

    public void j() {
        throw null;
    }

    public fu setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        fq fqVar = this.a;
        fqVar.i = fqVar.a.getText(i);
        fqVar.j = onClickListener;
        return this;
    }

    public fu setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        fq fqVar = this.a;
        fqVar.g = fqVar.a.getText(i);
        fqVar.h = onClickListener;
        return this;
    }

    public fu setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public fu setView(View view) {
        fq fqVar = this.a;
        fqVar.r = view;
        fqVar.q = 0;
        return this;
    }

    public fu(Context context) {
        this(context, fv.a(context, 0));
    }
}
