package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aabq {
    private aabq() {
    }

    public static ajwo a(Intent intent) {
        if (intent.hasExtra("record_interactions_endpoint")) {
            return vxg.b(intent.getByteArrayExtra("record_interactions_endpoint"));
        }
        return null;
    }

    public static void b(Intent intent, ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apdc.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                if (sxo.a.isPresent()) {
                    ((sxn) sxo.a.get()).b(intent, aabq.class);
                }
                intent.putExtra("record_interactions_endpoint", ajwoVar.toByteArray());
            }
        }
    }

    public static amud c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return l(bundle.getByteArray("logging_directive"));
    }

    public static amud d(Bundle bundle, String str) {
        if (bundle != null) {
            return l(bundle.getByteArray(str));
        }
        return null;
    }

    public static void e(Intent intent, amud amudVar) {
        if (amudVar != null) {
            intent.putExtra("logging_directive", amudVar.toByteArray());
        }
    }

    public static PendingIntent f(Context context, Intent intent) {
        return qof.b(context, (int) (Math.random() * 2.147483647E9d), intent, 1140850688);
    }

    public static PendingIntent g(Context context, Intent intent) {
        return qof.a(context, (int) (Math.random() * 2.147483647E9d), intent, 1140850688, 0);
    }

    public static void h(Intent intent, String str, aode aodeVar) {
        if (aodeVar == null || !aodeVar.e) {
            return;
        }
        yno.U(intent, str);
    }

    public static Collection i(List list, List list2) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aamo aamoVar = (aamo) it.next();
            map.put(aamoVar.d(), aamoVar);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            map.remove(((aamo) it2.next()).d());
        }
        return map.values();
    }

    public static void j(String str, jsk jskVar) {
        Iterator it = jskVar.g(str).iterator();
        while (it.hasNext()) {
            try {
                jskVar.m((jsp) it.next());
            } catch (jsi unused) {
            }
        }
    }

    public static boolean k(String str, List list) {
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            jsk jskVar = (jsk) it.next();
            if (jskVar != null) {
                String strValueOf = String.valueOf(str);
                for (String str2 : jskVar.h()) {
                    if (str2 != null && str2.startsWith(strValueOf.concat("."))) {
                        j(str2, jskVar);
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    private static amud l(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return (amud) aihn.parseFrom(amud.b, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik unused) {
            return null;
        }
    }
}
