package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class tnx {
    public static tnx d(toe toeVar) {
        return new tmk(new tnv(toeVar));
    }

    public static tnx e(Object obj) {
        return new tml(new tnw(obj, null, null, false));
    }

    public static tnx f(Object obj, tmt tmtVar) {
        return new tml(new tnw(obj, tmtVar, null, false));
    }

    public static tnx g(Object obj, tmt tmtVar, tny tnyVar) {
        return new tml(new tnw(obj, tmtVar, tnyVar, false));
    }

    public abstract tnv a();

    public abstract int b();

    public abstract tnw c();

    public final boolean h() {
        return b() == 1;
    }
}
