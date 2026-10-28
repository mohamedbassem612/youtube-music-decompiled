package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zsf {
    public static final zsf a;
    public static final zsf b;
    public static final zsf c;
    public static final zsf d;
    public static final zsf e;
    public static final zsf f;
    private static final /* synthetic */ zsf[] g;

    static {
        zsf zsfVar = new zsf("NATIVE_MEDIA_PLAYER", 0);
        a = zsfVar;
        zsf zsfVar2 = new zsf("ANDROID_EXOPLAYER", 1);
        b = zsfVar2;
        zsf zsfVar3 = new zsf("ANDROID_EXOPLAYER_V2", 2);
        c = zsfVar3;
        zsf zsfVar4 = new zsf("PLATYPUS", 3);
        d = zsfVar4;
        zsf zsfVar5 = new zsf("ANDROID_CLOUD_PLAYER", 4);
        e = zsfVar5;
        zsf zsfVar6 = new zsf("ANDROID_BASE_EXOPLAYER", 5);
        f = zsfVar6;
        g = new zsf[]{zsfVar, zsfVar2, zsfVar3, zsfVar4, zsfVar5, zsfVar6};
    }

    public static zsf[] values() {
        return (zsf[]) g.clone();
    }
}
