package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgk {
    public static final agke a = agke.A("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static final String a(ahfr ahfrVar, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < ahfrVar.getNumber()) ? "0" : String.valueOf(str.charAt(ahfrVar.getNumber() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= ahfrVar.getNumber()) {
            strValueOf = String.valueOf(str2.charAt(ahfrVar.getNumber() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean b(ahfr ahfrVar, agkj agkjVar, agkj agkjVar2, agkz agkzVar, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        char c;
        lgj lgjVar;
        int iD = d(ahfrVar);
        if (iD > 0 && (i2 != 1 || i != 1)) {
            cArr[iD] = '2';
        }
        if (c(ahfrVar, agkjVar2) == ahfs.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (ahfrVar == ahfr.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && agkzVar.contains(str)) {
                if (iD <= 0 || cArr[iD] == '2') {
                    return true;
                }
                cArr[iD] = '1';
                return true;
            }
            if (!agkjVar.containsKey(ahfrVar) || (lgjVar = (lgj) agkjVar.get(ahfrVar)) == null) {
                c = '0';
            } else {
                int iOrdinal = lgjVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return c(ahfrVar, agkjVar2) == ahfs.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? f(ahfrVar, cArr, str3, z2) : e(ahfrVar, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return c(ahfrVar, agkjVar2) == ahfs.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? e(ahfrVar, cArr, str2, z) : f(ahfrVar, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (c(ahfrVar, agkjVar2) != ahfs.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return f(ahfrVar, cArr, str3, z2);
                    }
                } else if (c(ahfrVar, agkjVar2) != ahfs.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return e(ahfrVar, cArr, str2, z);
                }
                c = '8';
            }
        }
        if (iD > 0 && cArr[iD] != '2') {
            cArr[iD] = c;
        }
        return false;
    }

    private static final ahfs c(ahfr ahfrVar, agkj agkjVar) {
        return (ahfs) agkjVar.getOrDefault(ahfrVar, ahfs.PURPOSE_RESTRICTION_UNDEFINED);
    }

    private static final int d(ahfr ahfrVar) {
        if (ahfrVar == ahfr.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (ahfrVar == ahfr.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (ahfrVar == ahfr.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return ahfrVar == ahfr.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final boolean e(ahfr ahfrVar, char[] cArr, String str, boolean z) {
        char c;
        int iD = d(ahfrVar);
        boolean z2 = false;
        if (z) {
            if (str.length() < ahfrVar.getNumber()) {
                c = '0';
            } else {
                char cCharAt = str.charAt(ahfrVar.getNumber() - 1);
                z2 = cCharAt == '1';
                if (iD > 0 && cArr[iD] != '2') {
                    cArr[iD] = cCharAt != '1' ? '6' : '1';
                }
            }
            return z2;
        }
        c = '4';
        if (iD > 0 && cArr[iD] != '2') {
            cArr[iD] = c;
        }
        return z2;
    }

    private static final boolean f(ahfr ahfrVar, char[] cArr, String str, boolean z) {
        char c;
        int iD = d(ahfrVar);
        boolean z2 = false;
        if (z) {
            if (str.length() < ahfrVar.getNumber()) {
                c = '0';
            } else {
                char cCharAt = str.charAt(ahfrVar.getNumber() - 1);
                z2 = cCharAt == '1';
                if (iD > 0 && cArr[iD] != '2') {
                    cArr[iD] = cCharAt != '1' ? '7' : '1';
                }
            }
            return z2;
        }
        c = '5';
        if (iD > 0 && cArr[iD] != '2') {
            cArr[iD] = c;
        }
        return z2;
    }
}
