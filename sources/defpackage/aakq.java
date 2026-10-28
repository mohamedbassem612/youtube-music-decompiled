package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aakq {
    private static final agrf h = agrf.h("com/google/android/libraries/youtube/offline/features/entitycontroller/OfflineImageUrlResolverImpl");
    public final wco b;
    public final zwb c;
    public final Executor d;
    public ListenableFuture f;
    public aakp g;
    private final tbt i;
    private final rrh j;
    private final boolean l;
    private final boolean m;
    private final aifk n;
    private final abxv o;
    public final Object a = new Object();
    private Boolean k = null;
    final Map e = new HashMap();

    public aakq(wco wcoVar, zwb zwbVar, tbt tbtVar, Executor executor, abxv abxvVar, rrh rrhVar, boolean z, boolean z2, aifk aifkVar) {
        this.b = wcoVar;
        this.c = zwbVar;
        this.i = tbtVar;
        this.d = executor;
        this.o = abxvVar;
        this.j = rrhVar;
        this.l = z;
        this.m = z2;
        this.n = aifkVar;
    }

    private final String g(zwa zwaVar, String str) {
        String str2;
        amtc amtcVar;
        synchronized (this) {
            str2 = (String) this.e.get(str);
        }
        if (str2 != null || f()) {
            return str2;
        }
        wcn wcnVarB = this.b.b(zwaVar);
        abxv abxvVar = this.o;
        ArrayList arrayList = new ArrayList();
        tzk.ah(aagt.a, 1, str, abxvVar, arrayList);
        agke agkeVar = (agke) wcnVarB.s(tzk.ai(abxvVar, arrayList)).E();
        if (agkeVar.isEmpty() || (amtcVar = (amtc) wcnVarB.g((String) agkeVar.get(0)).g(amtc.class).E()) == null || !amtcVar.f()) {
            return null;
        }
        String localImageUrl = amtcVar.getLocalImageUrl();
        synchronized (this) {
            this.e.put(str, localImageUrl);
        }
        return localImageUrl;
    }

    private final boolean h() {
        return !this.c.e().h();
    }

    public final String a(String str) {
        zwa zwaVarE = this.c.e();
        if (zwaVarE.h()) {
            return null;
        }
        String strG = g(zwaVarE, str);
        try {
            if (this.m && strG == null) {
                Uri uri = Uri.parse(str);
                aifk aifkVar = this.n;
                if (aifkVar.b(uri)) {
                    String string = aifkVar.c(new aifn(), uri).toString();
                    if (!str.equals(string) && (strG = g(zwaVarE, string)) != null) {
                        synchronized (this) {
                            this.e.put(str, strG);
                        }
                    }
                }
            }
            return strG;
        } catch (oam e) {
            String str2 = strG;
            ((agrc) ((agrc) ((agrc) h.b()).j(e)).k("com/google/android/libraries/youtube/offline/features/entitycontroller/OfflineImageUrlResolverImpl", "resolveRemoteImageUrl", (char) 177, "OfflineImageUrlResolverImpl.java")).t("Failed to remove FIFE options during offline lookup!");
            return str2;
        }
    }

    public final synchronized void b(String str, String str2) {
        if (h()) {
            this.e.put(str, str2);
        }
    }

    final void c(zwa zwaVar) {
        this.d.execute(afwl.i(new wdd(this, zwaVar, 15, (byte[]) null)));
    }

    public final void d() {
        this.i.f(this);
        c(this.c.e());
    }

    public final synchronized void e(String str) {
        if (h()) {
            Collection.EL.removeIf(this.e.entrySet(), new aajl(str, 4));
        }
    }

    public final boolean f() {
        if (!this.l) {
            return false;
        }
        Boolean boolValueOf = this.k;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.j.e() != 2);
            this.k = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        c(this.c.e());
    }

    @tcc
    public synchronized void handleSignOutEvent(zwu zwuVar) {
        this.e.clear();
    }
}
