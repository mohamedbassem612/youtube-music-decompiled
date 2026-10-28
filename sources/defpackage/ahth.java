package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import app.rive.runtime.kotlin.fonts.Fonts;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahth extends kry {
    public static final Parcelable.Creator CREATOR = new ahpw(4);
    public final Bundle a;
    private Map b;

    public ahth(Bundle bundle) {
        this.a = bundle;
    }

    public static final int b(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return Fonts.Font.STYLE_NORMAL.equals(str) ? 2 : 0;
    }

    public final Map a() {
        if (this.b == null) {
            Bundle bundle = this.a;
            afv afvVar = new afv();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        afvVar.put(str, str2);
                    }
                }
            }
            this.b = afvVar;
        }
        return new HashMap(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.p(parcel, 2, this.a);
        ksy.h(parcel, iG);
    }
}
