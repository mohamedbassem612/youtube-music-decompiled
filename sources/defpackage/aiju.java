package defpackage;

import java.security.PrivilegedExceptionAction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiju implements PrivilegedExceptionAction {
    private final /* synthetic */ int $cid;

    public aiju(int i) {
        this.$cid = i;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Object run() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? a.Y() : a.Y();
        }
        return a.Y();
    }
}
