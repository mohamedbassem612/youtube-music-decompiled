package defpackage;

import android.view.View;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aefl implements aeeo {
    public final boolean a;
    public final int b;
    public final View c;
    public final CharSequence d;
    public final CharSequence e;
    public final ajnf f;
    public final ajnf g;
    public final akrn h;
    public final String i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final float o;
    public final Optional p;
    public final Optional q;
    public final Optional r;
    public final aeem s;
    public final aefq t;

    public aefl(boolean z, int i, View view, CharSequence charSequence, CharSequence charSequence2, ajnf ajnfVar, ajnf ajnfVar2, akrn akrnVar, String str, int i2, int i3, int i4, int i5, int i6, float f, Optional optional, Optional optional2, Optional optional3, aeem aeemVar, aefq aefqVar) {
        this.a = z;
        this.b = i;
        this.c = view;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = ajnfVar;
        this.g = ajnfVar2;
        this.h = akrnVar;
        this.i = str;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = i5;
        this.n = i6;
        this.o = f;
        this.p = optional;
        this.q = optional2;
        this.r = optional3;
        this.s = aeemVar;
        this.t = aefqVar;
    }

    public static aefk b() {
        aefk aefkVar = new aefk((byte[]) null);
        aefkVar.j(0);
        aefkVar.o(1);
        aefkVar.n(0);
        aefkVar.p(0);
        aefkVar.k(1.0f);
        aefkVar.g(false);
        aefkVar.l(2);
        aefkVar.e(2);
        aefkVar.m();
        aefkVar.h(Optional.of(Boolean.FALSE));
        return aefkVar;
    }

    @Override // defpackage.aeeo
    public final int a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        View view;
        CharSequence charSequence;
        CharSequence charSequence2;
        ajnf ajnfVar;
        ajnf ajnfVar2;
        akrn akrnVar;
        String str;
        aeem aeemVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aefl) {
            aefl aeflVar = (aefl) obj;
            if (this.a == aeflVar.a && this.b == aeflVar.b && ((view = this.c) != null ? view.equals(aeflVar.c) : aeflVar.c == null) && ((charSequence = this.d) != null ? charSequence.equals(aeflVar.d) : aeflVar.d == null) && ((charSequence2 = this.e) != null ? charSequence2.equals(aeflVar.e) : aeflVar.e == null) && ((ajnfVar = this.f) != null ? ajnfVar.equals(aeflVar.f) : aeflVar.f == null) && ((ajnfVar2 = this.g) != null ? ajnfVar2.equals(aeflVar.g) : aeflVar.g == null) && ((akrnVar = this.h) != null ? akrnVar.equals(aeflVar.h) : aeflVar.h == null) && ((str = this.i) != null ? str.equals(aeflVar.i) : aeflVar.i == null) && this.j == aeflVar.j && this.k == aeflVar.k && this.l == aeflVar.l && this.m == aeflVar.m && this.n == aeflVar.n) {
                if (Float.floatToIntBits(this.o) == Float.floatToIntBits(aeflVar.o) && this.p.equals(aeflVar.p) && this.q.equals(aeflVar.q) && this.r.equals(aeflVar.r) && ((aeemVar = this.s) != null ? aeemVar.equals(aeflVar.s) : aeflVar.s == null)) {
                    aefq aefqVar = this.t;
                    if (aefqVar == null) {
                        if (aeflVar.t == null) {
                            return true;
                        }
                    } else if (aefqVar.equals(aeflVar.t)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.aeeo
    public final void f() {
        throw null;
    }

    public final int hashCode() {
        View view = this.c;
        int iHashCode = (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ 1237) * 1000003) ^ (view == null ? 0 : view.hashCode());
        CharSequence charSequence = this.d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        CharSequence charSequence2 = this.e;
        int iHashCode3 = iHashCode2 ^ (charSequence2 == null ? 0 : charSequence2.hashCode());
        ajnf ajnfVar = this.f;
        int iHashCode4 = ajnfVar == null ? 0 : ajnfVar.hashCode();
        int i = iHashCode3 * 583896283;
        ajnf ajnfVar2 = this.g;
        int iHashCode5 = (((i ^ iHashCode4) * 583896283) ^ (ajnfVar2 == null ? 0 : ajnfVar2.hashCode())) * 1000003;
        akrn akrnVar = this.h;
        int iHashCode6 = (iHashCode5 ^ (akrnVar == null ? 0 : akrnVar.hashCode())) * 1000003;
        String str = this.i;
        int iHashCode7 = (((((((((((((((((((iHashCode6 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n) * (-721379959)) ^ Float.floatToIntBits(this.o)) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003;
        aeem aeemVar = this.s;
        int iHashCode8 = (iHashCode7 ^ (aeemVar == null ? 0 : aeemVar.hashCode())) * (-721379959);
        aefq aefqVar = this.t;
        return iHashCode8 ^ (aefqVar != null ? aefqVar.hashCode() : 0);
    }

    public final String toString() {
        aefq aefqVar = this.t;
        aeem aeemVar = this.s;
        Optional optional = this.r;
        Optional optional2 = this.q;
        Optional optional3 = this.p;
        akrn akrnVar = this.h;
        ajnf ajnfVar = this.g;
        ajnf ajnfVar2 = this.f;
        CharSequence charSequence = this.e;
        CharSequence charSequence2 = this.d;
        return "YouTubeTooltipModel{counterfactual=" + this.a + ", duration=" + this.b + ", rateLimited=false, targetView=" + String.valueOf(this.c) + ", titleText=" + String.valueOf(charSequence2) + ", detailText=" + String.valueOf(charSequence) + ", actionText=null, actionListener=null, actionButtonRenderer=" + String.valueOf(ajnfVar2) + ", dismissText=null, dismissListener=null, dismissButtonRenderer=" + String.valueOf(ajnfVar) + ", elementsContent=" + String.valueOf(akrnVar) + ", positionEntityKey=" + this.i + ", tapDismissalType=" + this.j + ", tapConsumeStrategy=" + this.k + ", targetEffectType=" + this.l + ", placement=" + this.m + ", alignment=" + this.n + ", descriptionTextAlignment=null, maxWidthPercentage=" + this.o + ", backgroundColor=" + String.valueOf(optional3) + ", acceptFeedbackOnTargetTapEnabled=" + String.valueOf(optional2) + ", disableDismissalOnTargetViewChanges=" + String.valueOf(optional) + ", transientUiCallback=" + String.valueOf(aeemVar) + ", onClickListener=null, onTooltipDismissListener=" + String.valueOf(aefqVar) + '}';
    }

    public aefl() {
        throw null;
    }
}
