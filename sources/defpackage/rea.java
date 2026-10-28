package defpackage;

import android.util.Size;
import j$.time.Duration;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rea extends res {
    private static final Duration i = Duration.ofMillis(100);
    static final Size a = new Size(64, 64);

    @Override // defpackage.res
    protected final Duration e() {
        return i;
    }

    @Override // defpackage.res
    protected final /* synthetic */ rei f() {
        UUID uuid = this.b.a;
        req reqVar = this.c;
        ria riaVar = new ria(uuid, reqVar.t(), reqVar);
        rgn rgnVar = new rgn(new rgo());
        rgnVar.i(riaVar);
        riaVar.d(reqVar.q());
        riaVar.h(Duration.ZERO, a);
        return new rdz(this, riaVar, rgnVar);
    }
}
