package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nuk {
    public static final void a(tld tldVar, opr oprVar, bbz bbzVar) {
        View viewF;
        Object obj = tldVar.a;
        if (obj != null) {
            if ((obj instanceof opt) && (viewF = ((opt) obj).f()) != null) {
                obj = viewF;
            }
            bbzVar.a.addChild((View) obj);
            return;
        }
        Object obj2 = tldVar.b;
        if (obj2 != null) {
            bbzVar.l(oprVar.b, ((Integer) obj2).intValue());
        }
    }
}
