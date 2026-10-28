package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acgg implements Comparator, Serializable {
    public final acgf a;

    public acgg(abmt abmtVar) {
        this.a = new acgf(abmtVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.a.compare(((acge) obj).g, ((acge) obj2).g);
    }
}
