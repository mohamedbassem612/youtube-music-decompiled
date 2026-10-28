package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sep {
    public static final sep a;
    public static final sep b;
    public static final sep c;
    public static final sep d;
    private static final /* synthetic */ sep[] e;

    static {
        sep sepVar = new sep("AD_INTERRUPT_ACQUIRED", 0);
        a = sepVar;
        sep sepVar2 = new sep("AD_VIDEO_PLAY_REQUESTED", 1);
        b = sepVar2;
        sep sepVar3 = new sep("AD_VIDEO_PLAYING", 2);
        c = sepVar3;
        sep sepVar4 = new sep("AD_VIDEO_ENDED", 3);
        d = sepVar4;
        e = new sep[]{sepVar, sepVar2, sepVar3, sepVar4};
    }

    public static sep[] values() {
        return (sep[]) e.clone();
    }
}
