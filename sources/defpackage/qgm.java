package defpackage;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qgm implements qed {
    final /* synthetic */ tld a;

    public qgm(tld tldVar) {
        this.a = tldVar;
    }

    @Override // defpackage.qed
    public final void b(Activity activity) {
        a.aq((AtomicReference) this.a.b, activity);
    }

    @Override // defpackage.qed
    public final void c(Activity activity) {
        ((AtomicReference) this.a.b).set(activity);
    }

    @Override // defpackage.qed
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void f(int i) {
    }
}
