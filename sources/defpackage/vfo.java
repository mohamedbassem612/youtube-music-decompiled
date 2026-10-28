package defpackage;

import android.graphics.Color;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vfo {
    static final agek a = new vem(0);

    public static akqk a(int i) {
        aihf aihfVarCreateBuilder = akqk.a.createBuilder();
        double dRed = Color.red(i);
        aihfVarCreateBuilder.copyOnWrite();
        akqk akqkVar = (akqk) aihfVarCreateBuilder.instance;
        akqkVar.b |= 1;
        akqkVar.c = dRed;
        double dGreen = Color.green(i);
        aihfVarCreateBuilder.copyOnWrite();
        akqk akqkVar2 = (akqk) aihfVarCreateBuilder.instance;
        akqkVar2.b |= 2;
        akqkVar2.d = dGreen;
        double dBlue = Color.blue(i);
        aihfVarCreateBuilder.copyOnWrite();
        akqk akqkVar3 = (akqk) aihfVarCreateBuilder.instance;
        akqkVar3.b |= 4;
        akqkVar3.e = dBlue;
        double dAlpha = Color.alpha(i);
        aihfVarCreateBuilder.copyOnWrite();
        akqk akqkVar4 = (akqk) aihfVarCreateBuilder.instance;
        akqkVar4.b |= 8;
        akqkVar4.f = dAlpha;
        return (akqk) aihfVarCreateBuilder.build();
    }
}
