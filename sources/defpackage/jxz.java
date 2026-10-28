package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jxz {
    public static final String[] b = {"com.google", "com.google.work", "cn.google"};
    public static final String c = "androidPackageName";
    public static final ComponentName d = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final khn e;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        String str = new String[]{"GoogleAuthUtil"}[0];
        if (sb.length() > 1) {
            sb.append(',');
        }
        sb.append(str);
        sb.append("] ");
        e = new khn(sb.toString());
    }

    public static String a(Context context, String str) {
        kro.j(str, "accountName must be provided");
        kro.g("Calling this from your main thread can lead to deadlock");
        e(context);
        return b(context, new Account(str, "com.google"), "^^_account_id_^^", new Bundle());
    }

    public static String b(Context context, Account account, String str, Bundle bundle) {
        j(account);
        return g(context, account, str, bundle).b;
    }

    public static void c(Context context, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        qkh.c(context);
        jij jijVar = new jij(context);
        try {
            kro.g("Calling this from your main thread can lead to deadlock");
            e(context);
            Bundle bundle = new Bundle();
            i(context, bundle);
            d(context, d, new jxw(str, bundle));
            jijVar.f(1707, 0, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
        } catch (Exception e2) {
            jijVar.f(1707, 13, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
            throw e2;
        }
    }

    public static Object d(Context context, ComponentName componentName, jxy jxyVar) throws IOException {
        kln klnVar = new kln();
        kqy kqyVarB = kqy.b(context);
        try {
            try {
                if (!kqyVarB.c(new kqx(componentName), klnVar, "GoogleAuthUtil", null).d()) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    kro.g("BlockingServiceConnection.getService() called on main thread");
                    if (klnVar.a) {
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    }
                    klnVar.a = true;
                    Object objA = jxyVar.a((IBinder) klnVar.b.take());
                    kqyVarB.e(componentName, klnVar);
                    return objA;
                } catch (RemoteException | InterruptedException | TimeoutException e2) {
                    throw new IOException("Error on service connection.", e2);
                }
            } catch (Throwable th) {
                kqyVarB.e(componentName, klnVar);
                throw th;
            }
        } catch (SecurityException e3) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e3.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e3);
        }
    }

    public static void e(Context context) {
        try {
            kml.d(context.getApplicationContext(), 8400000);
        } catch (GooglePlayServicesIncorrectManifestValueException e2) {
            e = e2;
            throw new jxr(e.getMessage(), e);
        } catch (kmj e3) {
            e = e3;
            throw new jxr(e.getMessage(), e);
        } catch (kmk e4) {
            throw new jyb(e4.a, e4.getMessage(), new Intent(e4.b));
        }
    }

    public static Account[] f(Context context) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        qkh.c(context);
        jij jijVar = new jij(context);
        try {
            kro.i("com.google");
            try {
                int i = klu.c;
                kml.d(context, 8400000);
                if (context == null) {
                    throw new NullPointerException("null reference");
                }
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient("com.google.android.gms.auth.accounts");
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
                    }
                    try {
                        try {
                            Bundle bundle = new Bundle();
                            bundle.putString("callingActivity", context instanceof Activity ? ((Activity) context).getComponentName().getClassName() : "");
                            Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("get_accounts", "com.google", bundle);
                            if (bundleCall == null) {
                                throw new RemoteException("Null result from AccountChimeraContentProvider");
                            }
                            Parcelable[] parcelableArrK = aie.k(bundleCall, "accounts", Account.class);
                            if (parcelableArrK == null) {
                                throw new RemoteException("Key_Accounts is Null");
                            }
                            Account[] accountArr = new Account[parcelableArrK.length];
                            for (int i2 = 0; i2 < parcelableArrK.length; i2++) {
                                accountArr[i2] = (Account) parcelableArrK[i2];
                            }
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            jijVar.f(1708, 0, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
                            return accountArr;
                        } catch (Exception e2) {
                            e.j("Exception when getting accounts", e2);
                            throw new RemoteException("Accounts ContentProvider failed: " + e2.getMessage());
                        }
                    } catch (RemoteException e3) {
                        e.j("RemoteException when fetching accounts", e3);
                        throw e3;
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (GooglePlayServicesIncorrectManifestValueException unused) {
                throw new kmj(18);
            }
        } catch (Exception e4) {
            jijVar.f(1708, 13, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
            throw e4;
        }
    }

    public static TokenData g(final Context context, final Account account, final String str, Bundle bundle) throws Exception {
        final long j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        qkh.c(context);
        final jij jijVar = new jij(context);
        try {
            kro.g("Calling this from your main thread can lead to deadlock");
            kro.j(str, "Scope cannot be empty or null.");
            j(account);
            e(context);
            final Bundle bundle2 = new Bundle(bundle);
            i(context, bundle2);
            j = jCurrentTimeMillis;
            try {
                jxy jxyVar = new jxy() { // from class: jxv
                    @Override // defpackage.jxy
                    public final Object a(IBinder iBinder) throws jxr, IOException {
                        jrz jrzVar;
                        jzl jzlVar;
                        String strR;
                        String[] strArr = jxz.b;
                        TokenData tokenData = null;
                        if (iBinder == null) {
                            jrzVar = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                            jrzVar = iInterfaceQueryLocalInterface instanceof jrz ? (jrz) iInterfaceQueryLocalInterface : new jrz(iBinder);
                        }
                        Bundle bundle3 = bundle2;
                        String str2 = str;
                        Account account2 = account;
                        Parcel parcelC = jrzVar.c();
                        gdc.c(parcelC, account2);
                        parcelC.writeString(str2);
                        gdc.c(parcelC, bundle3);
                        Parcel parcelD = jrzVar.d(5, parcelC);
                        Bundle bundle4 = (Bundle) gdc.a(parcelD, Bundle.CREATOR);
                        parcelD.recycle();
                        if (bundle4 == null) {
                            throw new IOException("Service call returned null");
                        }
                        ClassLoader classLoader = TokenData.class.getClassLoader();
                        if (classLoader != null) {
                            bundle4.setClassLoader(classLoader);
                        }
                        Bundle bundle5 = bundle4.getBundle("tokenDetails");
                        if (bundle5 != null) {
                            if (classLoader != null) {
                                bundle5.setClassLoader(classLoader);
                            }
                            tokenData = (TokenData) aie.i(bundle5, "TokenData", TokenData.class);
                        }
                        long j2 = jElapsedRealtime;
                        long j3 = j;
                        jij jijVar2 = jijVar;
                        if (tokenData != null) {
                            jijVar2.f(1709, 0, j3, System.currentTimeMillis(), j2);
                            return tokenData;
                        }
                        String string = bundle4.getString("Error");
                        Intent intent = (Intent) aie.i(bundle4, "userRecoveryIntent", Intent.class);
                        PendingIntent pendingIntent = (PendingIntent) aie.i(bundle4, "userRecoveryPendingIntent", PendingIntent.class);
                        int i = 49500;
                        while (true) {
                            if (i < 50000) {
                                if (i != 495243) {
                                    switch (i) {
                                        case 49500:
                                            strR = "AccountNotPresent";
                                            break;
                                        case 49501:
                                            strR = "AppSuspended";
                                            break;
                                        case 49502:
                                            strR = "InvalidScope";
                                            break;
                                        case 49503:
                                            strR = "NeedPermission";
                                            break;
                                        case 49504:
                                            strR = "NeedRemoteConsent";
                                            break;
                                        case 49505:
                                            strR = "PermissionDenied";
                                            break;
                                        case 49506:
                                            strR = "UnknownError";
                                            break;
                                        default:
                                            switch (i) {
                                                case 49508:
                                                    strR = "ServiceUnavailable";
                                                    break;
                                                case 49509:
                                                    strR = "InvalidRequest";
                                                    break;
                                                case 49510:
                                                    strR = "EmptyConsumerPackageOrSignature";
                                                    break;
                                                case 49511:
                                                    strR = "NeedsTwoFactorAuth";
                                                    break;
                                                case 49512:
                                                    strR = "NeedsBrowser";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 49514:
                                                            strR = "UserCancel";
                                                            break;
                                                        case 49515:
                                                            strR = "RestrictedClient";
                                                            break;
                                                        case 49516:
                                                            strR = "InvalidAudience";
                                                            break;
                                                        case 49517:
                                                            strR = "UnregisteredOnApiConsole";
                                                            break;
                                                        case 49518:
                                                            strR = "ThirdPartyDeviceManagementRequired";
                                                            break;
                                                        case 49519:
                                                            strR = "DeviceManagementInternalError";
                                                            break;
                                                        case 49520:
                                                            strR = "DeviceManagementSyncDisabled";
                                                            break;
                                                        case 49521:
                                                            strR = "DeviceManagementAdminBlocked";
                                                            break;
                                                        case 49522:
                                                            strR = "DeviceManagementAdminPendingApproval";
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 49524:
                                                                    strR = "DeviceManagementDeactivated";
                                                                    break;
                                                                case 49525:
                                                                    strR = "DeviceManagementScreenLockRequired";
                                                                    break;
                                                                case 49526:
                                                                    strR = "DeviceManagementRequired";
                                                                    break;
                                                                case 49527:
                                                                    strR = "DeviceManagementRequiredOrSyncDisabled";
                                                                    break;
                                                                case 49528:
                                                                    strR = "AuthSecurityError";
                                                                    break;
                                                                case 49529:
                                                                    strR = "AuthBindingError";
                                                                    break;
                                                                case 49530:
                                                                    strR = "BadAuthentication";
                                                                    break;
                                                                case 49531:
                                                                    strR = "NetworkError";
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 49754:
                                                                            strR = "CapabilityResponseYes";
                                                                            break;
                                                                        case 49755:
                                                                            strR = "CapabilityResponseNo";
                                                                            break;
                                                                        case 49756:
                                                                            strR = "CapabilityResponseNotPermitted";
                                                                            break;
                                                                        case 49757:
                                                                            strR = "CapabilityResponseRequestFailed";
                                                                            break;
                                                                        case 49758:
                                                                            strR = "CapabilityResponseUnknownCapability";
                                                                            break;
                                                                        case 49759:
                                                                            strR = "CapabilityResponseFailedToSync";
                                                                            break;
                                                                        default:
                                                                            strR = kro.r(i);
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    strR = "DeviceManagementStaleSyncRequired";
                                }
                                if (!strR.equals(string)) {
                                    i++;
                                }
                            } else {
                                i = 13;
                            }
                        }
                        jijVar2.f(1709, i, j3, System.currentTimeMillis(), j2);
                        jzl[] jzlVarArrValues = jzl.values();
                        int length = jzlVarArrValues.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                jzlVar = jzlVarArrValues[i2];
                                if (!jzlVar.al.equals(string)) {
                                    i2++;
                                }
                            } else {
                                jzlVar = jzl.UNKNOWN;
                            }
                        }
                        khn khnVar = jxz.e;
                        khnVar.l(String.format("[GoogleAuthUtil] error status:%s with method:%s", jzlVar, "getTokenWithDetails"));
                        if (!jzl.BAD_AUTHENTICATION.equals(jzlVar) && !jzl.CAPTCHA.equals(jzlVar) && !jzl.NEED_PERMISSION.equals(jzlVar) && !jzl.NEED_REMOTE_CONSENT.equals(jzlVar) && !jzl.NEEDS_BROWSER.equals(jzlVar) && !jzl.USER_CANCEL.equals(jzlVar) && !jzl.DEVICE_MANAGEMENT_REQUIRED.equals(jzlVar) && !jzl.DM_INTERNAL_ERROR.equals(jzlVar) && !jzl.DM_SYNC_DISABLED.equals(jzlVar) && !jzl.DM_ADMIN_BLOCKED.equals(jzlVar) && !jzl.DM_ADMIN_PENDING_APPROVAL.equals(jzlVar) && !jzl.DM_STALE_SYNC_REQUIRED.equals(jzlVar) && !jzl.DM_DEACTIVATED.equals(jzlVar) && !jzl.DM_REQUIRED.equals(jzlVar) && !jzl.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(jzlVar) && !jzl.DM_SCREENLOCK_REQUIRED.equals(jzlVar)) {
                            if (jzl.NETWORK_ERROR.equals(jzlVar) || jzl.SERVICE_UNAVAILABLE.equals(jzlVar) || jzl.INTNERNAL_ERROR.equals(jzlVar) || jzl.AUTH_SECURITY_ERROR.equals(jzlVar)) {
                                throw new IOException(string);
                            }
                            throw new jxr(string);
                        }
                        if (pendingIntent != null && intent != null) {
                            throw UserRecoverableAuthException.a(string, intent);
                        }
                        Context context2 = context;
                        klt kltVar = klt.a;
                        int iA = kml.a(context2);
                        if (iA >= 233800000 && pendingIntent == null) {
                            khnVar.k(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.valueOf(iA), "getTokenWithDetails", 233800000));
                        }
                        if (intent == null) {
                            khnVar.k(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", string, "getTokenWithDetails"));
                        }
                        throw new UserRecoverableAuthException(string, intent, 1);
                    }
                };
                jijVar = jijVar;
                try {
                    return (TokenData) d(context, d, jxyVar);
                } catch (Exception e2) {
                    e = e2;
                    Exception exc = e;
                    jijVar.f(1709, 13, j, System.currentTimeMillis(), jElapsedRealtime);
                    throw exc;
                }
            } catch (Exception e3) {
                e = e3;
                jijVar = jijVar;
            }
        } catch (Exception e4) {
            e = e4;
            j = jCurrentTimeMillis;
        }
    }

    public static void h(Object obj) {
        if (obj != null) {
            return;
        }
        e.l("Service call returned null.");
        throw new IOException("Service unavailable.");
    }

    private static void i(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = c;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    private static void j(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = b;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }
}
