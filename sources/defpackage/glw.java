package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class glw extends sxp implements aupi {
    private volatile auof a;
    private final Object b = new Object();

    public glw() {
        addOnContextAvailableListener(new gfa(this, 4));
    }

    protected auof a() {
        throw null;
    }

    public void c() {
        throw null;
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final auof componentManager() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = a();
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.qe, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        componentManager().e();
    }

    @Override // defpackage.fx, defpackage.cf, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        componentManager().d();
    }
}
