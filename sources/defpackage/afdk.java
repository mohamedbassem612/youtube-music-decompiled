package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afdk {
    public CharSequence a;
    public CharSequence b;
    public View d;
    public TabLayout f;
    public afdm g;
    public int c = -1;
    public final int e = 1;
    public int h = -1;

    public final void a() {
        TabLayout tabLayout = this.f;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.l(this, true);
    }

    public final void b() {
        afdm afdmVar = this.g;
        if (afdmVar != null) {
            afdmVar.b();
        }
    }

    public final boolean c() {
        TabLayout tabLayout = this.f;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        int iA = tabLayout.a();
        return iA != -1 && iA == this.c;
    }

    public final void d(View view) {
        this.d = view;
        b();
    }

    public final void e(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(charSequence)) {
            this.g.setContentDescription(charSequence);
        }
        this.a = charSequence;
        b();
    }
}
