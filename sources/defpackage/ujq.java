package defpackage;

import android.graphics.Color;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ujq {
    public static final agjt a = new agph(new Object[]{5, atzx.ALIGN_LEFT, 6, atzx.ALIGN_RIGHT, 4, atzx.ALIGN_CENTER}, 3);

    public static int a(atzx atzxVar) {
        return ((Integer) ((agph) a).d.getOrDefault(atzxVar, 4)).intValue();
    }

    public static int b(aimw aimwVar) {
        return Color.argb((int) aimwVar.f, (int) aimwVar.c, (int) aimwVar.d, (int) aimwVar.e);
    }

    public static aimw c(int i) {
        aihf aihfVarCreateBuilder = aimw.a.createBuilder();
        double dRed = Color.red(i);
        aihfVarCreateBuilder.copyOnWrite();
        aimw aimwVar = (aimw) aihfVarCreateBuilder.instance;
        aimwVar.b |= 1;
        aimwVar.c = dRed;
        double dGreen = Color.green(i);
        aihfVarCreateBuilder.copyOnWrite();
        aimw aimwVar2 = (aimw) aihfVarCreateBuilder.instance;
        aimwVar2.b |= 2;
        aimwVar2.d = dGreen;
        double dBlue = Color.blue(i);
        aihfVarCreateBuilder.copyOnWrite();
        aimw aimwVar3 = (aimw) aihfVarCreateBuilder.instance;
        aimwVar3.b |= 4;
        aimwVar3.e = dBlue;
        double dAlpha = Color.alpha(i);
        aihfVarCreateBuilder.copyOnWrite();
        aimw aimwVar4 = (aimw) aihfVarCreateBuilder.instance;
        aimwVar4.b |= 8;
        aimwVar4.f = dAlpha;
        return (aimw) aihfVarCreateBuilder.build();
    }

    public static auir d(String str) {
        for (auir auirVar : auir.values()) {
            if (auirVar.name().equals(str)) {
                return auirVar;
            }
        }
        return auir.FONT_FAMILY_UNSPECIFIED;
    }
}
