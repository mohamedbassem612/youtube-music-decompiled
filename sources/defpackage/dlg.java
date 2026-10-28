package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dlg {
    public boolean a;
    public PreferenceScreen b;
    public dlf c;
    public dld d;
    public dle e;
    private final Context f;
    private long g = 0;
    private SharedPreferences h;
    private SharedPreferences.Editor i;
    private String j;

    public dlg(Context context) {
        this.f = context;
        f(String.valueOf(context.getPackageName()).concat("_preferences"));
    }

    private final void g(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.i) != null) {
            editor.apply();
        }
        this.a = z;
    }

    public final long a() {
        long j;
        synchronized (this) {
            j = this.g;
            this.g = 1 + j;
        }
        return j;
    }

    public final SharedPreferences.Editor b() {
        if (!this.a) {
            return c().edit();
        }
        SharedPreferences.Editor editor = this.i;
        if (editor != null) {
            return editor;
        }
        SharedPreferences.Editor editorEdit = c().edit();
        this.i = editorEdit;
        return editorEdit;
    }

    public final SharedPreferences c() {
        SharedPreferences sharedPreferences = this.h;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = this.f.getSharedPreferences(this.j, 0);
        this.h = sharedPreferences2;
        return sharedPreferences2;
    }

    public final Preference d(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.b;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.l(charSequence);
    }

    public final PreferenceScreen e(Context context, int i, PreferenceScreen preferenceScreen) {
        g(true);
        int i2 = dlc.a;
        Object[] objArr = new Object[2];
        String[] strArr = {String.valueOf(Preference.class.getPackage().getName()).concat("."), String.valueOf(SwitchPreference.class.getPackage().getName()).concat(".")};
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            Preference preferenceA = dlc.a(xml, preferenceScreen, context, objArr, this, strArr);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preferenceA;
            preferenceScreen2.C(this);
            g(false);
            return preferenceScreen2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    public final void f(String str) {
        this.j = str;
        this.h = null;
    }
}
