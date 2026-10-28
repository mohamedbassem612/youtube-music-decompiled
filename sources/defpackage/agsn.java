package defpackage;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agsn extends agsl {
    public agsn(agsw agswVar) {
        super(agswVar);
    }

    public static agsn h(String str) {
        return new agsn(agtu.d(str));
    }

    public static agsn i(String str) {
        return new agsn(aguk.c.a(str));
    }

    public static agsn j() {
        return new agsn(agtu.d(agtu.g().b(agsn.class)));
    }

    @Override // defpackage.agqv
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final agsj a(Level level) {
        boolean zF = f(level);
        agtu.n(d(), level, zF);
        return !zF ? b : new agsm(this, level);
    }
}
