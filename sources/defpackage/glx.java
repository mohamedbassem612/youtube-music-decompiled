package defpackage;

import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class glx {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/blocks/BlocksRegistrar");

    public static final void a(adwq adwqVar, Consumer consumer) {
        agfr agfrVar = adwqVar.b;
        if (agfrVar instanceof max) {
            ((max) agfrVar).c(consumer);
            return;
        }
        maw mawVar = adwqVar.a;
        if (mawVar instanceof mav) {
            consumer.r(mawVar);
        } else {
            ((agrc) a.c().k("com/google/android/apps/youtube/music/blocks/BlocksRegistrar", "registerBlock", 35, "BlocksRegistrar.kt")).t("Lazy block registration failed because the SectionListContext is not configured with a BlockRegistrySupplier or BlockRegistry.");
        }
    }
}
