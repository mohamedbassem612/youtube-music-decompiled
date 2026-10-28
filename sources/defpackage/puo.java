package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class puo implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ofd ofdVar = (ofd) obj;
        int iOrdinal = ofdVar.ordinal();
        if (iOrdinal == 0) {
            return aidt.CUSTOM_UI_TYPE_GROWTH_CATALOG_DIALOG;
        }
        if (iOrdinal == 1) {
            return aidt.CUSTOM_UI_TYPE_ANDROID_DESKTOP_GROWTH_NUDGE;
        }
        if (iOrdinal == 2) {
            return aidt.CUSTOM_UI_TYPE_ANDROID_DESKTOP_GROWTH_NOTIFICATION;
        }
        if (iOrdinal == 3) {
            return aidt.CUSTOM_UI_TYPE_GHA_FSI;
        }
        if (iOrdinal == 4) {
            return aidt.CUSTOM_UI_TYPE_CHIME_DEMO_DIALOG;
        }
        if (iOrdinal == 5) {
            return aidt.CUSTOM_UI_TYPE_EDITORS_ANDROID_PROMO_TOOLTIP;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(ofdVar))));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
