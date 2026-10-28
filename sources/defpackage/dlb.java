package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dlb extends nh {
    public List a;
    private final PreferenceGroup e;
    private List f;
    private final List g;
    private final Runnable i = new cqc(this, 20, null);
    private final Handler h = new Handler(Looper.getMainLooper());

    public dlb(PreferenceGroup preferenceGroup) {
        this.e = preferenceGroup;
        preferenceGroup.G = this;
        this.f = new ArrayList();
        this.a = new ArrayList();
        this.g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            t(((PreferenceScreen) preferenceGroup).d);
        } else {
            t(true);
        }
        C();
    }

    private final List E(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iK = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < iK; i2++) {
            Preference preferenceO = preferenceGroup.o(i2);
            if (preferenceO.z) {
                if (!G(preferenceGroup) || i < preferenceGroup.c) {
                    arrayList.add(preferenceO);
                } else {
                    arrayList2.add(preferenceO);
                }
                if (preferenceO instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceO;
                    if (!preferenceGroup2.ae()) {
                        continue;
                    } else {
                        if (G(preferenceGroup) && G(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : E(preferenceGroup2)) {
                            if (!G(preferenceGroup) || i < preferenceGroup.c) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (G(preferenceGroup) && i > preferenceGroup.c) {
            dke dkeVar = new dke(preferenceGroup.j, arrayList2, preferenceGroup.gE());
            dkeVar.o = new ioi(this, preferenceGroup, 1);
            arrayList.add(dkeVar);
        }
        return arrayList;
    }

    private final void F(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int iK = preferenceGroup.k();
        for (int i = 0; i < iK; i++) {
            Preference preferenceO = preferenceGroup.o(i);
            list.add(preferenceO);
            dla dlaVar = new dla(preferenceO);
            List list2 = this.g;
            if (!list2.contains(dlaVar)) {
                list2.add(dlaVar);
            }
            if (preferenceO instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceO;
                if (preferenceGroup2.ae()) {
                    F(list, preferenceGroup2);
                }
            }
            preferenceO.G = this;
        }
    }

    private static final boolean G(PreferenceGroup preferenceGroup) {
        return preferenceGroup.c != Integer.MAX_VALUE;
    }

    public final int A(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((Preference) this.a.get(i)).t)) {
                return i;
            }
        }
        return -1;
    }

    public final Preference B(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return (Preference) this.a.get(i);
    }

    public final void C() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).G = null;
        }
        ArrayList arrayList = new ArrayList(this.f.size());
        this.f = arrayList;
        PreferenceGroup preferenceGroup = this.e;
        F(arrayList, preferenceGroup);
        this.a = E(preferenceGroup);
        dlg dlgVar = preferenceGroup.k;
        jW();
        for (Preference preference : this.f) {
        }
    }

    public final void D() {
        Handler handler = this.h;
        Runnable runnable = this.i;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }

    @Override // defpackage.nh
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.nh
    public final int b(int i) {
        dla dlaVar = new dla(B(i));
        List list = this.g;
        int iIndexOf = list.indexOf(dlaVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = list.size();
        list.add(dlaVar);
        return size;
    }

    @Override // defpackage.nh
    public final long c(int i) {
        if (this.c) {
            return B(i).gE();
        }
        return -1L;
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        dla dlaVar = (dla) this.g.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, dlk.a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = dl.d(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(dlaVar.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = dlaVar.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new dlj(viewInflate);
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void o(oh ohVar, int i) {
        dlj dljVar = (dlj) ohVar;
        View view = dljVar.a;
        Preference preferenceB = B(i);
        Drawable background = view.getBackground();
        Drawable drawable = dljVar.s;
        if (background != drawable) {
            view.setBackground(drawable);
        }
        TextView textView = (TextView) dljVar.C(R.id.title);
        if (textView != null && dljVar.t != null && !textView.getTextColors().equals(dljVar.t)) {
            textView.setTextColor(dljVar.t);
        }
        preferenceB.a(dljVar);
    }

    public final int z(Preference preference) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            Preference preference2 = (Preference) this.a.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }
}
