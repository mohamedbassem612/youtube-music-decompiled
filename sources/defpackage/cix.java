package defpackage;

import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cix extends ciy {
    public final String a;
    public final civ b;
    private final cjg i;

    public cix(bse bseVar, List list, cjd cjdVar, List list2, String str, long j) {
        super(bseVar, list, cjdVar, list2);
        Uri.parse(((cim) list.get(0)).a);
        long j2 = cjdVar.b;
        civ civVar = j2 <= 0 ? null : new civ(null, cjdVar.a, j2);
        this.b = civVar;
        this.a = str;
        this.i = civVar == null ? new cjg(new civ(null, 0L, j)) : null;
    }

    @Override // defpackage.ciy
    public final cia k() {
        return this.i;
    }

    @Override // defpackage.ciy
    public final civ l() {
        return this.b;
    }

    @Override // defpackage.ciy
    public final String m() {
        return this.a;
    }
}
