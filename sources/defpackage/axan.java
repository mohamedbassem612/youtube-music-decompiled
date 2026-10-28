package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axan {
    public static final axan a;
    public static final axan b;
    public static final axan c;
    private static final /* synthetic */ axan[] d;

    static {
        axan axanVar = new axan("START", 0);
        a = axanVar;
        axan axanVar2 = new axan("STOP", 1);
        b = axanVar2;
        axan axanVar3 = new axan("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = axanVar3;
        axan[] axanVarArr = {axanVar, axanVar2, axanVar3};
        d = axanVarArr;
        JniZero.m(axanVarArr);
    }

    public static axan[] values() {
        return (axan[]) d.clone();
    }
}
