package com.google.android.libraries.families;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.a;
import defpackage.agfe;
import defpackage.agkz;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.ahno;
import defpackage.ahxe;
import defpackage.aihn;
import defpackage.aiik;
import defpackage.awq;
import defpackage.kmm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class FamilyActivity extends Activity {
    private static final agrf a = agrf.h("com/google/android/libraries/families/FamilyActivity");
    private static final agkz b = agkz.q(4, 5);
    private String c;
    private int d;
    private int e;
    private boolean f;
    private long g;
    private String h;
    private String i;
    private String j;

    private final Intent b(int i, String str, int i2, long j, boolean z) {
        Intent intentPutExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", i).putExtra("extra.accountName", str).putExtra("extra.screen.family-app_id", String.valueOf(i2)).putExtra("extra.screen.utmSource", this.h).putExtra("extra.screen.utmMedium", this.i).putExtra("extra.screen.family-session_id", String.valueOf(j));
        awq awqVar = awq.a;
        Intent intentPutExtra2 = intentPutExtra.putExtra("extra.screen.hl", awq.d(LocaleList.getAdjustedDefault()).e());
        if (z) {
            intentPutExtra2.putExtra("extra.themeChoice", 2);
        }
        if (i2 == 4 && this.d == 7) {
            intentPutExtra2.putExtra("extra.screen.family-upgrade_tos_accept_only", "true");
        }
        return intentPutExtra2;
    }

    private final void c(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    private static final int d(int i) {
        switch (i) {
            case 1:
                return 10731;
            case 2:
                return 10052;
            case 3:
            case 8:
                return 10768;
            case 4:
                return 10790;
            case 5:
                return 10793;
            case 6:
                return 10723;
            case 7:
                return 10756;
            default:
                return 0;
        }
    }

    private static final int e(int i) {
        int i2 = i - 1;
        if (i2 != 2) {
            return i2 != 3 ? -4 : -5;
        }
        return -3;
    }

    final void a(int i) {
        c(4, new Intent().putExtra("extra.accountName", this.c).putExtra("errorCode", i));
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        FamilyActivity familyActivity;
        String str;
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (intent != null && (stringExtra = intent.getStringExtra("extra.consistencyToken")) != null) {
            this.j = stringExtra;
        }
        Intent intentPutExtra = new Intent().putExtra("extra.accountName", this.c);
        if (intent != null && (str = this.j) != null) {
            intentPutExtra.putExtra("consistencyToken", str).putExtra("tokenExpirationTimeSecs", 300);
        }
        ahxe ahxeVar = null;
        if (intent != null) {
            String stringExtra2 = intent.getStringExtra("result.familywebviewoutcome");
            if (!TextUtils.isEmpty(stringExtra2)) {
                try {
                    byte[] bArrDecode = Base64.decode(stringExtra2, 0);
                    if (bArrDecode != null) {
                        ahxeVar = (ahxe) aihn.parseFrom(ahxe.a, bArrDecode, ExtensionRegistryLite.getGeneratedRegistry());
                    }
                } catch (aiik | IllegalArgumentException unused) {
                    ((agrc) ((agrc) a.b()).k("com/google/android/libraries/families/FamilyActivity", "deserializedWebviewState", 276, "FamilyActivity.java")).t("Exception caught in deserializedWebviewState");
                }
            }
        }
        switch (this.d) {
            case 1:
            case 3:
            case 4:
            case 7:
                int i3 = i2 == -1 ? 1 : 3;
                if (b.contains(Integer.valueOf(this.e))) {
                    int i4 = this.e;
                    if (i3 == 3 || ahxeVar == null) {
                        c(3, intentPutExtra);
                    } else {
                        int i5 = ahxeVar.b;
                        if ((i5 & 2) == 0) {
                            if (i4 != 4) {
                                if (ahxeVar.c) {
                                    intentPutExtra.putExtra("familyChanged", true);
                                    c(1, intentPutExtra);
                                }
                            } else if (ahxeVar.g || ahxeVar.h) {
                                intentPutExtra.putExtra("familyChanged", true);
                                c(1, intentPutExtra);
                            } else if ((i5 & 8) != 0) {
                                intentPutExtra.putExtra("encryptedBillingSignupParams", ahxeVar.f);
                                c(5, intentPutExtra);
                            }
                            c(3, intentPutExtra);
                        } else {
                            int iAV = a.aV(ahxeVar.d);
                            intentPutExtra.putExtra("errorCode", e(iAV != 0 ? iAV : 1));
                            c(4, intentPutExtra);
                        }
                    }
                } else if (ahxeVar != null) {
                    intentPutExtra.putExtra("familyChanged", ahxeVar.c);
                    if (i2 == -1) {
                        int i6 = ahxeVar.b;
                        if ((i6 & 4) == 0) {
                            familyActivity = this;
                            if ((i6 & 2) != 0) {
                                int iAV2 = a.aV(ahxeVar.d);
                                intentPutExtra.putExtra("errorCode", e(iAV2 != 0 ? iAV2 : 1));
                                familyActivity.c(4, intentPutExtra);
                            }
                        } else {
                            int iAV3 = a.aV(ahxeVar.e);
                            if (iAV3 == 0) {
                                iAV3 = 1;
                            }
                            if (iAV3 - 1 == 3) {
                                this.d = 2;
                                startActivityForResult(b(d(2), this.c, this.e, this.g, this.f), 1);
                            }
                        }
                    } else {
                        familyActivity = this;
                    }
                    familyActivity.c(i3, intentPutExtra);
                } else {
                    intentPutExtra.putExtra("familyChanged", false);
                    c(i3, intentPutExtra);
                }
                break;
            case 2:
            case 8:
                intentPutExtra.putExtra("familyChanged", true);
                c(1, intentPutExtra);
                break;
            case 5:
            case 6:
                c(1, intentPutExtra);
                break;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (!kmm.a(this).b(getCallingPackage())) {
            a(-2);
            return;
        }
        Intent intent = getIntent();
        if (!intent.hasExtra("extra.accountName") || !intent.hasExtra("flowType") || !intent.hasExtra("appId")) {
            a(-1);
            return;
        }
        this.c = getIntent().getStringExtra("extra.accountName");
        this.d = getIntent().getIntExtra("flowType", 0);
        this.e = getIntent().getIntExtra("appId", 0);
        this.f = getIntent().getBooleanExtra("darkModeOverride", false);
        String stringExtra = getIntent().getStringExtra("utmSource");
        this.h = stringExtra;
        if (ahno.aa(stringExtra)) {
            int i = this.e;
            if (i == 1) {
                str = "googleaccount";
            } else if (i == 14) {
                str = "googlesettings";
            } else if (i != 16) {
                str = i != 17 ? "familylibrary" : "fitbit-ace-companion";
            } else {
                str = "youtubetwoperson";
            }
            this.h = str;
        }
        String stringExtra2 = getIntent().getStringExtra("utmMedium");
        this.i = stringExtra2;
        if (ahno.aa(stringExtra2)) {
            this.i = "default";
        }
        int iD = d(this.d);
        if (iD == 0) {
            a(-1);
            return;
        }
        long jNextInt = agfe.a.nextInt();
        this.g = jNextInt;
        startActivityForResult(b(iD, this.c, this.e, jNextInt, this.f), 1);
    }
}
