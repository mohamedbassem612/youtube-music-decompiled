package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class cys implements bsw {
    public cys(List list) {
        DesugarCollections.unmodifiableList(list);
    }

    @Override // defpackage.bsw
    public final /* synthetic */ bse a() {
        return null;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(String.valueOf(getClass().getSimpleName()));
    }

    public cys() {
    }

    @Override // defpackage.bsw
    public final /* synthetic */ void b(bsu bsuVar) {
    }
}
