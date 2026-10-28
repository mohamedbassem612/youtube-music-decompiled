package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdv implements rjt {
    public static final Set a;

    static {
        Set set = rre.b;
        set.getClass();
        a = atqq.s(set, "https://www.googleapis.com/auth/accounts.reauth");
    }

    @Override // defpackage.rjt
    public final Set a() {
        return a;
    }
}
