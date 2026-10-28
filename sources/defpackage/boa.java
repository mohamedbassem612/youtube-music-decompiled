package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class boa {
    private static final /* synthetic */ awpl $ENTRIES;
    private static final /* synthetic */ boa[] $VALUES;
    public static final bnz Companion;
    public static final boa ON_ANY;
    public static final boa ON_CREATE;
    public static final boa ON_DESTROY;
    public static final boa ON_PAUSE;
    public static final boa ON_RESUME;
    public static final boa ON_START;
    public static final boa ON_STOP;

    static {
        boa boaVar = new boa("ON_CREATE", 0);
        ON_CREATE = boaVar;
        boa boaVar2 = new boa("ON_START", 1);
        ON_START = boaVar2;
        boa boaVar3 = new boa("ON_RESUME", 2);
        ON_RESUME = boaVar3;
        boa boaVar4 = new boa("ON_PAUSE", 3);
        ON_PAUSE = boaVar4;
        boa boaVar5 = new boa("ON_STOP", 4);
        ON_STOP = boaVar5;
        boa boaVar6 = new boa("ON_DESTROY", 5);
        ON_DESTROY = boaVar6;
        boa boaVar7 = new boa("ON_ANY", 6);
        ON_ANY = boaVar7;
        boa[] boaVarArr = {boaVar, boaVar2, boaVar3, boaVar4, boaVar5, boaVar6, boaVar7};
        $VALUES = boaVarArr;
        $ENTRIES = JniZero.m(boaVarArr);
        Companion = new bnz();
    }

    public static boa[] values() {
        return (boa[]) $VALUES.clone();
    }

    public final bob a() {
        switch (ordinal()) {
            case 0:
            case 4:
                return bob.c;
            case 1:
            case 3:
                return bob.d;
            case 2:
                return bob.e;
            case 5:
                return bob.a;
            case 6:
                toString();
                throw new IllegalArgumentException(toString().concat(" has no target state"));
            default:
                throw new awmj();
        }
    }
}
