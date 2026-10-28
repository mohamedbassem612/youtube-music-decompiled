package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hui {
    public static final hui a;
    public static final hui b;
    public static final hui c;
    public static final hui d;
    private static final /* synthetic */ hui[] e;

    static {
        hui huiVar = new hui("TOP_RESULT", 0);
        a = huiVar;
        hui huiVar2 = new hui("SONGS_AND_VIDEOS", 1);
        b = huiVar2;
        hui huiVar3 = new hui("PLAYLISTS", 2);
        c = huiVar3;
        hui huiVar4 = new hui("ALBUMS", 3);
        d = huiVar4;
        e = new hui[]{huiVar, huiVar2, huiVar3, huiVar4};
    }

    public static hui[] values() {
        return (hui[]) e.clone();
    }
}
