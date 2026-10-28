package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agdc extends agfx {
    @Override // defpackage.agfx
    public final long a() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
