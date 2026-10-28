package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ezk implements eyv {
    public static final etx a = new etx("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500, etx.a);
    private final ci b;

    public ezk(ci ciVar) {
        this.b = ciVar;
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ hed b(Object obj, int i, int i2, ety etyVar) {
        ci ciVar = this.b;
        eyl eylVar = (eyl) obj;
        eyl eylVar2 = (eyl) ciVar.Y(eylVar, 0, 0);
        if (eylVar2 == null) {
            ((ffo) ciVar.a).h(eyu.a(eylVar, 0, 0), eylVar);
        } else {
            eylVar = eylVar2;
        }
        return new hed(eylVar, new euq(eylVar, ((Integer) etyVar.b(a)).intValue()));
    }
}
