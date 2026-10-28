package defpackage;

import android.content.res.AssetFileDescriptor;
import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import j$.util.Optional;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rfa extends res {
    private static final Duration i = Duration.ofMillis(300);
    public final AtomicReference a;
    private ListenableFuture j;

    public rfa(qup qupVar, req reqVar) {
        super(qupVar, reqVar, 3);
        this.a = new AtomicReference();
        this.j = q();
    }

    private final ListenableFuture q() {
        return this.a.get() == null ? this.c.s().c(new qoh(this, 6)) : aher.a;
    }

    @Override // defpackage.res
    protected final Duration e() {
        return i;
    }

    @Override // defpackage.res
    protected final /* synthetic */ rei f() {
        rhe rheVar = new rhe();
        rheVar.i(this.b.c);
        req reqVar = this.c;
        reqVar.K();
        rih rihVar = new rih(reqVar.p().b, this.b.d, 1);
        rgu rguVarI = rgw.i();
        rguVarI.a = reqVar.t();
        rguVarI.b = reqVar.h();
        rguVarI.c = reqVar.u();
        rguVarI.d = reqVar.i();
        rguVarI.f = reqVar.j();
        rguVarI.g = reqVar;
        rguVarI.h = this.b.a;
        rguVarI.i = reqVar.M();
        rguVarI.j = reqVar.p().a;
        rguVarI.k = reqVar.r();
        rgw rgwVar = new rgw(rguVarI);
        rihVar.b = rgwVar;
        int i2 = rgm.c;
        rgk rgkVar = new rgk();
        rgkVar.a = this.e;
        rgkVar.c = reqVar.p().a.c;
        rgkVar.b = j(reqVar.w());
        rgkVar.b(rgwVar);
        rgkVar.b(rheVar);
        rgkVar.d = reqVar.p().a;
        rgm rgmVarA = rgkVar.a();
        rif rifVar = new rif(reqVar.m(), this.b.a, reqVar.n(), ((qux) this.b.b).j, Optional.empty(), rihVar, reqVar.t(), reqVar.p().a, true, reqVar);
        qup qupVar = this.b;
        rgmVarA.l(qupVar.c, qupVar.b());
        rgmVarA.i(rifVar);
        rifVar.s(reqVar.q());
        rgwVar.j(k());
        return new rez(this, reqVar.s().d(this.j, new kjh(this, rifVar, 13, null)), rgwVar, rheVar, rgmVarA, rifVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.res
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final agke k() {
        agjz agjzVar = new agjz(4);
        qup qupVar = this.b;
        req reqVar = this.c;
        String str = (reqVar.y().isPresent() && ((qxg) reqVar.y().get()).c().isPresent()) ? (String) ((qxg) reqVar.y().get()).c().get() : "";
        qux quxVar = (qux) qupVar.b;
        qzl qzlVar = new qzl(qupVar.a, quxVar.k, str);
        qzlVar.h = quxVar.l;
        qzlVar.i = quxVar.m;
        agjzVar.h(qzlVar);
        agjzVar.j(this.b.is());
        return agjzVar.g();
    }

    @Override // defpackage.res
    protected final boolean i(rjg rjgVar) {
        if (!rjgVar.b(rjf.o)) {
            return false;
        }
        if (this.j.isDone()) {
            this.a.set(null);
            this.j = q();
        } else {
            this.j.cancel(false);
            this.j = this.c.s().g(this.j, new qoh(this, 7));
        }
        return true;
    }

    public final void l() {
        byte[] bArrB;
        int i2;
        try {
            AtomicReference atomicReference = this.a;
            Size size = null;
            atomicReference.set(null);
            qwx qwxVar = ((qux) this.b.b).k;
            rjs.c();
            Duration durationOf = qwx.a;
            String path = qwxVar.d.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                InputStream inputStreamOpen = qwxVar.b.getAssets().open(path.replace("/android_asset/", ""));
                try {
                    bArrB = agyi.b(inputStreamOpen);
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                } catch (Throwable th) {
                    if (inputStreamOpen == null) {
                        throw th;
                    }
                    try {
                        inputStreamOpen.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                AssetFileDescriptor assetFileDescriptorA = qol.a(qwxVar.b, qwxVar.d, "r", qok.b);
                try {
                    FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorA.createInputStream();
                    try {
                        byte[] bArrB2 = agyi.b(fileInputStreamCreateInputStream);
                        if (fileInputStreamCreateInputStream != null) {
                            fileInputStreamCreateInputStream.close();
                        }
                        if (assetFileDescriptorA != null) {
                            assetFileDescriptorA.close();
                        }
                        bArrB = bArrB2;
                    } catch (Throwable th3) {
                        if (fileInputStreamCreateInputStream == null) {
                            throw th3;
                        }
                        try {
                            fileInputStreamCreateInputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                        req reqVar = this.c;
                        tge tgeVarA = quk.a();
                        tgeVarA.b = e;
                        tgeVarA.c = new quh(this.b.a, 1);
                        reqVar.a(tgeVarA.e());
                        throw new Exception(e);
                    }
                } catch (Throwable th5) {
                    if (assetFileDescriptorA == null) {
                        throw th5;
                    }
                    try {
                        assetFileDescriptorA.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            }
            JSONObject jSONObject = new JSONObject(new String(bArrB, StandardCharsets.UTF_8));
            if (jSONObject.has("w") && jSONObject.has("h")) {
                size = new Size(jSONObject.getInt("w"), jSONObject.getInt("h"));
            } else {
                rbc rbcVar = new rbc(qwx.e, rbd.c);
                rbcVar.c();
                rbcVar.a("Could not find the size in the skottie file.", new Object[0]);
            }
            Size size2 = size;
            if (!jSONObject.has("fr") || jSONObject.getInt("fr") <= 0) {
                rbc rbcVar2 = new rbc(qwx.e, rbd.c);
                rbcVar2.c();
                rbcVar2.a("Could not find the frame rate field in the skottie file, using the default value.", new Object[0]);
                i2 = 30;
            } else {
                i2 = jSONObject.getInt("fr");
                durationOf = Duration.of(1000000 / ((long) i2), ChronoUnit.MICROS);
            }
            int iOptInt = jSONObject.optInt("ip", 0);
            atomicReference.set(new qww(size2, durationOf, Duration.of(Math.round((((long) (Math.max(iOptInt, jSONObject.optInt("op", 0)) - iOptInt)) * 100000) / ((double) i2)) * 10, ChronoUnit.MICROS), i2));
        } catch (Exception e) {
            req reqVar2 = this.c;
            tge tgeVarA2 = quk.a();
            tgeVarA2.b = e;
            tgeVarA2.c = new quh(this.b.a, 1);
            reqVar2.a(tgeVarA2.e());
            throw new Exception(e);
        }
    }
}
