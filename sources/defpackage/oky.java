package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oky {
    public static final oky a;
    public static final oky b;
    public static final oky c;
    public static final oky d;
    public static final oky e;
    private static final /* synthetic */ oky[] f;

    static {
        oky okyVar = new oky("UNSPECIFIED", 0);
        a = okyVar;
        oky okyVar2 = new oky("FILE_ALREADY_SHARED", 1);
        b = okyVar2;
        oky okyVar3 = new oky("FILE_SHARING_CHECKSUM_NOT_PROVIDED", 2);
        c = okyVar3;
        oky okyVar4 = new oky("FILE_ALREADY_EXISTS_IN_ANDROID_SHARED_STORAGE", 3);
        d = okyVar4;
        oky okyVar5 = new oky("FILE_NOT_SHARED_IN_ANDROID_SHARED_STORAGE", 4);
        e = okyVar5;
        f = new oky[]{okyVar, okyVar2, okyVar3, okyVar4, okyVar5};
    }

    public static oky[] values() {
        return (oky[]) f.clone();
    }
}
