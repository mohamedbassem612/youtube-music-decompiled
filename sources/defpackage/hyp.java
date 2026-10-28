package defpackage;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyp implements hyi {
    public final Activity a;
    public final agfr b;
    public boolean c;
    public final hhc d = new hhc(this);
    private final agfr e;

    public hyp(Activity activity) {
        activity.getClass();
        this.a = activity;
        this.b = aguu.al(new cbr(this, 10));
        this.e = aguu.al(new cbr(this, 11));
    }

    @Override // defpackage.hyi
    public final anfv a() {
        if (this.c) {
            return (anfv) this.e.io();
        }
        return null;
    }
}
