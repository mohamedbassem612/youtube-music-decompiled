package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zjv {
    public static final zjv a;
    public static final zjv b;
    public static final zjv c;
    public static final zjv d;
    public static final zjv e;
    public static final zjv f;
    public static final zjv g;
    private static final /* synthetic */ zjv[] h;

    static {
        zjv zjvVar = new zjv("INVALID", 0);
        a = zjvVar;
        zjv zjvVar2 = new zjv("MEDIA_CODEC", 1);
        b = zjvVar2;
        zjv zjvVar3 = new zjv("MEDIA_CODEC_HARDWARE_ONLY", 2);
        c = zjvVar3;
        zjv zjvVar4 = new zjv("LIBVPX", 3);
        d = zjvVar4;
        zjv zjvVar5 = new zjv("LIBOPUS", 4);
        e = zjvVar5;
        zjv zjvVar6 = new zjv("LIBOPUS_AMBISONICS", 5);
        f = zjvVar6;
        zjv zjvVar7 = new zjv("LIBDAV1D", 6);
        g = zjvVar7;
        h = new zjv[]{zjvVar, zjvVar2, zjvVar3, zjvVar4, zjvVar5, zjvVar6, zjvVar7};
    }

    public static zjv[] values() {
        return (zjv[]) h.clone();
    }
}
