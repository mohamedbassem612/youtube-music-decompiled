package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amq {
    public static final amq a;
    public static final amq b;
    public static final amq c;
    private static final /* synthetic */ amq[] d;

    static {
        amq amqVar = new amq("Initial", 0);
        a = amqVar;
        amq amqVar2 = new amq("Main", 1);
        b = amqVar2;
        amq amqVar3 = new amq("Final", 2);
        c = amqVar3;
        amq[] amqVarArr = {amqVar, amqVar2, amqVar3};
        d = amqVarArr;
        JniZero.m(amqVarArr);
    }

    public static amq[] values() {
        return (amq[]) d.clone();
    }
}
