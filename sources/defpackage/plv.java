package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class plv {
    public static final plv a;
    public static final plv b;
    public static final plv c;
    private static final /* synthetic */ plv[] d;

    static {
        plv plvVar = new plv("FCM", 0);
        a = plvVar;
        plv plvVar2 = new plv("FCM_AND_FETCH", 1);
        b = plvVar2;
        plv plvVar3 = new plv("FETCH_ONLY", 2);
        c = plvVar3;
        plv[] plvVarArr = {plvVar, plvVar2, plvVar3};
        d = plvVarArr;
        JniZero.m(plvVarArr);
    }

    public static plv[] values() {
        return (plv[]) d.clone();
    }

    public final boolean a() {
        return this == a || this == b;
    }

    public final boolean b() {
        return this == c || this == b;
    }
}
