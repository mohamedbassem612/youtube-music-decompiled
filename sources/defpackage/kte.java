package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kte {
    public static final kte a = new kte();
    private kjc b = null;

    public static kjc b(Context context) {
        return a.a(context);
    }

    public final synchronized kjc a(Context context) {
        kjc kjcVar;
        kjcVar = this.b;
        if (kjcVar == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            kjcVar = new kjc(context);
            this.b = kjcVar;
        }
        return kjcVar;
    }
}
