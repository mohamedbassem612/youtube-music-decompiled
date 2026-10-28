package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.research.xeno.effect.Effect;
import j$.util.Optional;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class adab implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public adab(adsc adscVar, adrw adrwVar, Bitmap bitmap, int i) {
        this.$cid = i;
        this.b = adscVar;
        this.a = adrwVar;
        this.c = bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [eug, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v67, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v84, types: [com.google.research.xeno.effect.AssetDownloader$DownloadCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v67, types: [attc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v13, types: [adxu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [adkz, adlr] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r9v60, types: [atta, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v61, types: [java.lang.Object, java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        File fileCreateTempFile;
        BufferedInputStream bufferedInputStream;
        String str;
        int i = 5;
        byte[] bArr = null;
        try {
            switch (this.$cid) {
                case 0:
                    ((adac) this.a).a.J((String) this.b, (View) this.c);
                    return;
                case 1:
                    ((adac) this.a).a.J((String) this.b, (View) this.c);
                    return;
                case 2:
                    ((adac) this.a).a.J((String) this.b, (View) this.c);
                    return;
                case 3:
                    fea feaVarP = ((esn) this.a).p();
                    Object obj = this.c;
                    ?? r9 = this.b;
                    try {
                        r9.b(obj, (Bitmap) feaVarP.get());
                        return;
                    } catch (Exception e) {
                        r9.iT(obj, e);
                        return;
                    }
                case 4:
                    ((adjh) this.b).b((esf) this.c, this.a);
                    return;
                case 5:
                    Object obj2 = this.a;
                    adne adneVar = (adne) obj2;
                    afvq afvqVar = adneVar.d;
                    ?? r3 = afvqVar.c;
                    Object obj3 = this.b;
                    r3.remove(obj3);
                    afvqVar.d.remove(obj3);
                    ?? r2 = afvqVar.b;
                    Object obj4 = this.c;
                    r2.remove(obj4);
                    oh ohVar = (oh) obj4;
                    if (adneVar.v(ohVar)) {
                        if (adneVar.b) {
                            ((nl) obj2).k((oh) obj4);
                            ((adne) obj2).a();
                            return;
                        } else {
                            ((nl) obj2).k(ohVar);
                            adneVar.a();
                            return;
                        }
                    }
                    return;
                case 6:
                    Object obj5 = this.a;
                    adne adneVar2 = (adne) obj5;
                    afvq afvqVar2 = adneVar2.c;
                    ?? r4 = afvqVar2.c;
                    Object obj6 = this.b;
                    r4.remove(obj6);
                    afvqVar2.d.remove(obj6);
                    ?? r5 = afvqVar2.b;
                    Object obj7 = this.c;
                    r5.remove(obj7);
                    oh ohVar2 = (oh) obj7;
                    if (adneVar2.v(ohVar2)) {
                        if (adneVar2.b) {
                            ((nl) obj5).k((oh) obj7);
                            ((adne) obj5).a();
                            return;
                        } else {
                            ((nl) obj5).k(ohVar2);
                            adneVar2.a();
                            return;
                        }
                    }
                    return;
                case 7:
                    Object obj8 = this.a;
                    adne adneVar3 = (adne) obj8;
                    afvq afvqVar3 = adneVar3.e;
                    ?? r6 = afvqVar3.c;
                    Object obj9 = this.b;
                    r6.remove(obj9);
                    afvqVar3.d.remove(obj9);
                    ?? r7 = afvqVar3.b;
                    Object obj10 = this.c;
                    r7.remove(obj10);
                    oh ohVar3 = (oh) obj10;
                    if (adneVar3.v(ohVar3)) {
                        if (adneVar3.b) {
                            ((nl) obj8).k((oh) obj10);
                            ((adne) obj8).a();
                            return;
                        } else {
                            ((nl) obj8).k(ohVar3);
                            adneVar3.a();
                            return;
                        }
                    }
                    return;
                case 8:
                    ((adsc) this.b).d((adrw) this.a, (Bitmap) this.c);
                    return;
                case 9:
                    Iterator it = this.b.iterator();
                    while (true) {
                        ?? r8 = this.c;
                        if (!it.hasNext()) {
                            r8.a();
                            return;
                        }
                        akxz akxzVar = (akxz) it.next();
                        int i2 = akxzVar.b;
                        if (i2 == 1) {
                            akyb akybVar = i2 == 1 ? (akyb) akxzVar.c : akyb.a;
                            String str2 = akybVar.b;
                            if (str2.isEmpty()) {
                                aihf aihfVarCreateBuilder = atxp.a.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder.instance).b = 3;
                                aihfVarCreateBuilder.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder.instance).c = "FeedComparableSetOperation. Section target id is empty";
                                r8.b((atxp) aihfVarCreateBuilder.build());
                                return;
                            }
                            Optional optionalE = ((adxz) this.a).e(str2);
                            if (!optionalE.isPresent()) {
                                aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
                                aihfVarCreateBuilder2.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder2.instance).b = 5;
                                String strValueOf = String.valueOf(str2);
                                aihfVarCreateBuilder2.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder2.instance).c = "FeedComparableSetOperation. Controller not found for sectionTargetId: ".concat(strValueOf);
                                r8.b((atxp) aihfVarCreateBuilder2.build());
                                return;
                            }
                            ?? A = ((advj) optionalE.get()).a();
                            if (A instanceof adlr) {
                                String str3 = akybVar.c;
                                akya akyaVar = akybVar.d;
                                if (akyaVar == null) {
                                    akyaVar = akya.a;
                                }
                                if (!A.hJ(str3, akyaVar)) {
                                    aihf aihfVarCreateBuilder3 = atxp.a.createBuilder();
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    ((atxp) aihfVarCreateBuilder3.instance).b = 2;
                                    String strValueOf2 = String.valueOf(akybVar.c);
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    ((atxp) aihfVarCreateBuilder3.instance).c = "FeedComparableSetOperation. Comparable adapter operation failed for identifier: ".concat(strValueOf2);
                                    r8.b((atxp) aihfVarCreateBuilder3.build());
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    break;
                case 10:
                    aoqm aoqmVar = (aoqm) this.b;
                    apji apjiVar = aoqmVar.b;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    Object obj11 = this.a;
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
                    apjiVar.c(aihlVarCheckIsLite);
                    if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                        apji apjiVar2 = aoqmVar.b;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                        apjiVar2.c(aihlVarCheckIsLite2);
                        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                        Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                        Object obj12 = this.c;
                        adly adlyVar = new adly();
                        aetd aetdVar = (aetd) obj11;
                        adlyVar.a(aetdVar.d.hB());
                        acxm acxmVarA = aetdVar.c.a((akrn) objC);
                        acxt acxtVar = aetdVar.b;
                        acxtVar.h(adlyVar, acxmVarA, false, false);
                        ViewGroup viewGroup = (ViewGroup) obj12;
                        viewGroup.removeAllViews();
                        View viewA = acxtVar.a();
                        if (viewA.getParent() instanceof ViewGroup) {
                            ((ViewGroup) viewA.getParent()).removeView(viewA);
                        }
                        viewGroup.addView(viewA);
                        viewGroup.setVisibility(0);
                        aetdVar.a.kk(Boolean.TRUE);
                    }
                    aetd aetdVar2 = (aetd) obj11;
                    aetdVar2.e.ap(false, 19);
                    aetdVar2.f.a();
                    return;
                case 11:
                    afkm afkmVar = (afkm) this.c;
                    boolean z = afkmVar.e;
                    Object obj13 = this.b;
                    if (z) {
                        Object obj14 = this.a;
                        if (afkmVar.c.remove(obj14)) {
                            afkj afkjVar = (afkj) afkmVar.b.b(((afko) obj14).a);
                            afuu afuuVarD = afwt.d(122, "onSuccess FuturesMixin", afux.a, true);
                            try {
                                afkjVar.c(((afko) obj14).d, obj13);
                                afuuVarD.close();
                                return;
                            } catch (Throwable th2) {
                                try {
                                    afuuVarD.close();
                                    break;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        }
                        return;
                    }
                    return;
                case 12:
                    afkm afkmVar2 = (afkm) this.c;
                    boolean z2 = afkmVar2.e;
                    Object obj15 = this.b;
                    if (z2) {
                        Object obj16 = this.a;
                        if (afkmVar2.c.remove(obj16)) {
                            afkj afkjVar2 = (afkj) afkmVar2.b.b(((afko) obj16).a);
                            afuu afuuVarD2 = afwt.d(120, "onFailure FuturesMixin", afux.a, true);
                            try {
                                afkjVar2.a(((afko) obj16).d, (Throwable) obj15);
                                afuuVarD2.close();
                                return;
                            } catch (Throwable th4) {
                                try {
                                    afuuVarD2.close();
                                    break;
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        }
                        return;
                    }
                    return;
                case 13:
                    ((afry) this.c).l((afsa) this.a, this.b);
                    return;
                case 14:
                    ((ahpj) this.c).a.execute(new agrq(this.b, this.a, 7, bArr));
                    return;
                case 15:
                    ((ahpj) this.c).a.execute(new agrq(this.b, this.a, i, bArr));
                    return;
                case 16:
                    ((ahpj) this.c).a.execute(new agrq(this.b, this.a, 6, bArr));
                    return;
                case 17:
                    Object obj17 = this.a;
                    try {
                        ((ahsr) this.b).f((Intent) this.c);
                        return;
                    } finally {
                        ((kjc) obj17).v(null);
                    }
                case 18:
                    ahub ahubVar = Effect.d;
                    this.c.a((Effect) this.a, (String) this.b);
                    return;
                case 19:
                    Iterator it2 = this.a.iterator();
                    while (true) {
                        ?? r1 = this.c;
                        if (!it2.hasNext()) {
                            for (Map.Entry entry : this.b.entrySet()) {
                                r1.a((Effect) entry.getValue(), null);
                            }
                            return;
                        }
                        r1.a(null, String.format("No effect with id: %s", (String) it2.next()));
                    }
                    break;
                default:
                    ?? r0 = this.c;
                    Object obj18 = this.b;
                    Object obj19 = this.a;
                    try {
                        try {
                            URL url = new URL((String) obj18);
                            String host = url.getHost();
                            List list = ((atuq) obj19).a;
                            if (!list.isEmpty()) {
                                Iterator it3 = list.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        throw new IOException(a.ce(host, "Domain not allowed: "));
                                    }
                                    str = (String) it3.next();
                                    if (!host.equals(str)) {
                                    }
                                } while (!host.endsWith('.' + str));
                            }
                            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                            httpURLConnection.connect();
                            int responseCode = httpURLConnection.getResponseCode();
                            if (httpURLConnection.getResponseCode() != 200) {
                                throw new IOException(String.format("Bad Http status code: %d", Integer.valueOf(responseCode)));
                            }
                            fileCreateTempFile = File.createTempFile("XenoHttpAssetDownloaderTmpFile", null);
                            try {
                                bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream(), SemanticState.Multiline);
                                try {
                                    fileOutputStream = new FileOutputStream(fileCreateTempFile.getPath());
                                    try {
                                        byte[] bArr2 = new byte[SemanticState.Multiline];
                                        while (true) {
                                            int i3 = bufferedInputStream.read(bArr2);
                                            if (i3 == -1) {
                                                try {
                                                    fileOutputStream.close();
                                                    bufferedInputStream.close();
                                                    String.valueOf(fileCreateTempFile);
                                                    r0.onCompletion(fileCreateTempFile.getPath(), null);
                                                    return;
                                                } catch (Throwable th6) {
                                                    if (fileCreateTempFile != null) {
                                                        fileCreateTempFile.delete();
                                                    }
                                                    throw th6;
                                                }
                                            }
                                            fileOutputStream.write(bArr2, 0, i3);
                                            r0.onCompletion(null, e.getMessage());
                                            return;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } finally {
                                                if (fileCreateTempFile != null) {
                                                    fileCreateTempFile.delete();
                                                }
                                            }
                                        }
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                            break;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    fileOutputStream = null;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                fileOutputStream = null;
                                bufferedInputStream = null;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            fileOutputStream = null;
                            fileCreateTempFile = null;
                            bufferedInputStream = null;
                        }
                    } catch (Exception e2) {
                        r0.onCompletion(null, e2.getMessage());
                        return;
                    }
                    break;
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    public /* synthetic */ adab(ahpj ahpjVar, Runnable runnable, avgj avgjVar, int i) {
        this.$cid = i;
        this.c = ahpjVar;
        this.b = runnable;
        this.a = avgjVar;
    }

    public /* synthetic */ adab(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ adab(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ adab(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ adab(List list, attc attcVar, Map map, int i) {
        this.$cid = i;
        this.a = list;
        this.c = attcVar;
        this.b = map;
    }
}
