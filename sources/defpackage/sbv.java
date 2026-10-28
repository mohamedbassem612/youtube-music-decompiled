package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sbv extends sbk implements saq {
    private final awmd a;

    public sbv(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // defpackage.saq
    public final void ab(sko skoVar, int i) {
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            String str = skoVar.a;
            if (TextUtils.equals(((slr) sniVar.b).a, str) && nrm.c(sniVar.a, i)) {
                arrayList.add(sniVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.a.io()).q(arrayList);
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return new agqj(slr.class);
    }
}
