package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ydj extends xmq implements aupi {
    private volatile auof c;
    private final Object d = new Object();
    public boolean b = false;

    public ydj() {
        addOnContextAvailableListener(new gfa(this, 16));
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final auof componentManager() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new auof(this);
                }
            }
        }
        return this.c;
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.qe, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.xmq, defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        componentManager().e();
    }

    @Override // defpackage.fx, defpackage.cf, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        componentManager().d();
    }
}
