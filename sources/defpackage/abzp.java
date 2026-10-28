package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abzp implements zsa {
    final /* synthetic */ aihf a;

    public abzp(aihf aihfVar) {
        this.a = aihfVar;
    }

    @Override // defpackage.zsa
    public final int a() {
        return ((akkl) this.a.instance).d;
    }

    @Override // defpackage.zsa
    public final int b() {
        return ((akkl) this.a.instance).c;
    }

    @Override // defpackage.zsa
    public final int c() {
        return 0;
    }

    @Override // defpackage.zsa
    public final int d() {
        TimeUnit timeUnit = TimeUnit.DAYS;
        return 43200;
    }

    @Override // defpackage.zsa
    public final /* synthetic */ boolean e() {
        return false;
    }
}
