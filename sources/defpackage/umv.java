package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class umv {
    public static final umv a;
    public static final umv b;
    private static final /* synthetic */ umv[] c;

    static {
        umv umvVar = new umv("VISIBLE", 0);
        a = umvVar;
        umv umvVar2 = new umv("HIDDEN", 1);
        b = umvVar2;
        umv[] umvVarArr = {umvVar, umvVar2};
        c = umvVarArr;
        JniZero.m(umvVarArr);
    }

    public static umv[] values() {
        return (umv[]) c.clone();
    }
}
