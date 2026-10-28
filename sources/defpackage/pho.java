package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pho {
    public static final agsn a = agsn.h("GnpSdk");

    public static final Bundle a(Intent intent) {
        if (intent.hasExtra("com.google.android.libraries.notifications.INTENT_EXTRA_APP_PROVIDED_DATA")) {
            return intent.getBundleExtra("com.google.android.libraries.notifications.INTENT_EXTRA_APP_PROVIDED_DATA");
        }
        return null;
    }

    public static final pzn b(Intent intent) {
        intent.getClass();
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.libraries.notifications.INTENT_EXTRA_LOCAL_THREAD_STATE");
        if (byteArrayExtra != null) {
            try {
                pzn pznVar = (pzn) aihn.parseFrom(pzn.a, byteArrayExtra, ExtensionRegistryLite.getGeneratedRegistry());
                pznVar.getClass();
                return pznVar;
            } catch (aiik e) {
                ((agsj) ((agsj) a.b()).j(e)).t("Unable to parse LocalThreadState message");
            }
        }
        pzn pznVar2 = pzn.a;
        pznVar2.getClass();
        return pznVar2;
    }

    public static final ahza c(Intent intent) {
        intent.getClass();
        ahza ahzaVarA = ahza.a(intent.getIntExtra("com.google.android.libraries.notifications.INTENT_EXTRA_REMOVE_REASON", 0));
        return ahzaVarA == null ? ahza.REMOVE_REASON_UNKNOWN : ahzaVarA;
    }

    public static final aicf d(Intent intent) {
        intent.getClass();
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.libraries.notifications.INTENT_EXTRA_CHIME_ACTION");
        if (byteArrayExtra != null) {
            try {
                aicf aicfVar = (aicf) aihn.parseFrom(aicf.a, byteArrayExtra, ExtensionRegistryLite.getGeneratedRegistry());
                aicfVar.getClass();
                return aicfVar;
            } catch (aiik e) {
                ((agsj) ((agsj) a.b()).j(e)).t("Unable to parse Action message");
            }
        }
        aicf aicfVar2 = aicf.a;
        aicfVar2.getClass();
        return aicfVar2;
    }

    public static final aiff e(Intent intent) {
        intent.getClass();
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE");
        if (byteArrayExtra != null) {
            try {
                aiff aiffVar = (aiff) aihn.parseFrom(aiff.a, byteArrayExtra, ExtensionRegistryLite.getGeneratedRegistry());
                aiffVar.getClass();
                return aiffVar;
            } catch (aiik e) {
                ((agsj) ((agsj) a.b()).j(e)).t("Unable to parse ThreadStateUpdate message");
            }
        }
        aiff aiffVar2 = aiff.a;
        aiffVar2.getClass();
        return aiffVar2;
    }

    public static final String f(Intent intent) {
        intent.getClass();
        return intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID");
    }

    public static final String g(Intent intent) {
        intent.getClass();
        return intent.getStringExtra("com.google.android.libraries.notifications.GROUP_ID");
    }

    public static final String h(Intent intent) {
        intent.getClass();
        return intent.getStringExtra("com.google.android.libraries.notifications.THREAD_ID");
    }

    public static final void i(Intent intent, plx plxVar) {
        intent.getClass();
        if (plxVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.ACCOUNT_REPRESENTATION", nxm.c(plxVar.b()));
        }
    }

    public static final void j(Intent intent, String str) {
        intent.getClass();
        if (str != null) {
            intent.putExtra("com.google.android.libraries.notifications.ACTION_ID", str);
        }
    }

    public static final void k(Intent intent, Bundle bundle) {
        intent.getClass();
        intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_APP_PROVIDED_DATA", bundle);
    }

    public static final void l(Intent intent, int i) {
        intent.getClass();
        intent.putExtra("com.google.android.libraries.notifications.EVENT_TYPE", i);
    }

    public static final void m(Intent intent, pot potVar) {
        intent.getClass();
        if (potVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.GROUP_ID", potVar.q);
        }
    }

    public static final void n(Intent intent, pzn pznVar) {
        intent.getClass();
        if (pznVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_LOCAL_THREAD_STATE", pznVar.toByteArray());
        }
    }

    public static final void o(Intent intent, ahza ahzaVar) {
        intent.getClass();
        intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_REMOVE_REASON", ahzaVar.r);
    }

    public static final void p(Intent intent, pot potVar) {
        intent.getClass();
        if (potVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.THREAD_ID", potVar.a);
        }
    }

    public static final void q(Intent intent, aiff aiffVar) {
        intent.getClass();
        intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE", aiffVar.toByteArray());
    }

    public static final int r(Intent intent) {
        intent.getClass();
        return intent.getIntExtra("com.google.android.libraries.notifications.EVENT_TYPE", 0);
    }
}
