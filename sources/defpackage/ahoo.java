package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahoo implements ahrs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ahoo(Context context, String str, int i) {
        this.$cid = i;
        this.b = context;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [ahol, java.lang.Object] */
    @Override // defpackage.ahrs
    public final Object a() {
        int i = this.$cid;
        if (i == 0) {
            ahok ahokVar = (ahok) this.b;
            return ahokVar.f.a(new ahpf(ahokVar, this.a));
        }
        Object obj = this.a;
        if (i != 1) {
            return new ahrg((Context) this.b, (String) obj);
        }
        ahnr ahnrVar = (ahnr) obj;
        String strH = ahnrVar.h();
        return new ahsm((Context) this.b, strH);
    }

    public /* synthetic */ ahoo(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
