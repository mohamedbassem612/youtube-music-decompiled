package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class otk {
    static final ConcurrentHashMap a = new ConcurrentHashMap();
    static final ConcurrentHashMap b = new ConcurrentHashMap();
    static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final /* synthetic */ int d = 0;

    public static /* synthetic */ Boolean a(Context context, Integer num) {
        try {
            XmlResourceParser xml = context.getResources().getXml(num.intValue());
            if (xml != null) {
                xml.close();
            }
            return Boolean.TRUE;
        } catch (Resources.NotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    public static int b(Context context, atiq atiqVar) {
        int iAS = atiqVar.aS();
        for (int i = 0; i < iAS; i++) {
            ativ ativVarAY = atiqVar.aY(i);
            if (ativVarAY.aS()) {
                atii atiiVarAU = ativVarAY.aU();
                if ((Memory.peekByte(atiiVarAU.c + 8) & 2) != 0) {
                    String strAR = atiiVarAU.aR();
                    String str = (atiqVar.aV() == 5 || atiqVar.aV() == 4) ? "raw" : "drawable";
                    return ((Integer) ConcurrentMap.EL.computeIfAbsent(a, str.concat(String.valueOf(strAR)), new hpm(context, strAR, str, 7))).intValue();
                }
            }
        }
        return 0;
    }
}
