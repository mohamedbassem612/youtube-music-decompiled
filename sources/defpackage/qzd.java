package defpackage;

import com.google.research.xeno.effect.Effect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qzd implements attc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ qzd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [attc, java.lang.Object] */
    @Override // defpackage.attc
    public final void a(Effect effect, String str) {
        if (this.$cid != 0) {
            int i = qyz.a;
            ?? r2 = this.a;
            if (str != null) {
                r2.a(null, str);
                return;
            } else {
                r2.a(effect, null);
                return;
            }
        }
        int i2 = qzf.f;
        Object obj = this.a;
        if (effect != null) {
            ((aqi) obj).b(new qvk(effect));
        } else {
            ((aqi) obj).d(new IllegalStateException(String.format("loadEffect() failed with error: %s", str)));
        }
    }
}
