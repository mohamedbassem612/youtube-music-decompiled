package defpackage;

import android.net.Uri;
import android.os.PowerManager;
import android.util.Pair;
import android.view.View;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cdf implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cdf(int i, PowerManager.WakeLock wakeLock, plb plbVar, Runnable runnable, pnh pnhVar, int i2) {
        this.$cid = i2;
        this.a = i;
        this.c = wakeLock;
        this.b = plbVar;
        this.e = runnable;
        this.d = pnhVar;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r15v13, types: [adhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, sxu] */
    @Override // java.lang.Runnable
    public final void run() {
        RuntimeException runtimeException;
        agru agruVarC;
        aqi aqiVar;
        Optional optionalEmpty;
        switch (this.$cid) {
            case 0:
                Pair pair = (Pair) this.c;
                ((cdg) this.b).a.i.i(((Integer) pair.first).intValue(), (cnm) pair.second, (cnd) this.d, (cni) this.e, this.a);
                return;
            case 1:
                break;
            case 2:
                agsn agsnVar = pnk.a;
                Object obj = this.d;
                ?? r0 = this.e;
                Object obj2 = this.b;
                Object obj3 = this.c;
                int i = this.a;
                try {
                    ((PowerManager.WakeLock) obj3).acquire(((plb) obj2).f() ? 300000L : ((plb) obj2).a());
                    r0.run();
                    try {
                        ((PowerManager.WakeLock) obj3).release();
                    } catch (RuntimeException e) {
                        runtimeException = e;
                        agruVarC = pnk.a.c();
                        agru agruVarJ = ((agsj) agruVarC).j(runtimeException);
                    }
                    break;
                } catch (SecurityException e2) {
                    ((agsj) ((agsj) ((agsj) pnk.a.c()).j(e2)).k("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "executeInBroadcast", SemanticState.Focused, "GnpExecutorApiImpl.java")).u("WakeLock acquiring failed for execution [%d].", i);
                    try {
                        ((PowerManager.WakeLock) obj3).release();
                    } catch (RuntimeException e3) {
                        runtimeException = e3;
                        agruVarC = pnk.a.c();
                        agru agruVarJ2 = ((agsj) agruVarC).j(runtimeException);
                    }
                    break;
                } finally {
                    try {
                        ((PowerManager.WakeLock) obj3).release();
                        break;
                    } catch (RuntimeException e4) {
                        ((agsj) ((agsj) ((agsj) pnk.a.c()).j(e4)).k("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "executeInBroadcast", 134, "GnpExecutorApiImpl.java")).t("WakeLock releasing failed, probably due to timeout passing.");
                    }
                    ((pnh) obj).a();
                }
                return;
            case 3:
                Object obj4 = this.c;
                int i2 = this.a;
                Object obj5 = this.e;
                Object obj6 = this.d;
                Object obj7 = this.b;
                synchronized (obj7) {
                    aqiVar = ((tsl) obj7).f;
                }
                if (aqiVar == obj4) {
                    try {
                        ((tsl) obj7).g((String) obj6, (String) obj5, i2, (aqi) obj4);
                        return;
                    } catch (Exception e5) {
                        ((agrc) ((agrc) tsl.a.b().i(agso.a, "S3TextToSpeechControlle")).j(e5).k("com/google/android/libraries/youtube/common/tts/S3TextToSpeechController", "speak$<anonymous>$<anonymous>", 253, "S3TextToSpeechController.kt")).t("Failed to start S3 TTS");
                        synchronized (obj7) {
                            if (((tsl) obj7).f == obj4) {
                                ((tsl) obj7).a();
                                return;
                            }
                            return;
                        }
                    }
                }
                return;
            case 4:
                Object obj8 = this.c;
                Uri uri = (Uri) obj8;
                String lastPathSegment = uri.getLastPathSegment();
                taq.c();
                Object obj9 = this.e;
                vic vicVar = (vic) obj9;
                aeiv aeivVar = (aeiv) vicVar.f;
                if (((Optional) aeivVar.c).isEmpty() || lastPathSegment == null) {
                    optionalEmpty = Optional.empty();
                } else {
                    Object obj10 = ((Optional) aeivVar.c).get();
                    taq.c();
                    File file = ((syw) obj10).b;
                    byte[] byteArray = null;
                    if (file != null) {
                        try {
                            File file2 = new File(file, lastPathSegment);
                            if (file2.exists()) {
                                FileInputStream fileInputStream = new FileInputStream(file2);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[SemanticState.ReadOnly];
                                while (true) {
                                    int i3 = fileInputStream.read(bArr);
                                    if (i3 <= 0) {
                                        byteArray = byteArrayOutputStream.toByteArray();
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i3);
                                    }
                                }
                            }
                        } catch (IOException | SecurityException e6) {
                            ((agrc) ((agrc) ((agrc) syw.a.b()).j(e6)).k("com/google/android/libraries/youtube/common/cache/TtlDiskCache", "get", (char) 243, "TtlDiskCache.java")).t("Error getting file");
                        }
                    }
                    optionalEmpty = Optional.ofNullable(byteArray);
                }
                ?? r1 = this.d;
                if (!optionalEmpty.isPresent()) {
                    vicVar.c.m(uri, new vib(vicVar, uri, vicVar.a, r1));
                    return;
                }
                byte[] bArrD = (byte[]) optionalEmpty.get();
                if (vic.c(uri)) {
                    bArrD = vic.d((byte[]) optionalEmpty.get(), this.a);
                }
                vicVar.b(uri, bArrD);
                try {
                    ((sxw) r1).b(obj8, ((adhn) ((vic) obj9).d).d(bArrD));
                    return;
                } catch (tzn e7) {
                    this.b.iT(obj8, e7);
                    return;
                }
                break;
            case 5:
                xja xjaVar = (xja) ((xip) this.b).a.io();
                Object obj11 = this.d;
                aihf builder = ((aihn) obj11).toBuilder();
                builder.copyOnWrite();
                amiu amiuVar = (amiu) builder.instance;
                Object obj12 = this.e;
                obj12.getClass();
                amiuVar.b |= 8;
                amiuVar.g = (String) obj12;
                amiu amiuVar2 = (amiu) obj11;
                int i4 = amiuVar2.b & 4;
                int iK = this.a;
                if (i4 != 0 && (iK = atqp.K(amiuVar2.f)) == 0) {
                    iK = 1;
                }
                Object obj13 = this.c;
                builder.copyOnWrite();
                amiu amiuVar3 = (amiu) builder.instance;
                amiuVar3.f = iK - 1;
                amiuVar3.b |= 4;
                xjaVar.a((amiu) builder.build(), (xie) obj13);
                return;
            case 6:
                xja xjaVar2 = (xja) ((xip) this.b).a.io();
                aihf builder2 = ((aihn) this.d).toBuilder();
                builder2.copyOnWrite();
                amix amixVar = (amix) builder2.instance;
                Object obj14 = this.e;
                obj14.getClass();
                amixVar.b |= 2;
                amixVar.d = (String) obj14;
                builder2.copyOnWrite();
                amix amixVar2 = (amix) builder2.instance;
                amixVar2.b |= 64;
                amixVar2.h = this.a;
                amix amixVar3 = (amix) builder2.build();
                wjr wjrVar = (wjr) xjaVar2.a.io();
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                amixVar3.getClass();
                alouVar.d = amixVar3;
                alouVar.c = 255;
                wjrVar.A(alosVar, (xie) this.c);
                return;
            default:
                ((ytv) this.c).A(this.a, (arfb) this.d, (agkz) this.b, (String) this.e);
                return;
        }
        for (int i5 = 0; i5 < this.a; i5++) {
            View view = (View) ((ArrayList) this.d).get(i5);
            String str = (String) ((ArrayList) this.c).get(i5);
            int i6 = bac.a;
            view.setTransitionName(str);
            ((View) ((ArrayList) this.e).get(i5)).setTransitionName((String) ((ArrayList) this.b).get(i5));
        }
    }

    public cdf(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i2) {
        this.$cid = i2;
        this.a = i;
        this.d = arrayList;
        this.c = arrayList2;
        this.e = arrayList3;
        this.b = arrayList4;
    }

    public /* synthetic */ cdf(cdg cdgVar, Pair pair, cnd cndVar, cni cniVar, int i, int i2) {
        this.$cid = i2;
        this.b = cdgVar;
        this.c = pair;
        this.d = cndVar;
        this.e = cniVar;
        this.a = i;
    }

    public /* synthetic */ cdf(Object obj, Object obj2, String str, int i, Object obj3, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.d = obj2;
        this.e = str;
        this.a = i;
        this.c = obj3;
    }

    public /* synthetic */ cdf(vic vicVar, Uri uri, int i, sxw sxwVar, sxu sxuVar, int i2) {
        this.$cid = i2;
        this.e = vicVar;
        this.c = uri;
        this.a = i;
        this.d = sxwVar;
        this.b = sxuVar;
    }

    public /* synthetic */ cdf(ytv ytvVar, int i, arfb arfbVar, agkz agkzVar, String str, int i2) {
        this.$cid = i2;
        this.c = ytvVar;
        this.a = i;
        this.d = arfbVar;
        this.b = agkzVar;
        this.e = str;
    }
}
