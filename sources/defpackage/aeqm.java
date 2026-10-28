package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aeqm extends ixt {
    final /* synthetic */ Bundle a;
    final /* synthetic */ List b;

    public aeqm(Bundle bundle, List list) {
        this.a = bundle;
        this.b = list;
    }

    @Override // defpackage.ixt
    public final List a() {
        List<aeqo> list = this.b;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (aeqo aeqoVar : list) {
            byte[] bArr = aeqoVar.a;
            if (bArr != null) {
                arrayList.add(new kvp(bArr, aeqoVar.b, aeqoVar.c));
            }
        }
        return arrayList;
    }

    @Override // defpackage.ixt
    public final List b() {
        return a.q(this.a);
    }
}
