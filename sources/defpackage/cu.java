package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cu extends rj {
    @Override // defpackage.rj
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        ri riVarA = (ri) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = riVarA.b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                czs czsVar = new czs(riVarA.a);
                czsVar.c = null;
                czsVar.b(riVarA.d, riVarA.c);
                riVarA = czsVar.a();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", riVarA);
        if (dd.aa(2)) {
            intent.toString();
        }
        return intent;
    }

    @Override // defpackage.rj
    public final /* synthetic */ Object b(int i, Intent intent) {
        return new ra(i, intent);
    }
}
