package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class teb {
    public static final teb a;
    public static final teb b;
    public static final teb c;
    private static final /* synthetic */ teb[] d;

    static {
        teb tebVar = new teb("DOWNLOAD_STARTED", 0);
        a = tebVar;
        teb tebVar2 = new teb("DOWNLOAD_FINISHED", 1);
        b = tebVar2;
        teb tebVar3 = new teb("PICTURE_IN_PICTURE_ENTERED", 2);
        c = tebVar3;
        teb[] tebVarArr = {tebVar, tebVar2, tebVar3};
        d = tebVarArr;
        JniZero.m(tebVarArr);
    }

    public static teb[] values() {
        return (teb[]) d.clone();
    }
}
