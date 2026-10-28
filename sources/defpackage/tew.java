package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tew {
    public static final tew a;
    public static final tew b;
    public static final tew c;
    public static final tew d;
    public static final tew e;
    public static final tew f;
    public static final tew g;
    private static final /* synthetic */ tew[] h;

    static {
        tew tewVar = new tew("NONE", 0);
        a = tewVar;
        tew tewVar2 = new tew("FOREGROUND_MODERATE", 1);
        b = tewVar2;
        tew tewVar3 = new tew("FOREGROUND_CRITICAL", 2);
        c = tewVar3;
        tew tewVar4 = new tew("BACKGROUND_MODERATE", 3);
        d = tewVar4;
        tew tewVar5 = new tew("BACKGROUND_CRITICAL", 4);
        e = tewVar5;
        tew tewVar6 = new tew("BACKGROUND_PLAY", 5);
        f = tewVar6;
        tew tewVar7 = new tew("BACKGROUND_DOWNLOAD_FINISH", 6);
        g = tewVar7;
        tew[] tewVarArr = {tewVar, tewVar2, tewVar3, tewVar4, tewVar5, tewVar6, tewVar7};
        h = tewVarArr;
        JniZero.m(tewVarArr);
    }

    public static tew[] values() {
        return (tew[]) h.clone();
    }
}
