package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pqu implements pqm {
    public static final agsn a = agsn.h("GnpSdk");
    public final aunn b;
    public final axff c;
    private final Context d;
    private final pqg e;
    private final awou f;
    private final awou g;

    public pqu(Context context, aunn aunnVar, pqg pqgVar, awou awouVar, awou awouVar2) {
        context.getClass();
        aunnVar.getClass();
        pqgVar.getClass();
        awouVar.getClass();
        awouVar2.getClass();
        this.d = context;
        this.b = aunnVar;
        this.e = pqgVar;
        this.f = awouVar;
        this.g = awouVar2;
        this.c = new axfi(false);
    }

    @Override // defpackage.pqm
    public final pky a(pql pqlVar) {
        SecurityException e;
        long jC;
        String str;
        try {
            aihf aihfVarCreateBuilder = aiah.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            aihf aihfVarCreateBuilder2 = aiao.a.createBuilder();
            aihfVarCreateBuilder2.getClass();
            Context context = this.d;
            String packageName = context.getPackageName();
            packageName.getClass();
            ahno.v(packageName, aihfVarCreateBuilder2);
            Object systemService = context.getSystemService("user");
            systemService.getClass();
            long serialNumberForUser = ((UserManager) systemService).getSerialNumberForUser(Process.myUserHandle());
            if (serialNumberForUser != -1) {
                ahno.w(serialNumberForUser, aihfVarCreateBuilder2);
            }
            if (pqlVar.a) {
                ahno.x(this.e.c(), aihfVarCreateBuilder2);
            }
            if (pqlVar.b && (str = (String) awqx.l(this.g, new dnz(this, (awoq) null, 10))) != null && str.length() != 0) {
                aihfVarCreateBuilder2.copyOnWrite();
                aiao aiaoVar = (aiao) aihfVarCreateBuilder2.instance;
                aiaoVar.b |= 2;
                aiaoVar.d = str;
            }
            if (pqlVar.c) {
                UserManager userManager = (UserManager) context.getSystemService("user");
                try {
                    if (!auvj.a.io().d() || userManager == null || userManager.isSystemUser()) {
                        jC = lsx.a.c(context.getContentResolver(), -1L);
                        if (jC == -1) {
                            try {
                                ((agsj) a.c()).t("Failed to get android ID.");
                            } catch (SecurityException e2) {
                                e = e2;
                                ((agsj) ((agsj) a.b()).j(e)).t("Exception reading GServices key.");
                            }
                        }
                    } else {
                        jC = -1;
                    }
                } catch (SecurityException e3) {
                    e = e3;
                    jC = -1;
                }
                if (jC != -1) {
                    ahno.u(jC, aihfVarCreateBuilder2);
                }
            }
            ahno.z(ahno.t(aihfVarCreateBuilder2), aihfVarCreateBuilder);
            return new pla(ahno.y(aihfVarCreateBuilder));
        } catch (pqh e4) {
            return new pqs(e4, pkx.g);
        }
    }

    @Override // defpackage.pqm
    public final Object b(awoq awoqVar) throws Throwable {
        Object objP = awro.p(this.f, new dnz(this, (awoq) null, 11, (byte[]) null), awoqVar);
        return objP != awox.a ? awmy.a : objP;
    }

    public final Object c(awoq awoqVar) {
        return awqx.o(((bec) this.b.io()).b(), awoqVar);
    }
}
