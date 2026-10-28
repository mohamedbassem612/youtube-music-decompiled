package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qop extends bqd {
    private List k;

    public qop(Context context) {
        super(context.getApplicationContext());
    }

    @Override // defpackage.bqd
    public final /* bridge */ /* synthetic */ Object a() {
        TreeSet treeSet = new TreeSet();
        String[] strArrSplit = nqv.j(this.d.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            int iIndexOf = str.indexOf(32);
            String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
            ahno.R(strArrSplit2.length == 2 && iIndexOf > 0, "Invalid license meta-data line:\n%s", str);
            arrayList.add(new qon(str.substring(iIndexOf + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])));
        }
        Collections.sort(arrayList);
        treeSet.addAll(arrayList);
        return DesugarCollections.unmodifiableList(new ArrayList(treeSet));
    }

    @Override // defpackage.bqg
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void j(List list) {
        this.k = list;
        super.j(list);
    }

    @Override // defpackage.bqg
    public final void l() {
        List list = this.k;
        if (list != null) {
            j(list);
        } else {
            g();
        }
    }

    @Override // defpackage.bqg
    public final void m() {
        h();
    }
}
