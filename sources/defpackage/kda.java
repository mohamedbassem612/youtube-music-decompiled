package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kda {
    public static final khn a = new khn("ApplicationAnalytics", (String) null);
    public final kcw b;
    public final kdl c;
    public final kdc d;
    public final SharedPreferences e;
    public kdb f;
    public kbu g;
    private final Handler i = new afkg(Looper.getMainLooper(), (byte[]) null);
    private final Runnable h = new kcx(this, 0);

    public kda(SharedPreferences sharedPreferences, kcw kcwVar, kdl kdlVar, Bundle bundle, String str) {
        this.e = sharedPreferences;
        this.b = kcwVar;
        this.c = kdlVar;
        this.d = new kdc(bundle, str);
    }

    public static String a() {
        kbk kbkVarB = kbk.b();
        kro.l(kbkVarB);
        return kbkVarB.c().d;
    }

    private final void i(CastDevice castDevice) {
        kdb kdbVar = this.f;
        if (kdbVar != null) {
            kdbVar.d = castDevice.j;
            kdbVar.h = castDevice.a();
            kdbVar.i = castDevice.e;
            kdbVar.o = castDevice.b();
            khd khdVarD = castDevice.d();
            if (khdVarD != null) {
                String str = khdVarD.d;
                if (str != null) {
                    kdbVar.j = str;
                }
                String str2 = khdVarD.e;
                if (str2 != null) {
                    kdbVar.k = str2;
                }
                String str3 = khdVarD.f;
                if (str3 != null) {
                    kdbVar.l = str3;
                }
                String str4 = khdVarD.g;
                if (str4 != null) {
                    kdbVar.m = str4;
                }
                String str5 = khdVarD.h;
                if (str5 != null) {
                    kdbVar.n = str5;
                }
            }
        }
    }

    private final boolean j() {
        String str;
        if (this.f == null) {
            khn.e();
            return false;
        }
        String strA = a();
        if (strA == null || (str = this.f.c) == null || !TextUtils.equals(str, strA)) {
            khn.e();
            return false;
        }
        kro.l(this.f);
        return true;
    }

    public final void b() {
        this.i.removeCallbacks(this.h);
    }

    public final void c() {
        if (!j()) {
            a.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
            d();
            return;
        }
        kbu kbuVar = this.g;
        CastDevice castDeviceB = kbuVar != null ? kbuVar.b() : null;
        if (castDeviceB != null && !TextUtils.equals(this.f.d, castDeviceB.j)) {
            i(castDeviceB);
        }
        kro.l(this.f);
    }

    public final void d() {
        khn.e();
        kdb kdbVarA = kdb.a(this.c);
        this.f = kdbVarA;
        kro.l(kdbVarA);
        kbu kbuVar = this.g;
        kdbVarA.p = kbuVar != null && kbuVar.k();
        kdb kdbVar = this.f;
        kro.l(kdbVar);
        kdbVar.c = a();
        kbu kbuVar2 = this.g;
        CastDevice castDeviceB = kbuVar2 == null ? null : kbuVar2.b();
        if (castDeviceB != null) {
            i(castDeviceB);
        }
        kdb kdbVar2 = this.f;
        kro.l(kdbVar2);
        kbu kbuVar3 = this.g;
        kdbVar2.q = kbuVar3 != null ? kbuVar3.n() : 0;
        kro.l(this.f);
    }

    public final void e(int i) {
        khn.e();
        c();
        this.b.a(this.d.b(this.f, i), 228);
        b();
        this.f = null;
    }

    public final void f() {
        kdb kdbVar = this.f;
        SharedPreferences sharedPreferences = this.e;
        if (sharedPreferences != null) {
            khn.e();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("application_id", kdbVar.c);
            editorEdit.putString("receiver_metrics_id", kdbVar.d);
            editorEdit.putLong("analytics_session_id", kdbVar.e);
            editorEdit.putInt("event_sequence_number", kdbVar.f);
            editorEdit.putString("receiver_session_id", kdbVar.g);
            editorEdit.putInt("device_capabilities", kdbVar.h);
            editorEdit.putString("device_model_name", kdbVar.i);
            editorEdit.putString("manufacturer", kdbVar.j);
            editorEdit.putString("product_name", kdbVar.k);
            editorEdit.putString("build_type", kdbVar.l);
            editorEdit.putString("cast_build_version", kdbVar.m);
            editorEdit.putString("system_build_number", kdbVar.n);
            editorEdit.putInt("device_category", kdbVar.o);
            editorEdit.putInt("analytics_session_start_type", kdbVar.q);
            editorEdit.putBoolean("is_output_switcher_enabled", kdbVar.p);
            editorEdit.apply();
        }
    }

    public final void g() {
        Runnable runnable = this.h;
        kro.l(runnable);
        this.i.postDelayed(runnable, 300000L);
    }

    public final boolean h(String str) {
        String str2;
        if (!j()) {
            return false;
        }
        kro.l(this.f);
        if (str != null && (str2 = this.f.g) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        khn.e();
        return false;
    }
}
