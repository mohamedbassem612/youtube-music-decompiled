package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pys {
    public static final pys a;
    public static final pys b;
    public static final pys c;
    public static final pys d;
    public static final pys e;
    public static final pys f;
    public static final pys g;
    private static final /* synthetic */ pys[] h;

    static {
        pys pysVar = new pys("CUSTOMIZATION_APPLIED", 0);
        a = pysVar;
        pys pysVar2 = new pys("CUSTOMIZATION_NOT_APPLIED_FLAG_DISABLED", 1);
        b = pysVar2;
        pys pysVar3 = new pys("CUSTOMIZATION_NOT_APPLIED_IMAGE_LOADING_FAILED", 2);
        c = pysVar3;
        pys pysVar4 = new pys("CUSTOMIZATION_NOT_APPLIED_IMAGE_LOADING_TIMED_OUT", 3);
        d = pysVar4;
        pys pysVar5 = new pys("CUSTOMIZATION_NOT_APPLIED_DEVICE_NOT_SUPPORTED", 4);
        e = pysVar5;
        pys pysVar6 = new pys("CUSTOMIZATION_NOT_APPLIED_CUSTOMIZATION_NOT_NEEDED", 5);
        f = pysVar6;
        pys pysVar7 = new pys("CUSTOMIZATION_NOT_APPLIED_GENERAL_ERROR", 6);
        g = pysVar7;
        pys[] pysVarArr = {pysVar, pysVar2, pysVar3, pysVar4, pysVar5, pysVar6, pysVar7};
        h = pysVarArr;
        JniZero.m(pysVarArr);
    }

    public static pys[] values() {
        return (pys[]) h.clone();
    }
}
