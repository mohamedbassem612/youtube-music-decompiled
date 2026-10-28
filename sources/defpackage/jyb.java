package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jyb extends UserRecoverableAuthException {
    public final int a;

    public jyb(int i, String str, Intent intent) {
        super(str, intent, 1);
        this.a = i;
    }
}
