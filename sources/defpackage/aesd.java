package defpackage;

import android.os.Build;
import android.os.Debug;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aesd extends Thread {
    public volatile boolean a;
    final /* synthetic */ aese b;
    private final Runnable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aesd(aese aeseVar) {
        super("ANRGuard-Thread");
        this.b = aeseVar;
        this.c = new acem(this, 7);
        this.a = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        aqih aqihVar;
        aihf builder;
        int i = aerx.a;
        aese aeseVar = this.b;
        Thread thread = aeseVar.d.getLooper().getThread();
        aesa aesaVar = aeseVar.c;
        Object obj = aesaVar.c.b;
        if (((File) obj).exists()) {
            try {
                aihf aihfVar = (aihf) ajeb.a.createBuilder().mergeFrom(agyn.b((File) obj, new ahng()), ExtensionRegistryLite.getGeneratedRegistry());
                xeu xeuVar = aesaVar.d;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(aihfVar, alot.ANR_DETECTION);
                    tqj tqjVar = aesaVar.g;
                    int i2 = tqr.a;
                    if (tqjVar.k(1073808301)) {
                        xffVarA.h = ((ajeb) aihfVar.instance).f;
                    }
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    ajeb ajebVar = (ajeb) aihfVar.build();
                    ajebVar.getClass();
                    alouVar.d = ajebVar;
                    alouVar.c = 161;
                    alou alouVar2 = (alou) alosVar.build();
                    tqj tqjVar2 = aesaVar.g;
                    int i3 = tqr.a;
                    if (tqjVar2.k(1073808301)) {
                        xeuVar.d(alouVar2, xel.c(((ajeb) aihfVar.instance).f));
                    } else {
                        xeuVar.b(alouVar2);
                    }
                }
                aesaVar.a();
            } catch (IOException e) {
                zvp.b(zvn.b, zvm.B, "Unable to flush ANR", e);
            }
        }
        aese aeseVar2 = this.b;
        aery aeryVar = aeseVar2.e;
        aeryVar.a();
        while (!interrupted()) {
            this.a = true;
            aeseVar2.d.post(this.c);
            try {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j = aeseVar2.a;
                timeUnit.sleep(j);
                aeryVar.a();
                if (aeseVar2.b) {
                    aihf aihfVarCreateBuilder = aqie.a.createBuilder();
                    ((aepv) aeseVar2.f.io()).c();
                    aihf aihfVarCreateBuilder2 = aqih.a.createBuilder();
                    aqie aqieVar = (aqie) aihfVarCreateBuilder.build();
                    aihfVarCreateBuilder2.copyOnWrite();
                    aqih aqihVar2 = (aqih) aihfVarCreateBuilder2.instance;
                    aqieVar.getClass();
                    aqihVar2.e = aqieVar;
                    aqihVar2.b |= 4;
                    aqihVar = (aqih) aihfVarCreateBuilder2.build();
                } else {
                    aqihVar = null;
                }
                if (Debug.isDebuggerConnected()) {
                    aeseVar2.c.a();
                } else if (this.a) {
                    aesa aesaVar2 = aeseVar2.c;
                    ajeb ajebVar2 = aesaVar2.h;
                    if (ajebVar2 == null) {
                        builder = ajeb.a.createBuilder();
                        long epochMilli = aesaVar2.b.f().toEpochMilli() - j;
                        builder.copyOnWrite();
                        ajeb ajebVar3 = (ajeb) builder.instance;
                        ajebVar3.b |= 8;
                        ajebVar3.f = epochMilli;
                    } else {
                        builder = ajebVar2.toBuilder();
                    }
                    aesaVar2.b(builder, j);
                    int i4 = aesaVar2.e;
                    if (i4 > 0) {
                        StringBuilder sb = new StringBuilder();
                        for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                            sb.append(stackTraceElement);
                            sb.append('\n');
                        }
                        String string = sb.toString();
                        if (sb.length() > i4) {
                            string = string.substring(0, i4);
                        }
                        builder.copyOnWrite();
                        ajeb ajebVar4 = (ajeb) builder.instance;
                        string.getClass();
                        ajebVar4.b |= 4;
                        ajebVar4.e = string;
                    }
                    if (aqihVar != null) {
                        builder.copyOnWrite();
                        ajeb ajebVar5 = (ajeb) builder.instance;
                        ajebVar5.v = aqihVar;
                        ajebVar5.b |= 262144;
                    }
                    int i5 = Build.VERSION.SDK_INT;
                    builder.copyOnWrite();
                    ajeb ajebVar6 = (ajeb) builder.instance;
                    ajebVar6.b |= 64;
                    ajebVar6.i = i5;
                    int iA = txz.a(aesaVar2.a);
                    builder.copyOnWrite();
                    ajeb ajebVar7 = (ajeb) builder.instance;
                    ajebVar7.b |= SemanticState.Focused;
                    ajebVar7.j = iA;
                    aesaVar2.h = (ajeb) builder.build();
                    try {
                        String.valueOf(aesaVar2.h);
                        aerz aerzVar = aesaVar2.c;
                        ajeb ajebVar8 = aesaVar2.h;
                        if (!aerzVar.a) {
                            aerzVar.a = true;
                            File parentFile = ((File) aerzVar.b).getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                        }
                        agyo.d(ajebVar8.toByteArray(), (File) aerzVar.b);
                    } catch (IOException e2) {
                        zvp.b(zvn.b, zvm.B, "Unable to record ANR", e2);
                    }
                } else {
                    aese aeseVar3 = this.b;
                    aesa aesaVar3 = aeseVar3.c;
                    long j2 = aeseVar3.a;
                    ajeb ajebVar9 = aesaVar3.h;
                    if (ajebVar9 != null) {
                        if (aesaVar3.f) {
                            aihf builder2 = ajebVar9.toBuilder();
                            builder2.copyOnWrite();
                            ajeb ajebVar10 = (ajeb) builder2.instance;
                            ajebVar10.b |= 1;
                            ajebVar10.c = true;
                            aesaVar3.b(builder2, j2);
                            int i6 = Build.VERSION.SDK_INT;
                            builder2.copyOnWrite();
                            ajeb ajebVar11 = (ajeb) builder2.instance;
                            ajebVar11.b |= 64;
                            ajebVar11.i = i6;
                            int iA2 = txz.a(aesaVar3.a);
                            builder2.copyOnWrite();
                            ajeb ajebVar12 = (ajeb) builder2.instance;
                            ajebVar12.b |= SemanticState.Focused;
                            ajebVar12.j = iA2;
                            aesaVar3.h = (ajeb) builder2.build();
                            String.valueOf(aesaVar3.h);
                            xeu xeuVar2 = aesaVar3.d;
                            if (xeuVar2.b) {
                                xff xffVarA2 = xeuVar2.a(aesaVar3.h, alot.ANR_DETECTION);
                                ztf ztfVar2 = xffVarA2.k.e;
                                xffVarA2.l = ztfVar2.a();
                                ztfVar2.k(xffVarA2);
                            } else {
                                alos alosVar2 = (alos) alou.a.createBuilder();
                                ajeb ajebVar13 = aesaVar3.h;
                                alosVar2.copyOnWrite();
                                alou alouVar3 = (alou) alosVar2.instance;
                                ajebVar13.getClass();
                                alouVar3.d = ajebVar13;
                                alouVar3.c = 161;
                                xeuVar2.b((alou) alosVar2.build());
                            }
                            aesaVar3.a();
                        } else {
                            aesaVar3.a();
                        }
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
