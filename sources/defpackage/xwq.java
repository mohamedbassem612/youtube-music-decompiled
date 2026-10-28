package defpackage;

import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xwq implements xwh {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/pairing/RealScreenInfoRetriever");
    private final tft b;
    private final axfd c;

    public xwq(tft tftVar, axfd axfdVar) {
        this.b = tftVar;
        this.c = axfdVar;
    }

    @Override // defpackage.xwh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return b((xwc) obj, 4);
    }

    public final xve b(xwc xwcVar, int i) {
        if (xwcVar == null) {
            return null;
        }
        axfd axfdVar = this.c;
        String strValueOf = String.valueOf(axfdVar.B());
        String str = xwcVar.b;
        tge tgeVarB = tgf.b(strValueOf.concat("get_screen"));
        tgeVarB.d = tgd.d(Collections.singletonMap("pairing_code", str), tfs.a);
        if (((vxz) axfdVar.c).m(14, 45627566L)) {
            tgeVarB.d(tok.MDX_PAIRING_URL_BUILDER_SCREEN_FOR_PAIRING_CODE);
        }
        tgf tgfVarA = tgeVarB.a();
        xwp xwpVar = new xwp(tgfVarA.a, i);
        yno.cL(this.b, tgfVarA, xwpVar);
        return xwpVar.a;
    }
}
