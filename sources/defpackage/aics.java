package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aics {
    public static final aics a;
    public static final aics b;
    public static final aics c;
    public static final aics d;
    public static final aics e;
    private static final /* synthetic */ aics[] f;

    static {
        aics aicsVar = new aics("STOPWATCH_START_TIME", 0);
        a = aicsVar;
        aics aicsVar2 = new aics("TIMER_END_TIME", 1);
        b = aicsVar2;
        aics aicsVar3 = new aics("PAUSED_STOPWATCH_ELAPSED_DURATION", 2);
        c = aicsVar3;
        aics aicsVar4 = new aics("PAUSED_TIMER_REMAINING_DURATION", 3);
        d = aicsVar4;
        aics aicsVar5 = new aics("TYPE_NOT_SET", 4);
        e = aicsVar5;
        f = new aics[]{aicsVar, aicsVar2, aicsVar3, aicsVar4, aicsVar5};
    }

    public static aics a(int i) {
        if (i == 0) {
            return e;
        }
        if (i == 2) {
            return a;
        }
        if (i == 3) {
            return b;
        }
        if (i == 4) {
            return c;
        }
        if (i != 5) {
            return null;
        }
        return d;
    }

    public static aics[] values() {
        return (aics[]) f.clone();
    }
}
