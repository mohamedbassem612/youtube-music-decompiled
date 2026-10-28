package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class phb {
    public static final phb a;
    public static final phb b;
    public static final phb c;
    public static final phb d;
    public static final phb e;
    public static final /* synthetic */ awpl f;
    private static final /* synthetic */ phb[] g;

    static {
        phb phbVar = new phb("UNKNOWN", 0);
        a = phbVar;
        phb phbVar2 = new phb("DEVICE_RESTART", 1);
        b = phbVar2;
        phb phbVar3 = new phb("APP_UPDATE", 2);
        c = phbVar3;
        phb phbVar4 = new phb("IMAGE_RETRY", 3);
        d = phbVar4;
        phb phbVar5 = new phb("COLLABORATOR_REQUEST", 4);
        e = phbVar5;
        phb[] phbVarArr = {phbVar, phbVar2, phbVar3, phbVar4, phbVar5};
        g = phbVarArr;
        f = JniZero.m(phbVarArr);
    }

    public static phb[] values() {
        return (phb[]) g.clone();
    }
}
