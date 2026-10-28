package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tjs {
    public static final tjs a;
    public static final tjs b;
    public static final tjs c;
    private static final /* synthetic */ tjs[] d;

    static {
        tjs tjsVar = new tjs("DELIVERED_FRESH", 0);
        a = tjsVar;
        tjs tjsVar2 = new tjs("DELIVERED_STALE", 1);
        b = tjsVar2;
        tjs tjsVar3 = new tjs("NOT_DELIVERED", 2);
        c = tjsVar3;
        tjs[] tjsVarArr = {tjsVar, tjsVar2, tjsVar3};
        d = tjsVarArr;
        JniZero.m(tjsVarArr);
    }

    public static tjs[] values() {
        return (tjs[]) d.clone();
    }
}
