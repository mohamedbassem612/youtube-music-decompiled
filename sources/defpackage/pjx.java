package defpackage;

import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pjx {
    public static final pjx a = new pjx();
    private static final agsn b = agsn.h("GnpSdk");

    public static final int a(StatusBarNotification statusBarNotification) {
        String str;
        Integer numG;
        statusBarNotification.getClass();
        Integer numValueOf = Integer.valueOf(statusBarNotification.getNotification().extras.getInt("chime.account_name_hash"));
        Integer numValueOf2 = null;
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        String tag = statusBarNotification.getTag();
        if (tag != null && (str = (String) awrc.F(tag, new String[]{"::"}).get(0)) != null && (numG = awrc.G(str)) != null) {
            int iIntValue = numG.intValue();
            if (iIntValue == -91843507) {
                iIntValue = -1;
            }
            numValueOf2 = Integer.valueOf(iIntValue);
        }
        if (numValueOf2 == null) {
            return 0;
        }
        return numValueOf2.intValue();
    }

    public static final int b(String str, String str2, int i) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":e:");
        sb.append(i);
        sb.append(":a:");
        if (str2 == null) {
            str2 = "NO_ACTION";
        }
        sb.append(str2);
        return sb.toString().hashCode();
    }

    public static final pjw c(pcu pcuVar, pot potVar) {
        String strF;
        pcuVar.getClass();
        potVar.getClass();
        if (nvk.c(potVar).length() > 0) {
            strF = nvk.c(potVar) + "::" + UUID.randomUUID();
        } else {
            strF = f(pcuVar, potVar.a);
        }
        return new pjw(0, strF);
    }

    public static final String d(StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        Bundle bundle = statusBarNotification.getNotification().extras;
        bundle.getClass();
        return o(bundle, "chime.slot_key");
    }

    public static final String e(pcu pcuVar, String str) {
        pcuVar.getClass();
        str.getClass();
        String strD = pcuVar.d();
        if (strD == null) {
            strD = "Anonymous";
        }
        return strD.hashCode() + "::SUMMARY::" + str;
    }

    public static final String f(pcu pcuVar, String str) {
        String strD = pcuVar.d();
        if (strD == null) {
            strD = "Anonymous";
        }
        return strD.hashCode() + "::" + str;
    }

    public static final String g(StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        Bundle bundle = statusBarNotification.getNotification().extras;
        bundle.getClass();
        String strO = o(bundle, "chime.thread_id");
        if (strO != null) {
            return strO;
        }
        String tag = statusBarNotification.getTag();
        if (tag == null) {
            return null;
        }
        return (String) atqq.aa(awrc.F(tag, new String[]{"::"}), 1);
    }

    public static final boolean h(StatusBarNotification statusBarNotification, pls plsVar) {
        statusBarNotification.getClass();
        Bundle bundle = statusBarNotification.getNotification().extras;
        bundle.getClass();
        String strO = o(bundle, "chime.client_id");
        if (strO == null) {
            return true;
        }
        return awrc.c(strO, plsVar.a);
    }

    public static final boolean i(int i, plx plxVar) {
        plxVar.getClass();
        return j(nvu.a(plxVar)) == i;
    }

    public static final int j(pcu pcuVar) {
        String strD = pcuVar.d();
        if (strD != null) {
            return strD.hashCode();
        }
        return -1;
    }

    public static final pjw k(StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        return new pjw(statusBarNotification.getId(), statusBarNotification.getTag());
    }

    public static final boolean l(StatusBarNotification statusBarNotification, pxk pxkVar, String str) {
        statusBarNotification.getClass();
        if (awrc.c(g(statusBarNotification), str)) {
            if (a(statusBarNotification) == (pxkVar != null ? pxkVar.a().hashCode() : -1)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean m(StatusBarNotification statusBarNotification, pcu pcuVar) {
        statusBarNotification.getClass();
        return a(statusBarNotification) == j(pcuVar);
    }

    public static final boolean n(StatusBarNotification statusBarNotification, pcu pcuVar, String str) {
        statusBarNotification.getClass();
        pcuVar.getClass();
        return awrc.c(g(statusBarNotification), str) && m(statusBarNotification, pcuVar);
    }

    private static final String o(Bundle bundle, String str) {
        try {
            return bundle.getString(str);
        } catch (Exception e) {
            ((agsj) ((agsj) b.c()).j(e)).t("Failed to get String from Bundle");
            return null;
        }
    }
}
