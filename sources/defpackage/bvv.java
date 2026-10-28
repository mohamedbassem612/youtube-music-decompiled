package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bvv implements bvw {
    @Override // defpackage.bvw
    public final void a(String str, String str2, Throwable th) {
        Log.e(str, bvx.a(str2, th));
    }

    @Override // defpackage.bvw
    public final void b(String str, String str2, Throwable th) {
        Log.w(str, bvx.a(str2, th));
    }
}
