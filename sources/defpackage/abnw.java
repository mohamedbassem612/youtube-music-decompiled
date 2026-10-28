package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abnw {
    public static final abnw a;
    public static final abnw b;
    public static final abnw c;
    public static final abnw d;
    public static final abnw e;
    private static final /* synthetic */ abnw[] f;

    static {
        abnw abnwVar = new abnw("NEW", 0);
        a = abnwVar;
        abnw abnwVar2 = new abnw("VIDEO_LOADING", 1);
        b = abnwVar2;
        abnw abnwVar3 = new abnw("VIDEO_PLAYBACK_ERROR", 2);
        c = abnwVar3;
        abnw abnwVar4 = new abnw("VIDEO_PLAYBACK_LOADED", 3);
        d = abnwVar4;
        abnw abnwVar5 = new abnw("VIDEO_WATCH_LOADED", 4);
        e = abnwVar5;
        f = new abnw[]{abnwVar, abnwVar2, abnwVar3, abnwVar4, abnwVar5};
    }

    public static abnw[] values() {
        return (abnw[]) f.clone();
    }

    public final boolean a(abnw... abnwVarArr) {
        for (abnw abnwVar : abnwVarArr) {
            if (this == abnwVar) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(abnw abnwVar) {
        return ordinal() >= abnwVar.ordinal();
    }
}
