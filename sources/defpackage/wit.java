package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wit {
    public static final wit a;
    public static final wit b;
    public static final wit c;
    public static final wit d;
    public static final wit e;
    public static final wit f;
    public static final wit g;
    public static final wit h;
    private static final /* synthetic */ wit[] i;

    static {
        wit witVar = new wit("DEFAULT", 0);
        a = witVar;
        wit witVar2 = new wit("AV1_MEDIA_CODEC_HW", 1);
        b = witVar2;
        wit witVar3 = new wit("AV1_MEDIA_CODEC", 2);
        c = witVar3;
        wit witVar4 = new wit("VP9_MEDIA_CODEC_HW", 3);
        d = witVar4;
        wit witVar5 = new wit("VP9_MEDIA_CODEC", 4);
        e = witVar5;
        wit witVar6 = new wit("VP9_LIBVPX_GL", 5);
        f = witVar6;
        wit witVar7 = new wit("VP9_LIBVPX_SW", 6);
        g = witVar7;
        wit witVar8 = new wit("H264_MEDIA_CODEC", 7);
        h = witVar8;
        i = new wit[]{witVar, witVar2, witVar3, witVar4, witVar5, witVar6, witVar7, witVar8};
    }

    public static wit[] values() {
        return (wit[]) i.clone();
    }
}
