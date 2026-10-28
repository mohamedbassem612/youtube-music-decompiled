package defpackage;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zzr implements syk {
    private final /* synthetic */ int $cid;
    public final Object a;
    private final Object b;

    public zzr(awmd awmdVar, awmd awmdVar2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = awmdVar;
        this.a = awmdVar2;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [awmd, java.lang.Object] */
    @Override // defpackage.syk
    public final int a(Bundle bundle) {
        aaqn aaqnVarB;
        aaqn aaqnVarB2;
        aaqn aaqnVarB3;
        ListenableFuture listenableFutureA;
        ListenableFuture listenableFutureB;
        int i = this.$cid;
        int i2 = 1;
        if (i == 0) {
            String string = bundle.getString("renderer_class_name");
            if (string != null) {
                String string2 = bundle.getString("unique_payload_id");
                byte[] byteArray = bundle.getByteArray("com.google.android.libraries.youtube.notification.pref.notification_renderer");
                if (byteArray != null) {
                    ((zzs) this.a).a(byteArray, string);
                    return 0;
                }
                if (string2 != null) {
                    Object obj = this.b;
                    int i3 = 17;
                    byte[] bArr = null;
                    return ((Integer) taf.e(ahcs.e(ahcs.f(ahcs.e(((qrx) ((elr) obj).a).c(), new xwd(string2, i3), MoreExecutors.directExecutor()), new row(obj, string2, i3, bArr), MoreExecutors.directExecutor()), new aaat(this, string, i2, bArr), MoreExecutors.directExecutor()), 1L, TimeUnit.HOURS, 1)).intValue();
                }
            }
        } else {
            if (i == 1) {
                if (((ztn) this.b.io()).a()) {
                    return 0;
                }
                ((zst) this.a.io()).g(akku.a(((Integer) bundle.get("tier_type")).intValue()));
                return 0;
            }
            if (i == 2) {
                String string3 = bundle.getString("identityId");
                if (string3 != null && (aaqnVarB = aacv.b((aanb) this.b.io(), string3)) != null) {
                    if (((aacl) this.a.io()).b(string3, aaqnVarB) == 0) {
                        return 0;
                    }
                    return 2;
                }
            } else if (i == 3) {
                String string4 = bundle.getString("identityId");
                if (string4 != null && (aaqnVarB2 = aacv.b((aanb) this.b.io(), string4)) != null) {
                    return aacv.a(((aapr) this.a.io()).a(string4, aaqnVarB2));
                }
            } else if (i != 4) {
                Object obj2 = this.b;
                int i4 = 5;
                if (i != 5) {
                    if (aajc.j(bundle, (grj) obj2)) {
                        try {
                            Object obj3 = this.a;
                            int iA = aajc.a(bundle);
                            if (((aajk) obj3).d.R()) {
                                ListenableFuture listenableFutureB2 = ((aajk) obj3).c.b();
                                afxd afxdVarF = afxd.f(listenableFutureB2);
                                aagw aagwVar = new aagw(obj3, i4);
                                Executor executor = ((aajk) obj3).a;
                                afxd afxdVarG = afxdVarF.g(aagwVar, executor).g(new xwx(19), MoreExecutors.directExecutor());
                                listenableFutureB = ahng.h(listenableFutureB2, afxdVarG).b(afwl.c(new aaji((aajk) obj3, listenableFutureB2, afxdVarG, iA, 1)), executor);
                            } else {
                                listenableFutureB = ahng.n(aakb.a());
                            }
                            if (((rv) listenableFutureB.get()).a()) {
                                return 0;
                            }
                        } catch (InterruptedException | ExecutionException e) {
                            if (e instanceof InterruptedException) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                } else if (aajc.j(bundle, (grj) obj2)) {
                    try {
                        Object obj4 = this.a;
                        int iA2 = aajc.a(bundle);
                        if (((aajk) obj4).d.R()) {
                            ListenableFuture listenableFutureB3 = ((aajk) obj4).c.b();
                            ListenableFuture listenableFutureA2 = ((aajk) obj4).a();
                            ListenableFuture listenableFutureB4 = ahng.h(listenableFutureB3, listenableFutureA2).b(afwl.c(new aaji((aajk) obj4, listenableFutureB3, listenableFutureA2, iA2, 0)), ((aajk) obj4).a);
                            listenableFutureA = ahng.h(listenableFutureB4, listenableFutureB3).a(afwl.j(new wci(listenableFutureB3, listenableFutureB4, 18)), MoreExecutors.directExecutor());
                        } else {
                            listenableFutureA = ahng.n(aakb.a());
                        }
                        if (((rv) listenableFutureA.get()).a()) {
                            return 0;
                        }
                    } catch (InterruptedException | ExecutionException e2) {
                        if (e2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            } else {
                String string5 = bundle.getString("identityId");
                if (string5 != null && (aaqnVarB3 = aacv.b((aanb) this.a.io(), string5)) != null) {
                    if (((aarg) this.b.io()).a(string5, aaqnVarB3, bundle.getBoolean("forceSync", false)) == 0) {
                        return 0;
                    }
                    return 2;
                }
            }
        }
        return 1;
    }

    public zzr(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
