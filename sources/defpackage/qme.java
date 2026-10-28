package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qme {
    public final boolean a;
    public final boolean b;
    public final agkz d;
    private final agek e;
    private volatile String f = null;
    public final boolean c = false;

    public qme(agek agekVar, boolean z, boolean z2, agkz agkzVar) {
        this.e = agekVar;
        this.a = z;
        this.b = z2;
        this.d = agkzVar;
    }

    final String a(Context context) {
        String str = this.f;
        if (str != null) {
            return str;
        }
        String str2 = (String) this.e.apply(context);
        this.f = str2;
        return str2;
    }
}
