package defpackage;

import android.accounts.Account;
import android.os.RemoteException;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zzt {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/notification/chime/ChimeIdentityProvider");
    public final awmd b;
    private final awmd c;

    public zzt(awmd awmdVar, awmd awmdVar2) {
        this.c = awmdVar;
        this.b = awmdVar2;
    }

    public final Optional a(zwa zwaVar) {
        try {
            Optional optionalOfNullable = Optional.ofNullable(((omj) this.c.io()).M(zwaVar));
            return true == optionalOfNullable.isPresent() ? Optional.ofNullable(((Account) optionalOfNullable.get()).name) : optionalOfNullable;
        } catch (RemoteException | kmj | kmk e) {
            zvp.b(zvn.b, zvm.h, "Get account failed", e);
            return Optional.empty();
        }
    }
}
