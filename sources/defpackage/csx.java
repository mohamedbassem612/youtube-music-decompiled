package defpackage;

import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class csx extends clm {
    public final int c;
    public final boolean d;

    public csx(Throwable th, clo cloVar, Surface surface) {
        super(th, cloVar);
        this.c = System.identityHashCode(surface);
        boolean z = true;
        if (surface != null && !surface.isValid()) {
            z = false;
        }
        this.d = z;
    }
}
