package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abrl implements zza {
    private final ahbw a;
    private final Set b;
    private final zza c;
    private final long d;
    private final vxz e;

    public abrl(ahbw ahbwVar, vxz vxzVar, Set set, zza zzaVar, long j) {
        this.a = ahbwVar;
        this.e = vxzVar;
        this.b = set;
        this.c = zzaVar;
        this.d = j;
    }

    @Override // defpackage.tnh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        wja wjaVarA;
        alvt alvtVar = (alvt) obj;
        wjg wjgVar = new wjg();
        wjgVar.b = alvtVar;
        wjgVar.c = this.a.a();
        long j = this.d;
        wjgVar.b(j);
        if ((alvtVar.b & 16) != 0) {
            wiy wiyVar = new wiy(alvtVar);
            wiyVar.b(j);
            wiyVar.c(this.e);
            wjaVarA = wiyVar.a();
        } else {
            wjaVarA = null;
        }
        if (wjaVarA != null) {
            wjgVar.g = wjaVarA;
        }
        wji wjiVarA = wjgVar.a();
        for (wjw wjwVar : this.b) {
            if (wjwVar != null) {
                wjwVar.a(wjiVarA);
            }
        }
        this.c.a(wjiVarA);
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        this.c.jj(toeVar);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
