package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ioh extends ioo implements aupi {
    private volatile auof c;
    private final Object d = new Object();
    public boolean a = false;

    public ioh() {
        addOnContextAvailableListener(new gfa(this, 11));
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.qe, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final auof componentManager() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = i();
                }
            }
        }
        return this.c;
    }

    protected auof i() {
        throw null;
    }

    @Override // defpackage.izy, defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        componentManager().e();
    }

    @Override // defpackage.izy, defpackage.fx, defpackage.cf, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        componentManager().d();
    }
}
