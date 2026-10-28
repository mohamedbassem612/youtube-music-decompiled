package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aefb implements aeen {
    public abstract aefd b();

    protected abstract void g(View.OnClickListener onClickListener);

    protected abstract void h(CharSequence charSequence);

    public abstract void j();

    public abstract void k(CharSequence charSequence);

    public final void l(CharSequence charSequence, View.OnClickListener onClickListener) {
        h(charSequence);
        g(onClickListener);
    }
}
