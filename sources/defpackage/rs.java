package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rs extends rj {
    @Override // defpackage.rj
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        ri riVar = (ri) obj;
        riVar.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", riVar);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.rj
    public final /* synthetic */ Object b(int i, Intent intent) {
        return new ra(i, intent);
    }
}
