package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oae implements eyv {
    public static final etx a;
    public final eyv b;
    public final Class c;
    public final omj d;
    public final ci e;

    static {
        agsn.h("FifeModelLoader");
        a = new etx("com.google.android.libraries.glide.fife.FifeModelLoader.useBatchSizeAsAlternate", Boolean.FALSE, new oac());
    }

    public oae(eyv eyvVar, omj omjVar, ci ciVar, Class cls) {
        new ahdt();
        this.b = eyvVar;
        this.d = omjVar;
        this.c = cls;
        this.e = ciVar;
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.eyv
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final hed b(oab oabVar, int i, int i2, ety etyVar) {
        List listSingletonList = Collections.EMPTY_LIST;
        if (((Boolean) etyVar.b(a)).booleanValue()) {
            listSingletonList = Collections.singletonList(new oaf(oabVar, i, i2));
        }
        return new hed((ett) new oaf(oabVar, i, i2), listSingletonList, (euh) new oad(this, oabVar, i, i2, etyVar));
    }
}
