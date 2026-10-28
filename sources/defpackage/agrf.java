package defpackage;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agrf extends agqv {
    public static final agre b = new agre();

    @Deprecated
    public static agrf h(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("injected class name is empty");
        }
        return new agrf(agtu.d(str.replace('/', '.')));
    }

    @Override // defpackage.agqv
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final agrc a(Level level) {
        boolean zF = f(level);
        agtu.n(d(), level, zF);
        return !zF ? b : new agrd(this, level);
    }
}
