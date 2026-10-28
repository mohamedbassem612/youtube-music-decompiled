package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class auu {
    public atr h;
    CharSequence i;
    public CharSequence j;
    public boolean k = false;

    protected String a() {
        return null;
    }

    public void b(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.j = bundle.getCharSequence("android.summaryText");
            this.k = true;
        }
        this.i = bundle.getCharSequence("android.title.big");
    }

    public void f(dep depVar) {
        throw null;
    }

    public void i(Bundle bundle) {
        if (this.k) {
            bundle.putCharSequence("android.summaryText", this.j);
        }
        CharSequence charSequence = this.i;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String strA = a();
        if (strA != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strA);
        }
    }

    public void j() {
    }
}
