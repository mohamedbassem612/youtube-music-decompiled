package defpackage;

import android.content.Context;
import android.util.Log;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahvn implements aheh {
    final /* synthetic */ ahwf a;
    final /* synthetic */ ahvo b;

    public ahvn(ahvo ahvoVar, ahwf ahwfVar) {
        this.a = ahwfVar;
        this.b = ahvoVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        Log.e("ClientLoggingBackend", "Error while logging.", th);
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kje] */
    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        agxi agxiVarB;
        String str = (String) obj;
        ahvq ahvqVar = this.b.c;
        qjj qjjVarB = qjj.b(((qji) ahvqVar.b.io()).a(null));
        float fA = qjjVarB.c / qjjVarB.a();
        if (fA >= 0.0f) {
            aihf builder = this.a.toBuilder();
            builder.copyOnWrite();
            ahwf ahwfVar = (ahwf) builder.instance;
            ahwfVar.b |= SemanticState.Modal;
            ahwfVar.k = fA;
            ahwf ahwfVar2 = (ahwf) builder.build();
            ahpu ahpuVar = ahvqVar.c;
            ahab ahabVar = ahwfVar2.g;
            if (ahabVar == null) {
                ahabVar = ahab.a;
            }
            String str2 = ahabVar.j;
            ahvg ahvgVar = ahvh.a;
            int i = agxm.b;
            agxj agxjVar = agxy.a;
            Charset charset = StandardCharsets.UTF_8;
            if (charset.equals(StandardCharsets.UTF_8)) {
                int length = str2.length();
                agxy agxyVar = (agxy) agxjVar;
                int iRotateLeft = agxyVar.c;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = i2 + 4;
                    if (i4 > length) {
                        break;
                    }
                    char cCharAt = str2.charAt(i2);
                    char cCharAt2 = str2.charAt(i2 + 1);
                    char cCharAt3 = str2.charAt(i2 + 2);
                    char cCharAt4 = str2.charAt(i2 + 3);
                    if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                        break;
                    }
                    iRotateLeft = (Integer.rotateLeft(iRotateLeft ^ (Integer.rotateLeft((((cCharAt | (cCharAt2 << '\b')) | (cCharAt3 << 16)) | (cCharAt4 << 24)) * (-862048943), 15) * 461845907), 13) * 5) - 430675100;
                    i3 += 4;
                    i2 = i4;
                }
                long jH = 0;
                int i5 = 0;
                while (i2 < length) {
                    char cCharAt5 = str2.charAt(i2);
                    if (cCharAt5 < 128) {
                        jH |= ((long) cCharAt5) << i5;
                        i3++;
                        i5 += 8;
                    } else if (cCharAt5 < 2048) {
                        jH |= agxy.i(cCharAt5) << i5;
                        i3 += 2;
                        i5 += 16;
                    } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                        jH |= agxy.h(cCharAt5) << i5;
                        i3 += 3;
                        i5 += 24;
                    } else {
                        int iCodePointAt = Character.codePointAt(str2, i2);
                        if (iCodePointAt == cCharAt5) {
                            agxiVarB = agxyVar.b(str2.toString().getBytes(charset));
                        } else {
                            jH |= agxy.j(iCodePointAt) << i5;
                            i3 += 4;
                            i5 += 32;
                            i2++;
                        }
                    }
                    if (i5 >= 32) {
                        int iRotateLeft2 = Integer.rotateLeft(iRotateLeft ^ (Integer.rotateLeft(((int) jH) * (-862048943), 15) * 461845907), 13) * 5;
                        jH >>>= 32;
                        iRotateLeft = iRotateLeft2 - 430675100;
                        i5 -= 32;
                    }
                    i2++;
                }
                agxiVarB = agxy.k(iRotateLeft ^ (Integer.rotateLeft(((int) jH) * (-862048943), 15) * 461845907), i3);
            } else {
                agxiVarB = ((agxy) agxjVar).b(str2.toString().getBytes(charset));
            }
            ?? r4 = ahpuVar.b;
            Object obj2 = ahpuVar.a;
            int iA = agxiVarB.a();
            Context context = (Context) obj2;
            kih kihVarJ = r4.a(context, str).j(ahwfVar2, new mea(context, new mdv(new mdp(71415400))));
            kihVarJ.k(iA);
            ListenableFuture listenableFutureBp = qnl.bp(kihVarJ.e());
            agel agelVar = new agel();
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            int i6 = ahcs.c;
            ahcr ahcrVar = new ahcr(listenableFutureBp, agelVar);
            listenableFutureBp.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
            ahcrVar.addListener(new ahvk(ahcrVar, 0), MoreExecutors.directExecutor());
            abzy abzyVar = new abzy(20);
            long j = afwl.a;
            afwi afwiVar = new afwi(afty.c(false), abzyVar);
            Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
            int i7 = ahbz.d;
            ahby ahbyVar = new ahby(ahcrVar, Exception.class, afwiVar);
            ahcrVar.addListener(ahbyVar, MoreExecutors.c(executorDirectExecutor2, ahbyVar));
        }
    }
}
