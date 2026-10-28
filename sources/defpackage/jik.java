package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jik extends jio {
    public aeem a;
    public Object b;
    public int c;
    private int d;
    private CharSequence e;
    private CharSequence f;
    private View.OnClickListener g;
    private byte h;

    @Override // defpackage.jio, defpackage.aefb
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jir b() {
        CharSequence charSequence;
        if (this.h == 7 && (charSequence = this.e) != null) {
            return new jir(this.d, charSequence, this.f, this.g, this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.h & 1) == 0) {
            sb.append(" counterfactual");
        }
        if ((this.h & 2) == 0) {
            sb.append(" duration");
        }
        if (this.e == null) {
            sb.append(" text");
        }
        if ((this.h & 4) == 0) {
            sb.append(" rateLimited");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c() {
        this.h = (byte) (this.h | 1);
    }

    @Override // defpackage.aeen
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void i(int i) {
        this.d = i;
        this.h = (byte) (this.h | 2);
    }

    @Override // defpackage.aefb
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void j() {
        this.h = (byte) (this.h | 4);
    }

    @Override // defpackage.aefb
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void k(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null text");
        }
        this.e = charSequence;
    }

    @Override // defpackage.aefb
    protected final /* synthetic */ void g(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    @Override // defpackage.aefb
    protected final /* synthetic */ void h(CharSequence charSequence) {
        this.f = charSequence;
    }
}
