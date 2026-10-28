package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmz {
    public static final dmz a;
    public static final dmz b;
    public static final dmz c;
    private static final /* synthetic */ dmz[] d;

    static {
        dmz dmzVar = new dmz("DEFERRED", 0);
        a = dmzVar;
        dmz dmzVar2 = new dmz("IMMEDIATE", 1);
        b = dmzVar2;
        dmz dmzVar3 = new dmz("EXCLUSIVE", 2);
        c = dmzVar3;
        dmz[] dmzVarArr = {dmzVar, dmzVar2, dmzVar3};
        d = dmzVarArr;
        JniZero.m(dmzVarArr);
    }

    public static dmz[] values() {
        return (dmz[]) d.clone();
    }
}
