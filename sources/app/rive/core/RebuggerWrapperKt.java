package app.rive.core;

import defpackage.ahk;
import defpackage.ail;
import defpackage.awmy;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RebuggerWrapperKt {
    public static final void RebuggerWrapper(Map map, ahk ahkVar, int i) {
        map.getClass();
        ahk ahkVarC = ahkVar.C();
        if (!ahkVarC.y()) {
            ahkVarC.j();
        }
        ail ailVarB = ahkVarC.b();
        if (ailVarB != null) {
            ailVarB.a();
        }
    }

    static final awmy RebuggerWrapper$lambda$0(Map map, int i, ahk ahkVar, int i2) {
        int i3 = i | 1;
        int i4 = 306783378 & i3;
        int i5 = 613566756 & i3;
        RebuggerWrapper(map, ahkVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 << 1) & i5));
        return awmy.a;
    }
}
