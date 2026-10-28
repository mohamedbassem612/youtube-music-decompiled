package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tqt {
    public static final tqt a;
    public static final tqt b;
    public static final tqt c;
    public static final tqt d;
    private static final /* synthetic */ tqt[] e;

    static {
        tqt tqtVar = new tqt("SHORTS_FIRST_DATA_SOURCE_TYPE_UNKNOWN", 0);
        a = tqtVar;
        tqt tqtVar2 = new tqt("SHORTS_FIRST_DATA_SOURCE_TYPE_SEEDLESS", 1);
        b = tqtVar2;
        tqt tqtVar3 = new tqt("SHORTS_FIRST_DATA_SOURCE_TYPE_SEEDED", 2);
        c = tqtVar3;
        tqt tqtVar4 = new tqt("SHORTS_FIRST_DATA_SOURCE_TYPE_CACHED", 3);
        d = tqtVar4;
        tqt[] tqtVarArr = {tqtVar, tqtVar2, tqtVar3, tqtVar4};
        e = tqtVarArr;
        JniZero.m(tqtVarArr);
    }

    public static tqt[] values() {
        return (tqt[]) e.clone();
    }
}
