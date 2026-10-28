package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ken implements knj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ker a;

    public /* synthetic */ ken(ker kerVar, int i) {
        this.$cid = i;
        this.a = kerVar;
    }

    @Override // defpackage.knj
    public final void a(kni kniVar) {
        if (this.$cid != 0) {
            Status statusA = ((kfk) kniVar).a();
            int i = statusA.f;
            ker kerVar = this.a;
            if (i != 0) {
                kerVar.a.d(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(i), statusA.g), new Object[0]);
            }
            kerVar.k = null;
            kerVar.c();
            return;
        }
        Status statusA2 = ((kfk) kniVar).a();
        int i2 = statusA2.f;
        ker kerVar2 = this.a;
        if (i2 != 0) {
            kerVar2.a.d(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(i2), statusA2.g), new Object[0]);
        }
        kerVar2.j = null;
        kerVar2.c();
    }
}
