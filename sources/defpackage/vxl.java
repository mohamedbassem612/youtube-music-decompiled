package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vxl {
    public static final CharSequence[] a = new CharSequence[0];

    public static Spanned a(Context context, alay alayVar, final vxe vxeVar, boolean z) {
        ackf ackfVar;
        if (vxeVar != null) {
            final vxi vxiVarA = vxj.a(z);
            ackfVar = new ackf() { // from class: vxk
                @Override // defpackage.ackf
                public final ClickableSpan a(ajwo ajwoVar) {
                    return vxiVarA.a(vxeVar, null, ajwoVar);
                }
            };
        } else {
            ackfVar = null;
        }
        return (context == null || alayVar == null || ackfVar == null) ? ackj.k(null, alayVar, ackfVar, false) : ackj.a(new ackh(context, alayVar, ackfVar));
    }

    public static List b(List list, vxe vxeVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(null, (alay) it.next(), vxeVar, false));
        }
        return arrayList;
    }
}
