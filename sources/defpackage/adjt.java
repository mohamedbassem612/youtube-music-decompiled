package defpackage;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adjt implements eyv {
    private final awmd a;
    private final eyv b;

    public adjt(awmd awmdVar, eyv eyvVar) {
        this.a = awmdVar;
        this.b = eyvVar;
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return ((aakq) this.a.io()).a(((eyl) obj).b()) != null;
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ hed b(Object obj, int i, int i2, ety etyVar) {
        return this.b.b(new File(typ.c(((aakq) this.a.io()).a(((eyl) obj).b()))), i, i2, etyVar);
    }
}
