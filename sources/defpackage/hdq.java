package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hdq implements zwg {
    public final abvk a;
    private final zwb b;
    private final Handler c;

    public hdq(zwb zwbVar, abvk abvkVar, Handler handler) {
        this.b = zwbVar;
        this.a = abvkVar;
        this.c = handler;
    }

    @Override // defpackage.zwg
    public final void a(zwa zwaVar) {
        if (this.b.u()) {
            return;
        }
        this.c.post(new gnc(this, 20));
    }
}
