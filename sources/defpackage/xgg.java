package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xgg {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public xgg(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.d = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
        awmdVar7.getClass();
        this.g = awmdVar7;
        this.h = awmdVar8;
        awmdVar9.getClass();
        this.i = awmdVar9;
        awmdVar10.getClass();
        this.j = awmdVar10;
        awmdVar11.getClass();
        this.k = awmdVar11;
        awmdVar12.getClass();
        this.l = awmdVar12;
        awmdVar13.getClass();
        this.m = awmdVar13;
    }

    public static void C(int i, ong ongVar, oip oipVar) {
        ongVar.k(i, oipVar.d, oipVar.f, oipVar.s, oipVar.t);
    }

    public static void D(ong ongVar, oip oipVar, oin oinVar, int i) {
        aihf aihfVarCreateBuilder = ahal.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahal ahalVar = (ahal) aihfVarCreateBuilder.instance;
        ahalVar.c = aext.f(i);
        ahalVar.b |= 1;
        String str = oipVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        ahal ahalVar2 = (ahal) aihfVarCreateBuilder.instance;
        str.getClass();
        ahalVar2.b |= 2;
        ahalVar2.d = str;
        int i2 = oipVar.f;
        aihfVarCreateBuilder.copyOnWrite();
        ahal ahalVar3 = (ahal) aihfVarCreateBuilder.instance;
        ahalVar3.b |= 4;
        ahalVar3.e = i2;
        long j = oipVar.s;
        aihfVarCreateBuilder.copyOnWrite();
        ahal ahalVar4 = (ahal) aihfVarCreateBuilder.instance;
        ahalVar4.b |= SemanticState.Focused;
        ahalVar4.i = j;
        String str2 = oipVar.t;
        aihfVarCreateBuilder.copyOnWrite();
        ahal ahalVar5 = (ahal) aihfVarCreateBuilder.instance;
        str2.getClass();
        ahalVar5.b |= SemanticState.Hidden;
        ahalVar5.j = str2;
        String str3 = oinVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        ahal ahalVar6 = (ahal) aihfVarCreateBuilder.instance;
        str3.getClass();
        ahalVar6.b |= 8;
        ahalVar6.f = str3;
        ongVar.d((ahal) aihfVarCreateBuilder.build());
    }

    public static agev c(oip oipVar, oip oipVar2) {
        if (oipVar2.s != oipVar.s) {
            return agev.i(ahba.NEW_BUILD_ID);
        }
        if (!oipVar2.t.equals(oipVar.t)) {
            return agev.i(ahba.NEW_VARIANT_ID);
        }
        if (oipVar2.f != oipVar.f) {
            return agev.i(ahba.NEW_VERSION_NUMBER);
        }
        if (!u(oipVar, oipVar2)) {
            return agev.i(ahba.DIFFERENT_FILES);
        }
        aifv aifvVar = oipVar2.h;
        if (aifvVar == null) {
            aifvVar = aifv.a;
        }
        aifv aifvVar2 = oipVar.h;
        if (aifvVar2 == null) {
            aifvVar2 = aifv.a;
        }
        if (!aifvVar.equals(aifvVar2)) {
            return agev.i(ahba.DIFFERENT_CUSTOM_METADATA);
        }
        if (oipVar2.k != oipVar.k) {
            return agev.i(ahba.DIFFERENT_STALE_LIFETIME);
        }
        if (oipVar2.l != oipVar.l) {
            return agev.i(ahba.DIFFERENT_EXPIRATION_DATE);
        }
        oir oirVar = oipVar2.m;
        if (oirVar == null) {
            oirVar = oir.a;
        }
        oir oirVar2 = oipVar.m;
        if (oirVar2 == null) {
            oirVar2 = oir.a;
        }
        if (!oirVar.equals(oirVar2)) {
            return agev.i(ahba.DIFFERENT_DOWNLOAD_CONDITIONS);
        }
        int iAS = a.aS(oipVar2.j);
        if (iAS == 0) {
            iAS = 1;
        }
        int iAS2 = a.aS(oipVar.j);
        if (iAS2 == 0) {
            iAS2 = 1;
        }
        if (iAS != iAS2) {
            return agev.i(ahba.DIFFERENT_ALLOWED_READERS);
        }
        int iA = nsw.a(oipVar2.r);
        if (iA == 0) {
            iA = 1;
        }
        int iA2 = nsw.a(oipVar.r);
        if (iA != (iA2 != 0 ? iA2 : 1)) {
            return agev.i(ahba.DIFFERENT_DOWNLOAD_POLICY);
        }
        axif axifVar = oipVar2.v;
        if (axifVar == null) {
            axifVar = axif.a;
        }
        axif axifVar2 = oipVar.v;
        if (axifVar2 == null) {
            axifVar2 = axif.a;
        }
        return !axifVar.equals(axifVar2) ? agev.i(ahba.DIFFERENT_EXPERIMENT_INFO) : agdf.a;
    }

    public static boolean u(oip oipVar, oip oipVar2) {
        return oipVar.o.equals(oipVar2.o);
    }

    public static boolean w(ojb ojbVar, long j) {
        return j > ojbVar.f;
    }

    public static final ahai x(oip oipVar) {
        aihf aihfVarCreateBuilder = ahai.a.createBuilder();
        String str = oipVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        ahai ahaiVar = (ahai) aihfVarCreateBuilder.instance;
        str.getClass();
        ahaiVar.b |= 1;
        ahaiVar.c = str;
        String str2 = oipVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        ahai ahaiVar2 = (ahai) aihfVarCreateBuilder.instance;
        str2.getClass();
        ahaiVar2.b |= 4;
        ahaiVar2.e = str2;
        int i = oipVar.f;
        aihfVarCreateBuilder.copyOnWrite();
        ahai ahaiVar3 = (ahai) aihfVarCreateBuilder.instance;
        ahaiVar3.b |= 2;
        ahaiVar3.d = i;
        long j = oipVar.s;
        aihfVarCreateBuilder.copyOnWrite();
        ahai ahaiVar4 = (ahai) aihfVarCreateBuilder.instance;
        ahaiVar4.b |= 64;
        ahaiVar4.i = j;
        String str3 = oipVar.t;
        aihfVarCreateBuilder.copyOnWrite();
        ahai ahaiVar5 = (ahai) aihfVarCreateBuilder.instance;
        str3.getClass();
        ahaiVar5.b |= SemanticState.Focused;
        ahaiVar5.j = str3;
        return (ahai) aihfVarCreateBuilder.build();
    }

    public static final void y(List list, oiw oiwVar) throws oig {
        onb.e("%s downloadFileGroup %s %s can't finish!", "FileGroupManager", oiwVar.c, oiwVar.d);
        ohs.b(list, oiwVar.c);
        onb.c("%s: An unknown error has occurred during download", "FileGroupManager");
        acb acbVarA = oig.a();
        acbVarA.b = oif.UNKNOWN_ERROR;
        throw acbVarA.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture A(final oip oipVar, final oin oinVar, final oiz oizVar, final ojb ojbVar, final int i) throws onr {
        final String str = oinVar.o;
        final long j = oipVar.l;
        int iAS = a.aS(oizVar.f);
        if (iAS == 0) {
            iAS = 1;
        }
        int i2 = iAS;
        Object obj = this.f;
        Context context = (Context) obj;
        Uri uriBR = qnl.bR(context, i2, ojbVar.c, oinVar.g, (qnl) this.e, (agev) this.b, false);
        if (uriBR == null) {
            onb.c("%s: Failed to get file uri!", "FileGroupManager");
            throw new onr(28, "Failed to get local file uri");
        }
        Object obj2 = this.j;
        return ooi.d(ahno.aq(new itk(context, str, (ayq) obj2, uriBR, oinVar, oipVar, 2), this.g)).f(new ahcy() { // from class: okr
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj3) {
                final xgg xggVar = this.h;
                final int i3 = i;
                final oip oipVar2 = oipVar;
                final oin oinVar2 = oinVar;
                ojb ojbVar2 = ojbVar;
                final oiz oizVar2 = oizVar;
                String str2 = str;
                final long j2 = j;
                return xggVar.s(xggVar.B(oipVar2, oinVar2, ojbVar2, oizVar2, str2, j2, i3), new ahcy() { // from class: okq
                    @Override // defpackage.ahcy
                    public final ListenableFuture a(Object obj4) {
                        if (((Boolean) obj4).booleanValue() || i3 == 6) {
                            return aher.a;
                        }
                        long j3 = j2;
                        oiz oizVar3 = oizVar2;
                        oin oinVar3 = oinVar2;
                        return xggVar.t(oipVar2, oinVar3, oizVar3, j3);
                    }
                });
            }
        }, this.k);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture B(final oip oipVar, final oin oinVar, ojb ojbVar, final oiz oizVar, final String str, long j, final int i) {
        if (ojbVar.e && !w(ojbVar, j)) {
            D((ong) this.d, oipVar, oinVar, i);
            return ahng.n(Boolean.TRUE);
        }
        final long jMax = Math.max(j, ojbVar.f);
        Object obj = this.f;
        Object obj2 = this.j;
        final ayq ayqVar = (ayq) obj2;
        final Context context = (Context) obj;
        return s(ahno.aq(new ahcx() { // from class: onq
            @Override // defpackage.ahcx
            public final ListenableFuture a() throws onr {
                String message = "";
                Context context2 = context;
                String str2 = str;
                long j2 = jMax;
                ayq ayqVar2 = ayqVar;
                oin oinVar2 = oinVar;
                oip oipVar2 = oipVar;
                int i2 = 0;
                try {
                    agfm agfmVar = qps.a;
                    OutputStream outputStream = (OutputStream) ayqVar2.X(rmp.G(String.valueOf(str2).concat(".lease"), context2.getPackageName(), j2), new qqu());
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (IOException unused) {
                    onb.e("%s: Failed to acquire lease for file %s, file group %s", "AndroidSharingUtil", oinVar2.c, oipVar2.d);
                    message = String.format("Error while acquiring lease for file %s, group %s", oinVar2.c, oipVar2.d);
                    i2 = 20;
                } catch (qpy unused2) {
                    onb.e("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", oinVar2.c, oipVar2.d);
                    message = String.format("System limit exceeded for file %s, group %s", oinVar2.c, oipVar2.d);
                    i2 = 25;
                } catch (qqb unused3) {
                    onb.e("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", oinVar2.c, oipVar2.d);
                    message = String.format("Malformed lease Uri for file %s, group %s", oinVar2.c, oipVar2.d);
                    i2 = 18;
                } catch (qqf e) {
                    message = TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
                    String str3 = oinVar2.c;
                    String str4 = oipVar2.d;
                    int i3 = onb.a;
                    message = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(message));
                    i2 = 24;
                }
                if (i2 == 0) {
                    return aher.a;
                }
                throw new onr(i2, message);
            }
        }, this.g), new ahcy() { // from class: okj
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, omb] */
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj3) {
                aihf aihfVarCreateBuilder = ojb.a.createBuilder();
                oiv oivVar = oiv.DOWNLOAD_COMPLETE;
                aihfVarCreateBuilder.copyOnWrite();
                ojb ojbVar2 = (ojb) aihfVarCreateBuilder.instance;
                ojbVar2.d = oivVar.h;
                ojbVar2.b |= 2;
                aihfVarCreateBuilder.copyOnWrite();
                ojb ojbVar3 = (ojb) aihfVarCreateBuilder.instance;
                ojbVar3.b |= 1;
                String str2 = str;
                ojbVar3.c = "android_shared_".concat(String.valueOf(str2));
                aihfVarCreateBuilder.copyOnWrite();
                ojb ojbVar4 = (ojb) aihfVarCreateBuilder.instance;
                ojbVar4.b |= 4;
                ojbVar4.e = true;
                aihfVarCreateBuilder.copyOnWrite();
                ojb ojbVar5 = (ojb) aihfVarCreateBuilder.instance;
                ojbVar5.b |= 8;
                final long j2 = jMax;
                ojbVar5.f = j2;
                aihfVarCreateBuilder.copyOnWrite();
                ojb ojbVar6 = (ojb) aihfVarCreateBuilder.instance;
                str2.getClass();
                ojbVar6.b |= 16;
                ojbVar6.g = str2;
                ojb ojbVar7 = (ojb) aihfVarCreateBuilder.build();
                final xgg xggVar = this.g;
                ListenableFuture listenableFutureH = ((omn) xggVar.c).d.h(oizVar, ojbVar7);
                final oin oinVar2 = oinVar;
                final oip oipVar2 = oipVar;
                final int i2 = i;
                return xggVar.s(listenableFutureH, new ahcy() { // from class: okt
                    @Override // defpackage.ahcy
                    public final ListenableFuture a(Object obj4) {
                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        xgg xggVar2 = xggVar;
                        oip oipVar3 = oipVar2;
                        oin oinVar3 = oinVar2;
                        if (!zBooleanValue) {
                            onb.e("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", oinVar3.c, oipVar3.d);
                            xgg.D((ong) xggVar2.d, oipVar3, oinVar3, 15);
                            return ahng.n(Boolean.FALSE);
                        }
                        long j3 = j2;
                        int i3 = i2;
                        Object obj5 = xggVar2.d;
                        aihf aihfVarCreateBuilder2 = ahal.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahal ahalVar = (ahal) aihfVarCreateBuilder2.instance;
                        ahalVar.c = aext.f(i3);
                        ahalVar.b |= 1;
                        String str3 = oipVar3.d;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahal ahalVar2 = (ahal) aihfVarCreateBuilder2.instance;
                        str3.getClass();
                        ahalVar2.b |= 2;
                        ahalVar2.d = str3;
                        int i4 = oipVar3.f;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahal ahalVar3 = (ahal) aihfVarCreateBuilder2.instance;
                        ahalVar3.b |= 4;
                        ahalVar3.e = i4;
                        long j4 = oipVar3.s;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahal ahalVar4 = (ahal) aihfVarCreateBuilder2.instance;
                        ahalVar4.b |= SemanticState.Focused;
                        ahalVar4.i = j4;
                        String str4 = oipVar3.t;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahal ahalVar5 = (ahal) aihfVarCreateBuilder2.instance;
                        str4.getClass();
                        ahalVar5.b |= SemanticState.Hidden;
                        ahalVar5.j = str4;
                        String str5 = oinVar3.c;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahal ahalVar6 = (ahal) aihfVarCreateBuilder2.instance;
                        str5.getClass();
                        ahalVar6.b |= 8;
                        ahalVar6.f = str5;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahal ahalVar7 = (ahal) aihfVarCreateBuilder2.instance;
                        ahalVar7.b |= 16;
                        ahalVar7.g = true;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahal ahalVar8 = (ahal) aihfVarCreateBuilder2.instance;
                        ahalVar8.b |= 32;
                        ahalVar8.h = j3;
                        ((ong) obj5).d((ahal) aihfVarCreateBuilder2.build());
                        return ahng.n(Boolean.TRUE);
                    }
                });
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture E(oiw oiwVar, final oip oipVar, final ahcy ahcyVar, final elr elrVar) {
        int i = onb.a;
        aihf builder = oiwVar.toBuilder();
        builder.copyOnWrite();
        oiw oiwVar2 = (oiw) builder.instance;
        oiwVar2.b |= 8;
        oiwVar2.f = true;
        final oiw oiwVar3 = (oiw) builder.build();
        aihf builder2 = oiwVar.toBuilder();
        builder2.copyOnWrite();
        oiw oiwVar4 = (oiw) builder2.instance;
        oiwVar4.b |= 8;
        oiwVar4.f = false;
        final oiw oiwVar5 = (oiw) builder2.build();
        oio oioVar = oipVar.c;
        if (oioVar == null) {
            oioVar = oio.a;
        }
        final boolean z = (oioVar.b & 4) != 0;
        long jF = ((omj) this.i).f();
        oio oioVar2 = oipVar.c;
        if (oioVar2 == null) {
            oioVar2 = oio.a;
        }
        aihf builder3 = oioVar2.toBuilder();
        builder3.copyOnWrite();
        oio oioVar3 = (oio) builder3.instance;
        oioVar3.b |= 4;
        oioVar3.e = jF;
        oio oioVar4 = (oio) builder3.build();
        aihf builder4 = oipVar.toBuilder();
        builder4.copyOnWrite();
        oip oipVar2 = (oip) builder4.instance;
        oioVar4.getClass();
        oipVar2.c = oioVar4;
        oipVar2.b |= 1;
        final oip oipVar3 = (oip) builder4.build();
        ooi ooiVarD = ooi.d(j(oipVar));
        ahcy ahcyVar2 = new ahcy() { // from class: oku
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.concurrent.Executor] */
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                elr elrVar2 = elrVar;
                oip oipVar4 = oipVar;
                okz okzVar = (okz) obj;
                okz okzVar2 = okz.c;
                if (okzVar == okzVar2) {
                    elrVar2.f(1008, oipVar4);
                    return ahng.n(okzVar2);
                }
                okz okzVar3 = okz.a;
                if (okzVar == okzVar3) {
                    elrVar2.f(1007, oipVar4);
                    return ahng.n(okzVar3);
                }
                boolean z2 = z;
                oip oipVar5 = oipVar3;
                oiw oiwVar6 = oiwVar3;
                ahcy ahcyVar3 = ahcyVar;
                oiw oiwVar7 = oiwVar5;
                xgg xggVar = this.g;
                int i2 = 0;
                ahno.F(okzVar == okz.b);
                ooi ooiVarD2 = ooi.d(ahcyVar3.a(new omh(oiwVar7, oipVar4)));
                iaj iajVar = new iaj(xggVar, (Object) elrVar2, oipVar4, oiwVar7, 13);
                ?? r11 = xggVar.k;
                return ooiVarD2.f(iajVar, r11).f(new okn((Object) xggVar, (aihn) oipVar4, 7), r11).f(new ojk(xggVar, oiwVar6, oipVar5, 15), r11).f(new okn((Object) xggVar, (aihn) oiwVar7, 8), r11).f(new ods(xggVar, 10), r11).e(new oks(z2, elrVar2, oipVar5, i2), r11);
            }
        };
        ?? r2 = this.k;
        return ooiVarD.f(ahcyVar2, r2).f(new ods(this, 11), r2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    public final xgf a(xgu xguVar) {
        dov dovVar = (dov) this.a.io();
        dovVar.getClass();
        txp txpVar = (txp) this.b.io();
        txpVar.getClass();
        tbt tbtVar = (tbt) this.c.io();
        tbtVar.getClass();
        xgo xgoVar = (xgo) this.d.io();
        xgoVar.getClass();
        xgp xgpVar = (xgp) this.e.io();
        xgpVar.getClass();
        ((Context) this.f.io()).getClass();
        vxz vxzVar = (vxz) this.h.io();
        vxzVar.getClass();
        Executor executor = (Executor) this.j.io();
        executor.getClass();
        ((tre) this.k.io()).getClass();
        tqj tqjVar = (tqj) this.l.io();
        tqjVar.getClass();
        ?? r13 = this.m;
        return new xgf(xguVar, dovVar, txpVar, tbtVar, xgoVar, xgpVar, this.g, vxzVar, this.i, executor, tqjVar, r13);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [aunn, java.lang.Object] */
    public final vrx b(xgn xgnVar, wnf wnfVar, vph vphVar, vnr vnrVar, vps vpsVar) {
        Context context = (Context) this.l.io();
        context.getClass();
        hbu hbuVar = (hbu) this.d.io();
        hbuVar.getClass();
        aeda aedaVar = (aeda) this.g.io();
        aedaVar.getClass();
        adne adneVar = (adne) this.e.io();
        adneVar.getClass();
        vxz vxzVar = (vxz) this.b.io();
        ?? Io = this.k.io();
        Io.getClass();
        vxe vxeVar = (vxe) this.f.io();
        vxeVar.getClass();
        adgj adgjVar = (adgj) this.h.io();
        adgjVar.getClass();
        abxu abxuVar = (abxu) this.j.io();
        abxuVar.getClass();
        vxz vxzVar2 = (vxz) this.a.io();
        vxzVar2.getClass();
        vxz vxzVar3 = (vxz) this.c.io();
        vxzVar3.getClass();
        acxt acxtVar = (acxt) this.i.io();
        acxtVar.getClass();
        acyx acyxVar = (acyx) this.m.io();
        acyxVar.getClass();
        xgnVar.getClass();
        return new vrx(context, hbuVar, aedaVar, adneVar, vxzVar, Io, vxeVar, adgjVar, abxuVar, vxzVar2, vxzVar3, acxtVar, acyxVar, xgnVar, wnfVar, vphVar, vnrVar, vpsVar);
    }

    public final agkj d(oip oipVar) {
        agkh agkhVar = new agkh(4);
        Uri uriC = nsp.c((Context) this.f, (agev) this.b, oipVar);
        for (oin oinVar : oipVar.o) {
            agkhVar.e(oinVar, nsp.b(uriC, oinVar));
        }
        return agkhVar.d(false);
    }

    public final agkj e(agkj agkjVar, agkj agkjVar2) {
        agkh agkhVar = new agkh(4);
        agqr it = agkjVar2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() != null && agkjVar.containsKey(entry.getKey())) {
                Uri uri = (Uri) agkjVar.get(entry.getKey());
                Uri uri2 = (Uri) entry.getValue();
                try {
                    if (((ayq) this.j).ac(uri)) {
                        try {
                            if (nsv.a((Context) this.f, uri).toString().equals(uri2.toString())) {
                                agkhVar.e((oin) entry.getKey(), uri);
                            } else {
                                onb.e("%s verifyIsolatedFileUris isolated file uri does match expected on-device uri! %s %s", "FileGroupManager", uri, uri2);
                            }
                        } catch (IOException unused) {
                            onb.e("%s verifyIsolatedFileUris unable to read symlink using isolated file uri! %s %s", "FileGroupManager", uri, uri2);
                        }
                    } else {
                        onb.e("%s verifyIsolatedFileUris isolated uri does not exist -- unable to verify it matches the expected target! %s %s", "FileGroupManager", uri, uri2);
                    }
                } catch (IOException unused2) {
                    onb.e("%s verifyIsolatedFileUris unable to check if isolated uri exists! %s %s", "FileGroupManager", uri, uri2);
                }
            }
        }
        return agkhVar.d(false);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture f(oip oipVar) {
        if (!oipVar.n) {
            return aher.a;
        }
        try {
            Object obj = this.f;
            Context context = (Context) obj;
            nsp.l(context, (agev) this.b, oipVar, (ayq) this.j);
            aiie aiieVar = oipVar.o;
            if (aguu.H(aiieVar, new bym(15)).g()) {
                return ahng.m(new UnsupportedOperationException("Preserve File Paths is invalid with Android Blob Sharing"));
            }
            agkj agkjVarD = d(oipVar);
            ListenableFuture listenableFutureM = m(oipVar);
            ojk ojkVar = new ojk(this, (List) aiieVar, agkjVarD, 10);
            ?? r0 = this.k;
            ListenableFuture listenableFutureAs = ahno.as(listenableFutureM, ojkVar, r0);
            ahno.at(listenableFutureAs, new hhi(this, oipVar, 7, null), r0);
            return listenableFutureAs;
        } catch (IOException e) {
            acb acbVarA = oig.a();
            acbVarA.b = oif.UNABLE_TO_REMOVE_SYMLINK_STRUCTURE;
            acbVarA.c = "Unable to cleanup symlink structure";
            acbVarA.d = e;
            return ahng.m(acbVarA.a());
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture g(oiw oiwVar, oir oirVar, ahcy ahcyVar) {
        AtomicReference atomicReference = new AtomicReference();
        return ahno.an(s(i(oiwVar, false), new okm(this, oiwVar, atomicReference, oirVar, ahcyVar, 0)), Exception.class, new ojk(this, atomicReference, oiwVar, 9, (byte[]) null), this.k);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture h(ojb ojbVar, oin oinVar, oip oipVar) {
        if (ojbVar.e) {
            return ahng.n(oky.b);
        }
        if (oinVar.o.isEmpty()) {
            return ahng.n(oky.c);
        }
        Object obj = this.f;
        String str = oinVar.o;
        Object obj2 = this.j;
        return r(ahno.aq(new waq((Context) obj, str, (ayq) obj2, oinVar, oipVar, 1), this.g), new kke(16));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ola] */
    public final ListenableFuture i(oiw oiwVar, boolean z) {
        aihf builder = oiwVar.toBuilder();
        builder.copyOnWrite();
        oiw oiwVar2 = (oiw) builder.instance;
        oiwVar2.b |= 8;
        oiwVar2.f = z;
        return this.m.g((oiw) builder.build());
    }

    public final ListenableFuture j(oip oipVar) {
        return k(oipVar, false, false, 0, oipVar.o.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture k(final oip oipVar, final boolean z, final boolean z2, final int i, final int i2) {
        if (i < i2) {
            final oin oinVar = (oin) oipVar.o.get(i);
            return nsp.j(oinVar) ? k(oipVar, z, z2, i + 1, i2) : ooi.d(l(oinVar, oipVar)).f(new ahcy() { // from class: okw
                @Override // defpackage.ahcy
                public final ListenableFuture a(Object obj) {
                    xgg xggVar = this.g;
                    oip oipVar2 = oipVar;
                    boolean z3 = z;
                    boolean z4 = z2;
                    int i3 = i + 1;
                    oin oinVar2 = oinVar;
                    int i4 = i2;
                    oiv oivVar = (oiv) obj;
                    if (oivVar == oiv.DOWNLOAD_COMPLETE) {
                        String str = oinVar2.c;
                        int i5 = onb.a;
                        return xggVar.k(oipVar2, z3, z4, i3, i4);
                    }
                    if (oivVar == oiv.SUBSCRIBED || oivVar == oiv.DOWNLOAD_IN_PROGRESS) {
                        String str2 = oinVar2.c;
                        int i6 = onb.a;
                        return xggVar.k(oipVar2, z3, true, i3, i4);
                    }
                    String str3 = oinVar2.c;
                    int i7 = onb.a;
                    return xggVar.k(oipVar2, true, z4, i3, i4);
                }
            }, this.k);
        }
        if (z) {
            return ahng.n(okz.c);
        }
        return z2 ? ahng.n(okz.a) : ahng.n(okz.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture l(oin oinVar, oip oipVar) {
        int iAS = a.aS(oipVar.j);
        int i = 1;
        if (iAS == 0) {
            iAS = 1;
        }
        oiz oizVarA = nsj.a(oinVar, iAS);
        omn omnVar = (omn) this.c;
        return ooi.d(ahno.as(omnVar.f(oizVarA), new oly(0), omnVar.b)).c(oma.class, new okn((Object) this, (aihn) oipVar, i), this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture m(oip oipVar) {
        int i = 4;
        agkh agkhVar = new agkh(4);
        agkh agkhVar2 = new agkh(4);
        for (oin oinVar : oipVar.o) {
            if (nsp.j(oinVar)) {
                agkhVar.e(oinVar, Uri.parse(oinVar.d));
            } else {
                int iAS = a.aS(oipVar.j);
                if (iAS == 0) {
                    iAS = 1;
                }
                agkhVar2.e(oinVar, nsj.a(oinVar, iAS));
            }
        }
        agkj agkjVarD = agkhVar2.d(false);
        return ooi.d(((omn) this.c).e(agkz.n(agkjVarD.values()))).e(new kjh(agkjVarD, agkhVar, i), this.k);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture n(oip oipVar, oin oinVar, oiz oizVar) {
        return ahno.an(((omn) this.c).f(oizVar), oma.class, new iaj(this, oizVar, oipVar, oinVar, 14), this.k);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ola] */
    public final ListenableFuture o(ahcy ahcyVar) {
        return s(this.m.d(), new okv(this, new ArrayList(), ahcyVar, 0));
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, ola] */
    public final ListenableFuture p(oiw oiwVar, oig oigVar, long j, String str) {
        aihf aihfVarCreateBuilder = ahai.a.createBuilder();
        String str2 = oiwVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        ahai ahaiVar = (ahai) aihfVarCreateBuilder.instance;
        str2.getClass();
        ahaiVar.b |= 1;
        ahaiVar.c = str2;
        String str3 = oiwVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        ahai ahaiVar2 = (ahai) aihfVarCreateBuilder.instance;
        str3.getClass();
        ahaiVar2.b |= 4;
        ahaiVar2.e = str3;
        aihfVarCreateBuilder.copyOnWrite();
        ahai ahaiVar3 = (ahai) aihfVarCreateBuilder.instance;
        ahaiVar3.b |= 64;
        ahaiVar3.i = j;
        aihfVarCreateBuilder.copyOnWrite();
        ahai ahaiVar4 = (ahai) aihfVarCreateBuilder.instance;
        str.getClass();
        ahaiVar4.b |= SemanticState.Focused;
        ahaiVar4.j = str;
        aihf builder = oiwVar.toBuilder();
        builder.copyOnWrite();
        oiw oiwVar2 = (oiw) builder.instance;
        oiwVar2.b |= 8;
        oiwVar2.f = false;
        return s(this.m.g((oiw) builder.build()), new ojk(this, aihfVarCreateBuilder, oigVar, 14, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, omb] */
    public final ListenableFuture q(final oip oipVar, final int i, final int i2) {
        if (i >= i2) {
            return ahng.n(Boolean.TRUE);
        }
        oin oinVar = (oin) oipVar.o.get(i);
        if (nsp.j(oinVar)) {
            return q(oipVar, i + 1, i2);
        }
        int iAS = a.aS(oipVar.j);
        oiz oizVarA = nsj.a(oinVar, iAS != 0 ? iAS : 1);
        Object obj = this.c;
        omn omnVar = (omn) obj;
        return s(ahno.as(omnVar.d.e(oizVarA), new ols(obj, oizVarA, 3), omnVar.b), new ahcy() { // from class: oko
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj2) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                oip oipVar2 = oipVar;
                if (!zBooleanValue) {
                    onb.d("%s: Subscribing to file failed for group: %s", "FileGroupManager", oipVar2.d);
                    return ahng.n(Boolean.FALSE);
                }
                return this.d.q(oipVar2, i + 1, i2);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture r(ListenableFuture listenableFuture, agek agekVar) {
        return ahno.ar(listenableFuture, agekVar, this.k);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture s(ListenableFuture listenableFuture, ahcy ahcyVar) {
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), ahcyVar, 1);
        int i = ahcs.c;
        ?? r3 = this.k;
        ahcq ahcqVar = new ahcq(listenableFuture, ahdbVar);
        listenableFuture.addListener(ahcqVar, MoreExecutors.c(r3, ahcqVar));
        return ahcqVar;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture t(oip oipVar, oin oinVar, final oiz oizVar, final long j) {
        final omn omnVar = (omn) this.c;
        return s(ahno.as(omnVar.f(oizVar), new ahcy() { // from class: olu
            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, omb] */
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                ojb ojbVar = (ojb) obj;
                long j2 = ojbVar.f;
                long j3 = j;
                if (j3 <= j2) {
                    return ahng.n(Boolean.TRUE);
                }
                oiz oizVar2 = oizVar;
                omn omnVar2 = omnVar;
                aihf builder = ojbVar.toBuilder();
                builder.copyOnWrite();
                ojb ojbVar2 = (ojb) builder.instance;
                ojbVar2.b |= 8;
                ojbVar2.f = j3;
                return omnVar2.d.h(oizVar2, (ojb) builder.build());
            }
        }, omnVar.b), new ojk(this, oinVar, oipVar, 6, (char[]) null));
    }

    public final boolean v(String str) {
        try {
            ((Context) this.f).getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final ListenableFuture z(oip oipVar, oin oinVar, oiz oizVar, ojb ojbVar, int i) {
        return s(B(oipVar, oinVar, ojbVar, oizVar, oinVar.o, oipVar.l, i), new acty(this, i, oipVar, oinVar, oizVar, 1));
    }

    public xgg(Context context, ong ongVar, qnl qnlVar, ola olaVar, omn omnVar, omj omjVar, Executor executor, agev agevVar, ayq ayqVar, agev agevVar2, oii oiiVar, Executor executor2) {
        this.h = new omj();
        this.f = context;
        this.d = ongVar;
        this.e = qnlVar;
        this.m = olaVar;
        this.c = omnVar;
        this.i = omjVar;
        this.k = executor;
        this.g = executor2;
        this.b = agevVar;
        this.j = ayqVar;
        this.a = agevVar2;
        this.l = oiiVar;
    }

    public xgg(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, byte[] bArr) {
        awmdVar.getClass();
        this.l = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.g = awmdVar3;
        this.e = awmdVar4;
        this.b = awmdVar5;
        this.k = awmdVar6;
        awmdVar7.getClass();
        this.f = awmdVar7;
        awmdVar8.getClass();
        this.h = awmdVar8;
        awmdVar9.getClass();
        this.j = awmdVar9;
        this.a = awmdVar10;
        awmdVar11.getClass();
        this.c = awmdVar11;
        this.i = awmdVar12;
        this.m = awmdVar13;
    }

    public xgg(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.j = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.f = awmdVar3;
        awmdVar4.getClass();
        this.i = awmdVar4;
        awmdVar5.getClass();
        this.l = awmdVar5;
        awmdVar6.getClass();
        this.g = awmdVar6;
        this.a = awmdVar7;
        this.e = awmdVar8;
        this.m = awmdVar9;
        this.k = awmdVar10;
        awmdVar11.getClass();
        this.c = awmdVar11;
        awmdVar12.getClass();
        this.h = awmdVar12;
        this.d = awmdVar13;
    }
}
