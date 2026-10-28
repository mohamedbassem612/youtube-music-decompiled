package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qoj extends qom {
    @Override // defpackage.qom
    protected final int a(Context context, tld tldVar, boolean z) {
        return (((Uri) tldVar.b).getAuthority().lastIndexOf(64) < 0 || api.c(context, "android.permission.INTERACT_ACROSS_USERS", Process.myPid(), Process.myUid(), context.getPackageName()) != 0) ? 3 : 2;
    }
}
