package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nfe {
    public static final nfe a;
    public static final nfe b;
    public static final nfe c;
    public static final nfe d;
    public static final nfe e;
    public static final nfe f;
    public static final nfe g;
    public static final nfe h;
    private static final /* synthetic */ nfe[] i;

    static {
        nfe nfeVar = new nfe("TRANSITION_VALUE_TYPE_NONE", 0);
        a = nfeVar;
        nfe nfeVar2 = new nfe("TRANSITION_VALUE_TYPE_X_Y", 1);
        b = nfeVar2;
        nfe nfeVar3 = new nfe("TRANSITION_VALUE_TYPE_WIDTH_HEIGHT", 2);
        c = nfeVar3;
        nfe nfeVar4 = new nfe("TRANSITION_VALUE_TYPE_SCALE", 3);
        d = nfeVar4;
        nfe nfeVar5 = new nfe("TRANSITION_VALUE_TYPE_ALPHA", 4);
        e = nfeVar5;
        nfe nfeVar6 = new nfe("TRANSITION_VALUE_TYPE_ROTATION", 5);
        f = nfeVar6;
        nfe nfeVar7 = new nfe("TRANSITION_VALUE_TYPE_TRANSLATION", 6);
        g = nfeVar7;
        nfe nfeVar8 = new nfe("TRANSITION_VALUE_TYPE_TRANSFORM", 7);
        h = nfeVar8;
        i = new nfe[]{nfeVar, nfeVar2, nfeVar3, nfeVar4, nfeVar5, nfeVar6, nfeVar7, nfeVar8};
    }

    public static nfe a(int i2) {
        switch (i2) {
            case 0:
                return a;
            case 1:
                return b;
            case 2:
                return c;
            case 3:
                return d;
            case 4:
                return e;
            case 5:
                return f;
            case 6:
                return g;
            case 7:
                return h;
            default:
                return null;
        }
    }

    public static nfe[] values() {
        return (nfe[]) i.clone();
    }
}
