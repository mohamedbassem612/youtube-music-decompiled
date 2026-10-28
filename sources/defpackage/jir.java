package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jir extends aefd {
    public final Object a;
    public final int b;
    private final int c;
    private final CharSequence d;
    private final CharSequence e;
    private final View.OnClickListener f;
    private final aeem g;

    public jir(int i, CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener, aeem aeemVar, Object obj, int i2) {
        this.c = i;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = onClickListener;
        this.g = aeemVar;
        this.a = obj;
        this.b = i2;
    }

    @Override // defpackage.aeeo
    public final int a() {
        return this.c;
    }

    @Override // defpackage.aefd
    public final View.OnClickListener b() {
        return this.f;
    }

    @Override // defpackage.aefd
    public final aeem c() {
        return this.g;
    }

    @Override // defpackage.aefd
    public final CharSequence d() {
        return this.e;
    }

    @Override // defpackage.aefd
    public final CharSequence e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        CharSequence charSequence;
        View.OnClickListener onClickListener;
        aeem aeemVar;
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof jir) {
            jir jirVar = (jir) obj;
            if (this.c == jirVar.c && this.d.equals(jirVar.d) && ((charSequence = this.e) != null ? charSequence.equals(jirVar.e) : jirVar.e == null) && ((onClickListener = this.f) != null ? onClickListener.equals(jirVar.f) : jirVar.f == null) && ((aeemVar = this.g) != null ? aeemVar.equals(jirVar.g) : jirVar.g == null) && ((obj2 = this.a) != null ? obj2.equals(jirVar.a) : jirVar.a == null)) {
                int i = this.b;
                if (i == 0) {
                    if (jirVar.b == 0) {
                        return true;
                    }
                } else if (i == jirVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.c ^ 385623362) * 1000003) ^ this.d.hashCode();
        CharSequence charSequence = this.e;
        int iHashCode2 = ((iHashCode * 1000003) ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        View.OnClickListener onClickListener = this.f;
        int iHashCode3 = (((iHashCode2 ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003) ^ 1237) * 1000003;
        aeem aeemVar = this.g;
        int iHashCode4 = (iHashCode3 ^ (aeemVar == null ? 0 : aeemVar.hashCode())) * 1000003;
        Object obj = this.a;
        int iHashCode5 = (iHashCode4 ^ (obj == null ? 0 : obj.hashCode())) * 1000003;
        int i = this.b;
        return iHashCode5 ^ (i != 0 ? i : 0);
    }

    public final String toString() {
        int i = this.b;
        return "MusicSnackbarModel{counterfactual=false, duration=" + this.c + ", text=" + String.valueOf(this.d) + ", actionText=" + String.valueOf(this.e) + ", actionListener=" + String.valueOf(this.f) + ", rateLimited=false, transientUiCallback=" + String.valueOf(this.g) + ", tag=" + String.valueOf(this.a) + ", style=" + (i != 0 ? Integer.toString(i - 1) : "null") + '}';
    }

    public jir() {
        throw null;
    }

    @Override // defpackage.aeeo
    public final void f() {
    }
}
