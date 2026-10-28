package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fvb implements fvd {
    @Override // defpackage.fvd
    public final void a(int i, String str, Throwable th, Map map) {
        if (i - 1 == 2) {
            throw new RuntimeException(str);
        }
    }
}
