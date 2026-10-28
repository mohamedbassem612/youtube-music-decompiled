package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ppa {
    private static ahnr a;

    public static synchronized ahnr a(Context context, pls plsVar) {
        ahnr ahnrVarC;
        String str;
        ahnr ahnrVarD = a;
        if (ahnrVarD == null) {
            if (plsVar.h) {
                try {
                    ahnrVarC = ahnr.b();
                } catch (IllegalStateException unused) {
                    ahnrVarC = ahnr.c(context);
                }
                a = ahnrVarC;
                return ahnrVarC;
            }
            kro.j("AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los", "ApiKey must be set.");
            kro.j("1:747654520220:android:0000000000000000", "ApplicationId must be set.");
            try {
                ahnrVarD = ahnr.d(context, new ahnv("1:747654520220:android:0000000000000000", "AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los", null, null, plsVar.b, null, null, "chime-sdk"), "CHIME_ANDROID_SDK");
            } catch (IllegalStateException unused2) {
                Object obj = ahnr.a;
                synchronized (obj) {
                    Map map = ahnr.b;
                    ahnr ahnrVar = (ahnr) map.get("CHIME_ANDROID_SDK");
                    if (ahnrVar == null) {
                        ArrayList arrayList = new ArrayList();
                        synchronized (obj) {
                            try {
                                Iterator it = map.values().iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((ahnr) it.next()).g());
                                }
                                Collections.sort(arrayList);
                                if (arrayList.isEmpty()) {
                                    str = "";
                                } else {
                                    str = "Available app names: " + TextUtils.join(", ", arrayList);
                                }
                                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", "CHIME_ANDROID_SDK", str));
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    ((ahqz) ahnrVar.e.a()).c();
                    ahnrVarD = ahnrVar;
                }
            }
            a = ahnrVarD;
            throw th;
        }
        return ahnrVarD;
    }
}
