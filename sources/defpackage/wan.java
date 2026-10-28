package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.libraries.youtube.composition.api.C2paEmbedRequest;
import com.google.android.libraries.youtube.composition.api.C2paEmbedder;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protos.youtube.api.innertube.CompositionProto$Composition;
import internal.org.jni_zero.JniZero;
import j$.util.Optional;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wan implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wan(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [agex, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ahcx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v17, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v65, types: [aeow, java.lang.Object] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        switch (this.$cid) {
            case 0:
                return this.a.isCancelled() ? ahng.m(new RejectedExecutionException()) : this.b.a();
            case 1:
                final uhc uhcVar = (uhc) ((uhk) this.a).b.io();
                final uha uhaVar = (uha) this.b;
                return ahng.s(afwl.c(new ahcx() { // from class: uhb
                    /* JADX WARN: Code duplicated, block: B:114:0x01bc A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:115:0x01be  */
                    /* JADX WARN: Code duplicated, block: B:116:0x01c3  */
                    /* JADX WARN: Code duplicated, block: B:119:0x01cb A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:120:0x01cd  */
                    /* JADX WARN: Code duplicated, block: B:121:0x01d2  */
                    /* JADX WARN: Code duplicated, block: B:123:0x01d7  */
                    /* JADX WARN: Code duplicated, block: B:126:0x020f  */
                    /* JADX WARN: Code duplicated, block: B:129:0x024f  */
                    /* JADX WARN: Code duplicated, block: B:132:0x0277  */
                    /* JADX WARN: Code duplicated, block: B:133:0x027e  */
                    /* JADX WARN: Code duplicated, block: B:135:0x02b0  */
                    /* JADX WARN: Code duplicated, block: B:191:0x016e A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:83:0x0164 A[Catch: Exception -> 0x01ab, TryCatch #3 {Exception -> 0x01ab, blocks: (B:38:0x00bc, B:49:0x00dd, B:59:0x00f0, B:60:0x00f5, B:57:0x00ec, B:58:0x00ef, B:61:0x00f6, B:63:0x0105, B:65:0x0110, B:67:0x0118, B:69:0x0126, B:71:0x012c, B:75:0x0138, B:77:0x014b, B:79:0x0153, B:81:0x015b, B:83:0x0164, B:86:0x016e, B:87:0x0173, B:88:0x0174, B:89:0x0179, B:90:0x017a, B:91:0x017f, B:95:0x0187, B:96:0x018c, B:93:0x0181, B:94:0x0186, B:97:0x018d, B:98:0x0192, B:99:0x0193, B:100:0x0198, B:101:0x0199, B:102:0x019e, B:105:0x01a1, B:106:0x01aa, B:74:0x0134, B:40:0x00c4, B:42:0x00cc, B:44:0x00d2, B:51:0x00e2, B:52:0x00e7, B:55:0x00ea), top: B:172:0x00bc, inners: #0, #5, #7 }] */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v2, types: [awqg, java.lang.Object] */
                    @Override // defpackage.ahcx
                    public final ListenableFuture a() {
                        File file;
                        String absolutePath;
                        boolean z;
                        long j;
                        Throwable th;
                        char c;
                        int i;
                        String str;
                        akcx akcxVar;
                        apbs apbsVar;
                        aiie aiieVar;
                        akcw akcwVar;
                        amsy amsyVar;
                        amsy amsyVar2;
                        Object lowerCase;
                        uha uhaVar2 = uhaVar;
                        uhc uhcVar2 = uhcVar;
                        uhg uhgVar = uhcVar2.f;
                        String str2 = uhaVar2.b;
                        uhf uhfVar = new uhf(uhgVar, str2);
                        Throwable th2 = null;
                        C2paEmbedder c2paEmbedder = (C2paEmbedder) uhcVar2.d.orElse(null);
                        CompositionProto$Composition compositionProto$Composition = uhaVar2.a;
                        if (c2paEmbedder == null) {
                            IllegalStateException illegalStateException = new IllegalStateException("C2paEmbedder is not available");
                            uhfVar.a(compositionProto$Composition, illegalStateException);
                            return ahng.m(illegalStateException);
                        }
                        aihf builder = compositionProto$Composition.toBuilder();
                        builder.getClass();
                        try {
                            if (awrc.v(str2)) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            if (!uhcVar2.b(str2)) {
                                throw new SecurityException();
                            }
                            File fileC = uhc.c(uhcVar2.a(str2));
                            if (fileC.exists() && fileC.isFile()) {
                                long j2 = 0;
                                if (fileC.length() != 0) {
                                    int size = ((CompositionProto$Composition) builder.instance).c.size();
                                    boolean z2 = false;
                                    int i2 = 0;
                                    while (i2 < size) {
                                        akcw akcwVar2 = (akcw) ((CompositionProto$Composition) builder.instance).c.get(i2);
                                        akcwVar2.getClass();
                                        int i3 = akcwVar2.c;
                                        if (i3 != 3) {
                                            z = z2;
                                            j = j2;
                                            th = th2;
                                        } else {
                                            if (((i3 == 3 ? (amsy) akcwVar2.d : amsy.a).b & 1) != 0) {
                                                try {
                                                    String str3 = (akcwVar2.c == 3 ? (amsy) akcwVar2.d : amsy.a).c;
                                                    str3.getClass();
                                                    if (awrc.v(str3)) {
                                                        throw new ugs();
                                                    }
                                                    j = j2;
                                                    try {
                                                        if (awrc.n(str3, "content://", true)) {
                                                            Uri uri = Uri.parse(str3);
                                                            uri.getClass();
                                                            c = 1;
                                                            try {
                                                                AssetFileDescriptor assetFileDescriptorA = qol.a(uhcVar2.b, uri, "r", qok.a);
                                                                if (assetFileDescriptorA == null) {
                                                                    throw new ugv();
                                                                }
                                                                try {
                                                                    if (assetFileDescriptorA.getDeclaredLength() != j) {
                                                                        ParcelFileDescriptor parcelFileDescriptor = assetFileDescriptorA.getParcelFileDescriptor();
                                                                        if ((parcelFileDescriptor != null ? parcelFileDescriptor.getStatSize() : j) != j) {
                                                                            JniZero.l(assetFileDescriptorA, th2);
                                                                        }
                                                                    }
                                                                    throw new ugu();
                                                                } catch (Throwable th3) {
                                                                    try {
                                                                        throw th3;
                                                                    } catch (Throwable th4) {
                                                                        JniZero.l(assetFileDescriptorA, th3);
                                                                        throw th4;
                                                                    }
                                                                }
                                                            } catch (Exception e) {
                                                                e = e;
                                                                uhfVar.b++;
                                                                i = akcwVar2.c;
                                                                if (i != 3) {
                                                                    str = "";
                                                                } else {
                                                                    if (i == 3) {
                                                                        amsyVar = (amsy) akcwVar2.d;
                                                                    } else {
                                                                        amsyVar = amsy.a;
                                                                    }
                                                                    if ((amsyVar.b & 1) != 0) {
                                                                        if (i == 3) {
                                                                            amsyVar2 = (amsy) akcwVar2.d;
                                                                        } else {
                                                                            amsyVar2 = amsy.a;
                                                                        }
                                                                        str = amsyVar2.c;
                                                                    } else {
                                                                        str = "";
                                                                    }
                                                                }
                                                                str.getClass();
                                                                uhg uhgVar2 = uhfVar.c;
                                                                String strA = uhgVar2.a(str);
                                                                Locale locale = Locale.US;
                                                                String simpleName = e.getClass().getSimpleName();
                                                                String str4 = akcwVar2.e;
                                                                boolean z3 = z2;
                                                                Object[] objArr = new Object[3];
                                                                objArr[z3 ? 1 : 0] = simpleName;
                                                                objArr[c] = strA;
                                                                objArr[2] = str4;
                                                                String str5 = String.format(locale, "Shorts Camera C2PA ingredient path validation failed (exception=%s); path=%s, asset id=%s", Arrays.copyOf(objArr, 3));
                                                                str5.getClass();
                                                                uhgVar2.b(str5, ajtv.ERROR_LEVEL_WARNING, e);
                                                                akcxVar = akcwVar2.f;
                                                                if (akcxVar == null) {
                                                                    akcxVar = akcx.a;
                                                                }
                                                                aihf builder2 = akcxVar.toBuilder();
                                                                builder2.getClass();
                                                                aihh aihhVar = (aihh) builder2;
                                                                aihf aihfVarCreateBuilder = apbs.a.createBuilder();
                                                                aihf aihfVarCreateBuilder2 = ajai.a.createBuilder();
                                                                aihfVarCreateBuilder2.copyOnWrite();
                                                                ajai ajaiVar = (ajai) aihfVarCreateBuilder2.instance;
                                                                ajaiVar.c = z3 ? 1 : 0;
                                                                ajaiVar.b |= 1;
                                                                aihfVarCreateBuilder.copyOnWrite();
                                                                apbsVar = (apbs) aihfVarCreateBuilder.instance;
                                                                ajai ajaiVar2 = (ajai) aihfVarCreateBuilder2.build();
                                                                ajaiVar2.getClass();
                                                                aiieVar = apbsVar.c;
                                                                if (!aiieVar.c()) {
                                                                    apbsVar.c = aihn.mutableCopy(aiieVar);
                                                                }
                                                                apbsVar.c.add(ajaiVar2);
                                                                aihn aihnVarBuild = aihfVarCreateBuilder.build();
                                                                aihnVarBuild.getClass();
                                                                aihhVar.e(apbs.b, (apbs) aihnVarBuild);
                                                                aihf builder3 = akcwVar2.toBuilder();
                                                                builder3.copyOnWrite();
                                                                akcwVar = (akcw) builder3.instance;
                                                                if (akcwVar.c == 3) {
                                                                    z = false;
                                                                    akcwVar.c = 0;
                                                                    th = null;
                                                                    akcwVar.d = null;
                                                                } else {
                                                                    th = null;
                                                                    z = false;
                                                                }
                                                                builder3.copyOnWrite();
                                                                akcw akcwVar3 = (akcw) builder3.instance;
                                                                akcx akcxVar2 = (akcx) aihhVar.build();
                                                                akcxVar2.getClass();
                                                                akcwVar3.f = akcxVar2;
                                                                akcwVar3.b |= 2;
                                                                akcw akcwVar4 = (akcw) builder3.build();
                                                                builder.copyOnWrite();
                                                                CompositionProto$Composition compositionProto$Composition2 = (CompositionProto$Composition) builder.instance;
                                                                akcwVar4.getClass();
                                                                compositionProto$Composition2.a();
                                                                compositionProto$Composition2.c.set(i2, akcwVar4);
                                                            }
                                                        } else {
                                                            c = 1;
                                                            Uri uri2 = Uri.parse(str3);
                                                            uri2.getClass();
                                                            String scheme = uri2.getScheme();
                                                            if (scheme != null) {
                                                                lowerCase = scheme.toLowerCase(Locale.ROOT);
                                                                lowerCase.getClass();
                                                            } else {
                                                                lowerCase = th2;
                                                            }
                                                            if (atqq.ay(uhc.a, lowerCase)) {
                                                                throw new ugw();
                                                            }
                                                            File fileC2 = uhc.c(uhcVar2.a(str3));
                                                            if (!fileC2.exists()) {
                                                                throw new ugx();
                                                            }
                                                            if (!fileC2.isFile()) {
                                                                throw new ugz();
                                                            }
                                                            if (fileC2.length() == j) {
                                                                throw new ugy();
                                                            }
                                                            try {
                                                                String canonicalPath = fileC2.getCanonicalPath();
                                                                canonicalPath.getClass();
                                                                String str6 = uhcVar2.b.getApplicationInfo().dataDir;
                                                                if (awrc.n(canonicalPath, "/system/", z2)) {
                                                                    throw new uhi();
                                                                }
                                                                if (awrc.n(canonicalPath, "/sys/", z2)) {
                                                                    throw new uhh();
                                                                }
                                                                if (!awrc.n(canonicalPath, "/data/", z2)) {
                                                                    str6.getClass();
                                                                    if (awrc.n(canonicalPath, str6, z2)) {
                                                                        if (!uhcVar2.b(canonicalPath)) {
                                                                            throw new uhl();
                                                                        }
                                                                    }
                                                                } else if (!uhcVar2.b(canonicalPath)) {
                                                                    throw new uhl();
                                                                }
                                                            } catch (Exception e2) {
                                                                throw new ugt(e2);
                                                            }
                                                        }
                                                        th = th2;
                                                        z = z2;
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        c = 1;
                                                        uhfVar.b++;
                                                        i = akcwVar2.c;
                                                        if (i != 3) {
                                                            str = "";
                                                        } else {
                                                            if (i == 3) {
                                                                amsyVar = (amsy) akcwVar2.d;
                                                            } else {
                                                                amsyVar = amsy.a;
                                                            }
                                                            if ((amsyVar.b & 1) != 0) {
                                                                if (i == 3) {
                                                                    amsyVar2 = (amsy) akcwVar2.d;
                                                                } else {
                                                                    amsyVar2 = amsy.a;
                                                                }
                                                                str = amsyVar2.c;
                                                            } else {
                                                                str = "";
                                                            }
                                                        }
                                                        str.getClass();
                                                        uhg uhgVar3 = uhfVar.c;
                                                        String strA2 = uhgVar3.a(str);
                                                        Locale locale2 = Locale.US;
                                                        String simpleName2 = e.getClass().getSimpleName();
                                                        String str7 = akcwVar2.e;
                                                        boolean z4 = z2;
                                                        Object[] objArr2 = new Object[3];
                                                        objArr2[z4 ? 1 : 0] = simpleName2;
                                                        objArr2[c] = strA2;
                                                        objArr2[2] = str7;
                                                        String str8 = String.format(locale2, "Shorts Camera C2PA ingredient path validation failed (exception=%s); path=%s, asset id=%s", Arrays.copyOf(objArr2, 3));
                                                        str8.getClass();
                                                        uhgVar3.b(str8, ajtv.ERROR_LEVEL_WARNING, e);
                                                        akcxVar = akcwVar2.f;
                                                        if (akcxVar == null) {
                                                            akcxVar = akcx.a;
                                                        }
                                                        aihf builder4 = akcxVar.toBuilder();
                                                        builder4.getClass();
                                                        aihh aihhVar2 = (aihh) builder4;
                                                        aihf aihfVarCreateBuilder3 = apbs.a.createBuilder();
                                                        aihf aihfVarCreateBuilder4 = ajai.a.createBuilder();
                                                        aihfVarCreateBuilder4.copyOnWrite();
                                                        ajai ajaiVar3 = (ajai) aihfVarCreateBuilder4.instance;
                                                        ajaiVar3.c = z4 ? 1 : 0;
                                                        ajaiVar3.b |= 1;
                                                        aihfVarCreateBuilder3.copyOnWrite();
                                                        apbsVar = (apbs) aihfVarCreateBuilder3.instance;
                                                        ajai ajaiVar4 = (ajai) aihfVarCreateBuilder4.build();
                                                        ajaiVar4.getClass();
                                                        aiieVar = apbsVar.c;
                                                        if (!aiieVar.c()) {
                                                            apbsVar.c = aihn.mutableCopy(aiieVar);
                                                        }
                                                        apbsVar.c.add(ajaiVar4);
                                                        aihn aihnVarBuild2 = aihfVarCreateBuilder3.build();
                                                        aihnVarBuild2.getClass();
                                                        aihhVar2.e(apbs.b, (apbs) aihnVarBuild2);
                                                        aihf builder5 = akcwVar2.toBuilder();
                                                        builder5.copyOnWrite();
                                                        akcwVar = (akcw) builder5.instance;
                                                        if (akcwVar.c == 3) {
                                                            z = false;
                                                            akcwVar.c = 0;
                                                            th = null;
                                                            akcwVar.d = null;
                                                        } else {
                                                            th = null;
                                                            z = false;
                                                        }
                                                        builder5.copyOnWrite();
                                                        akcw akcwVar5 = (akcw) builder5.instance;
                                                        akcx akcxVar3 = (akcx) aihhVar2.build();
                                                        akcxVar3.getClass();
                                                        akcwVar5.f = akcxVar3;
                                                        akcwVar5.b |= 2;
                                                        akcw akcwVar6 = (akcw) builder5.build();
                                                        builder.copyOnWrite();
                                                        CompositionProto$Composition compositionProto$Composition3 = (CompositionProto$Composition) builder.instance;
                                                        akcwVar6.getClass();
                                                        compositionProto$Composition3.a();
                                                        compositionProto$Composition3.c.set(i2, akcwVar6);
                                                        i2++;
                                                        th2 = th;
                                                        z2 = z;
                                                        j2 = j;
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    j = j2;
                                                }
                                            } else {
                                                z = z2;
                                                j = j2;
                                                th = th2;
                                            }
                                        }
                                        i2++;
                                        th2 = th;
                                        z2 = z;
                                        j2 = j;
                                    }
                                    Throwable th5 = th2;
                                    aihn aihnVarBuild3 = builder.build();
                                    aihnVarBuild3.getClass();
                                    CompositionProto$Composition compositionProto$Composition4 = (CompositionProto$Composition) aihnVarBuild3;
                                    String strA3 = uhcVar2.a(str2);
                                    File fileC3 = uhc.c(strA3);
                                    if (uhaVar2.f) {
                                        File file2 = new File(fileC3.getPath() + ".c2pa_tmp_" + UUID.randomUUID());
                                        try {
                                            JniZero.k(fileC3, file2);
                                            file = file2;
                                        } catch (Exception e5) {
                                            if (file2.exists()) {
                                                file2.delete();
                                            }
                                            IOException iOException = new IOException("Failed to create temp copy for C2PA embedding", e5);
                                            uhfVar.a(compositionProto$Composition4, iOException);
                                            return ahng.m(iOException);
                                        }
                                    } else {
                                        file = th5;
                                    }
                                    if (file != 0 && (absolutePath = file.getAbsolutePath()) != null) {
                                        strA3 = absolutePath;
                                    }
                                    C2paEmbedRequest c2paEmbedRequestCreate = C2paEmbedRequest.create();
                                    c2paEmbedRequestCreate.getClass();
                                    c2paEmbedRequestCreate.setComposition(compositionProto$Composition4);
                                    c2paEmbedRequestCreate.setFilePath(strA3);
                                    c2paEmbedRequestCreate.setTimestampOption(uhaVar2.d);
                                    c2paEmbedRequestCreate.setClientDescriptor(uhaVar2.e);
                                    c2paEmbedRequestCreate.setFileType(uhaVar2.c);
                                    ListenableFuture listenableFutureEmbed = c2paEmbedder.embed(c2paEmbedRequestCreate);
                                    if (file != 0) {
                                        agek agekVarA = afwl.a(new hco(uhcVar2, file, fileC3, 10, (byte[]) null));
                                        ahex ahexVar = uhcVar2.e;
                                        listenableFutureEmbed = ahbz.f(ahcs.e(listenableFutureEmbed, agekVarA, ahexVar), Throwable.class, afwl.d(new qmu(file, 16)), ahexVar);
                                    }
                                    ahng.x(listenableFutureEmbed, afwl.g(new hhi(uhfVar, compositionProto$Composition4, 8)), uhcVar2.e);
                                    return listenableFutureEmbed;
                                }
                            }
                            throw new FileNotFoundException();
                        } catch (Exception e6) {
                            uhg uhgVar4 = uhfVar.c;
                            saa saaVar = new saa(new prq(20), 20);
                            Optional optional = uhgVar4.b;
                            optional.isPresent();
                            saaVar.a.invoke(optional.get());
                            uhgVar4.b("Shorts Camera C2PA manifest embedding aborted. Target output file validation failed", ajtv.ERROR_LEVEL_ERROR, e6);
                            return ahng.m(new IllegalStateException("Shorts Camera C2PA manifest embedding aborted. Target output file validation failed", e6));
                        }
                    }
                }), uhcVar.e);
            case 2:
                return ((woo) this.b).F(this.a);
            case 3:
                ahng.v(this.b);
                ahng.v(this.a);
                return ahng.n(null);
            case 4:
                return ((aajm) this.b).b(this.a);
            case 5:
                ((ug) ahng.v(this.b)).d().get();
                return this.a;
            case 6:
                acsv acsvVar = ((actr) this.b).e;
                Object obj = this.a;
                acsvVar.e((ajwo) obj);
                return ahng.n(obj);
            case 7:
                Object obj2 = this.a;
                ((actp) this.b).d.e((ajwo) obj2);
                return ahng.n(obj2);
            case 8:
                Object obj3 = this.b;
                Object obj4 = this.a;
                return ahno.aq(new wan(obj4, obj3, 9), ((adbr) obj4).b);
            case 9:
                ((adbr) this.a).a((adbp) this.b);
                return aher.a;
            case 10:
                return ((axlj) ((aeiy) this.b).g).m((String) this.a, true);
            case 11:
                return ((axlj) ((aeiy) this.b).g).n((String) this.a);
            case 12:
                return ((axlj) ((aeiy) this.b).g).n((String) this.a);
            case 13:
                return ((axlj) ((aeiy) this.b).g).n((String) this.a);
            case 14:
                return ((axlj) ((aeiy) this.b).g).n((String) this.a);
            case 15:
                return ((axlj) ((aeiy) this.b).g).n((String) this.a);
            case 16:
                return ahng.n(new aciz((String) ahng.v(this.b), (aprb) ahng.v(this.a), (char[]) null));
            case 17:
                return ahng.n(this.b.a(this.a));
            case 18:
                aeoo aeooVar = (aeoo) this.a;
                aeooVar.d();
                File file = new File(aeooVar.a, aeor.a((aeom) this.b));
                if (!file.exists() || !file.canRead()) {
                    return ahng.n(null);
                }
                try {
                    return ahng.n(agyo.e(file));
                } catch (FileNotFoundException unused) {
                    return ahng.n(null);
                }
            case 19:
                Iterator it = ((agm) ((ahgb) this.b).e).e().keySet().iterator();
                while (it.hasNext()) {
                    this.a.a(it.next());
                }
                return ahng.n(null);
            default:
                String strA = afiz.a((affd) this.b);
                ArrayList arrayList = new ArrayList();
                abhh abhhVar = (abhh) this.a;
                agqr it2 = ((auor) abhhVar.b).h().iterator();
                while (it2.hasNext()) {
                    arrayList.add(abhhVar.l(new File((File) it2.next(), strA)));
                }
                return ahng.i(arrayList).a(new okp(15), MoreExecutors.directExecutor());
        }
    }

    public /* synthetic */ wan(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
