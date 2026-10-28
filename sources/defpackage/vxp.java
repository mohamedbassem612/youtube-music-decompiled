package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vxp {
    public aunn a;
    public boolean b = false;
    public boolean c = false;
    private final Context d;
    private final awmd e;
    private final awmd f;
    private final vxu g;

    public vxp(Context context, vxu vxuVar, awmd awmdVar, awmd awmdVar2) {
        this.d = context;
        this.g = vxuVar;
        this.e = awmdVar;
        this.f = awmdVar2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x0094  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b5  */
    public final void a() {
        ajvu ajvuVarC;
        String str;
        String country;
        if (this.b) {
            return;
        }
        if (((Integer) this.e.io()).intValue() < 16200000 || (ajvuVarC = this.g.c()) == null) {
            ((FirebaseAnalytics) this.a.io()).a(false);
        } else {
            akyz akyzVar = ajvuVarC.t;
            if (akyzVar == null) {
                akyzVar = akyz.a;
            }
            if (akyzVar.b) {
                ((FirebaseAnalytics) this.a.io()).a(true);
                this.c = true;
                FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) this.a.io();
                Bundle bundle = new Bundle();
                Context context = this.d;
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    String simCountryIso = telephonyManager.getSimCountryIso();
                    if (TextUtils.isEmpty(simCountryIso)) {
                        str = (String) this.f.io();
                        if (TextUtils.isEmpty(str)) {
                            country = context.getResources().getConfiguration().locale.getCountry();
                            if (TextUtils.isEmpty(country)) {
                                bundle.putString("country_code", "ZZ");
                            } else {
                                int i = typ.a;
                                bundle.putString("country_code", country.toUpperCase(Locale.US));
                            }
                        } else {
                            int i2 = typ.a;
                            bundle.putString("country_code", str.toUpperCase(Locale.US));
                        }
                    } else {
                        int i3 = typ.a;
                        bundle.putString("country_code", simCountryIso.toUpperCase(Locale.US));
                    }
                } else {
                    str = (String) this.f.io();
                    if (TextUtils.isEmpty(str)) {
                        int i4 = typ.a;
                        bundle.putString("country_code", str.toUpperCase(Locale.US));
                    } else {
                        country = context.getResources().getConfiguration().locale.getCountry();
                        if (TextUtils.isEmpty(country)) {
                            int i5 = typ.a;
                            bundle.putString("country_code", country.toUpperCase(Locale.US));
                        } else {
                            bundle.putString("country_code", "ZZ");
                        }
                    }
                }
                Bundle bundle2 = new Bundle(bundle);
                lay layVar = firebaseAnalytics.a;
                layVar.i(new lao(layVar, bundle2));
            } else {
                ((FirebaseAnalytics) this.a.io()).a(false);
            }
        }
        this.b = true;
    }
}
