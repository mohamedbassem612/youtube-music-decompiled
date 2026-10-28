package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hlp extends aaqg implements SharedPreferences.OnSharedPreferenceChangeListener {
    private static final aodp h = aodp.OFFLINE_AUDIO_QUALITY_MEDIUM;
    private final Context i;
    private final List j;
    private final tfq k;
    private final hef l;
    private final abfv m;

    public hlp(Context context, SharedPreferences sharedPreferences, int i, vyo vyoVar, aauk aaukVar, abfv abfvVar, tfq tfqVar, abfv abfvVar2, hef hefVar) {
        super(sharedPreferences, vyoVar, i, aaukVar, abfvVar);
        this.i = context;
        this.m = abfvVar2;
        this.k = tfqVar;
        this.l = hefVar;
        this.j = new ArrayList();
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    private final void E() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            hlo hloVar = (hlo) ((WeakReference) it.next()).get();
            if (hloVar != null) {
                hloVar.V();
            }
        }
    }

    private final boolean F() {
        if (this.m.z()) {
            return this.k.k();
        }
        return false;
    }

    @Override // defpackage.aaqg
    public final float a(String str) {
        return str.equals("PPOM") ? 0.6f : 0.0f;
    }

    public final aodp b(String str) {
        aodp aodpVar;
        if (!TextUtils.isEmpty(str)) {
            try {
                int i = Integer.parseInt(str);
                if (i == 48) {
                    aodpVar = aodp.OFFLINE_AUDIO_QUALITY_LOW;
                } else if (i != 128) {
                    aodpVar = i != 256 ? aodp.OFFLINE_AUDIO_QUALITY_UNKNOWN : aodp.OFFLINE_AUDIO_QUALITY_HIGH;
                } else {
                    aodpVar = aodp.OFFLINE_AUDIO_QUALITY_MEDIUM;
                }
                if (aodpVar != aodp.OFFLINE_AUDIO_QUALITY_UNKNOWN) {
                    return aodpVar;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return h;
    }

    public final aodp c() {
        String string = this.b.getString(gzj.OFFLINE_AUDIO_QUALITY, null);
        return !TextUtils.isEmpty(string) ? b(string) : h;
    }

    @Override // defpackage.aaqg
    public final aodp d(aohx aohxVar) {
        return c();
    }

    @Override // defpackage.aaqg
    public final aohx e() {
        return super.r(aohx.AUDIO_ONLY);
    }

    public final void f(hlo hloVar) {
        this.j.add(new WeakReference(hloVar));
    }

    public final void g(boolean z) {
        this.b.edit().putBoolean("offline_policy", z).apply();
        abfv abfvVar = this.g;
        if (abfvVar.v()) {
            abfvVar.t(z ? atpr.UNMETERED_WIFI_OR_UNMETERED_MOBILE : atpr.ANY);
        }
    }

    public final void h(boolean z) {
        SharedPreferences sharedPreferences = this.b;
        boolean z2 = sharedPreferences.getBoolean("show_device_files", false);
        sharedPreferences.edit().putBoolean("show_device_files", z).apply();
        this.l.l(true);
        if (z2 == z) {
            E();
        }
    }

    public final void i(hlo hloVar) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null || ((hlo) weakReference.get()).equals(hloVar)) {
                it.remove();
            }
        }
    }

    @Override // defpackage.aaqg
    public final boolean j() {
        return this.b.getBoolean("offline_policy", true);
    }

    public final boolean k() {
        tfq tfqVar = this.k;
        aauk aaukVar = this.d;
        boolean zJ = tfqVar.j(1);
        boolean zF = F();
        if (aaukVar.p() && this.m.z()) {
            if (super.s() != atpr.UNMETERED_WIFI) {
                return super.s() != atpr.UNMETERED_WIFI_OR_UNMETERED_MOBILE || zJ || zF;
            }
        } else if (!j()) {
            return true;
        }
        return zJ;
    }

    public final boolean l() {
        tfq tfqVar = this.k;
        aauk aaukVar = this.d;
        boolean zJ = tfqVar.j(1);
        boolean zF = F();
        if (aaukVar.p() && this.m.z() && super.s() != atpr.UNMETERED_WIFI) {
            return zJ || zF;
        }
        return zJ;
    }

    public final boolean m() {
        return this.b.getBoolean("show_device_files", false);
    }

    @Override // defpackage.aaqg
    public final boolean n() {
        return this.b.getBoolean("offline_use_sd_card", false);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (gzj.OFFLINE_QUALITY.equals(str)) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                hlo hloVar = (hlo) ((WeakReference) it.next()).get();
                if (hloVar != null) {
                    hloVar.W();
                }
            }
            return;
        }
        if (gzj.OFFLINE_AUDIO_QUALITY.equals(str)) {
            Iterator it2 = this.j.iterator();
            while (it2.hasNext()) {
                hlo hloVar2 = (hlo) ((WeakReference) it2.next()).get();
                if (hloVar2 != null) {
                    hloVar2.U();
                }
            }
            return;
        }
        if ("show_device_files".equals(str)) {
            E();
            return;
        }
        if ("offline_policy".equals(str)) {
            this.b.edit().putString("offline_policy_string", this.i.getString(true != j() ? R.string.any : R.string.wifi)).apply();
            Iterator it3 = this.j.iterator();
            while (it3.hasNext()) {
            }
        }
    }
}
