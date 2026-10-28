package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acbb extends tzk {
    public acbb() {
        super(null);
    }

    @Override // defpackage.tzk
    public final void G(Deque deque, Attributes attributes, String str) {
        acbm acbmVar = (acbm) deque.peekFirst();
        if (acbmVar != null) {
            int iM = aawb.m(attributes, 0, "w", "win");
            String strP = aawb.p(attributes, "t", "start");
            if (strP != null) {
                int i = Integer.parseInt(strP);
                int iM2 = aawb.m(attributes, 0, "d", "dur") + i;
                String strReplaceAll = str.replaceAll("\n", "<br/>");
                if (aawb.p(attributes, "append") == null) {
                    acbmVar.c(iM, strReplaceAll, i, iM2);
                } else {
                    acbmVar.b(iM).a.d(strReplaceAll, i, iM2);
                }
            }
        }
    }
}
