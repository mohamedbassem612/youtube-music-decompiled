package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akjd {
    public static final akjd a;
    public static final akjd b;
    public static final akjd c;
    public static final akjd d;
    public static final akjd e;
    private static final /* synthetic */ akjd[] f;

    static {
        akjd akjdVar = new akjd("COMMAND", 0);
        a = akjdVar;
        akjd akjdVar2 = new akjd("EMBARGO", 1);
        b = akjdVar2;
        akjd akjdVar3 = new akjd("COMPOSITE_EMBARGO", 2);
        c = akjdVar3;
        akjd akjdVar4 = new akjd("AUTO_SPEED", 3);
        d = akjdVar4;
        akjd akjdVar5 = new akjd("ACTION_NOT_SET", 4);
        e = akjdVar5;
        f = new akjd[]{akjdVar, akjdVar2, akjdVar3, akjdVar4, akjdVar5};
    }

    public static akjd a(int i) {
        if (i == 0) {
            return e;
        }
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i != 4) {
            return null;
        }
        return d;
    }

    public static akjd[] values() {
        return (akjd[]) f.clone();
    }
}
