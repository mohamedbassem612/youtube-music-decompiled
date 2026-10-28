package defpackage;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lef {
    final Context a;
    Boolean b;
    long c;
    kzu d;
    boolean e;
    Long f;
    Long g;
    String h;

    public lef(Context context, kzu kzuVar, Long l, Long l2) {
        this.e = true;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new NullPointerException("null reference");
        }
        this.a = applicationContext;
        this.f = l;
        this.g = l2;
        if (kzuVar != null) {
            this.d = kzuVar;
            this.e = kzuVar.c;
            this.c = kzuVar.b;
            this.h = kzuVar.e;
            Bundle bundle = kzuVar.d;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
