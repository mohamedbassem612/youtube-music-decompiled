package defpackage;

import androidx.car.app.AppManager$1;
import androidx.car.app.model.TemplateInfo;
import androidx.car.app.model.TemplateWrapper;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wv implements aex {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ wv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.aex
    public final Object a() {
        TemplateWrapper templateWrapperWrap;
        TemplateWrapper templateWrapper;
        int i = this.$cid;
        if (i != 0) {
            templateWrapperWrap = null;
            if (i != 1) {
                Object obj = this.a;
                if (i != 2) {
                    AppManager$1.lambda$startLocationUpdates$1((xr) obj);
                    return null;
                }
                AppManager$1.lambda$stopLocationUpdates$2((xr) obj);
                return null;
            }
            AppManager$1.lambda$onBackPressed$0((xr) this.a);
        } else {
            afi.a();
            yb ybVar = (yb) this.a;
            ya yaVarA = ybVar.a();
            acz aczVarB = yaVarA.b();
            templateWrapperWrap = (!yaVarA.d || (templateWrapper = yaVarA.c) == null) ? TemplateWrapper.wrap(aczVarB) : TemplateWrapper.wrap(aczVarB, new TemplateInfo(templateWrapper.getTemplate().getClass(), templateWrapper.getId()).getTemplateId());
            yaVarA.d = false;
            yaVarA.c = templateWrapperWrap;
            ArrayList arrayList = new ArrayList();
            for (ya yaVar : ybVar.a) {
                if (yaVar.c == null) {
                    yaVar.c = TemplateWrapper.wrap(yaVar.b());
                }
                arrayList.add(new TemplateInfo(yaVar.c.getTemplate().getClass(), yaVar.c.getId()));
            }
            templateWrapperWrap.setTemplateInfosForScreenStack(arrayList);
        }
        return templateWrapperWrap;
    }
}
