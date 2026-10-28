package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class advl {
    public final adtt a;
    public final Object b;
    public final CharSequence c = null;
    public final View.OnClickListener d;
    public final advm e;

    public advl(adtt adttVar, Object obj, View.OnClickListener onClickListener, advm advmVar) {
        this.a = adttVar;
        this.b = obj;
        this.d = onClickListener;
        this.e = advmVar;
    }

    public final advl a(adtt adttVar) {
        return new advl(adttVar, this.b, this.d, this.e);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("event", this.a);
        ageuVarAc.b("eventId", this.b);
        ageuVarAc.b("onRetry", this.e);
        ageuVarAc.b("onMore", this.d);
        ageuVarAc.b("moreLabel", null);
        return ageuVarAc.toString();
    }
}
