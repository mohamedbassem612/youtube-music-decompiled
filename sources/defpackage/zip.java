package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zip implements zha {
    final /* synthetic */ awmd a;
    final /* synthetic */ zha b;

    public zip(awmd awmdVar, zha zhaVar) {
        this.a = awmdVar;
        this.b = zhaVar;
    }

    @Override // defpackage.zha
    public final void m(int i, Map map) {
        Long lB = new elr(map, (byte[]) null).B("x-walltime-ms");
        if (lB != null) {
            ((twi) this.a.io()).a(lB);
        }
        this.b.m(i, map);
    }
}
