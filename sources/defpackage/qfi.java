package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qfi {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final nzx e;
    public final agfr f;
    public final agfr g;
    public final awmd h;
    public final agev i;
    public final agev j;
    public final agev k;
    public final int l;
    public final xsc m;

    public qfi(Context context, agev agevVar, String str, awmd awmdVar, xsc xscVar, agev agevVar2, agev agevVar3, agev agevVar4) {
        int i;
        this.a = context;
        this.h = awmdVar;
        this.b = context.getPackageName();
        this.c = qel.b(context);
        if (agevVar.g()) {
        }
        this.g = null;
        this.d = str;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
            i = 3;
        } else {
            i = packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        }
        this.l = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : i;
        this.e = new nzx(context);
        this.f = aguu.al(new ope(this, 14));
        this.m = xscVar;
        this.i = agevVar2;
        this.j = agevVar3;
        this.k = agevVar4;
    }
}
