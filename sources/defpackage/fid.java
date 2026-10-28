package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fid extends fkq implements fjy {
    private final AtomicInteger d;

    public fid(int i) {
        super(i);
        this.d = new AtomicInteger(0);
    }

    @Override // defpackage.fvj
    public final Object a(Context context, fvm fvmVar) {
        Object objA;
        synchronized (this) {
            objA = this.b.a();
            this.c = Math.max(0, this.c - 1);
        }
        if (objA != null) {
            return objA;
        }
        this.d.incrementAndGet();
        return fvmVar.y(context);
    }
}
