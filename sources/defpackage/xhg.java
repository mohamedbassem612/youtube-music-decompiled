package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class xhg {
    private static final agrf e = agrf.h("com/google/android/libraries/youtube/logging/interaction/features/InteractionLoggingContext");
    public xgz c;
    public amdd d;
    public xgn b = xgn.l;
    public Optional a = Optional.empty();

    public final void a(xgn xgnVar) {
        if (xgnVar == null) {
            ((agrc) ((agrc) e.b()).k("com/google/android/libraries/youtube/logging/interaction/features/InteractionLoggingContext", "putInteractionLogger", 39, "InteractionLoggingContext.java")).t("Trying to set a null InteractionLogger!!  Assigning to no-op InteractionLogger instead");
            xgnVar = xgn.l;
        }
        this.b = xgnVar;
    }
}
