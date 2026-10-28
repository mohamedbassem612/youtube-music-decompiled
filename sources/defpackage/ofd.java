package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ofd {
    public static final ofd a;
    public static final ofd b;
    public static final ofd c;
    public static final ofd d;
    public static final ofd e;
    public static final ofd f;
    private static final /* synthetic */ ofd[] g;

    static {
        ofd ofdVar = new ofd("CUSTOM_UI_TYPE_GROWTH_CATALOG_DIALOG", 0);
        a = ofdVar;
        ofd ofdVar2 = new ofd("CUSTOM_UI_TYPE_ANDROID_DESKTOP_GROWTH_NUDGE", 1);
        b = ofdVar2;
        ofd ofdVar3 = new ofd("CUSTOM_UI_TYPE_ANDROID_DESKTOP_GROWTH_NOTIFICATION", 2);
        c = ofdVar3;
        ofd ofdVar4 = new ofd("CUSTOM_UI_TYPE_GHA_FSI", 3);
        d = ofdVar4;
        ofd ofdVar5 = new ofd("CUSTOM_UI_TYPE_CHIME_DEMO_DIALOG", 4);
        e = ofdVar5;
        ofd ofdVar6 = new ofd("CUSTOM_UI_TYPE_EDITORS_ANDROID_PROMO_TOOLTIP", 5);
        f = ofdVar6;
        ofd[] ofdVarArr = {ofdVar, ofdVar2, ofdVar3, ofdVar4, ofdVar5, ofdVar6};
        g = ofdVarArr;
        JniZero.m(ofdVarArr);
    }

    public static ofd[] values() {
        return (ofd[]) g.clone();
    }
}
