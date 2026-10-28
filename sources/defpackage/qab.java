package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qab {
    public static final qab a;
    public static final qab b;
    public static final qab c;
    public static final qab d;
    public static final qab e;
    public static final qab f;
    public static final qab g;
    public static final qab h;
    public static final qab i;
    public static final qab j;
    public static final qab k;
    public static final qab l;
    public static final qab m;
    public static final qab n;
    public static final qab o;
    public static final qab p;
    private static final /* synthetic */ qab[] q;

    static {
        qab qabVar = new qab("UNKNOWN", 0);
        a = qabVar;
        qab qabVar2 = new qab("INVALID_PAYLOAD", 1);
        b = qabVar2;
        qab qabVar3 = new qab("SILENT_NOTIFICATION", 2);
        c = qabVar3;
        qab qabVar4 = new qab("HANDLED_BY_APP", 3);
        d = qabVar4;
        qab qabVar5 = new qab("USER_SUPPRESSED", 4);
        e = qabVar5;
        qab qabVar6 = new qab("INVALID_TARGET_STATE", 5);
        f = qabVar6;
        qab qabVar7 = new qab("WORK_PROFILE", 6);
        g = qabVar7;
        qab qabVar8 = new qab("UNICORN_OR_GRIFFIN_ACCOUNT", 7);
        h = qabVar8;
        qab qabVar9 = new qab("CLIENT_COUNTERFACTUAL", 8);
        i = qabVar9;
        qab qabVar10 = new qab("SEARCH_DISCOVER_DISABLED", 9);
        j = qabVar10;
        qab qabVar11 = new qab("SEARCH_OUTSIDE_CONTEXT_FENCE", 10);
        k = qabVar11;
        qab qabVar12 = new qab("SEARCH_ACCOUNT_MISSING_OR_MISMATCH", 11);
        l = qabVar12;
        qab qabVar13 = new qab("OUT_OF_ORDER_UPDATE", 12);
        m = qabVar13;
        qab qabVar14 = new qab("SEARCH_DISABLEMENT_DISABLED", 13);
        n = qabVar14;
        qab qabVar15 = new qab("DISABLED_BY_FLAG", 14);
        o = qabVar15;
        qab qabVar16 = new qab("DISABLED_BY_HOLDBACK", 15);
        p = qabVar16;
        qab[] qabVarArr = {qabVar, qabVar2, qabVar3, qabVar4, qabVar5, qabVar6, qabVar7, qabVar8, qabVar9, qabVar10, qabVar11, qabVar12, qabVar13, qabVar14, qabVar15, qabVar16};
        q = qabVarArr;
        JniZero.m(qabVarArr);
    }

    public static qab[] values() {
        return (qab[]) q.clone();
    }
}
