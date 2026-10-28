package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pwk {
    public static final pwk a;
    public static final pwk b;
    public static final pwk c;
    public static final pwk d;
    public static final pwk e;
    public static final pwk f;
    public static final pwk g;
    public static final pwk h;
    public static final pwk i;
    private static final /* synthetic */ pwk[] j;

    static {
        pwk pwkVar = new pwk("DEFAULT", 0);
        a = pwkVar;
        pwk pwkVar2 = new pwk("TV", 1);
        b = pwkVar2;
        pwk pwkVar3 = new pwk("WEARABLE", 2);
        c = pwkVar3;
        pwk pwkVar4 = new pwk("AUTOMOTIVE", 3);
        d = pwkVar4;
        pwk pwkVar5 = new pwk("BATTLESTAR", 4);
        e = pwkVar5;
        pwk pwkVar6 = new pwk("CHROME_OS", 5);
        f = pwkVar6;
        pwk pwkVar7 = new pwk("DESKTOP_ANDROID", 6);
        g = pwkVar7;
        pwk pwkVar8 = new pwk("XR", 7);
        h = pwkVar8;
        pwk pwkVar9 = new pwk("XR_PERIPHERAL", 8);
        i = pwkVar9;
        pwk[] pwkVarArr = {pwkVar, pwkVar2, pwkVar3, pwkVar4, pwkVar5, pwkVar6, pwkVar7, pwkVar8, pwkVar9};
        j = pwkVarArr;
        JniZero.m(pwkVarArr);
    }

    public static pwk[] values() {
        return (pwk[]) j.clone();
    }
}
