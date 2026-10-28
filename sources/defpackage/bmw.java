package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmw {
    public static final bmw a;
    public static final bmw b;
    public static final bmw c;
    public static final bmw d;
    public static final bmw e;
    public static final bmw f;
    public static final bmw g;
    public static final bmw h;
    public static final bmw i;
    private static final /* synthetic */ bmw[] j;

    static {
        bmw bmwVar = new bmw("PENALTY_LOG", 0);
        a = bmwVar;
        bmw bmwVar2 = new bmw("PENALTY_DEATH", 1);
        b = bmwVar2;
        bmw bmwVar3 = new bmw("DETECT_FRAGMENT_REUSE", 2);
        c = bmwVar3;
        bmw bmwVar4 = new bmw("DETECT_FRAGMENT_TAG_USAGE", 3);
        d = bmwVar4;
        bmw bmwVar5 = new bmw("DETECT_WRONG_NESTED_HIERARCHY", 4);
        e = bmwVar5;
        bmw bmwVar6 = new bmw("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = bmwVar6;
        bmw bmwVar7 = new bmw("DETECT_SET_USER_VISIBLE_HINT", 6);
        g = bmwVar7;
        bmw bmwVar8 = new bmw("DETECT_TARGET_FRAGMENT_USAGE", 7);
        h = bmwVar8;
        bmw bmwVar9 = new bmw("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = bmwVar9;
        bmw[] bmwVarArr = {bmwVar, bmwVar2, bmwVar3, bmwVar4, bmwVar5, bmwVar6, bmwVar7, bmwVar8, bmwVar9};
        j = bmwVarArr;
        JniZero.m(bmwVarArr);
    }

    public static bmw[] values() {
        return (bmw[]) j.clone();
    }
}
