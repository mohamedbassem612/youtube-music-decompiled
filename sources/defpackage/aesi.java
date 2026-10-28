package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import app.rive.semantics.SemanticState;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aesi implements Runnable {
    public final /* synthetic */ aesk a;

    public /* synthetic */ aesi(aesk aeskVar) {
        this.a = aeskVar;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mbc] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        boolean z;
        aesk aeskVar = this.a;
        aess aessVar = aeskVar.h;
        long millis = aessVar.d.e().toMillis();
        yvt yvtVar = (yvt) aeskVar.g.get();
        int i3 = yvtVar.b;
        long j = millis - yvtVar.a;
        long j2 = aeskVar.a;
        if (j <= j2) {
            aesb aesbVar = aeskVar.d;
            aihf aihfVar = aesbVar.e;
            if (aihfVar != null) {
                if (aesbVar.c > 0) {
                    aihfVar.copyOnWrite();
                    ajeb ajebVar = (ajeb) aihfVar.instance;
                    ajeb ajebVar2 = ajeb.a;
                    ajebVar.b |= 1;
                    ajebVar.c = true;
                    aesbVar.c--;
                    xeu xeuVar = (xeu) aesbVar.b.io();
                    if (xeuVar.b) {
                        xff xffVarA = xeuVar.a(aesbVar.e.build(), alot.ANR_DETECTION);
                        ztf ztfVar = xffVarA.k.e;
                        xffVarA.l = ztfVar.a();
                        ztfVar.k(xffVarA);
                    } else {
                        alos alosVar = (alos) alou.a.createBuilder();
                        aihf aihfVar2 = aesbVar.e;
                        alosVar.copyOnWrite();
                        alou alouVar = (alou) alosVar.instance;
                        ajeb ajebVar3 = (ajeb) aihfVar2.build();
                        ajebVar3.getClass();
                        alouVar.d = ajebVar3;
                        alouVar.c = 161;
                        xeuVar.b((alou) alosVar.build());
                    }
                }
                aesbVar.a();
                ((tqv) aessVar.f).b(SemanticState.Focused, 0, null);
            }
            j2 = (j2 - j) + 50;
            aesbVar.d = j2 + millis;
        } else if (Debug.isDebuggerConnected()) {
            aeskVar.d.a();
        } else {
            Thread thread = aeskVar.e.getLooper().getThread();
            aesb aesbVar2 = aeskVar.d;
            trl trlVar = (trl) aessVar.e;
            boolean z2 = trlVar.d;
            int iB = trlVar.b(349);
            int iB2 = trlVar.b(354);
            if (aesbVar2.e == null) {
                aihf aihfVarCreateBuilder = ajeb.a.createBuilder();
                i = 1;
                aess aessVar2 = aesbVar2.a;
                i2 = 2;
                long epochMilli = aessVar2.d.f().toEpochMilli() - j;
                aihfVarCreateBuilder.copyOnWrite();
                ajeb ajebVar4 = (ajeb) aihfVarCreateBuilder.instance;
                ajebVar4.b |= 8;
                ajebVar4.f = epochMilli;
                int i4 = Build.VERSION.SDK_INT;
                aihfVarCreateBuilder.copyOnWrite();
                ajeb ajebVar5 = (ajeb) aihfVarCreateBuilder.instance;
                ajebVar5.b |= 64;
                ajebVar5.i = i4;
                int iA = txz.a((Context) aessVar2.c);
                aihfVarCreateBuilder.copyOnWrite();
                ajeb ajebVar6 = (ajeb) aihfVarCreateBuilder.instance;
                ajebVar6.b |= SemanticState.Focused;
                ajebVar6.j = iA;
                aesbVar2.e = aihfVarCreateBuilder;
                if (z2) {
                    Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                    StackTraceElement[] stackTrace = allStackTraces.get(thread);
                    if (stackTrace == null) {
                        stackTrace = thread.getStackTrace();
                    }
                    String strD = aery.d(stackTrace);
                    aihf aihfVar3 = aesbVar2.e;
                    aihfVar3.copyOnWrite();
                    ajeb ajebVar7 = (ajeb) aihfVar3.instance;
                    ajebVar7.b |= 4;
                    ajebVar7.e = strD;
                    aihf aihfVar4 = aesbVar2.e;
                    String name = thread.getName();
                    aihf aihfVarCreateBuilder2 = akca.a.createBuilder();
                    akcb akcbVar = akcb.a;
                    aihf aihfVarCreateBuilder3 = akcbVar.createBuilder();
                    aihfVarCreateBuilder3.copyOnWrite();
                    akcb akcbVar2 = (akcb) aihfVarCreateBuilder3.instance;
                    name.getClass();
                    akcbVar2.b |= 2;
                    akcbVar2.d = name;
                    aihfVarCreateBuilder3.copyOnWrite();
                    akcb akcbVar3 = (akcb) aihfVarCreateBuilder3.instance;
                    akcbVar3.b |= 1;
                    akcbVar3.c = strD;
                    aihfVarCreateBuilder2.copyOnWrite();
                    akca akcaVar = (akca) aihfVarCreateBuilder2.instance;
                    akcb akcbVar4 = (akcb) aihfVarCreateBuilder3.build();
                    akcbVar4.getClass();
                    akcaVar.c = akcbVar4;
                    akcaVar.b |= 1;
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
                    int i5 = 0;
                    while (true) {
                        if ((iB2 != 0 && i5 >= iB2) || !it.hasNext()) {
                            break;
                        }
                        Map.Entry<Thread, StackTraceElement[]> next = it.next();
                        Thread key = next.getKey();
                        if (key != thread) {
                            aihf aihfVarCreateBuilder4 = akcbVar.createBuilder();
                            String name2 = key.getName();
                            aihfVarCreateBuilder4.copyOnWrite();
                            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                            akcb akcbVar5 = (akcb) aihfVarCreateBuilder4.instance;
                            name2.getClass();
                            Thread thread2 = thread;
                            akcbVar5.b |= 2;
                            akcbVar5.d = name2;
                            String str = akcbVar5.d;
                            int i6 = aerx.a;
                            int i7 = i5 + 1;
                            if (i5 < iB || iB == 0) {
                                String strD2 = aery.d(next.getValue());
                                aihfVarCreateBuilder4.copyOnWrite();
                                akcb akcbVar6 = (akcb) aihfVarCreateBuilder4.instance;
                                akcbVar6.b |= 1;
                                akcbVar6.c = strD2;
                                String str2 = akcbVar6.c;
                            }
                            aihfVarCreateBuilder2.bo(aihfVarCreateBuilder4);
                            i5 = i7;
                            it = it2;
                            thread = thread2;
                        }
                    }
                    aihf aihfVarCreateBuilder5 = akby.a.createBuilder();
                    aihfVarCreateBuilder5.aQ((akca) aihfVarCreateBuilder2.build());
                    aihfVar4.copyOnWrite();
                    ajeb ajebVar8 = (ajeb) aihfVar4.instance;
                    akby akbyVar = (akby) aihfVarCreateBuilder5.build();
                    akbyVar.getClass();
                    ajebVar8.p = akbyVar;
                    ajebVar8.b |= SemanticState.Multiline;
                } else {
                    aihf aihfVar5 = aesbVar2.e;
                    String strD3 = aery.d(thread.getStackTrace());
                    aihfVar5.copyOnWrite();
                    ajeb ajebVar9 = (ajeb) aihfVar5.instance;
                    ajebVar9.b |= 4;
                    ajebVar9.e = strD3;
                }
                z = true;
            } else {
                i = 1;
                i2 = 2;
                z = false;
            }
            aihf aihfVar6 = aesbVar2.e;
            int iMin = (int) Math.min(j, 2147483647L);
            aihfVar6.copyOnWrite();
            ajeb ajebVar10 = (ajeb) aihfVar6.instance;
            ajeb ajebVar11 = ajeb.a;
            ajebVar10.b |= 2;
            ajebVar10.d = iMin;
            if (i3 == i2) {
                int i8 = aerx.a;
                int iMin2 = (int) Math.min(j, 2147483647L);
                aihfVar6.copyOnWrite();
                ajeb ajebVar12 = (ajeb) aihfVar6.instance;
                ajebVar12.b |= 16;
                ajebVar12.g = iMin2;
            }
            if (z) {
                ((tqv) aessVar.f).b(SemanticState.Focused, i, null);
            }
            aihf aihfVar7 = aesbVar2.e;
            if (aihfVar7 != null && aesbVar2.d != 0) {
                ajef ajefVar = ((ajeb) aihfVar7.instance).r;
                if (ajefVar == null) {
                    ajefVar = ajef.a;
                }
                if ((ajefVar.b & 16) == 0) {
                    ajef ajefVar2 = ((ajeb) aihfVar7.instance).r;
                    if (ajefVar2 == null) {
                        ajefVar2 = ajef.a;
                    }
                    aihf builder = ajefVar2.toBuilder();
                    long j3 = aesbVar2.d;
                    builder.copyOnWrite();
                    ajef ajefVar3 = (ajef) builder.instance;
                    ajefVar3.b |= 2;
                    ajefVar3.e = j3;
                    long j4 = millis - aesbVar2.d;
                    builder.copyOnWrite();
                    ajef ajefVar4 = (ajef) builder.instance;
                    ajefVar4.b |= 16;
                    ajefVar4.i = j4;
                    aihfVar7.copyOnWrite();
                    ajeb ajebVar13 = (ajeb) aihfVar7.instance;
                    ajef ajefVar5 = (ajef) builder.build();
                    ajefVar5.getClass();
                    ajebVar13.r = ajefVar5;
                    ajebVar13.b |= 32768;
                }
            }
            aihf aihfVar8 = aesbVar2.e;
            if (aihfVar8 != null) {
                ajeb ajebVar14 = (ajeb) aihfVar8.build();
                int i9 = aerx.a;
                aewo.m(aesbVar2.a, ajebVar14);
            } else {
                int i10 = aerx.a;
            }
            j2 = aeskVar.c;
        }
        aeskVar.i.schedule(new aesi(aeskVar), j2, TimeUnit.MILLISECONDS);
    }
}
