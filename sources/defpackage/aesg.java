package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import app.rive.semantics.SemanticState;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aesg extends Thread {
    public volatile boolean a;
    final /* synthetic */ aesh b;
    private final Runnable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aesg(aesh aeshVar) {
        super("ANRGuard-Thread");
        this.b = aeshVar;
        this.c = new aemk(this, 7, null);
        this.a = true;
    }

    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, mbc] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        aihf aihfVarCreateBuilder;
        int i = aerx.a;
        aesh aeshVar = this.b;
        Handler handler = (Handler) aeshVar.b;
        Thread thread = handler.getLooper().getThread();
        while (!interrupted()) {
            this.a = true;
            handler.post(this.c);
            aery aeryVar = (aery) ((AtomicReference) aeshVar.d).get();
            try {
                long j = aeshVar.a;
                Thread.sleep(j);
                if (aeryVar != null) {
                    aeryVar.a();
                }
                if (Debug.isDebuggerConnected()) {
                    ((ahqj) aeshVar.c).f();
                } else if (this.a) {
                    Object obj = aeshVar.c;
                    Object obj2 = ((ahqj) obj).b;
                    if (obj2 == null) {
                        aihfVarCreateBuilder = ajeb.a.createBuilder();
                        long epochMilli = ((aess) ((ahqj) obj).a).d.f().toEpochMilli() - j;
                        aihfVarCreateBuilder.copyOnWrite();
                        ajeb ajebVar = (ajeb) aihfVarCreateBuilder.instance;
                        ajebVar.b |= 8;
                        ajebVar.f = epochMilli;
                        z = true;
                    } else {
                        aihf builder = ((aihn) obj2).toBuilder();
                        z = false;
                        aihfVarCreateBuilder = builder;
                    }
                    long j2 = ((long) ((ajeb) aihfVarCreateBuilder.instance).d) + j;
                    aihfVarCreateBuilder.copyOnWrite();
                    ajeb ajebVar2 = (ajeb) aihfVarCreateBuilder.instance;
                    ajebVar2.b |= 2;
                    ajebVar2.d = (int) j2;
                    if (aeryVar == null || aeryVar.c()) {
                        long j3 = ((long) ajebVar2.g) + j;
                        aihfVarCreateBuilder.copyOnWrite();
                        ajeb ajebVar3 = (ajeb) aihfVarCreateBuilder.instance;
                        ajebVar3.b |= 16;
                        ajebVar3.g = (int) j3;
                    }
                    if (aeryVar == null || aeryVar.b()) {
                        long j4 = ((long) ((ajeb) aihfVarCreateBuilder.instance).h) + j;
                        aihfVarCreateBuilder.copyOnWrite();
                        ajeb ajebVar4 = (ajeb) aihfVarCreateBuilder.instance;
                        ajebVar4.b |= 32;
                        ajebVar4.h = (int) j4;
                    }
                    String strD = aery.d(thread.getStackTrace());
                    aihfVarCreateBuilder.copyOnWrite();
                    ajeb ajebVar5 = (ajeb) aihfVarCreateBuilder.instance;
                    ajebVar5.b |= 4;
                    ajebVar5.e = strD;
                    int i2 = Build.VERSION.SDK_INT;
                    aihfVarCreateBuilder.copyOnWrite();
                    ajeb ajebVar6 = (ajeb) aihfVarCreateBuilder.instance;
                    ajebVar6.b |= 64;
                    ajebVar6.i = i2;
                    Object obj3 = ((ahqj) obj).a;
                    int iA = txz.a((Context) ((aess) obj3).c);
                    aihfVarCreateBuilder.copyOnWrite();
                    ajeb ajebVar7 = (ajeb) aihfVarCreateBuilder.instance;
                    ajebVar7.b |= SemanticState.Focused;
                    ajebVar7.j = iA;
                    ((ahqj) obj).b = (ajeb) aihfVarCreateBuilder.build();
                    String.valueOf(((ahqj) obj).b);
                    aewo.m((aess) obj3, (ajeb) ((ahqj) obj).b);
                    if (z) {
                        ((tqv) ((aess) aeshVar.e).f).b(SemanticState.Focused, 1, null);
                    }
                } else {
                    Object obj4 = aeshVar.c;
                    if (((ahqj) obj4).b != null) {
                        ((ahqj) obj4).f();
                        ((tqv) ((aess) aeshVar.e).f).b(SemanticState.Focused, 0, null);
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
