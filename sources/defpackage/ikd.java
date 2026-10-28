package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ikd extends fx implements aupi {
    private volatile auof b;
    private final Object c = new Object();
    public boolean a = false;

    public ikd() {
        addOnContextAvailableListener(new gfa(this, 10));
    }

    protected auof a() {
        throw null;
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final auof componentManager() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = a();
                }
            }
        }
        return this.b;
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
