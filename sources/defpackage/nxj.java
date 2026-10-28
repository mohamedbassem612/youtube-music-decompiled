package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;
import j$.util.Objects;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nxj {
    public static /* synthetic */ int a(Object obj) {
        Objects.checkIndex(0, 3);
        if (obj instanceof UserRecoverableAuthException) {
            return 0;
        }
        return obj instanceof IOException ? 1 : -2;
    }
}
