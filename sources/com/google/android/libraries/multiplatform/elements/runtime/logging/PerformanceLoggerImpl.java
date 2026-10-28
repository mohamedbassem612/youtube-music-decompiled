package com.google.android.libraries.multiplatform.elements.runtime.logging;

import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.multiplatform.elements.runtime.logging.PerformanceLoggerImpl;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ahey;
import defpackage.ahno;
import defpackage.grj;
import defpackage.mbc;
import java.util.concurrent.TimeUnit;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PerformanceLoggerImpl {
    public static final Object a = new Object();
    public ListenableFuture b;
    public final grj c;
    private final ahey d;
    private final mbc e;

    public PerformanceLoggerImpl(grj grjVar, ahey aheyVar, mbc mbcVar) {
        this.c = grjVar;
        this.d = aheyVar;
        this.e = mbcVar;
    }

    public static native boolean jniHasPerformanceSpans();

    public static native long[] jniLogPerformanceSpans();

    private static native void jniQueuePerformanceSpan(long j, long j2, int i);

    public final void a() {
        if (this.b == null) {
            this.b = ahno.aj(new Runnable() { // from class: ovt
                /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
                /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nzw] */
                @Override // java.lang.Runnable
                public final void run() {
                    char c;
                    String str;
                    Object obj = PerformanceLoggerImpl.a;
                    PerformanceLoggerImpl performanceLoggerImpl = this.a;
                    synchronized (obj) {
                        if (PerformanceLoggerImpl.jniHasPerformanceSpans()) {
                            long[] jArrJniLogPerformanceSpans = PerformanceLoggerImpl.jniLogPerformanceSpans();
                            if (jArrJniLogPerformanceSpans == null) {
                                return;
                            }
                            int length = jArrJniLogPerformanceSpans.length - 1;
                            aind[] aindVarArr = new aind[length];
                            UpbArena upbArena = new UpbArena(jArrJniLogPerformanceSpans[0]);
                            for (int i = 1; i < jArrJniLogPerformanceSpans.length; i++) {
                                aindVarArr[i - 1] = new aind(new UpbMessage(jArrJniLogPerformanceSpans[i], ainc.a, upbArena));
                            }
                            ?? r0 = performanceLoggerImpl.c.a;
                            String strB = r0.b();
                            r0.c(strB);
                            for (int i2 = 0; i2 < length; i2++) {
                                aind aindVar = aindVarArr[i2];
                                switch (Memory.peekInt(aindVar.c + 12, false)) {
                                    case 0:
                                        c = 1;
                                        break;
                                    case 1:
                                        c = 2;
                                        break;
                                    case 2:
                                        c = 3;
                                        break;
                                    case 3:
                                        c = 4;
                                        break;
                                    case 4:
                                        c = 5;
                                        break;
                                    case 5:
                                        c = 6;
                                        break;
                                    case 6:
                                        c = 7;
                                        break;
                                    case 7:
                                        c = '\b';
                                        break;
                                    case 8:
                                        c = '\t';
                                        break;
                                    case 9:
                                        c = '\n';
                                        break;
                                    case 10:
                                        c = 11;
                                        break;
                                    case 11:
                                        c = '\f';
                                        break;
                                    case 12:
                                        c = '\r';
                                        break;
                                    case 13:
                                        c = 14;
                                        break;
                                    default:
                                        c = 0;
                                        break;
                                }
                                if (c != 0) {
                                    switch (c) {
                                        case 1:
                                            str = "PERFORMANCE_SPAN_TYPE_UNSPECIFIED";
                                            break;
                                        case 2:
                                            str = "MODEL_SYNTHESIS";
                                            break;
                                        case 3:
                                            str = "TEMPLATE_RESOLUTION";
                                            break;
                                        case 4:
                                            str = "TEMPLATE_FETCHING";
                                            break;
                                        case 5:
                                            str = "COMPONENT_MATERIALIZATION";
                                            break;
                                        case 6:
                                            str = "LAYOUT";
                                            break;
                                        case 7:
                                            str = "FLATTEN";
                                            break;
                                        case '\b':
                                            str = "MEASURE";
                                            break;
                                        case '\t':
                                            str = "SNAPSHOT";
                                            break;
                                        case '\n':
                                            str = "APPLY";
                                            break;
                                        case 11:
                                            str = "GENERATE_AND_PREPARE";
                                            break;
                                        case '\f':
                                            str = "MUTATE";
                                            break;
                                        case '\r':
                                            str = "STYLING";
                                            break;
                                        default:
                                            str = "TEMPLATE_PROCESSING";
                                            break;
                                    }
                                } else {
                                    str = "PERFORMANCE_SPAN_TYPE_UNSPECIFIED";
                                }
                                nzp nzpVar = new nzp();
                                nzpVar.b(str);
                                long j = aindVar.c;
                                boolean z = aind.a;
                                nzpVar.a = Long.valueOf(Memory.peekLong(j + (true != z ? 24L : 32L), false));
                                nzpVar.b = Long.valueOf(Memory.peekLong(aindVar.c + (true == z ? 40L : 32L), false));
                                if ((Memory.peekByte(aindVar.c + 8) & 8) != 0 && !aindVar.aR().isEmpty()) {
                                    nzq nzqVarA = nzr.a();
                                    String strAR = aindVar.aR();
                                    if (strAR.contains("|")) {
                                        strAR = strAR.substring(0, strAR.indexOf(R.styleable.AppCompatTheme_windowMinWidthMajor));
                                    }
                                    nzqVarA.c(new agqj(strAR));
                                    nzpVar.e = nzqVarA.a();
                                }
                                r0.e(strB, nzpVar.a());
                            }
                        }
                    }
                }
            }, 1000L, 1000L, TimeUnit.MILLISECONDS, this.e, this.d);
        }
    }
}
