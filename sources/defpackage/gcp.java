package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gcp extends gcr {
    private final View h;

    public gcp(gbg gbgVar, fxg fxgVar, int i, View view) {
        super(gbgVar, "xFm7w/jUhwmnEJP2poHVI6oNkr84lMyZ79jk2PZ7vzEeS+/REyqGC1qnrzq90fHK", "vQovEcJYjiuxrsTzn42XtuOeuH0MpKCgn9vor95WpUk=", fxgVar, i, 57);
        this.h = view;
    }

    @Override // defpackage.gcr
    protected final void a() {
        View view = this.h;
        if (view != null) {
            Boolean bool = (Boolean) jwp.t.d();
            Boolean bool2 = (Boolean) jwp.x.d();
            gbk gbkVar = new gbk((String) this.e.invoke(null, view, this.a.a.getResources().getDisplayMetrics(), bool, bool2));
            aihf aihfVarCreateBuilder = fxk.a.createBuilder();
            long jLongValue = gbkVar.a.longValue();
            aihfVarCreateBuilder.copyOnWrite();
            fxk fxkVar = (fxk) aihfVarCreateBuilder.instance;
            fxkVar.b |= 4;
            fxkVar.d = jLongValue;
            long jLongValue2 = gbkVar.b.longValue();
            aihfVarCreateBuilder.copyOnWrite();
            fxk fxkVar2 = (fxk) aihfVarCreateBuilder.instance;
            fxkVar2.b |= 8;
            fxkVar2.e = jLongValue2;
            long jLongValue3 = gbkVar.c.longValue();
            aihfVarCreateBuilder.copyOnWrite();
            fxk fxkVar3 = (fxk) aihfVarCreateBuilder.instance;
            fxkVar3.b |= 16;
            fxkVar3.f = jLongValue3;
            if (bool2.booleanValue()) {
                long jLongValue4 = gbkVar.e.longValue();
                aihfVarCreateBuilder.copyOnWrite();
                fxk fxkVar4 = (fxk) aihfVarCreateBuilder.instance;
                fxkVar4.b |= 1;
                fxkVar4.c = jLongValue4;
            }
            if (bool.booleanValue()) {
                long jLongValue5 = gbkVar.d.longValue();
                aihfVarCreateBuilder.copyOnWrite();
                fxk fxkVar5 = (fxk) aihfVarCreateBuilder.instance;
                fxkVar5.b |= 32;
                fxkVar5.g = jLongValue5;
            }
            fxg fxgVar = this.d;
            fxk fxkVar6 = (fxk) aihfVarCreateBuilder.build();
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxkVar6.getClass();
            fxlVar.S = fxkVar6;
            fxlVar.c |= 524288;
        }
    }
}
