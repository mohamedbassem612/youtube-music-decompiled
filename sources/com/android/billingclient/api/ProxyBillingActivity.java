package com.android.billingclient.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;
import defpackage.a;
import defpackage.aihf;
import defpackage.aiof;
import defpackage.aioj;
import defpackage.avg;
import defpackage.eoc;
import defpackage.eod;
import defpackage.eoh;
import defpackage.eok;
import defpackage.eoo;
import defpackage.eov;
import defpackage.zi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ProxyBillingActivity extends Activity {
    eoo a;
    eod b;
    private ResultReceiver c;
    private boolean d;
    private boolean e;
    private int f;
    private long g;
    private boolean h;

    private final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    private final synchronized void b() {
        try {
            this.a = new eoo(this.b);
            IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
            intentFilter.addAction("com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION");
            avg.f(this, this.a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", 2);
        } catch (NoSuchMethodError | RuntimeException e) {
            this.a = null;
            boolean z = e instanceof NoSuchMethodError;
            eod eodVar = this.b;
            if (z) {
                aihf aihfVarCreateBuilder = aioj.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aioj aiojVar = (aioj) aihfVarCreateBuilder.instance;
                aiojVar.c = 1;
                aiojVar.b |= 1;
                eodVar.e((aioj) aihfVarCreateBuilder.build());
            } else {
                aihf aihfVarCreateBuilder2 = aioj.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                aioj aiojVar2 = (aioj) aihfVarCreateBuilder2.instance;
                aiojVar2.c = 0;
                aiojVar2.b |= 1;
                eodVar.e((aioj) aihfVarCreateBuilder2.build());
            }
            eov.f("ProxyBillingActivity", "Failed to register receiver.", e);
        }
    }

    private final boolean c() {
        return this.a != null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    private final Intent d(int i, long j, boolean z) {
        eoh eohVar;
        Intent intentA = a();
        if (!z) {
            intentA.putExtra("RESPONSE_CODE", 6);
            intentA.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            intentA.putExtra("FAILURE_LOGGING_PAYLOAD", eoc.b(i, 2, zi.j(6, 0, "An internal error occurred.")).toByteArray());
        } else if (c() && (eohVar = this.a.a) != null) {
            intentA.putExtra("RESPONSE_CODE", eohVar.a);
            intentA.putExtra("DEBUG_MESSAGE", eohVar.c);
        } else if (!c() || this.a.b) {
            intentA.putExtra("RESPONSE_CODE", 6);
            intentA.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            intentA.putExtra("FAILURE_LOGGING_PAYLOAD", eoc.b(i, 2, zi.j(6, 0, "An internal error occurred.")).toByteArray());
        } else {
            intentA.putExtra("RESPONSE_CODE", 3);
            intentA.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
            intentA.putExtra("FAILURE_LOGGING_PAYLOAD", eoc.b(154, 2, zi.j(3, 0, "Play Store is blocked.")).toByteArray());
        }
        intentA.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentA.putExtra("billingClientTransactionId", j);
        intentA.putExtra("wasServiceAutoReconnected", this.h);
        return intentA;
    }

    private static final int e(int i, Intent intent) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return 22;
            }
            return i == 5 ? 151 : 1;
        }
        if (i == -1) {
            return R.styleable.AppCompatTheme_windowMinWidthMinor;
        }
        if (i == 0) {
            return R.styleable.AppCompatTheme_windowNoTitle;
        }
        if (i != 3) {
            return i != 4 ? 127 : 147;
        }
        return 146;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[PHI: r11
      0x0062: PHI (r11v1 int) = (r11v0 int), (r11v15 int) binds: [B:28:0x005d, B:30:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e5  */
    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        int iB;
        int i3;
        String string;
        Intent intentA;
        boolean z2;
        int i4;
        ResultReceiver resultReceiver;
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            iB = eov.b(intent, "ProxyBillingActivity");
            i3 = -1;
            if (i2 != -1) {
                eov.e("ProxyBillingActivity", a.bQ(iB, i2, "Activity finished with resultCode ", " and billing's responseCode: "));
                i3 = i2;
            } else if (iB != 0) {
                i2 = -1;
                eov.e("ProxyBillingActivity", a.bQ(iB, i2, "Activity finished with resultCode ", " and billing's responseCode: "));
                i3 = i2;
            }
            if (true != z) {
                eov.e("ProxyBillingActivity", a.ci((byte) 33, i3, "Got null data with resultCode "));
            } else if (intent.getExtras() == null) {
                eov.e("ProxyBillingActivity", "Got null bundle!");
            }
            if (e(i3, intent) != 1) {
                int iE = e(i3, intent);
                long j = this.g;
                if (intent == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intentA = d(iE, j, z2);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent2.setPackage(getApplicationContext().getPackageName());
                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentA = intent2;
                } else {
                    intentA = a();
                    intentA.putExtras(intent.getExtras());
                    intentA.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentA.putExtra("billingClientTransactionId", this.g);
                intentA.putExtra("wasServiceAutoReconnected", this.h);
            }
            if (i == 110) {
                intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentA);
        } else if (i == 110) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            iB = eov.b(intent, "ProxyBillingActivity");
            i3 = -1;
            if (i2 != -1) {
                eov.e("ProxyBillingActivity", a.bQ(iB, i2, "Activity finished with resultCode ", " and billing's responseCode: "));
                i3 = i2;
            } else if (iB != 0) {
                i2 = -1;
                eov.e("ProxyBillingActivity", a.bQ(iB, i2, "Activity finished with resultCode ", " and billing's responseCode: "));
                i3 = i2;
            }
            if (true != z) {
                eov.e("ProxyBillingActivity", a.ci((byte) 33, i3, "Got null data with resultCode "));
            } else if (intent.getExtras() == null) {
                eov.e("ProxyBillingActivity", "Got null bundle!");
            }
            if (e(i3, intent) != 1) {
                int iE2 = e(i3, intent);
                long j2 = this.g;
                if (intent == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intentA = d(iE2, j2, z2);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent3 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent3.setPackage(getApplicationContext().getPackageName());
                    intent3.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentA = intent3;
                } else {
                    intentA = a();
                    intentA.putExtras(intent.getExtras());
                    intentA.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentA.putExtra("billingClientTransactionId", this.g);
                intentA.putExtra("wasServiceAutoReconnected", this.h);
            }
            if (i == 110) {
                intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentA);
        } else if (i == 101) {
            int i5 = eov.a;
            if (intent == null) {
                eov.e("ProxyBillingActivity", "Got null intent!");
                intent = null;
            } else {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    eov.e("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i4 = extras2.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                }
                resultReceiver = this.c;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i4, extras);
                }
            }
            i4 = 0;
            resultReceiver = this.c;
            if (resultReceiver != null) {
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                resultReceiver.send(i4, extras);
            }
        } else {
            eov.e("ProxyBillingActivity", a.bP(i, "Got onActivityResult with wrong requestCode: ", "; skipping..."));
        }
        this.d = false;
        if (c()) {
            this.a.a = null;
        }
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:29:0x0113  */
    /* JADX WARN: Code duplicated, block: B:32:0x011e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0134  */
    /* JADX WARN: Code duplicated, block: B:38:0x0142  */
    /* JADX WARN: Code duplicated, block: B:40:0x014b  */
    /* JADX WARN: Code duplicated, block: B:41:0x014f  */
    /* JADX WARN: Code duplicated, block: B:43:0x015b  */
    /* JADX WARN: Code duplicated, block: B:49:0x016d A[Catch: SendIntentException -> 0x01a3, TryCatch #0 {SendIntentException -> 0x01a3, blocks: (B:47:0x0165, B:49:0x016d, B:55:0x0190, B:50:0x017b, B:52:0x0181), top: B:76:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x017b A[Catch: SendIntentException -> 0x01a3, TryCatch #0 {SendIntentException -> 0x01a3, blocks: (B:47:0x0165, B:49:0x016d, B:55:0x0190, B:50:0x017b, B:52:0x0181), top: B:76:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0181 A[Catch: SendIntentException -> 0x01a3, TryCatch #0 {SendIntentException -> 0x01a3, blocks: (B:47:0x0165, B:49:0x016d, B:55:0x0190, B:50:0x017b, B:52:0x0181), top: B:76:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x018f  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x0201  */
    /* JADX WARN: Code duplicated, block: B:76:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        boolean zContainsKey;
        int i;
        PendingIntent pendingIntent;
        Bundle bundle2;
        Bundle bundle3;
        ResultReceiver resultReceiver;
        Intent intentD;
        super.onCreate(bundle);
        if (bundle == null) {
            if (getIntent() != null) {
                zContainsKey = getIntent().hasExtra("IN_APP_MESSAGE_INTENT");
            } else {
                try {
                    i = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e) {
                    eov.f("ProxyBillingActivity", "Failed to get package info for current package.", e);
                    i = -1;
                }
                if (this.b == null) {
                    Context applicationContext = getApplicationContext();
                    aihf aihfVarCreateBuilder = aiof.a.createBuilder();
                    String packageName = getPackageName();
                    aihfVarCreateBuilder.copyOnWrite();
                    aiof aiofVar = (aiof) aihfVarCreateBuilder.instance;
                    packageName.getClass();
                    aiofVar.b |= 4;
                    aiofVar.e = packageName;
                    aihfVarCreateBuilder.copyOnWrite();
                    aiof aiofVar2 = (aiof) aihfVarCreateBuilder.instance;
                    aiofVar2.b |= 1;
                    aiofVar2.c = "9.2.0";
                    aihfVarCreateBuilder.copyOnWrite();
                    aiof aiofVar3 = (aiof) aihfVarCreateBuilder.instance;
                    aiofVar3.b |= SemanticState.Hidden;
                    aiofVar3.k = i;
                    int i2 = Build.VERSION.SDK_INT;
                    aihfVarCreateBuilder.copyOnWrite();
                    aiof aiofVar4 = (aiof) aihfVarCreateBuilder.instance;
                    aiofVar4.b |= SemanticState.Focused;
                    aiofVar4.j = i2;
                    aihfVarCreateBuilder.copyOnWrite();
                    aiof aiofVar5 = (aiof) aihfVarCreateBuilder.instance;
                    aiofVar5.b |= SemanticState.LiveRegion;
                    aiofVar5.l = 1000342775L;
                    this.b = new eok(applicationContext, (aiof) aihfVarCreateBuilder.build());
                }
                b();
            }
            if (bundle == null) {
                int i3 = eov.a;
                this.d = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
                if (bundle.containsKey("in_app_message_result_receiver")) {
                    this.c = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
                }
                this.e = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
                this.f = bundle.getInt("activity_code", 100);
                if (bundle.containsKey("billingClientTransactionId")) {
                    this.g = bundle.getLong("billingClientTransactionId");
                }
                if (bundle.containsKey("wasServiceAutoReconnected")) {
                    this.h = bundle.getBoolean("wasServiceAutoReconnected");
                    return;
                }
                return;
            }
            int i4 = eov.a;
            this.f = 100;
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.e = true;
                    this.f = 110;
                }
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.c = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                this.f = 101;
            } else {
                pendingIntent = null;
            }
            if (getIntent().hasExtra("billingClientTransactionId")) {
                this.g = getIntent().getLongExtra("billingClientTransactionId", 0L);
            }
            if (getIntent().hasExtra("wasServiceAutoReconnected")) {
                this.h = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
            }
            if (pendingIntent == null) {
                eov.e("ProxyBillingActivity", "PendingIntent is null, cannot launch flow.");
                resultReceiver = this.c;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                } else {
                    intentD = d(134, this.g, false);
                    if (this.e) {
                        intentD.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    sendBroadcast(intentD);
                }
                finish();
                return;
            }
            try {
                this.d = true;
                if (Build.VERSION.SDK_INT >= 36) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                    } else {
                        bundle2 = null;
                    }
                    startIntentSenderForResult(pendingIntent.getIntentSender(), this.f, new Intent(), 0, 0, 0, bundle2);
                }
                bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
                bundle2 = bundle3;
                startIntentSenderForResult(pendingIntent.getIntentSender(), this.f, new Intent(), 0, 0, 0, bundle2);
            } catch (IntentSender.SendIntentException e2) {
                eov.f("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e2);
                ResultReceiver resultReceiver2 = this.c;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentD2 = d(149, this.g, false);
                    if (this.e) {
                        intentD2.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    sendBroadcast(intentD2);
                }
                this.d = false;
                finish();
                return;
            }
        }
        zContainsKey = bundle.containsKey("in_app_message_result_receiver");
        if (!zContainsKey) {
            i = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            if (this.b == null) {
                Context applicationContext2 = getApplicationContext();
                aihf aihfVarCreateBuilder2 = aiof.a.createBuilder();
                String packageName2 = getPackageName();
                aihfVarCreateBuilder2.copyOnWrite();
                aiof aiofVar6 = (aiof) aihfVarCreateBuilder2.instance;
                packageName2.getClass();
                aiofVar6.b |= 4;
                aiofVar6.e = packageName2;
                aihfVarCreateBuilder2.copyOnWrite();
                aiof aiofVar7 = (aiof) aihfVarCreateBuilder2.instance;
                aiofVar7.b |= 1;
                aiofVar7.c = "9.2.0";
                aihfVarCreateBuilder2.copyOnWrite();
                aiof aiofVar8 = (aiof) aihfVarCreateBuilder2.instance;
                aiofVar8.b |= SemanticState.Hidden;
                aiofVar8.k = i;
                int i5 = Build.VERSION.SDK_INT;
                aihfVarCreateBuilder2.copyOnWrite();
                aiof aiofVar9 = (aiof) aihfVarCreateBuilder2.instance;
                aiofVar9.b |= SemanticState.Focused;
                aiofVar9.j = i5;
                aihfVarCreateBuilder2.copyOnWrite();
                aiof aiofVar10 = (aiof) aihfVarCreateBuilder2.instance;
                aiofVar10.b |= SemanticState.LiveRegion;
                aiofVar10.l = 1000342775L;
                this.b = new eok(applicationContext2, (aiof) aihfVarCreateBuilder2.build());
            }
            b();
        }
        if (bundle == null) {
            int i6 = eov.a;
            this.d = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.c = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.e = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.g = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.h = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        int i7 = eov.a;
        this.f = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT")) {
                this.e = true;
                this.f = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.c = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.g = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.h = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        if (pendingIntent == null) {
            eov.e("ProxyBillingActivity", "PendingIntent is null, cannot launch flow.");
            resultReceiver = this.c;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                intentD = d(134, this.g, false);
                if (this.e) {
                    intentD.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentD);
            }
            finish();
            return;
        }
        this.d = true;
        if (Build.VERSION.SDK_INT >= 36) {
            if (Build.VERSION.SDK_INT >= 34) {
                bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
            } else {
                bundle2 = null;
            }
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f, new Intent(), 0, 0, 0, bundle2);
        }
        bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
        bundle2 = bundle3;
        startIntentSenderForResult(pendingIntent.getIntentSender(), this.f, new Intent(), 0, 0, 0, bundle2);
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        eoh eohVar;
        super.onDestroy();
        if (c()) {
            eoo eooVar = this.a;
            eohVar = eooVar.a;
            try {
                unregisterReceiver(eooVar);
            } catch (RuntimeException e) {
                eov.f("ProxyBillingActivity", "Failed to unregister receiver.", e);
            }
        } else {
            eohVar = null;
        }
        if (isFinishing() && this.d) {
            Intent intentA = a();
            if (eohVar != null) {
                intentA.putExtra("RESPONSE_CODE", eohVar.a);
                intentA.putExtra("DEBUG_MESSAGE", eohVar.c);
            } else {
                intentA.putExtra("RESPONSE_CODE", 1);
                intentA.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.e) {
                intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.f;
            if (i == 110 || i == 100) {
                intentA.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentA.putExtra("billingClientTransactionId", this.g);
            }
            sendBroadcast(intentA);
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.c;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.d);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.e);
        bundle.putInt("activity_code", this.f);
        bundle.putLong("billingClientTransactionId", this.g);
        bundle.putBoolean("wasServiceAutoReconnected", this.h);
    }
}
