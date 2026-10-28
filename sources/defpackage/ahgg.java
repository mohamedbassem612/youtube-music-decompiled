package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ahgg implements ahfu {
    @Override // defpackage.ahfu
    public final Object a(Class cls) {
        if (cls.equals(ahgc.class)) {
            return cls.cast(ahgi.a);
        }
        if (!cls.equals(ahib.class) || ((AtomicBoolean) ahgl.a.a).get()) {
            return null;
        }
        return cls.cast(new ahgf());
    }
}
