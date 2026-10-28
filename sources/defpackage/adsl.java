package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adsl implements twi {
    private final /* synthetic */ int $cid;

    public /* synthetic */ adsl(int i) {
        this.$cid = i;
    }

    @Override // defpackage.twi
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            ((agrc) ((agrc) ((agrc) adbr.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/rendering/elements/activestate/ActiveStateLifecycleController", "attemptTransition", (char) 189, "ActiveStateLifecycleController.java")).t("Failed to set active state and notify listeners");
        } else if (i != 2) {
            ((agrc) ((agrc) ((agrc) advs.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/rendering/ui/OfflineMenuItemPlaceholderUtil", "maybeResolveOfflineMenuItemsAsync", '+', "OfflineMenuItemPlaceholderUtil.java")).t("Failed to modify offline video menu item");
        }
    }
}
