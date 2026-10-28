package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tjd implements tjl {
    public final aunn a;
    public final tjl b;
    public final tjj c;
    public final boolean d;

    public tjd(aunn aunnVar, tjl tjlVar, tjj tjjVar, boolean z) {
        this.a = aunnVar;
        this.b = tjlVar;
        this.c = tjjVar;
        this.d = z;
    }

    @Override // defpackage.tjl
    public final /* synthetic */ boolean a(tns tnsVar, List list, Throwable th) {
        return true;
    }

    @Override // defpackage.tjl
    public final /* synthetic */ boolean b(tns tnsVar) {
        return true;
    }

    @Override // defpackage.tjl
    public final tjm c(tns tnsVar, tlj tljVar, tit titVar, tmt tmtVar) {
        tnsVar.getClass();
        titVar.getClass();
        return new tjc(this, tnsVar, tljVar, titVar, tmtVar);
    }
}
