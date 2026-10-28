package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xym {
    public static final xym a;
    public static final xym b;
    private static final /* synthetic */ xym[] c;

    static {
        xvu xvuVar = xvu.ADD_VIDEO;
        xym xymVar = new xym("ON_GENERATIVE_PARTY_GAMES_STATE_CHANGE", 0);
        a = xymVar;
        xym xymVar2 = new xym("RESOLVE_GENERATIVE_PARTY_GAMES_COMMAND", 1);
        b = xymVar2;
        xym[] xymVarArr = {xymVar, xymVar2};
        c = xymVarArr;
        JniZero.m(xymVarArr);
    }

    public static xym[] values() {
        return (xym[]) c.clone();
    }
}
