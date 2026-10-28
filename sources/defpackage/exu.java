package defpackage;

import android.content.res.AssetManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exu implements eyw, ext {
    private final /* synthetic */ int $cid;
    private final AssetManager a;

    public exu(AssetManager assetManager, int i) {
        this.$cid = i;
        this.a = assetManager;
    }

    @Override // defpackage.ext
    public final euh a(AssetManager assetManager, String str) {
        return this.$cid != 0 ? new euo(assetManager, str) : new euw(assetManager, str);
    }

    @Override // defpackage.eyw
    public final eyv b(eza ezaVar) {
        return this.$cid != 0 ? new eyg(this.a, this, 1) : new eyg(this.a, this, 1);
    }

    @Override // defpackage.eyw
    public final void c() {
    }
}
