package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klt extends klu {
    private static volatile Boolean f;
    private kqb g;
    private static final Object e = new Object();
    public static final klt a = new klt();
    public static final int b = klu.c;

    public final Dialog a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return h(activity, i, new kql(n(activity, i, "d"), activity, i2), onCancelListener, null);
    }

    public final PendingIntent b(Context context, klo kloVar) {
        return kloVar.c() ? kloVar.a() : super.o(context, kloVar.c, null);
    }

    public final lpa c(knd kndVar, knd... kndVarArr) {
        return d(lpd.a, kndVar, kndVarArr);
    }

    public final lpa d(Executor executor, knd kndVar, knd... kndVarArr) {
        koq koqVar;
        if (kndVar == null) {
            throw new NullPointerException("Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(kndVar);
        arrayList.addAll(Arrays.asList(kndVarArr));
        synchronized (koq.c) {
            koqVar = koq.d;
            if (koqVar == null) {
                throw new NullPointerException("Must guarantee manager is non-null before using getInstance");
            }
        }
        knv knvVar = new knv(arrayList);
        Handler handler = koqVar.q;
        handler.sendMessage(handler.obtainMessage(2, knvVar));
        kjc kjcVar = knvVar.c;
        return ((lpa) kjcVar.a).d(executor, new klr());
    }

    public final void e(Context context, klo kloVar, boolean z) {
        Integer num = kloVar.e;
        kqa kqaVar = new kqa(num == null ? -1 : num.intValue(), context.getPackageName(), System.currentTimeMillis(), kloVar.c, z);
        if (this.g == null) {
            this.g = new ksh(context);
        }
        this.g.a(kqaVar);
    }

    public final void f(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof cf) {
                dd supportFragmentManager = ((cf) activity).getSupportFragmentManager();
                kmn kmnVar = new kmn();
                kro.m(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                kmnVar.k = dialog;
                if (onCancelListener != null) {
                    kmnVar.l = onCancelListener;
                }
                kmnVar.gT(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        klp klpVar = new klp();
        kro.m(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        klpVar.a = dialog;
        if (onCancelListener != null) {
            klpVar.b = onCancelListener;
        }
        klpVar.show(fragmentManager, str);
    }

    public final boolean g(int i) {
        if (i != 9) {
            switch (i) {
                default:
                    switch (i) {
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                            break;
                        default:
                            return false;
                    }
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    public final Dialog h(Context context, int i, kqo kqoVar, DialogInterface.OnCancelListener onCancelListener, Bundle bundle) {
        String strB;
        Resources resources;
        String string;
        String strC;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        int i2 = kqh.a;
        if (bundle != null) {
            strB = bundle.getString("errorText");
            if (TextUtils.isEmpty(strB)) {
                strB = kqh.b(context, i);
            }
        } else {
            strB = kqh.b(context, i);
        }
        builder.setMessage(strB);
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        if (bundle != null) {
            string = bundle.getString("buttonText");
            if (TextUtils.isEmpty(string)) {
                resources = context.getResources();
                if (i != 1) {
                    string = resources.getString(com.google.android.apps.youtube.music.R.string.common_google_play_services_install_button);
                } else if (i != 2) {
                    string = resources.getString(com.google.android.apps.youtube.music.R.string.common_google_play_services_update_button);
                } else if (i != 3) {
                    string = resources.getString(R.string.ok);
                } else {
                    string = resources.getString(com.google.android.apps.youtube.music.R.string.common_google_play_services_enable_button);
                }
            }
        } else {
            resources = context.getResources();
            if (i != 1) {
                string = resources.getString(com.google.android.apps.youtube.music.R.string.common_google_play_services_install_button);
            } else if (i != 2) {
                string = resources.getString(com.google.android.apps.youtube.music.R.string.common_google_play_services_update_button);
            } else if (i != 3) {
                string = resources.getString(R.string.ok);
            } else {
                string = resources.getString(com.google.android.apps.youtube.music.R.string.common_google_play_services_enable_button);
            }
        }
        if (string != null) {
            builder.setPositiveButton(string, kqoVar);
        }
        if (bundle != null) {
            strC = bundle.getString("errorTitle");
            if (TextUtils.isEmpty(strC)) {
                strC = kqh.c(context, i);
            }
        } else {
            strC = kqh.c(context, i);
        }
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final void i(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogA = a(activity, i, i2, onCancelListener);
        if (dialogA != null) {
            f(activity, dialogA, "GooglePlayServicesErrorDialog", onCancelListener);
        }
    }

    public final void j(Context context, int i) {
        k(context, new klo(1, i, super.o(context, i, "n"), null, null, null));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    public final void k(Context context, klo kloVar) {
        String strC;
        String strD;
        String string;
        int i;
        Object obj = e;
        synchronized (obj) {
            if (f == null) {
                f = Boolean.FALSE;
            }
        }
        int i2 = kloVar.c;
        f.booleanValue();
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, methodKey=%d, tag=%s", Integer.valueOf(i2), kloVar.e, null), new IllegalArgumentException());
        if (i2 == 18) {
            new kls(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        PendingIntent pendingIntentB = b(context, kloVar);
        if (pendingIntentB == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        Bundle bundle = kloVar.f;
        int i3 = kqh.a;
        if (bundle != null) {
            strC = bundle.getString("notificationTitle");
            if (TextUtils.isEmpty(strC)) {
                if (i2 == 6) {
                    strC = kqh.e(context, "common_google_play_services_resolution_required_title");
                    i2 = 6;
                } else {
                    strC = kqh.c(context, i2);
                }
                if (strC == null) {
                    strC = context.getResources().getString(com.google.android.apps.youtube.music.R.string.common_google_play_services_try_again_title);
                }
            }
        } else {
            if (i2 == 6) {
                strC = kqh.e(context, "common_google_play_services_resolution_required_title");
                i2 = 6;
            } else {
                strC = kqh.c(context, i2);
            }
            if (strC == null) {
                strC = context.getResources().getString(com.google.android.apps.youtube.music.R.string.common_google_play_services_try_again_title);
            }
        }
        if (bundle != null) {
            strD = bundle.getString("notificationText");
            if (TextUtils.isEmpty(strD)) {
                if (i2 != 6 || i2 == 19) {
                    strD = kqh.d(context, "common_google_play_services_resolution_required_text", kqh.a(context));
                } else {
                    strD = kqh.b(context, i2);
                }
            }
        } else if (i2 != 6) {
            strD = kqh.d(context, "common_google_play_services_resolution_required_text", kqh.a(context));
        } else {
            strD = kqh.d(context, "common_google_play_services_resolution_required_text", kqh.a(context));
        }
        if (bundle != null) {
            string = bundle.getString("notificationTicker");
            if (TextUtils.isEmpty(string)) {
                string = context.getResources().getString(com.google.android.apps.youtube.music.R.string.common_google_play_services_notification_ticker);
            }
        } else {
            string = context.getResources().getString(com.google.android.apps.youtube.music.R.string.common_google_play_services_notification_ticker);
        }
        Object systemService = context.getSystemService("notification");
        kro.l(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        atr atrVar = new atr(context, null);
        atrVar.w = true;
        atrVar.e(16, true);
        atrVar.l(strC);
        atq atqVar = new atq();
        atqVar.c(strD);
        atrVar.r(atqVar);
        boolean zC = kss.c(context);
        int i4 = R.drawable.stat_sys_warning;
        if (zC) {
            int i5 = context.getApplicationInfo().icon;
            if (i5 != 0) {
                i4 = i5;
            }
            atrVar.q(i4);
            atrVar.l = 2;
            if (kss.e(context)) {
                atrVar.f(com.google.android.apps.youtube.music.R.drawable.common_full_open_on_phone, context.getResources().getString(com.google.android.apps.youtube.music.R.string.common_open_on_phone), pendingIntentB);
            } else {
                atrVar.h = pendingIntentB;
            }
        } else {
            atrVar.q(R.drawable.stat_sys_warning);
            atrVar.t(string);
            atrVar.v(System.currentTimeMillis());
            atrVar.h = pendingIntentB;
            atrVar.k(strD);
        }
        synchronized (obj) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string2 = context.getResources().getString(com.google.android.apps.youtube.music.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string2, 4));
        } else if (!string2.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string2);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        atrVar.E = "com.google.android.gms.availability";
        Notification notificationA = atrVar.a();
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 21) {
            kml.c.set(false);
            i = 10436;
        } else {
            i = 39789;
        }
        notificationManager.notify(i, notificationA);
        e(context, kloVar, false);
    }
}
