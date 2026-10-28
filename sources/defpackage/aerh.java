package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aerh extends BroadcastReceiver {
    public final awkv a;

    public aerh(awkv awkvVar) {
        this.a = awkvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.os.action.POWER_SAVE_MODE_CHANGED")) {
            Optional optionalOfNullable = Optional.ofNullable((PowerManager) context.getSystemService("power"));
            adyu adyuVar = new adyu(this, 9);
            if (true == optionalOfNullable.isPresent()) {
                Object obj = optionalOfNullable.get();
                Object obj2 = adyuVar.a;
                ((aerh) obj2).a.kk(Boolean.valueOf(((PowerManager) obj).isPowerSaveMode()));
            }
        }
    }
}
