package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abrv {
    public final acdq a;
    public final Context b;
    public final awmd c;
    public final int d;
    public final awmd e;
    public final abrr f;
    public final abmt g;

    public abrv(Context context, awmd awmdVar, acdq acdqVar, int i, awmd awmdVar2, abrr abrrVar, abmt abmtVar) {
        this.b = context;
        this.c = awmdVar;
        this.a = acdqVar;
        this.d = i;
        awmdVar2.getClass();
        this.e = awmdVar2;
        this.f = abrrVar;
        this.g = abmtVar;
    }

    public final PendingIntent a(String str) {
        Intent intent = new Intent();
        Context context = this.b;
        return PendingIntent.getBroadcast(context, 0, intent.setPackage(context.getPackageName()).setAction(str), 201326592);
    }

    public final void b(atr atrVar, int i, int i2, PendingIntent pendingIntent, List list, boolean z) {
        atrVar.g(aag.h(i == 0 ? null : IconCompat.g(null, "", i), atr.c(this.b.getText(i2)), pendingIntent, new Bundle(), null));
        if (z) {
            list.add(Integer.valueOf(atrVar.b.size() - 1));
        }
    }

    public abrv(Context context, awmd awmdVar, acdq acdqVar, int i, awmd awmdVar2, abmt abmtVar) {
        this(context, awmdVar, acdqVar, i, awmdVar2, abrr.a, abmtVar);
    }
}
