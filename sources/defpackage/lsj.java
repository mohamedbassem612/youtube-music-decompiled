package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lsj extends lsi {
    private final knz a;

    public lsj(knz knzVar) {
        this.a = knzVar;
    }

    @Override // defpackage.lsi
    public final void b(Status status, lru lruVar) {
        this.a.c(new lrv(status, lruVar));
    }
}
