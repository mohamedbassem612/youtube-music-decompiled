package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abjg {
    public static final /* synthetic */ int a = 0;

    static {
        int[] iArr = abjl.F;
    }

    public static abkd a(abjl abjlVar) {
        if (abjlVar instanceof abkd) {
            return (abkd) abjlVar;
        }
        return null;
    }

    public static abke b(abjl abjlVar) {
        int iHd = abjlVar.hd();
        if (iHd != -1) {
            return abjlVar.O(0, iHd);
        }
        return null;
    }

    public static List c(abjl abjlVar, int i) {
        abjlVar.getClass();
        int iHc = abjlVar.hc(i);
        if (iHc == 0) {
            return Collections.EMPTY_LIST;
        }
        agjz agjzVarF = agke.f(iHc);
        for (int i2 = 0; i2 < iHc; i2++) {
            agjzVarF.h(abjlVar.O(i, i2));
        }
        return agjzVarF.g();
    }
}
