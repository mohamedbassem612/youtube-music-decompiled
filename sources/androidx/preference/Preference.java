package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import com.google.android.apps.youtube.music.R;
import defpackage.aun;
import defpackage.dkm;
import defpackage.dkn;
import defpackage.dko;
import defpackage.dkp;
import defpackage.dkq;
import defpackage.dl;
import defpackage.dlb;
import defpackage.dlf;
import defpackage.dlg;
import defpackage.dlj;
import defpackage.dlk;
import defpackage.jn;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class Preference implements Comparable {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public PreferenceGroup E;
    public dkq F;
    public dlb G;
    private boolean H;
    private boolean I;
    private boolean J;
    private List K;
    private boolean L;
    private dkp M;
    private final View.OnClickListener N;
    private CharSequence a;
    private Bundle b;
    private boolean c;
    private boolean d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    public final Context j;
    public dlg k;
    public long l;
    public boolean m;
    public dkn n;
    public dko o;
    public int p;
    public CharSequence q;
    public int r;
    public Drawable s;
    public String t;
    public Intent u;
    public String v;
    public boolean w;
    public boolean x;
    public Object y;
    public boolean z;

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = Alert.DURATION_SHOW_INDEFINITELY;
        this.c = true;
        this.w = true;
        this.x = true;
        this.f = true;
        this.g = true;
        this.z = true;
        this.h = true;
        this.i = true;
        this.I = true;
        this.J = true;
        this.C = R.layout.preference;
        this.N = new jn(this, 9);
        this.j = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dlk.g, i, i2);
        this.r = aun.e(typedArrayObtainStyledAttributes, 23, 0, 0);
        this.t = aun.h(typedArrayObtainStyledAttributes, 26, 6);
        this.q = aun.g(typedArrayObtainStyledAttributes, 34, 4);
        this.a = aun.g(typedArrayObtainStyledAttributes, 33, 7);
        this.p = aun.l(typedArrayObtainStyledAttributes, 28, 8);
        this.v = aun.h(typedArrayObtainStyledAttributes, 22, 13);
        this.C = aun.e(typedArrayObtainStyledAttributes, 27, 3, R.layout.preference);
        this.D = aun.e(typedArrayObtainStyledAttributes, 35, 9, 0);
        this.c = aun.i(typedArrayObtainStyledAttributes, 21, 2, true);
        this.w = aun.i(typedArrayObtainStyledAttributes, 30, 5, true);
        this.x = aun.i(typedArrayObtainStyledAttributes, 29, 1, true);
        this.e = aun.h(typedArrayObtainStyledAttributes, 19, 10);
        this.h = aun.i(typedArrayObtainStyledAttributes, 16, 16, this.w);
        this.i = aun.i(typedArrayObtainStyledAttributes, 17, 17, this.w);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.y = f(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.y = f(typedArrayObtainStyledAttributes, 11);
        }
        this.J = aun.i(typedArrayObtainStyledAttributes, 31, 12, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.H = zHasValue;
        if (zHasValue) {
            this.I = aun.i(typedArrayObtainStyledAttributes, 32, 14, true);
        }
        this.A = aun.i(typedArrayObtainStyledAttributes, 24, 15, false);
        this.z = aun.i(typedArrayObtainStyledAttributes, 25, 25, true);
        this.B = aun.i(typedArrayObtainStyledAttributes, 20, 20, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void k(View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                k(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    protected final void A() {
        dlb dlbVar = this.G;
        if (dlbVar != null) {
            dlbVar.D();
        }
    }

    public void B() {
        I();
    }

    public final void C(dlg dlgVar) {
        this.k = dlgVar;
        if (!this.m) {
            this.l = dlgVar.a();
        }
        if (Y() && r().contains(this.t)) {
            G(true, null);
            return;
        }
        Object obj = this.y;
        if (obj != null) {
            G(false, obj);
        }
    }

    public void D(Preference preference, boolean z) {
        if (this.f == z) {
            this.f = !z;
            z(j());
            d();
        }
    }

    public void E() {
        T();
    }

    protected void F() {
        T();
    }

    @Deprecated
    protected void G(boolean z, Object obj) {
        h(obj);
    }

    public final void H() {
        Intent intent;
        dlf dlfVar;
        if (X() && this.w) {
            c();
            dko dkoVar = this.o;
            if (dkoVar != null) {
                dkoVar.a();
                return;
            }
            dlg dlgVar = this.k;
            if ((dlgVar == null || (dlfVar = dlgVar.c) == null || !dlfVar.onPreferenceTreeClick(this)) && (intent = this.u) != null) {
                this.j.startActivity(intent);
            }
        }
    }

    public final void I() {
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        Preference preferenceT = t(this.e);
        if (preferenceT != null) {
            if (preferenceT.K == null) {
                preferenceT.K = new ArrayList();
            }
            preferenceT.K.add(this);
            D(preferenceT, preferenceT.j());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.e + "\" not found for preference \"" + this.t + "\" (title: \"" + ((Object) this.q) + '\"');
    }

    public void J(Object obj) {
        this.y = obj;
    }

    public final void K(String str) {
        T();
        this.e = str;
        I();
    }

    public final void L(boolean z) {
        if (this.c != z) {
            this.c = z;
            z(j());
            d();
        }
    }

    public void M(String str) {
        this.t = str;
        if (!this.d || W()) {
            return;
        }
        if (TextUtils.isEmpty(this.t)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.d = true;
    }

    public final void N(int i) {
        if (i != this.p) {
            this.p = i;
            A();
        }
    }

    public final void O(dkq dkqVar) {
        this.F = dkqVar;
        d();
    }

    public final void P(int i) {
        Q(this.j.getString(i));
    }

    public final void Q(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.q)) {
            return;
        }
        this.q = charSequence;
        d();
    }

    public final void R(boolean z) {
        if (this.z != z) {
            this.z = z;
            dlb dlbVar = this.G;
            if (dlbVar != null) {
                dlbVar.D();
            }
        }
    }

    public final void S(SharedPreferences.Editor editor) {
        if (this.k.a) {
            return;
        }
        editor.apply();
    }

    public final void T() {
        Preference preferenceT;
        List list;
        String str = this.e;
        if (str == null || (preferenceT = t(str)) == null || (list = preferenceT.K) == null) {
            return;
        }
        list.remove(this);
    }

    public boolean U(Object obj) {
        dkn dknVar = this.n;
        return dknVar == null || dknVar.a(this, obj);
    }

    protected boolean V(boolean z) {
        return Y() ? this.k.c().getBoolean(this.t, z) : z;
    }

    public final boolean W() {
        return !TextUtils.isEmpty(this.t);
    }

    public boolean X() {
        return this.c && this.f && this.g;
    }

    protected final boolean Y() {
        return this.k != null && this.x && W();
    }

    public final void Z(boolean z) {
        if (this.g == z) {
            this.g = !z;
            z(j());
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    public void a(dlj dljVar) {
        Integer numValueOf;
        Drawable drawableD;
        View view = dljVar.a;
        view.setOnClickListener(this.N);
        view.setId(0);
        TextView textView = (TextView) dljVar.C(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceM = m();
            if (TextUtils.isEmpty(charSequenceM)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceM);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) dljVar.C(android.R.id.title);
        if (textView2 != null) {
            CharSequence charSequence = this.q;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.H) {
                    textView2.setSingleLine(this.I);
                }
                if (!this.w && X() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) dljVar.C(android.R.id.icon);
        if (imageView != null) {
            int i = this.r;
            if (i != 0) {
                drawableD = this.s;
                if (drawableD == null) {
                    drawableD = dl.d(this.j, i);
                    this.s = drawableD;
                }
                if (drawableD != null) {
                    imageView.setImageDrawable(drawableD);
                }
            } else if (this.s != null) {
                i = 0;
                drawableD = this.s;
                if (drawableD == null) {
                    drawableD = dl.d(this.j, i);
                    this.s = drawableD;
                }
                if (drawableD != null) {
                    imageView.setImageDrawable(drawableD);
                }
            }
            if (this.s != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(true != this.A ? 8 : 4);
            }
        }
        View viewC = dljVar.C(R.id.icon_frame);
        if (viewC == null) {
            viewC = dljVar.C(android.R.id.icon_frame);
        }
        if (viewC != null) {
            if (this.s != null) {
                viewC.setVisibility(0);
            } else {
                viewC.setVisibility(true == this.A ? 4 : 8);
            }
        }
        if (this.J) {
            k(view, X());
        } else {
            k(view, true);
        }
        boolean z = this.w;
        view.setFocusable(z);
        view.setClickable(z);
        dljVar.u = this.h;
        dljVar.v = this.i;
        boolean z2 = this.B;
        if (z2 && this.M == null) {
            this.M = new dkp(this);
        }
        view.setOnCreateContextMenuListener(z2 ? this.M : null);
        view.setLongClickable(z2);
        if (!z2 || z) {
            return;
        }
        view.setBackground(null);
    }

    protected void aa(boolean z) {
        if (!Y() || z == V(!z)) {
            return;
        }
        SharedPreferences.Editor editorB = this.k.b();
        editorB.putBoolean(this.t, z);
        S(editorB);
    }

    protected void ab(int i) {
        if (!Y() || i == q(~i)) {
            return;
        }
        SharedPreferences.Editor editorB = this.k.b();
        editorB.putInt(this.t, i);
        S(editorB);
    }

    protected void ac(String str) {
        if (!Y() || TextUtils.equals(str, u(null))) {
            return;
        }
        SharedPreferences.Editor editorB = this.k.b();
        editorB.putString(this.t, str);
        S(editorB);
    }

    public void b(View view) {
        H();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.p;
        int i2 = preference.p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.q;
        CharSequence charSequence2 = preference.q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.q.toString());
    }

    public void d() {
        int iIndexOf;
        dlb dlbVar = this.G;
        if (dlbVar == null || (iIndexOf = dlbVar.a.indexOf(this)) == -1) {
            return;
        }
        dlbVar.b.c(iIndexOf, 1, this);
    }

    protected Object f(TypedArray typedArray, int i) {
        return null;
    }

    protected void g(Parcelable parcelable) {
        this.L = true;
        if (parcelable != dkm.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    protected Parcelable gD() {
        this.L = true;
        return dkm.EMPTY_STATE;
    }

    public long gE() {
        return this.l;
    }

    public boolean j() {
        return !X();
    }

    public CharSequence m() {
        dkq dkqVar = this.F;
        return dkqVar != null ? dkqVar.a(this) : this.a;
    }

    public void n(CharSequence charSequence) {
        if (this.F != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.a, charSequence)) {
            return;
        }
        this.a = charSequence;
        d();
    }

    protected int q(int i) {
        return Y() ? this.k.c().getInt(this.t, i) : i;
    }

    public final SharedPreferences r() {
        dlg dlgVar = this.k;
        if (dlgVar != null) {
            return dlgVar.c();
        }
        return null;
    }

    public final Bundle s() {
        Bundle bundle = this.b;
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        this.b = bundle2;
        return bundle2;
    }

    protected final Preference t(String str) {
        dlg dlgVar = this.k;
        if (dlgVar == null) {
            return null;
        }
        return dlgVar.d(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.q;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceM = m();
        if (!TextUtils.isEmpty(charSequenceM)) {
            sb.append(charSequenceM);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    protected String u(String str) {
        return Y() ? this.k.c().getString(this.t, str) : str;
    }

    public final Set v(Set set) {
        return Y() ? this.k.c().getStringSet(this.t, set) : set;
    }

    final void w(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.E != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.E = preferenceGroup;
    }

    public void x(Bundle bundle) {
        Parcelable parcelable;
        if (!W() || (parcelable = bundle.getParcelable(this.t)) == null) {
            return;
        }
        this.L = false;
        g(parcelable);
        if (!this.L) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void y(Bundle bundle) {
        if (W()) {
            this.L = false;
            Parcelable parcelableGD = gD();
            if (!this.L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableGD != null) {
                bundle.putParcelable(this.t, parcelableGD);
            }
        }
    }

    public void z(boolean z) {
        List list = this.K;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Preference) list.get(i)).D(this, z);
            }
        }
    }

    protected void c() {
    }

    protected void h(Object obj) {
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aun.c(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context) {
        this(context, null);
    }
}
