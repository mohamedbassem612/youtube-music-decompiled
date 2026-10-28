package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acqp implements acrm {
    final /* synthetic */ aheh a;
    final /* synthetic */ long b;
    final /* synthetic */ acqz c;

    public acqp(acqz acqzVar, aheh ahehVar, long j) {
        this.a = ahehVar;
        this.b = j;
        this.c = acqzVar;
    }

    @Override // defpackage.acrm
    public final void a() {
        this.a.a(new Exception("ReelWatchSequence has error response"));
    }

    @Override // defpackage.acrm
    public final void b() {
        this.a.b(Optional.ofNullable(this.c.ag.O(this.b)));
    }
}
