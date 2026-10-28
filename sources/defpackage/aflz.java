package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aflz {
    public static final aflz a;
    public static final aflz b;
    public static final aflz c;
    public static final aflz d;
    public static final aflz e;
    private static final /* synthetic */ aflz[] f;

    static {
        aflz aflzVar = new aflz("PROD", 0);
        a = aflzVar;
        aflz aflzVar2 = new aflz("DEV", 1);
        b = aflzVar2;
        aflz aflzVar3 = new aflz("ROBOLECTRIC", 2);
        c = aflzVar3;
        aflz aflzVar4 = new aflz("EMULATOR", 3);
        d = aflzVar4;
        aflz aflzVar5 = new aflz("UNKNOWN", 4);
        e = aflzVar5;
        f = new aflz[]{aflzVar, aflzVar2, aflzVar3, aflzVar4, aflzVar5};
    }

    public static aflz[] values() {
        return (aflz[]) f.clone();
    }
}
