package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahvm implements awmd {
    final /* synthetic */ Context a;
    final /* synthetic */ awmd b;
    final /* synthetic */ awmd c;
    private ahvh d = null;

    public ahvm(Context context, awmd awmdVar, awmd awmdVar2) {
        this.a = context;
        this.b = awmdVar;
        this.c = awmdVar2;
    }

    @Override // defpackage.awmd, defpackage.awmc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ahvh io() {
        ahvh ahvhVar = this.d;
        if (ahvhVar != null) {
            return ahvhVar;
        }
        Context context = this.a;
        awmd awmdVar = this.b;
        String packageName = context.getPackageName();
        String str = (String) awmdVar.io();
        this.c.io();
        ahvh ahvhVar2 = new ahvh(packageName, str);
        this.d = ahvhVar2;
        return ahvhVar2;
    }
}
