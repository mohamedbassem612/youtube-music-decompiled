package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aalh {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/identity/OfflineIdentityListenerRoot");
    private final Set b;

    public aalh(Set set) {
        set.getClass();
        this.b = set;
    }

    public final void a(zwa zwaVar) {
        agqr it = ((agpr) this.b).iterator();
        while (it.hasNext()) {
            try {
                ((aalh) it.next()).a(zwaVar);
            } catch (RuntimeException e) {
                ((agrc) ((agrc) a.b()).j(e).k("com/google/android/libraries/youtube/offline/identity/OfflineIdentityListenerRoot", "onSignIn", 24, "OfflineIdentityListenerRoot.kt")).t("Error while handling sign in event.");
            }
        }
    }

    public final void b() {
        agqr it = ((agpr) this.b).iterator();
        while (it.hasNext()) {
            try {
                ((aalh) it.next()).b();
            } catch (RuntimeException e) {
                ((agrc) ((agrc) a.b()).j(e).k("com/google/android/libraries/youtube/offline/identity/OfflineIdentityListenerRoot", "onSignOut", 34, "OfflineIdentityListenerRoot.kt")).t("Error while handling sign out event.");
            }
        }
    }
}
