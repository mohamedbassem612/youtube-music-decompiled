package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.cardboard.sdk.R;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ens extends BroadcastReceiver {
    final /* synthetic */ aerq a;
    private boolean b;
    private final boolean c;

    public ens(aerq aerqVar, boolean z) {
        this.a = aerqVar;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [eod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [eod, java.lang.Object] */
    private final void d(Bundle bundle, eoh eohVar, int i, aioc aiocVar, long j, boolean z) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            aerq aerqVar = this.a;
            if (byteArray != null) {
                ?? r2 = aerqVar.b;
                ainy ainyVar = (ainy) aihn.parseFrom(ainy.a, bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"));
                zj zjVar = new zj();
                zjVar.a = Long.valueOf(j);
                zjVar.c = Boolean.valueOf(z);
                r2.b(ainyVar, new eoe(zjVar));
            } else {
                ?? r3 = aerqVar.b;
                ainy ainyVarC = eoc.c(23, i, eohVar, null, aiocVar);
                zj zjVar2 = new zj();
                zjVar2.a = Long.valueOf(j);
                zjVar2.c = Boolean.valueOf(z);
                r3.b(ainyVarC, new eoe(zjVar2));
            }
        } catch (Throwable unused) {
            eov.e("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        if (!this.b) {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.c ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.b = true;
        }
    }

    public final synchronized void b(Context context) {
        if (!this.b) {
            eov.e("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.b = false;
        }
    }

    public final synchronized void c(Context context, IntentFilter intentFilter) {
        ens ensVar;
        try {
            try {
                if (this.b) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    ensVar = this;
                    context.registerReceiver(ensVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.c ? 4 : 2);
                } else {
                    ensVar = this;
                    context.registerReceiver(ensVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                ensVar.b = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [eom, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [eod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [eom, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [eod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [eod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [eom, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [eod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [eom, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [eod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [eod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [eod, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        aioc aiocVar;
        int i;
        eoh eohVarC;
        agke agkeVarQ;
        char c;
        int iIntValue;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    aiocVar = aioc.ALTERNATIVE_BILLING_ACTION;
                } else {
                    aiocVar = aioc.BROADCAST_ACTION_UNSPECIFIED;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                aiocVar = aioc.LOCAL_PURCHASES_UPDATED_ACTION;
            } else {
                aiocVar = aioc.BROADCAST_ACTION_UNSPECIFIED;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            aiocVar = aioc.PURCHASES_UPDATED_ACTION;
        } else {
            aiocVar = aioc.BROADCAST_ACTION_UNSPECIFIED;
        }
        aioc aiocVar2 = aiocVar;
        aioc aiocVar3 = aioc.LOCAL_PURCHASES_UPDATED_ACTION;
        if (aiocVar2.equals(aiocVar3) || aiocVar2.equals(aioc.ALTERNATIVE_BILLING_ACTION)) {
            i = 2;
        } else {
            i = aiocVar2.equals(aioc.PURCHASES_UPDATED_ACTION) ? 32 : 1;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            eov.e("BillingBroadcastManager", "Bundle is null.");
            aerq aerqVar = this.a;
            eoh eohVar = eoi.e;
            aerqVar.b.a(eoc.c(11, i, eohVar, null, aiocVar2));
            ?? r0 = aerqVar.d;
            if (r0 != 0) {
                r0.c(eohVar, agpi.a);
                return;
            }
            return;
        }
        char c2 = 0;
        if (i == 2) {
            int i2 = eov.a;
            if (intent == null) {
                eov.e("BillingHelper", "Got null intent!");
                eohVarC = zi.j(6, 0, "An internal error occurred.");
            } else {
                int iA = eov.a(intent.getExtras(), "BillingBroadcastManager");
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    eov.e("BillingBroadcastManager", "Unexpected null bundle received!");
                } else {
                    Object obj = extras2.get("SUB_RESPONSE_CODE");
                    if (obj != null) {
                        if (obj instanceof Integer) {
                            iIntValue = ((Integer) obj).intValue();
                        } else {
                            eov.e("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(String.valueOf(obj.getClass().getName())));
                        }
                    }
                    eohVarC = zi.j(iA, iIntValue, eov.d(intent.getExtras(), "BillingBroadcastManager"));
                }
                iIntValue = 0;
                eohVarC = zi.j(iA, iIntValue, eov.d(intent.getExtras(), "BillingBroadcastManager"));
            }
        } else {
            eohVarC = eov.c(intent, "BillingBroadcastManager");
        }
        long j = extras.getLong("billingClientTransactionId", 0L);
        boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!aiocVar2.equals(aioc.PURCHASES_UPDATED_ACTION) && !aiocVar2.equals(aiocVar3)) {
            if (aiocVar2.equals(aioc.ALTERNATIVE_BILLING_ACTION)) {
                if (eohVarC.a != 0) {
                    d(extras, eohVarC, i, aiocVar2, j, z);
                    agke agkeVar = agpi.a;
                    throw null;
                }
                eov.e("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                aerq aerqVar2 = this.a;
                ainy ainyVarC = eoc.c(153, i, eoi.e, null, aiocVar2);
                zj zjVar = new zj();
                zjVar.a = Long.valueOf(j);
                zjVar.c = Boolean.valueOf(z);
                aerqVar2.b.b(ainyVarC, new eoe(zjVar));
                agke agkeVar2 = agpi.a;
                throw null;
            }
            return;
        }
        eoh eohVar2 = eohVarC;
        if (!extras.getBoolean("IS_FIRST_PARTY_PURCHASE", false)) {
            eov.e("BillingBroadcastManager", "Received 3P purchase in 1P client and no valid 3P listener registered.");
            aerq aerqVar3 = this.a;
            ainy ainyVarC2 = eoc.c(R.styleable.AppCompatTheme_windowMinWidthMajor, i, eoi.e, null, aiocVar2);
            zj zjVar2 = new zj();
            zjVar2.a = Long.valueOf(j);
            zjVar2.c = Boolean.valueOf(z);
            aerqVar3.b.b(ainyVarC2, new eoe(zjVar2));
            return;
        }
        aerq aerqVar4 = this.a;
        ?? r13 = aerqVar4.d;
        if (r13 == 0) {
            eov.e("BillingBroadcastManager", "Received 1P purchase and no valid 1P listener registered.");
            aerq aerqVar5 = this.a;
            ainy ainyVarC3 = eoc.c(123, i, eoi.e, null, aiocVar2);
            zj zjVar3 = new zj();
            zjVar3.a = Long.valueOf(j);
            zjVar3.c = Boolean.valueOf(z);
            aerqVar5.b.b(ainyVarC3, new eoe(zjVar3));
            return;
        }
        if (eohVar2.a != 0) {
            d(extras, eohVar2, i, aiocVar2, j, z);
            r13.c(eohVar2, agpi.a);
            return;
        }
        boolean z2 = extras.getBoolean("IS_EMPTY_PURCHASE_DATA", false);
        ArrayList<String> stringArrayList = extras.getStringArrayList("FIRST_PARTY_PURCHASE_DATA_LIST");
        if (stringArrayList != null) {
            stringArrayList.size();
            agkeVarQ = agke.n(stringArrayList);
        } else {
            String string = extras.getString("FIRST_PARTY_PURCHASE_DATA");
            agkeVarQ = string != null ? agke.q(string) : agpi.a;
        }
        if (!z2 && agkeVarQ.isEmpty()) {
            aerq aerqVar6 = this.a;
            eoh eohVar3 = eoi.e;
            ainy ainyVarC4 = eoc.c(13, i, eohVar3, null, aiocVar2);
            zj zjVar4 = new zj();
            zjVar4.a = Long.valueOf(j);
            zjVar4.c = Boolean.valueOf(z);
            aerqVar6.b.b(ainyVarC4, new eoe(zjVar4));
            eov.e("BillingBroadcastManager", "Couldn't find purchase data in Bundle.");
            aerqVar6.d.c(eohVar3, agpi.a);
            return;
        }
        agjz agjzVar = new agjz(4);
        try {
            agqs agqsVarListIterator = agkeVarQ.listIterator(0);
            while (agqsVarListIterator.hasNext()) {
                c = c2;
                try {
                    agjzVar.h(new eol((String) agqsVarListIterator.next()));
                    c2 = c;
                } catch (JSONException unused) {
                    aerq aerqVar7 = this.a;
                    eoh eohVar4 = eoi.e;
                    ainy ainyVarC5 = eoc.c(14, i, eohVar4, null, aiocVar2);
                    zj zjVar5 = new zj();
                    zjVar5.a = Long.valueOf(j);
                    zjVar5.c = Boolean.valueOf(z);
                    aerqVar7.b.b(ainyVarC5, new eoe(zjVar5));
                    Object[] objArr = new Object[1];
                    objArr[c] = agkeVarQ;
                    eov.e("BillingBroadcastManager", String.format("Parse invalid first party purchase info: [%s]", objArr));
                    aerqVar7.d.c(eohVar4, agpi.a);
                    return;
                }
            }
            ?? r1 = aerqVar4.b;
            ainz ainzVarE = eoc.e(i, aiocVar2);
            zj zjVar6 = new zj();
            zjVar6.a = Long.valueOf(j);
            zjVar6.c = Boolean.valueOf(z);
            r1.c(ainzVarE, new eoe(zjVar6));
            r13.c(eohVar2, agjzVar.g());
        } catch (JSONException unused2) {
            c = c2;
        }
    }
}
