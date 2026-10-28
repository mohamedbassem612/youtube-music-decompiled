package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qwv {
    protected final qwy c;
    protected final Context d;
    public final boolean e = false;
    public qwu f;

    protected qwv(qwy qwyVar, Context context) {
        this.c = qwyVar;
        this.d = context;
    }

    public abstract void d();

    public final boolean e() {
        return (this.f == null && rjs.d()) ? false : true;
    }
}
