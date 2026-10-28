package defpackage;

import android.view.View;
import android.view.ViewGroup;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jle {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/util/ViewUtil");

    public static Optional a(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return Optional.empty();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        aihf aihfVarCreateBuilder = ailj.a.createBuilder();
        int i = marginLayoutParams.topMargin;
        aihfVarCreateBuilder.copyOnWrite();
        ailj ailjVar = (ailj) aihfVarCreateBuilder.instance;
        ailjVar.b |= 1;
        ailjVar.c = i;
        int marginEnd = marginLayoutParams.getMarginEnd();
        aihfVarCreateBuilder.copyOnWrite();
        ailj ailjVar2 = (ailj) aihfVarCreateBuilder.instance;
        ailjVar2.b |= 2;
        ailjVar2.d = marginEnd;
        int i2 = marginLayoutParams.bottomMargin;
        aihfVarCreateBuilder.copyOnWrite();
        ailj ailjVar3 = (ailj) aihfVarCreateBuilder.instance;
        ailjVar3.b |= 4;
        ailjVar3.e = i2;
        int marginStart = marginLayoutParams.getMarginStart();
        aihfVarCreateBuilder.copyOnWrite();
        ailj ailjVar4 = (ailj) aihfVarCreateBuilder.instance;
        ailjVar4.b |= 8;
        ailjVar4.f = marginStart;
        return Optional.of((ailj) aihfVarCreateBuilder.build());
    }

    public static void b(ailj ailjVar, View view) {
        if (ailjVar != null) {
            if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ((agrc) ((agrc) a.c()).k("com/google/android/apps/youtube/music/util/ViewUtil", "applyMargins", 63, "ViewUtil.java")).w("Attempted to set margins on view without MarginLayoutParams: %s", view);
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if ((ailjVar.b & 1) != 0) {
                marginLayoutParams.topMargin = ailjVar.c;
            }
            if ((ailjVar.b & 2) != 0) {
                marginLayoutParams.setMarginEnd(ailjVar.d);
            }
            if ((ailjVar.b & 4) != 0) {
                marginLayoutParams.bottomMargin = ailjVar.e;
            }
            if ((ailjVar.b & 8) != 0) {
                marginLayoutParams.setMarginStart(ailjVar.f);
            }
        }
    }
}
