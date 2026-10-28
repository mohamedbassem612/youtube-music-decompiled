package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afim extends qrb {
    private static final agrf b = agrf.h("com/google/apps/tiktok/account/data/manager/AccountDataStoreIOExceptionHandler");
    public final abhh a;
    private final agev c;
    private final awmd d;
    private final Executor e;

    public afim(abhh abhhVar, agev agevVar, awmd awmdVar, Executor executor) {
        this.a = abhhVar;
        this.c = agevVar;
        this.d = awmdVar;
        this.e = executor;
    }

    @Override // defpackage.qrb
    public final ListenableFuture a(IOException iOException, qrc qrcVar) {
        if (!((Boolean) ((agfa) this.c).a).booleanValue()) {
            return ahng.m(iOException);
        }
        if (!(iOException instanceof FileNotFoundException) && !(iOException.getCause() instanceof FileNotFoundException) && !(iOException instanceof aiik) && !(iOException.getCause() instanceof aiik)) {
            return ahng.m(iOException);
        }
        ((agrc) ((agrc) ((agrc) b.b()).j(iOException)).k("com/google/apps/tiktok/account/data/manager/AccountDataStoreIOExceptionHandler", "handleReadException", (char) 127, "AccountDataStoreIOExceptionHandler.java")).t("AccountDataStore read failed. Trying to recover by resetting the store and wiping out all the account data.");
        agke agkeVarN = this.a.n(false);
        int i = ((agpi) agkeVarN).d;
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = Integer.parseInt(((File) agkeVarN.get(i3)).getName());
            if (i4 > i2) {
                i2 = i4;
            }
        }
        Set<afil> set = (Set) ((aupo) this.d).b;
        ArrayList arrayList = new ArrayList(set.size());
        for (afil afilVar : set) {
            afilVar.getClass();
            arrayList.add(ahng.s(afwl.c(new afgi(afilVar, 2)), MoreExecutors.directExecutor()));
        }
        ahek ahekVarG = ahng.g(arrayList);
        okp okpVar = new okp(15);
        Executor executor = this.e;
        return ahbz.f(aheo.p(ahekVarG.a(okpVar, executor)).r(afwl.d(new aekb(this, 3)), executor).r(afwl.d(new hsx(qrcVar, i2, 7)), executor), IOException.class, afwl.d(new aekb(iOException, 4)), MoreExecutors.directExecutor());
    }
}
