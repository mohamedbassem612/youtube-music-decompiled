package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abhh {
    public final Object a;
    public final Object b;

    public abhh(abvk abvkVar, abhf abhfVar) {
        this.a = abvkVar;
        abhfVar.getClass();
        this.b = abhfVar;
        ((hyr) abhfVar).c.n = this;
    }

    private final ContentProviderClient B(Uri uri) throws afld, afla {
        String authority = uri.getAuthority();
        cmw cmwVar = new cmw(this, uri, 17);
        Object obj = null;
        try {
            Object objIo = cmwVar.io();
            e = null;
            obj = objIo;
        } catch (SecurityException e) {
            e = e;
        }
        if (obj != null) {
            return (ContentProviderClient) obj;
        }
        ProviderInfo providerInfoResolveContentProvider = ((PackageManager) this.b).resolveContentProvider(authority, 786944);
        if (providerInfoResolveContentProvider == null) {
            throw new afla(authority, e);
        }
        throw new afld(providerInfoResolveContentProvider, e);
    }

    public static String h(String[] strArr, Uri uri, Bundle bundle) {
        return i(strArr, uri, bundle.getString("android:query-arg-sql-selection"), bundle.getString("android:query-arg-sql-sort-order"));
    }

    public static String i(String[] strArr, Uri uri, String str, String str2) {
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(Arrays.toString(strArr));
        sb.append(" FROM ");
        sb.append(uri.getAuthority());
        if (str != null) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        if (str2 != null) {
            sb.append(" ORDER BY ");
            sb.append(str2);
        }
        return sb.toString();
    }

    public static /* synthetic */ afhn t(afiw afiwVar) {
        affd affdVarA = affd.a(afiwVar.c);
        afhq afhqVar = afiwVar.d;
        if (afhqVar == null) {
            afhqVar = afhq.a;
        }
        int iAS = a.aS(afiwVar.e);
        if (iAS == 0) {
            iAS = 1;
        }
        return new afhn(affdVarA, afhqVar, iAS);
    }

    public final void A(String str, Bitmap bitmap, Bundle bundle, List list, String str2) {
        aeqm aeqmVar = new aeqm(bundle, list);
        kvm kvmVar = new kvm((Context) this.a);
        kvmVar.b(aeqmVar);
        if (bitmap != null) {
            kvmVar.a = bitmap;
        }
        if (str2 != null) {
            kvmVar.c = str2;
        }
        if (str != null) {
            kvmVar.b = str;
        }
        ((lmm) this.b).h(kvmVar.a());
    }

    public final avmn[] a(abvn abvnVar) {
        int i = 2;
        int i2 = 1;
        int i3 = 9;
        return new avmn[]{abvnVar.M(new abhg(i2), new abhg(0)).i(aawb.y(abvnVar.X(), 1048576L)).i(new abwr(i2)).al(new abhb(this, i), new abeq(i3)), abvnVar.M(new abhg(i2), new abhg(i)).i(aawb.y(abvnVar.X(), 1048576L)).i(new abwr(i2)).al(new abhb(this, 3), new abeq(i3))};
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, tqj] */
    public final void b() {
        if (((abmt) this.b.io()).bl()) {
            tqh tqhVarD = this.a.d(6);
            int i = tqr.a;
            tqhVarD.b(88642, 0L);
            tqhVarD.b(88641, 0L);
            tqhVarD.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, tqj] */
    public final void c() {
        if (((abmt) this.b.io()).bl()) {
            tqh tqhVarD = this.a.d(6);
            int i = tqr.a;
            tqhVarD.b(350787, 0L);
            tqhVarD.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, tqj] */
    public final void d(boolean z) {
        if (((abmt) this.b.io()).bl()) {
            tqh tqhVarD = this.a.d(6);
            int i = tqr.a;
            tqhVarD.b(88642, true != z ? 0L : 1L);
            tqhVarD.b(88641, 1L);
            tqhVarD.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, tqj] */
    public final void e(String str) {
        str.getClass();
        if (((abmt) this.b.io()).bl()) {
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            byte[] bArrCopyOf = Arrays.copyOf(bytes, 16);
            bArrCopyOf.getClass();
            long jMin = Math.min(bytes.length, 16);
            tqh tqhVarD = this.a.d(6);
            int i = tqr.a;
            tqhVarD.b(350787, jMin);
            tqhVarD.c(8411776, bArrCopyOf);
            tqhVarD.a();
        }
    }

    public final aciw f(acjb acjbVar, abni abniVar, wjf wjfVar) {
        long jD = wjfVar.d();
        boolean zAr = ((abmt) this.a).ar();
        return acjbVar.s(wjfVar, abniVar.a, 0L, jD, null, null, 1, abniVar.c, null, null, zAr);
    }

    public final Object g(Uri uri, aflc aflcVar) throws afkx {
        try {
            ContentProviderClient contentProviderClientB = B(uri);
            try {
                Object objA = aflcVar.a(contentProviderClientB);
                contentProviderClientB.close();
                return objA;
            } catch (Throwable th) {
                try {
                    contentProviderClientB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (OperationApplicationException | RemoteException | FileNotFoundException | RuntimeException e) {
            throw new afkx(e);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [abhf, java.lang.Object] */
    @tcc
    public void handleSubtitleTrackChangedEvent(aazb aazbVar) {
        ?? r3 = this.b;
        acca accaVar = aazbVar.b;
        hyr hyrVar = (hyr) r3;
        hyrVar.c.m = accaVar;
        String string = null;
        if (accaVar != null && !accaVar.g() && !accaVar.q) {
            string = accaVar.toString();
        }
        hyrVar.d.f(string);
        if (accaVar == null || accaVar.g() || accaVar.q) {
            r3.b(false);
        } else {
            r3.b(true);
        }
    }

    @tcc
    public void handleSubtitleTracksAvailabilityEvent(aazc aazcVar) {
        Object obj = this.b;
        boolean z = aazcVar.a;
        hyr hyrVar = (hyr) obj;
        hyrVar.b = z;
        hyrVar.d.g(z);
    }

    public final Cursor j(Uri uri, afkv afkvVar, agfr agfrVar) throws Exception {
        ContentProviderClient contentProviderClientB = B(uri);
        try {
            Cursor cursorA = afkvVar.a(contentProviderClientB);
            if (cursorA != null) {
                return new afkw(cursorA, contentProviderClientB);
            }
            throw new aflb("Null returned from query: " + ((String) agfrVar.io()));
        } catch (aflb e) {
            e = e;
            contentProviderClientB.close();
            throw new afkx(e);
        } catch (RemoteException e2) {
            e = e2;
            contentProviderClientB.close();
            throw new afkx(e);
        } catch (Error e3) {
            contentProviderClientB.close();
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            contentProviderClientB.close();
            throw new afkx(e);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [awut, java.lang.Object] */
    public final bec k(afqy afqyVar) {
        MessageLite messageLite = afqyVar.c;
        messageLite.getClass();
        ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
        generatedRegistry.getClass();
        bgd bgdVar = new bgd(messageLite, generatedRegistry);
        Optional optional = afqyVar.e;
        optional.getClass();
        bgr bgrVar = (bgr) optional.orElse(null);
        bgz bgzVar = new bgz(afqyVar, this, 7, null);
        agke agkeVar = afqyVar.b;
        agkeVar.getClass();
        return azt.e(bgdVar, bgrVar, agkeVar, this.b, bgzVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ahex, java.lang.Object] */
    public final ListenableFuture l(File file) {
        return this.a.submit(afwl.j(new aegt(file, 8)));
    }

    public final agke m(final agkz agkzVar, final agkz agkzVar2, final boolean z) {
        boolean z2 = false;
        if (agkzVar != null ? agkzVar2 == null : agkzVar2 != null) {
            z2 = true;
        }
        ahno.F(z2);
        agjz agjzVar = new agjz(4);
        agqr it = ((auor) this.a).h().iterator();
        while (it.hasNext()) {
            File[] fileArrListFiles = new File((File) it.next(), "accounts").listFiles(new FilenameFilter() { // from class: afiy
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    File file2 = new File(file, str);
                    try {
                        Integer numValueOf = Integer.valueOf(str);
                        if (numValueOf.intValue() < 0) {
                            return false;
                        }
                        agkz agkzVar3 = agkzVar2;
                        if (agkzVar3 != null && agkzVar3.contains(numValueOf)) {
                            return false;
                        }
                        agkz agkzVar4 = agkzVar;
                        if ((agkzVar4 == null || agkzVar4.contains(numValueOf)) && file2.isDirectory()) {
                            return !z || file2.canWrite();
                        }
                        return false;
                    } catch (NumberFormatException unused) {
                        return false;
                    }
                }
            });
            if (fileArrListFiles != null) {
                agjzVar.i(fileArrListFiles);
            }
        }
        return agjzVar.g();
    }

    public final agke n(boolean z) {
        return m(null, agpr.a, z);
    }

    public final ListenableFuture o(agke agkeVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((agpi) agkeVar).d; i++) {
            arrayList.add(((abhh) this.b).l((File) agkeVar.get(i)));
        }
        return ahng.g(arrayList).a(new aegt(arrayList, 7), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ahex, java.lang.Object] */
    public final ListenableFuture p() {
        return this.a.submit(afwl.j(new aegt(this, 6)));
    }

    public final File q() throws FileNotFoundException {
        File fileE = ((jij) this.b).E();
        File parentFile = fileE.getParentFile();
        if (parentFile.mkdirs() || (parentFile.exists() && parentFile.isDirectory())) {
            return fileE;
        }
        throw new FileNotFoundException("Cannot create parent directory.");
    }

    public final ListenableFuture r() {
        ListenableFuture listenableFutureC = ((qrx) this.b).c();
        return !listenableFutureC.isDone() ? new afij(this, listenableFutureC) : listenableFutureC;
    }

    public final ListenableFuture s(agek agekVar, Executor executor) {
        return new afij(this, ((qrx) this.b).a(agekVar, new afik(this, executor, 1)));
    }

    public final ListenableFuture u(affd affdVar) {
        return ahbz.e(ahcs.e(((abhh) ((agfa) this.b).a).y(affdVar), afwl.a(new aeqk(this, 7)), MoreExecutors.directExecutor()), IllegalArgumentException.class, afwl.a(new aeni(3)), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    public final agkj v() {
        Set<afhy> set = (Set) this.a.io();
        agkh agkhVar = new agkh(4);
        for (afhy afhyVar : set) {
            String str = afhyVar.a;
            if (str.isEmpty()) {
                throw new IllegalArgumentException("AccountProvider's account type cannot be an empty string.");
            }
            agkhVar.e(str, afhyVar.b);
        }
        return agkhVar.d(true);
    }

    public final ListenableFuture w(affd affdVar) {
        Object obj = this.a;
        ListenableFuture listenableFutureR = ((abhh) ((afip) obj).a).r();
        idm idmVar = new idm(obj, affdVar, 19, null);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), idmVar, 1);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        int i = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureR, ahdbVar);
        listenableFutureR.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
        return ahcqVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture x(String str, String str2) {
        abhh abhhVar = (abhh) this.b;
        ListenableFuture listenableFutureR = ((abhh) abhhVar.b).r();
        idv idvVar = new idv(str, str2, 10);
        ?? r3 = abhhVar.a;
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), idvVar);
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureR, afwiVar);
        listenableFutureR.addListener(ahcrVar, MoreExecutors.c(r3, ahcrVar));
        return ahcrVar;
    }

    public final ListenableFuture y(affd affdVar) {
        ListenableFuture listenableFutureR = ((abhh) ((abhh) this.b).b).r();
        vzs vzsVar = new vzs(affdVar, 18);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), vzsVar);
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureR, afwiVar);
        listenableFutureR.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture z() {
        abhh abhhVar = (abhh) this.b;
        ListenableFuture listenableFutureR = ((abhh) abhhVar.b).r();
        abzy abzyVar = new abzy(11);
        ?? r4 = abhhVar.a;
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), abzyVar);
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureR, afwiVar);
        listenableFutureR.addListener(ahcrVar, MoreExecutors.c(r4, ahcrVar));
        return ahcrVar;
    }

    public abhh(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public abhh(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public abhh(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public abhh(Object obj, Executor executor) {
        this.b = obj;
        this.a = executor;
    }

    public abhh(awmd awmdVar, Executor executor) {
        this.b = executor;
        this.a = awmdVar;
    }

    public abhh(agev agevVar, agev agevVar2) {
        this.b = agevVar;
        this.a = agevVar2;
        Boolean.FALSE.booleanValue();
    }

    public abhh(awut awutVar, afiz afizVar) {
        awutVar.getClass();
        this.b = awutVar;
        this.a = afizVar;
    }

    public abhh() {
        awku awkuVar = new awku();
        this.b = awkuVar;
        this.a = awkuVar;
    }

    public abhh(abwk abwkVar, abmt abmtVar) {
        abwkVar.getClass();
        abmtVar.getClass();
        this.b = abwkVar;
        this.a = abmtVar;
    }

    public abhh(tqj tqjVar, awmd awmdVar) {
        tqjVar.getClass();
        awmdVar.getClass();
        this.a = tqjVar;
        this.b = awmdVar;
    }

    public abhh(awmd awmdVar, awmd awmdVar2, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
    }

    public abhh(awmd awmdVar, awmd awmdVar2, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
    }
}
