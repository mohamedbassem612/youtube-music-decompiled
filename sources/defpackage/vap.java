package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vap implements val {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/selection/NoOpMultiEffectApplicationDelegate");

    @Override // defpackage.val
    public final void a(String str, List list, Map map, Function0 function0) {
        ((agrc) a.c().k("com/google/android/libraries/youtube/creation/effects/selection/NoOpMultiEffectApplicationDelegate", "applyDeselection", 34, "NoOpMultiEffectApplicationDelegate.kt")).w("applyDeselection called on NoOp delegate. AssetId: %s", str);
        function0.invoke();
    }

    @Override // defpackage.val
    public final void b(uzz uzzVar, List list, Map map, Function0 function0) {
        ((agrc) a.c().k("com/google/android/libraries/youtube/creation/effects/selection/NoOpMultiEffectApplicationDelegate", "applySelection", 23, "NoOpMultiEffectApplicationDelegate.kt")).w("applySelection called on NoOp delegate. Request: %s", uzzVar);
        function0.invoke();
    }

    @Override // defpackage.val
    public final void c(Function0 function0) {
        ((agrc) a.c().k("com/google/android/libraries/youtube/creation/effects/selection/NoOpMultiEffectApplicationDelegate", "clearSelection", 39, "NoOpMultiEffectApplicationDelegate.kt")).t("clearSelection called on NoOp delegate.");
        function0.invoke();
    }

    @Override // defpackage.val
    public final void d(String str, List list, Map map, Function0 function0) {
        ((agrc) a.c().k("com/google/android/libraries/youtube/creation/effects/selection/NoOpMultiEffectApplicationDelegate", "clearSelection", 51, "NoOpMultiEffectApplicationDelegate.kt")).w("clearSelection (with entityKey) called on NoOp delegate. EntityKey: %s", str);
        function0.invoke();
    }

    @Override // defpackage.val
    public final void e() {
        ((agrc) a.c().k("com/google/android/libraries/youtube/creation/effects/selection/NoOpMultiEffectApplicationDelegate", "onDestroy", 14, "NoOpMultiEffectApplicationDelegate.kt")).t("onDestroy called on NoOp delegate.");
    }

    @Override // defpackage.val
    public final void g(van vanVar) {
        ((agrc) a.c().k("com/google/android/libraries/youtube/creation/effects/selection/NoOpMultiEffectApplicationDelegate", "onViewCreated", 10, "NoOpMultiEffectApplicationDelegate.kt")).t("onViewCreated called on NoOp delegate.");
    }
}
