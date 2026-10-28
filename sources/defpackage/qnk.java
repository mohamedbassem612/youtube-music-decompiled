package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qnk {
    public final String a;
    public final agfr b = new qnh(new ope(this, 17));
    final agfr c;
    final agfr d;
    Resources e;
    public final /* synthetic */ yre f;

    public qnk(yre yreVar, String str, agfr agfrVar) {
        this.f = yreVar;
        this.a = str;
        this.c = new qnh(new ovf(this, yreVar, str, 4, (char[]) null));
        this.d = agfrVar;
    }

    public final Resources a() throws PackageManager.NameNotFoundException {
        Resources resources = this.e;
        if (resources != null) {
            return resources;
        }
        yre yreVar = this.f;
        Resources resourcesForApplication = ((PackageManager) yreVar.c).getResourcesForApplication(this.a);
        this.e = resourcesForApplication;
        return resourcesForApplication;
    }
}
