package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eoo extends BroadcastReceiver {
    public eoh a;
    public boolean b = false;
    private final eod c;

    public eoo(eod eodVar) {
        this.c = eodVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        aiof aiofVar;
        if (intent == null) {
            eov.e("ProxyBillingReceiver", "Null intent!");
            return;
        }
        intent.getAction();
        int i = eov.a;
        if (Objects.equals(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION")) {
            if (!intent.hasExtra("RESPONSE_CODE")) {
                eov.e("ProxyBillingReceiver", "Missing RESPONSE_CODE in intent.");
                eod eodVar = this.c;
                if (eodVar != null) {
                    eodVar.d(null, intent.getLongExtra("billingClientTransactionId", 0L));
                    return;
                }
                return;
            }
            eoh eohVarJ = zi.j(intent.getIntExtra("RESPONSE_CODE", 0), 0, ahno.Z(intent.getStringExtra("DEBUG_MESSAGE")));
            this.a = eohVarJ;
            eod eodVar2 = this.c;
            if (eodVar2 != null) {
                eodVar2.d(eohVarJ, intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        if (!Objects.equals(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
            eov.e("ProxyBillingReceiver", "Unexpected broadcast action: ".concat(String.valueOf(intent.getAction())));
            return;
        }
        this.b = true;
        eod eodVar3 = this.c;
        if (eodVar3 != null) {
            long longExtra = intent.getLongExtra("billingClientTransactionId", 0L);
            try {
                aihf aihfVarCreateBuilder = aioe.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aioe aioeVar = (aioe) aihfVarCreateBuilder.instance;
                aioeVar.d = 3;
                aioeVar.b |= 2;
                aihfVarCreateBuilder.aE(aioc.PLAY_BILLING_ACTIVITY_CREATED_ACTION);
                aioe aioeVar2 = (aioe) aihfVarCreateBuilder.build();
                aihf aihfVarCreateBuilder2 = aioi.a.createBuilder();
                if (longExtra == 0) {
                    aiofVar = ((eok) eodVar3).b;
                } else {
                    aihf builder = ((eok) eodVar3).b.toBuilder();
                    builder.copyOnWrite();
                    aiof aiofVar2 = (aiof) builder.instance;
                    aiofVar2.b |= 32;
                    aiofVar2.h = longExtra;
                    aiofVar = (aiof) builder.build();
                }
                aihfVarCreateBuilder2.copyOnWrite();
                aioi aioiVar = (aioi) aihfVarCreateBuilder2.instance;
                aiofVar.getClass();
                aioiVar.e = aiofVar;
                aioiVar.b |= 1;
                aihfVarCreateBuilder2.copyOnWrite();
                aioi aioiVar2 = (aioi) aihfVarCreateBuilder2.instance;
                aioeVar2.getClass();
                aioiVar2.d = aioeVar2;
                aioiVar2.c = 5;
                ((eok) eodVar3).c.a((aioi) aihfVarCreateBuilder2.build());
            } catch (Throwable th) {
                eov.f("BillingLogger", "Unable to log.", th);
            }
        }
    }
}
